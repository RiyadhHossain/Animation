package com.example.animationriyadh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ThirdActivity extends AppCompatActivity {
    TextView text1;
    Animation animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        text1=findViewById(R.id.text1);
        animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_animation);
        text1.setAnimation(animation);

    }
}