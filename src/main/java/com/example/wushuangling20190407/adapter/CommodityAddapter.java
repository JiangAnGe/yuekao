package com.example.wushuangling20190407.adapter;

import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import com.example.wushuangling20190407.bean.JsonBean;

import java.util.List;

public class CommodityAddapter extends RecyclerView.Adapter {
    public CommodityAddapter(FragmentActivity activity) {
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public void setList(List<JsonBean.ResultBean> result) {
    }
}
