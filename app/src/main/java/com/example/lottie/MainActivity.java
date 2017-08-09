package com.example.lottie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity
{

    //https://android-arsenal.com/details/1/5203
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LottieAnimationView animationView = (LottieAnimationView) findViewById(R.id.lottie_id);
        animationView.setAnimation("snap_loader_white.json");
        animationView.loop(true);
        animationView.playAnimation();
    }
}
