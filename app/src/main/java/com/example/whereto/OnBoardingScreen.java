package com.example.whereto;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.whereto.HelperClasses.SliderAdapter;

public class OnBoardingScreen extends AppCompatActivity {

    ViewPager viewPager;
    LinearLayout dotsLayout;

    SliderAdapter sliderAdapter;
    TextView[] dots;

    Button letsGetStarted;
    Button skipBtn;

    Animation animation;

    int currentPosition;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_on_boarding_screen);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        //Hooks
        viewPager = findViewById(R.id.slider);
        dotsLayout = findViewById(R.id.dots);

        letsGetStarted = findViewById(R.id.get_started_btn);
        skipBtn = findViewById(R.id.skip_btn);

        //call adapter
        sliderAdapter = new SliderAdapter(this);
        viewPager.setAdapter(sliderAdapter);

        addDots(0);
        viewPager.addOnPageChangeListener(changeListener);

    }

    public void skip(View view){
        startActivity(new Intent(getApplicationContext(),LoginScreen.class));
        finish();
    }

    public void next(View view){
        viewPager.setCurrentItem(currentPosition + 1); //just move it 1 position from current one
    }

    public void getStarted(View view){
        startActivity(new Intent(getApplicationContext(),LoginScreen.class));
        finish();
    }


    private void addDots(int position){

        dots = new TextView[5];
        dotsLayout.removeAllViews();

        for(int i=0; i<dots.length; i++){
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226;"));
            dots[i].setTextSize(35);

            dotsLayout.addView(dots[i]);
        }

        if (dots.length > 0){
            dots[position].setTextColor(getResources().getColor(R.color.purple_500));
        }

    }

    ViewPager.OnPageChangeListener changeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDots(position);

            //getting current position from here
            currentPosition = position;

            if(position == 0){
                letsGetStarted.setVisibility(View.INVISIBLE);
            }
            else if(position == 1){
                letsGetStarted.setVisibility(View.INVISIBLE);
            }
            else if(position == 2){
                letsGetStarted.setVisibility(View.INVISIBLE);
            }
            else if(position == 3){
                letsGetStarted.setVisibility(View.INVISIBLE);
            }
            else {
                animation = AnimationUtils.loadAnimation(OnBoardingScreen.this,R.anim.side_anim);
                letsGetStarted.setAnimation(animation);
                letsGetStarted.setVisibility(View.VISIBLE);
            }

            if (position == 4){
                skipBtn.setVisibility(View.INVISIBLE);
            }
            else{
                skipBtn.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };
}