package com.example.wushuangling20190407.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
;
import android.support.v7.widget.GridLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;


import com.example.wushuangling20190407.R;
import com.example.wushuangling20190407.adapter.CommodityAdapter;
import com.example.wushuangling20190407.adapter.CommodityAddapter;
import com.example.wushuangling20190407.bean.JsonBean;
import com.example.wushuangling20190407.mvp.module.BaseModule;
import com.example.wushuangling20190407.mvp.presenter.BasePresenter;
import com.example.wushuangling20190407.mvp.view.BaseView;
import com.google.gson.Gson;
import com.jcodecraeer.xrecyclerview.XRecyclerView;


public class Frag01 extends Fragment implements BaseView {


    private RelativeLayout mLayoutShopNull;
    private XRecyclerView mXRecyclerView;
    private CommodityAdapter mCommodityAddapter;
    private GridLayoutManager gridLayoutManager;
    private BasePresenter mBasePresenter;
    private Button btn_seach;
    private EditText mEditText;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag01_item, container, false);
        mLayoutShopNull = view.findViewById(R.id.layout_shop_null);
        mXRecyclerView = view.findViewById(R.id.xrecyclerview);
        mEditText = view.findViewById(R.id.ed_seach);
        btn_seach = view.findViewById(R.id.btn_seach);

        mCommodityAddapter = new CommodityAdapter(getActivity());
        gridLayoutManager = new GridLayoutManager(getActivity(), 2);

        mXRecyclerView.setLayoutManager(gridLayoutManager);
        mXRecyclerView.setAdapter(mCommodityAddapter);
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mBasePresenter = new BasePresenter(new BaseModule(), this);
        btn_seach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seach();
            }
        });
        mBasePresenter.doCommodity();
    }

    private void seach() {
        String content = mEditText.getText().toString().trim();
        if (TextUtils.isEmpty(content)){
            Toast.makeText(getActivity(),"请输入要搜索的商品",Toast.LENGTH_SHORT).show();
            return;
        }

    }

    @Override
    public void success(int type, String data) {
        JsonBean bean = new Gson().fromJson(data, JsonBean.class);
        if (bean.getResult().size() == 0){
            mLayoutShopNull.setVisibility(View.VISIBLE);
        }else{
            mLayoutShopNull.setVisibility(View.GONE);

        }
        mCommodityAddapter.setList(bean.getResult());
    }

    @Override
    public void fail(String error) {

    }
}


