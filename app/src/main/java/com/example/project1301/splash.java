package com.example.project1301;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.project1301.Activity.MainActivity;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Timer;
import java.util.TimerTask;

public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                if(FirebaseAuth.getInstance().getCurrentUser() == null) {
                    Intent intent = new Intent(splash.this, HomeActivity.class);
                    startActivity(intent);
                }else{
                    Intent intent = new Intent(splash.this, MainActivity.class);
                    startActivity(intent);
                }
                finish();

            }
        };

        timer.schedule(task, 2000);
    }
}