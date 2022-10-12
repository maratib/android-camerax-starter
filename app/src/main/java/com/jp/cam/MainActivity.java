package com.jp.cam;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Main.Activity";
    private final PermissionsDelegate permissionsDelegate = new PermissionsDelegate(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        boolean hasPermission = permissionsDelegate.hasPermissions();
        if (!hasPermission) {
            permissionsDelegate.requestPermissions();
        }
    }
}
