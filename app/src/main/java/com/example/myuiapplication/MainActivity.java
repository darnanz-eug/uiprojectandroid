package com.example.myuiapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView textFromUser;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Init the UI
        this.textFromUser = this.findViewById(R.id.welcomeViewMessageText);
        this.button = this.findViewById(R.id.welcomeViewMessageButton);

        //Setup events
        this.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Do whatever we want
                String userInputText = String.valueOf(textFromUser.getText());
                //Navigate
                MainActivity.this.navigateToSecondActivity(userInputText);
            }
        });
    }

    private void navigateToSecondActivity(final String userText) {
        MainActivity.this.runOnUiThread(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.setAction(Intent.ACTION_VIEW);
                intent.putExtra(SecondActivity.CONSTANT_USERINPUT, userText);
                MainActivity.this.startActivity(intent);
            }
        });
    }

}