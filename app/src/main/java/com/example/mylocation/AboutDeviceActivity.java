package com.example.mylocation;

import android.os.Build;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AboutDeviceActivity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_device);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final String myDeviceBrand = "Device brand: " + android.os.Build.BRAND;
        final String myDeviceModel = "Device model: " + android.os.Build.MODEL;
        final String myDevice = "Device name: " + android.os.Build.DEVICE;
        final String myAndroidVersion = "Android version: " + android.os.Build.VERSION.RELEASE;
        final String myDeviceSDKVersion = "Device SDK version: " + android.os.Build.VERSION.SDK;
        final String myHardware = "Device Hardware name: " + android.os.Build.HARDWARE;
        final String myManufacturer = "Device manufacturer: " + android.os.Build.MANUFACTURER;

        final String Everything = myDeviceBrand +"\n"+ myDeviceModel +"\n"+ myDevice +"\n" + myAndroidVersion +"\n"+ myDeviceSDKVersion +"\n" + myHardware +"\n"+ myManufacturer +"\n";

        textView = findViewById(R.id.textView);
        textView.setText(Everything);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Snackbar.make(view, myDeviceModel, Snackbar.LENGTH_LONG).show();
            }
        });
    }

}
