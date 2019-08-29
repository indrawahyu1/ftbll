package com.example.ftbll;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;

public class Sceduleapp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AndroidNetworking.initialize(getApplicationContext());
    }
}
