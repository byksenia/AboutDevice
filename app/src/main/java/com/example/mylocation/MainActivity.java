package com.example.mylocation;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    String phraze;
    EditText edittext;
    Button but1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext = (EditText) findViewById(R.id.edittext);
        but1 = (Button) findViewById((R.id.button));

        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                phraze = "Hello, " + edittext.getText().toString()+"!";
                showToast(phraze);


            }

            public void showToast(String text) {
                //создаём и отображаем текстовое уведомление
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
