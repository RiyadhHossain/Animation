package com.example.animationriyadh;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    Button name1,name2,name3,name4,name5,name6;
    Animation lefttoright,righttoleft,solid_in_left,slaid_in_right,slaid_out_left,slaid_out_right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name1=findViewById(R.id.name1);
        name2=findViewById(R.id.name2);
        name3=findViewById(R.id.name3);
        name4=findViewById(R.id.name4);
        name5=findViewById(R.id.name5);
        name6=findViewById(R.id.name6);

        lefttoright=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.left_to_right);
        name1.setAnimation(lefttoright);

        righttoleft=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.right_to_left);
        name2.setAnimation(righttoleft);

        solid_in_left=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.solid_in_left);
        name3.setAnimation(solid_in_left);

        slaid_in_right=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slaid_in_right);
        name4.setAnimation(slaid_in_right);

        slaid_out_left=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slaid_out_left);
        name5.setAnimation(slaid_out_left);

        slaid_out_right=AnimationUtils.loadAnimation(getApplicationContext(),R.anim.slaid_out_right);
        name6.setAnimation(slaid_out_right);

        name1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),ThirdActivity.class));
            }
        });



    }
}