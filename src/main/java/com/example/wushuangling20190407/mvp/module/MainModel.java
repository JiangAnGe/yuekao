package com.example.wushuangling20190407.mvp.module;

/**
 * author:AbnerMing
 * date:2019/3/18
 */
public interface MainModel {

    interface CallBackListener {
        void success(String data);

        void fail();
    }

    //请求商品数据
    void doCommodity(String keyword, int page, CallBackListener listener);


    void doShopDetail(String id, CallBackListener listener);
}
