package com.example.wushuangling20190407.view;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import com.example.wushuangling20190407.R;
import com.example.wushuangling20190407.bean.ShopDetailBean;
import com.example.wushuangling20190407.mvp.module.BaseModule;
import com.example.wushuangling20190407.mvp.presenter.BasePresenter;
import com.example.wushuangling20190407.mvp.view.BaseView;
import com.google.gson.Gson;

public class CommodityDetailsActivity extends AppCompatActivity implements BaseView {

    private ViewPager mImage;
    private TextView mPrice, mNum, mTitle;
    private String[] picTrueArr;
    private ImagePageAdapter mImagePageAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_commodity);
        int id = getIntent().getIntExtra("id", 103);

       BasePresenter presenter = new BasePresenter(new BaseModule(), this);
        mImage = (ViewPager) findViewById(R.id.viewpage);
        mPrice = (TextView) findViewById(R.id.tv_price);
        mNum = (TextView) findViewById(R.id.tv_num);
        mTitle = (TextView) findViewById(R.id.tv_title);

        mImagePageAdapter = new ImagePageAdapter();
        mImage.setAdapter(mImagePageAdapter);
    }

    @Override
    public void success(int type, String data) {
        try {
            ShopDetailBean bean = new Gson().fromJson(data, ShopDetailBean.class);
            mTitle.setText(bean.getResult().getCommodityName());
            mPrice.setText("¥" + bean.getResult().getPrice());
            mNum.setText("已售" + bean.getResult().getSaleNum() + "件");
            String picTrue = bean.getResult().getPicture();
            picTrueArr = picTrue.split(",");
            mImagePageAdapter.notifyDataSetChanged();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public void fail(String error) {

    }

    private class ImagePageAdapter extends PagerAdapter {

        @Override
        public int getCount() {
            if (picTrueArr == null) {
                return 0;
            }
            return picTrueArr.length;
        }

        @Override
        public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
            return view == o;
        }

        @NonNull
        @Override
        public Object instantiateItem(@NonNull ViewGroup container, int position) {

            ImageView imageView = new ImageView(CommodityDetailsActivity.this);

            Glide.with(CommodityDetailsActivity.this).load(picTrueArr[position]).into(imageView);
            container.addView(imageView);

            return imageView;
        }

        @Override
        public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
            container.removeView((View) object);
        }
    }
}
