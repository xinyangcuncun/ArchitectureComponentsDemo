package com.example.netease.architecturecomponentsdemo.app;

import android.app.Application;

import com.example.netease.architecturecomponentsdemo.data.local.db.AppDatabaseManager;

/**
 * Created by netease on 17/11/15.
 */

public class MyApplication extends Application {
    private static MyApplication INSTANCE = null;

    public static MyApplication getInstance() {
        return INSTANCE;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        INSTANCE = this;
        AppDatabaseManager.getInstance().createDB(this);
    }
}
