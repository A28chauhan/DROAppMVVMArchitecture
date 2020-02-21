package com.carematix.droapp.view;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.carematix.droapp.R;
import com.carematix.droapp.preference.*;
import com.carematix.droapp.utils.*;

import java.util.Calendar;

public class SplashScreenActivity extends AppCompatActivity
         {
//implements UtilConstants,PrefConstants
    PrefManager prefManager;
    DefaultPreference defaultPreference;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        try {
            Utilities.adjustFontScale(SplashScreenActivity.this,getResources().getConfiguration());
        } catch (Exception e) {
            e.printStackTrace();
        }

        prefManager = new PrefManager(SplashScreenActivity.this);
        defaultPreference = new DefaultPreference(SplashScreenActivity.this);

        prefManager.setLongValue(PrefConstants.LAST_VISITED_DATE,System.currentTimeMillis());
        prefManager.setIntegerValue(UtilConstants.SET_DASHBOARD,2);
        prefManager.setBooleanValue(PrefConstants.WAKE_LOGIN_TIME,true);
        prefManager.setBooleanValue(PrefConstants.USER_INFO_VIEW,false);

        prefManager = new PrefManager(SplashScreenActivity.this);
        if(prefManager.getBooleanValue(PrefConstants.PREFERENCE_LOGIN_CHECK)){
            updateScheduleData();
        }

    }

    public void updateScheduleData(){
        // Calendar data set...
        try {
            Calendar calendar = Calendar.getInstance();
            /*String currentDate =Utilities.timeInDBDate(calendar.getTimeInMillis());
            String getDate = prefManager.getStringValue(PrefConstants.UPDATE_CURRENT_STATE_DATE);
            if(!currentDate.equals(getDate)){
                prefManager.setStringValue(PrefConstants.UPDATE_CURRENT_STATE_DATE,currentDate);
                Intent its = new Intent(SplashScreenActivity.this, UpdateDailySurveyList.class);
                startService(its);

                Intent it = new Intent(SplashScreenActivity.this, UpdateCurrentStateService.class);
                SplashScreenActivity.this.startService(it);
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
