package com.jujing.testactivity;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;


public class MainActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout fm = findViewById(R.id.fm);
        getSupportFragmentManager().beginTransaction().replace(fm.getId(),new TabTestFragment()).commit();
    }
}
