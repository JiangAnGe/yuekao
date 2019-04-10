package com.example.wushuangling20190407.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wushuangling20190407.R;
import com.example.wushuangling20190407.mvp.view.ShowView;

public class Frag03 extends Fragment implements ShowView {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag03_item, container, false);

        return view;
    }

    @Override
    public void success(int type, String data) {

    }

    @Override
    public void fail(String error) {

    }
}
