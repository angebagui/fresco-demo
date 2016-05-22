package com.herokuapp.angebagui.retrofitdemo;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;

/**
 * Created by angebagui on 22/05/2016.
 */
public class FrescoDemoApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);

    }
}
