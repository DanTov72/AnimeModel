package com.example.animemodel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainModel mainFragment = new MainModel();
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, mainFragment).commit();
    }
}