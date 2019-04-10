package com.example.wushuangling20190407.mvp.view;

/**
 * @Auther:wsl
 * @Date:
 * @Description:
 */
public interface ShowView {

    void success(int type, String data);//成功

    void fail(String error);//失败

}
