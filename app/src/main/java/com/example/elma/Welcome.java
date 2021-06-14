package com.example.elma;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class Welcome extends AppCompatActivity {

    ImageView awan;
    Animation kanankekiri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        awan = findViewById(R.id.awan);
        kanankekiri = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.kirikekanan);

        awan.startAnimation(kanankekiri);
    }
}