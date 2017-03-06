package com.openweather.logutil;

import android.util.Log;

/**
 * Created by andy6804tw on 2017/3/5.
 */

public class LogDebug {
    private static final  String TAG="LogUtil Library:";
    public static void d(String message){
        Log.d(TAG,message);
    }
    public static void e(String message){
        Log.e(TAG,message);
    }
}
