package com.example.dai.myapplication.net;

import android.util.Log;

import com.loopj.android.http.AsyncHttpResponseHandler;

import org.apache.http.Header;

/**
 * Created by kendami on 2016/11/14.
 */
public abstract class NetWorkCallBack extends AsyncHttpResponseHandler {
    @Override
    public void onSuccess(int i, org.apache.http.Header[] headers, byte[] bytes) {
        String response = new String(bytes);
        Log.e("111111111111111111111", response);
    }

    @Override
    public void onFailure(int i, Header[] headers, byte[] bytes, Throwable throwable) {

    }

    //    this.onResponse
    public abstract void onResponse(boolean isSucceed, int status, String response);
}
