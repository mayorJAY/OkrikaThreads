package com.example.josycom.okrikathreads;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        TextView textView1 = findViewById(R.id.splashText1);
        TextView textView2 = findViewById(R.id.splashText2);

        //Creates the animation from the XML file and applies it to the TextViews
        textView1.setAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_animation));
        textView2.setAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_animation));

        AnimationSet animationSet = new AnimationSet(false);

        animationSet.addAnimation(textView1.getAnimation());
        animationSet.addAnimation(textView2.getAnimation());

        textView1.getAnimation().setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {
                animation.getDuration();
            }

            @Override
            public void onAnimationEnd(Animation animation) {
                startActivity(new Intent(SplashScreenActivity.this, MainActivity.class));
                finish();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        animationSet.start();
    }

}
