package com.example.mylocation;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but1 = (Button) findViewById((R.id.button));



        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AboutDevice = new Intent(MainActivity.this,AboutDeviceActivity.class);
                startActivity(AboutDevice);

            }

        });
    }
}
