package com.example.wushuangling20190407.adapter;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.wushuangling20190407.R;
import com.example.wushuangling20190407.bean.JsonBean;
import com.example.wushuangling20190407.view.CommodityDetailsActivity;

import java.util.ArrayList;
import java.util.List;


public class CommodityAdapter extends RecyclerView.Adapter<CommodityAdapter.MyViewHolder> {
    private Context context;
    private List<JsonBean.ResultBean> list = new ArrayList<>();


    public CommodityAdapter(Context context) {
        this.context = context;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = View.inflate(context, R.layout.recycler_item, null);
        MyViewHolder myViewHolder = new MyViewHolder(view);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, final int i) {
        myViewHolder.mTitle.setText(list.get(i).getCommodityName());
        myViewHolder.mPrice.setText("¥"+list.get(i).getPrice() + "");
        myViewHolder.mNum.setText("已售" + list.get(i).getSaleNum() + "件");
        Glide.with(context).load(list.get(i).getMasterPic()).into(myViewHolder.mImage);
        myViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(context, CommodityDetailsActivity.class);
                intent.putExtra("id",list.get(i).getCommodityId());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    //传递数据
    public void setList(List<JsonBean.ResultBean> list) {
        this.list = list;
        notifyDataSetChanged();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView mTitle, mPrice, mNum;
        ImageView mImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            mImage = (ImageView) itemView.findViewById(R.id.image);
            mTitle = (TextView) itemView.findViewById(R.id.tv_title);
            mPrice = (TextView) itemView.findViewById(R.id.tv_price);
            mNum = (TextView) itemView.findViewById(R.id.tv_num);
        }
    }
}
