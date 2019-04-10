package com.example.wushuangling20190407.adapter;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;


public class FragPageAdapter extends FragmentPagerAdapter {
    private List<Fragment> list;

    public FragPageAdapter(FragmentManager fm, List<Fragment> list) {
        super(fm);
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Fragment getItem(int i) {
        return list.get(i);
    }


}
