package com.carematix.droapp.preference;

import android.util.Log;

/**
 * Created by Ankit chauhan on 20-02-2020.
 */

public class Logs {

    public static boolean isVisible = true;

    public static void e(String tag, String msg){
        if(isVisible){
            Log.e(tag +" : TAG e visible : ",msg);
        }
    }


    public static void d(String tag, String msg){
        if(isVisible){
            Log.d(tag +" : TAG d visible : ",msg);
        }
    }

    public static void v(String tag, String msg){
        if(isVisible){
            Log.v(tag +" : TAG v visible : ",msg);
        }
    }

    public static void i(String tag, String msg){
        if(isVisible){
            Log.i(tag +" : TAG i visible : ",msg);
        }
    }


    public static void printStack(Exception e){
        // print value in log
        if(isVisible)
        System.out.print(""+e);
    }
}
