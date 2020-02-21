package com.carematix.droapp.view;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;

import com.carematix.droapp.R;
import com.carematix.droapp.view.ui.CameraPreview;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static android.Manifest.permission.CAMERA;

public class CameraSurfaceActivity extends Activity implements SurfaceHolder.Callback {

    private static final String TAG = "CameraSurfaceActivity";
    private SurfaceHolder surfaceHolder;
    private SurfaceView surfaceView;
    public MediaRecorder mMediaRecorder = new MediaRecorder();
    private Button startRecording = null;
    private boolean previewRunning;

    private boolean mInitSuccesful=false;

    private final int maxDurationInMs = 20000;
    private final long maxFileSizeInBytes = 500000;
    private final int videoFramesPerSecond = 20;

    File file;String videoFilePath;
    private Camera mCamera;
    private CameraPreview mPreview;

    public CameraSurfaceActivity() {}
    private static final int REQUEST_RECORD_AUDIO_PERMISSION = 201;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        setContentView(R.layout.camera_surface);

        if (ActivityCompat.checkSelfPermission(CameraSurfaceActivity.this, CAMERA) != PackageManager.PERMISSION_GRANTED ) {
            if(ActivityCompat.shouldShowRequestPermissionRationale(CameraSurfaceActivity.this,
                    CAMERA)){
                ActivityCompat.requestPermissions(CameraSurfaceActivity.this, new String[]{CAMERA} , REQUEST_RECORD_AUDIO_PERMISSION);
            }else{
                ActivityCompat.requestPermissions(CameraSurfaceActivity.this, new String[]{CAMERA} , REQUEST_RECORD_AUDIO_PERMISSION);
            }
        }else{
            create();
        }

        // Create an instance of Camera
       /* mCamera = getCameraInstance();
        mCamera.open();
        mCamera.open(1);

        //mCamera.setPre

        // Create our Preview view and set it as the content of our activity.
        mPreview = new CameraPreview(this, mCamera);
        mPreview.setPressed(true);

        FrameLayout preview = (FrameLayout) findViewById(R.id.camera_preview);
        preview.addView(mPreview);

        //Log.i(null , "Video starting");
        startRecording = (Button)findViewById(R.id.buttonstart);
        startRecording.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get an image from the camera
               // mCamera.takePicture(null, null, picture);
            }
        });*/
        /*mCamera = Camera.open();
        surfaceView = (SurfaceView) findViewById(R.id.surface_camera);
        surfaceHolder = surfaceView.getHolder();
        surfaceHolder.addCallback(this);
        surfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);*/


    }

    private boolean permissionToRecordAccepted = false;
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case REQUEST_RECORD_AUDIO_PERMISSION:
                try {
                    permissionToRecordAccepted  = grantResults[0] == PackageManager.PERMISSION_GRANTED;
                    create();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }

    }

    public void create(){
        surfaceView = (SurfaceView) findViewById(R.id.surface_camera);
        surfaceHolder = surfaceView.getHolder();
        surfaceHolder.addCallback(this);
        surfaceHolder.setType(SurfaceHolder.SURFACE_TYPE_PUSH_BUFFERS);

        startRecording = (Button)findViewById(R.id.buttonstart);
        startRecording.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get an image from the camera
                if (((Button) v).isClickable()){
                    mMediaRecorder.start();
                }else {
                    mMediaRecorder.stop();
                    mMediaRecorder.reset();
                    try {
                        initRecorder(surfaceHolder.getSurface());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        });
    }

    public void initRecorder(Surface surface) throws IOException {
        if (mCamera == null) {
            mCamera = Camera.open();
            mCamera.unlock();
        }

        if (mMediaRecorder == null)
            mMediaRecorder = new MediaRecorder();

        mMediaRecorder.setPreviewDisplay(surface);
        mMediaRecorder.setCamera(mCamera);

        mMediaRecorder.setVideoSource(MediaRecorder.VideoSource.CAMERA);

        mMediaRecorder.setAudioSource(MediaRecorder.AudioSource.DEFAULT);

        mMediaRecorder.setOutputFormat(MediaRecorder.OutputFormat.DEFAULT);

       // createVideoFile();
        mMediaRecorder.setOutputFile(initFile().getAbsolutePath());

        // No limit. Don't forget to check the space on disk.
        mMediaRecorder.setMaxDuration(50000);
        mMediaRecorder.setVideoFrameRate(24);
        mMediaRecorder.setVideoSize(1280, 720);
        mMediaRecorder.setVideoEncodingBitRate(3000000);
        mMediaRecorder.setAudioEncodingBitRate(8000);

        mMediaRecorder.setVideoEncoder(MediaRecorder.VideoEncoder.DEFAULT);
        mMediaRecorder.setAudioEncoder(MediaRecorder.AudioEncoder.AMR_NB);

        try {
            mMediaRecorder.prepare();
        } catch (IllegalStateException e) {
            // This is thrown if the previous calls are not called with the
            // proper order
            e.printStackTrace();
        }

        mInitSuccesful = true;


    }

    private File initFile() {
        // File dir = new
        // File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES),
        // this
        File dir = new File(Environment.getExternalStorageDirectory(), this
                .getClass().getPackage().getName());


        if (!dir.exists() && !dir.mkdirs()) {
            Log.wtf(TAG,
                    "Failed to create storage directory: "
                            + dir.getAbsolutePath());
            Toast.makeText(CameraSurfaceActivity.this, "not record", Toast.LENGTH_SHORT);
            file = null;
        } else {
            file = new File(dir.getAbsolutePath(), new SimpleDateFormat(
                    "'IMG_'yyyyMMddHHmmss'.mp4'").format(new Date()));
        }
        return file;
    }

    private File createVideoFile() throws IOException {
        String timeStamp =new SimpleDateFormat("yyyyMMdd_HHmmss",
                Locale.getDefault()).format(new Date());
        String imageFileName = "VID_" + timeStamp + "_";
        File storageDir =CameraSurfaceActivity.this.getExternalFilesDir("Videos");
        //File storageDir =isExternalStorageAvailable();
        File filePath = File.createTempFile(
                imageFileName,  /* prefix */
                ".mp4",         /* suffix */
                storageDir      /* directory */
        );

        videoFilePath = filePath.getAbsolutePath();
        return filePath;
    }

    private Camera.PictureCallback mPicture = new Camera.PictureCallback() {

        @Override
        public void onPictureTaken(byte[] data, Camera camera) {

            File pictureFile =null;//= getOutputMediaFile(MEDIA_TYPE_IMAGE);
            if (pictureFile == null){
                Log.d(TAG, "Error creating media file, check storage permissions");
                return;
            }

            try {
                FileOutputStream fos = new FileOutputStream(pictureFile);
                fos.write(data);
                fos.close();
            } catch (FileNotFoundException e) {
                Log.d(TAG, "File not found: " + e.getMessage());
            } catch (IOException e) {
                Log.d(TAG, "Error accessing file: " + e.getMessage());
            }
        }
    };

    private void shutdown() {
        // Release MediaRecorder and especially the Camera as it's a shared
        // object that can be used by other applications
        mMediaRecorder.reset();
        mMediaRecorder.release();
        mCamera.release();

        // once the objects have been released they can't be reused
        mMediaRecorder = null;
        mCamera = null;
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        try {
            if (!mInitSuccesful)
                initRecorder(surfaceHolder.getSurface());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        shutdown();
    }
}
