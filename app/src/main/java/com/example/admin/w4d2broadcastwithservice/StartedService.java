package com.example.admin.w4d2broadcastwithservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class StartedService extends Service {
    private static final String TAG = "TAG_";

    public StartedService() {
        Log.d(TAG, "onConstruct: ");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate: ");
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        Log.d(TAG, "onBind: ");
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    
}
