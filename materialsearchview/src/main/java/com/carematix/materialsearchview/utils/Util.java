package com.carematix.materialsearchview.utils;

import android.content.Context;
import android.view.View;

import com.google.android.material.snackbar.Snackbar;

/*
 * created by ankit chauhan (06/02/2019)
 * */

public class Util {

    public static int dpToPx(Context context, float dp) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return Math.round(dp * scale);
    }

    public static void showSnackBarMessage(View view, String message){
        Snackbar.make(view, message, Snackbar.LENGTH_SHORT)
                .setAction("Action", null).show();
    }
}
