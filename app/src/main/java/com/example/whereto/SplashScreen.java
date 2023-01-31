package com.example.whereto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreen extends AppCompatActivity {

    Handler handler;

    SharedPreferences onBoardingScreen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        handler = new Handler();
        handler.postDelayed(() -> {

            onBoardingScreen = getSharedPreferences("onBoardingScreen",MODE_PRIVATE);
            boolean isFirstTime = onBoardingScreen.getBoolean("firstTime",true);

            if(isFirstTime){

                SharedPreferences.Editor editor = onBoardingScreen.edit();
                editor.putBoolean("firstTime",false);
                editor.commit();

                Intent i = new Intent(getApplicationContext(),OnBoardingScreen.class);
                startActivity(i);
                finish();
            }
            else{
                Intent i = new Intent(getApplicationContext(),LoginScreen.class);
                startActivity(i);
                finish();
            }
        },3000);

        ImageView image = (ImageView) findViewById(R.id.imageView1 );
        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slideup);
        image.startAnimation(animation1);



    }
}