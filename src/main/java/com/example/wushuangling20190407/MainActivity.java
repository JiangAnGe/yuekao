package com.example.wushuangling20190407;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.Color;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.wushuangling20190407.view.CricleView;

public class MainActivity extends AppCompatActivity {

    private CricleView mCricleView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        mCricleView = findViewById(R.id.cricle);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,LoginActivity.class));
            }
        });
//        int width = getWindowManager().getDefaultDisplay().getWidth();
//        int height = getWindowManager().getDefaultDisplay().getHeight();
//        ObjectAnimator objectAnimatorX = ObjectAnimator.ofFloat(mCricleView, "translationX", 0, width - 100);
//        ObjectAnimator objectAnimatorY = ObjectAnimator.ofFloat(mCricleView, "translationY", 0, width - 100);
//
//        AnimatorSet animatorSet = new AnimatorSet();
//        animatorSet.setDuration(3000);
//
//        animatorSet.play(objectAnimatorX).with(objectAnimatorY);
//        animatorSet.start();
//        animatorSet.addListener(new Animator.AnimatorListener() {
//            @Override
//            public void onAnimationStart(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationEnd(Animator animation) {
//                //跳转
//                startActivity(new Intent(MainActivity.this, LoginActivity.class));
//                finish();
//            }
//
//            @Override
//            public void onAnimationCancel(Animator animation) {
//
//            }
//
//            @Override
//            public void onAnimationRepeat(Animator animation) {
//
//            }
//        });
//       new Handler().postDelayed(new Runnable() {
//           @Override
//           public void run() {
//               mCricleView.setColor(Color.BLUE);
//           }
//       },1000);
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                mCricleView.setColor(Color.BLACK);
//            }
//        },2000);


    }
}
