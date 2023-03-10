package com.example.tresenratlla;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

public class Perfil extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);
        ActionBar actionBar = getSupportActionBar();
        int color = getResources().getColor(R.color.colorPrimary);
        actionBar.setBackgroundDrawable(new ColorDrawable(color));

    }
}