package com.carematix.droapp.view.ui.fragment;

import androidx.core.app.ActivityCompat;
import androidx.core.content.FileProvider;
import androidx.lifecycle.ViewModelProviders;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.carematix.droapp.view.CameraSurfaceActivity;
import com.carematix.droapp.R;
import com.carematix.droapp.viewmodal.MainViewModel;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import static android.Manifest.permission.CAMERA;

public class MainFragment extends Fragment implements View.OnClickListener {

    private MainViewModel mViewModel;

    ImageView imageView;
    TextView appCompatTextView;
    View view;
    Button button;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.main_fragment, container, false);

        imageView =(ImageView)view.findViewById(R.id.imageView);
        appCompatTextView =(TextView)view.findViewById(R.id.message);
        appCompatTextView.setOnClickListener(this);

        button =(Button)view.findViewById(R.id.button);
        button.setOnClickListener(this::OnButtonClick);

        return view;
    }

    public void OnButtonClick(View view){
        // intent call
        Intent intent =new Intent(getActivity(), CameraSurfaceActivity.class);
        startActivity(intent);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel
    }

    @Override
    public void onClick(View view){

        if (ActivityCompat.checkSelfPermission(getActivity(), CAMERA) != PackageManager.PERMISSION_GRANTED ) {
            if(ActivityCompat.shouldShowRequestPermissionRationale(getActivity(),
                    CAMERA)){
                ActivityCompat.requestPermissions(getActivity(), new String[]{CAMERA} , REQUEST_RECORD_AUDIO_PERMISSION);
            }else{
                ActivityCompat.requestPermissions(getActivity(), new String[]{CAMERA} , REQUEST_RECORD_AUDIO_PERMISSION);
            }
        }else{

            captureVideo();
        }
    }


    public void captureVideo(){
        try {
            // requestPermissions(permissions, RC_PERMISSIONS);

            if(checkCameraHardware(getActivity())){

                OnButtonClick(null);

            }else{
                Intent takeVideoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
                if (takeVideoIntent.resolveActivity(getActivity().getPackageManager()) != null) {
                    try {
                        videoFile = createVideoFile();
                    } catch (IOException e) {
                        // Error occurred while creating the File
                        e.printStackTrace();
                    }
                    if (videoFile != null) {
                        Uri videoURI = FileProvider.getUriForFile(getActivity(),"com.carematix.droapp.provider", videoFile);
                        takeVideoIntent.putExtra(MediaStore.EXTRA_OUTPUT,videoURI);
                        startActivityForResult(takeVideoIntent,REQUEST_VIDEO_CAPTURE);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    String videoFilePath;
    File videoFile;
    int REQUEST_VIDEO_CAPTURE=101;

    private File createVideoFile() throws IOException {
        String timeStamp =new SimpleDateFormat("yyyyMMdd_HHmmss",
                        Locale.getDefault()).format(new Date());
        String imageFileName = "VID_" + timeStamp + "_";
        File storageDir =getActivity().getExternalFilesDir("Videos");
        //File storageDir =isExternalStorageAvailable();
        File filePath = File.createTempFile(
                imageFileName,  /* prefix */
                ".mp4",         /* suffix */
                storageDir      /* directory */
        );

        videoFilePath = filePath.getAbsolutePath();
        return filePath;
    }

    private static final int REQUEST_RECORD_AUDIO_PERMISSION = 201;
    private boolean permissionToRecordAccepted = false;
    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        switch (requestCode){
            case REQUEST_RECORD_AUDIO_PERMISSION:
                try {
                    permissionToRecordAccepted  = grantResults[0] == PackageManager.PERMISSION_GRANTED;
                    //startRecording();
                    captureVideo();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
        }

    }

    public int RESULT_CODE =-1;
    @Override
    public void onActivityResult(int requestCode, int resultCode, Intent data) {

        if(requestCode == REQUEST_VIDEO_CAPTURE && resultCode == RESULT_CODE){
            Glide.with(getActivity()).load(videoFilePath).into(imageView);
            Toast.makeText(getActivity(), "Video saved to:\n" +videoFilePath.toString(), Toast.LENGTH_LONG).show();
        }
        //super.onActivityResult(requestCode, resultCode, data);
    }


    // check camera exist or not
    private boolean checkCameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA)){
            // this device has a camera
            return true;
        } else {
            // no camera on this device
            return false;
        }
    }

    public static Camera getCameraInstance(){
        Camera c = null;
        try {
            c = Camera.open(); // attempt to get a Camera instance
        }
        catch (Exception e){
            // Camera is not available (in use or does not exist)
        }
        return c; // returns null if camera is unavailable
    }
}
