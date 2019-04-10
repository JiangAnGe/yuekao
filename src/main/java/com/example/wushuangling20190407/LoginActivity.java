package com.example.wushuangling20190407;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RadioGroup;

import com.example.wushuangling20190407.adapter.FragPageAdapter;
import com.example.wushuangling20190407.fragment.Frag01;
import com.example.wushuangling20190407.fragment.Frag02;
import com.example.wushuangling20190407.fragment.Frag03;
import com.example.wushuangling20190407.fragment.Frag04;
import com.example.wushuangling20190407.fragment.Frag05;
import com.example.wushuangling20190407.view.CricleView;

import java.util.ArrayList;
import java.util.List;

public class LoginActivity extends AppCompatActivity {


    private RadioGroup radio_group;
    private ViewPager view_page;
    private List<Fragment> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //初始化
        view_page = (ViewPager) findViewById(R.id.view_page);
        radio_group = (RadioGroup) findViewById(R.id.radio_group);
        //创建集合模拟数据
        list = new ArrayList<>();
        list.add(new Frag01());
        list.add(new Frag02());
        list.add(new Frag03());
        list.add(new Frag04());
        list.add(new Frag05());

        //适配器
        FragPageAdapter adapter = new FragPageAdapter(getSupportFragmentManager(), list);
        view_page.setAdapter(adapter);
        //跟随
        view_page.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int i, float v, int i1) {

            }

            @Override
            public void onPageSelected(int i) {
                radio_group.check(radio_group.getChildAt(i).getId());
            }

            @Override
            public void onPageScrollStateChanged(int i) {

            }
        });
        radio_group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId){
                    case R.id.rd1:
                        view_page.setCurrentItem(0,false);
                        break;
                    case R.id.rd2:
                        view_page.setCurrentItem(1,false);
                        break;
                    case R.id.rd3:
                        view_page.setCurrentItem(2,false);
                        break;
                    case R.id.rd4:
                        view_page.setCurrentItem(3,false);
                        break;
                    case R.id.rd5:
                        view_page.setCurrentItem(4,false);
                        break;
                }
            }
        });


    }
}
