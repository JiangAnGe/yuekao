package com.example.wushuangling20190407.mvp.module;

import okhttp3.FormBody;


public interface Module {



    public interface MyCallBack{
        void success(int type, String data);

        void fail(String erroe);
    }

    void showGet(int type, String url, MyCallBack callBack);

    void showPost(int type, String url, MyCallBack callBack, FormBody.Builder builder);

    void doCommodity(String keyword, int page, MainModel.CallBackListener listener);
}
