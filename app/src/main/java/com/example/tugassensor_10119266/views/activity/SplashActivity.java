package com.example.tugassensor_10119266.views.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.tugassensor_10119266.MainActivity;

/*
 * NIM : 10119266
 * NAMA : Ahmad Haris
 * Kelas : IF-7
 * */
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();
    }
}