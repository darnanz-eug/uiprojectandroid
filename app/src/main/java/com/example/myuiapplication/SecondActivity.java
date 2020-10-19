package com.example.myuiapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {


    public static String CONSTANT_USERINPUT = "USERINPUT";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String userInputText =  SecondActivity.this.getIntent().getStringExtra(CONSTANT_USERINPUT);
        //Show tex
        Toast.makeText(SecondActivity.this, userInputText, Toast.LENGTH_LONG).show();

    }
}