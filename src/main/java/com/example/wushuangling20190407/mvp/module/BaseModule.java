package com.example.wushuangling20190407.mvp.module;

import com.example.wushuangling20190407.net.OkHttpUtils;

import okhttp3.FormBody;

public class BaseModule implements Module {
    @Override
    public void showGet(final int type, String url, final MyCallBack callBack) {
        new OkHttpUtils().get(url).request(new OkHttpUtils.HttpListener() {
            @Override
            public void success(String data) {
                callBack.success(type, data);
            }

            @Override
            public void fail(String error) {
                callBack.fail(error);
            }
        });
    }

    @Override
    public void showPost(final int type, String url, final MyCallBack callBack, FormBody.Builder builder) {
        OkHttpUtils httpUtils = new OkHttpUtils();
        if (builder == null) {
            httpUtils.get(url);
        } else {
            httpUtils.post(url, builder);
        }

        httpUtils.request(new OkHttpUtils.HttpListener() {
            @Override
            public void success(String data) {
                callBack.success(type, data);
            }

            @Override
            public void fail(String error) {
                callBack.fail(error);
            }
        });

    }

    @Override
    public void doCommodity(String keyword, int page, MainModel.CallBackListener listener) {

    }
}
