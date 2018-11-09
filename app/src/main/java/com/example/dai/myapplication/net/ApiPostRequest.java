package com.example.dai.myapplication.net;

import android.os.Build;
import android.util.Log;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.JsonHttpResponseHandler;
import com.loopj.android.http.RequestParams;

import org.apache.commons.httpclient.Header;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.message.BasicHeader;
import org.apache.http.protocol.HTTP;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

/**
 * Created by yun on 2017/5/24.
 */

public class ApiPostRequest {

    private static void addHeaders(RequestParams params) {
        params.put("type", "1");
        params.put("appVersion", "6.5.0");
        params.put("equipment", Build.MODEL);
        params.put("deviceToken", "Ahu-qu_GpNJ7Zz9QVO1ByCmz31ToxXx5EUg2GaKglmLi");
    }

    public static void login(String account, String password, NetWorkCallBack netWorkCallBack) {
        final RequestParams params = new RequestParams();
        params.put("password", "a123456");
        params.put("account", "17602115477");

        params.put("appVersion", "6.5.0");
        params.put("type", "1");
        AsyncHttpClient client = new AsyncHttpClient();

        client.post("http://test.xinjucai.com:8282/user/login", params, new JsonHttpResponseHandler() {

            @Override
            public void onSuccess(int statusCode, org.apache.http.Header[] headers, JSONObject response) {
                super.onSuccess(statusCode, headers, response);
                Log.e("11111111111", response.toString());
            }
        });

//        client.post("http://test.xinjucai.com:8282/user/login",params,new JsonHttpResponseHandler(){
//                    @Override
//                    public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
//                        super.onSuccess(statusCode, headers, response);
//                        Log.e("rs",response.toString());
//                    }
//                    @Override
//                    public void onFailure(int statusCode, Header[] headers, Throwable throwable, JSONObject errorResponse) {
//                        super.onFailure(statusCode, headers, throwable, errorResponse);
//                        Toast.makeText(mContext,"网络错误",Toast.LENGTH_LONG).show();
//                    }

//        JSONObject data = new JSONObject();
//        data.put("type", "1");
//        data.put("password", "a123456");
//        data.put("account", "17602115477");
//        data.put("appVersion", "6.5.0");

//            data.put("equipment", Build.MODEL);
//            data.put("deviceToken", "Ahu-qu_GpNJ7Zz9QVO1ByCmz31ToxXx5EUg2GaKglmLi");
//        ByteArrayEntity entity = null;
//        try {
//            entity = new ByteArrayEntity(data.toString().getBytes("UTF-8"));
//            entity.setContentType(new BasicHeader(HTTP.CONTENT_TYPE, "application/json"));
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//        }
////            StringEntity entity = new StringEntity(data.toString(), "UTF-8");
//        AsyncApiClient.post(entity, "http://test.xinjucai.com:8282/user/login", netWorkCallBack);
        //        mClient.setObject(2);
    }

//    public static void postSSID(String Type, String Name, String Password, String Mode, String ReferStoreID, NetWorkCallBack netWorkCallBack) {
//        try {
//            JSONObject data = new JSONObject();
//            if (!TextUtils.isEmpty(Type)) {
//                data.put("Type", Type);
//            }
//            if (!TextUtils.isEmpty(Name)) {
//                data.put("Name", Name);
//            }
//            if (!TextUtils.isEmpty(Password)) {
//                data.put("Password", Password);
//            }
//            if (!TextUtils.isEmpty(Mode)) {
//                data.put("Mode", Mode);
//            }
//            if (!TextUtils.isEmpty(ReferStoreID)) {
//                data.put("ReferStoreID", ReferStoreID);
//            }
//            StringEntity entity = new StringEntity(data.toString(), "UTF-8");
//            AsyncApiClient.post(entity, Urls.API_GET_CLIENT_ADD_SSID, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//    //    人事管理-岗位 - 新增岗位
//    public static void postPost(int DeptID, List<PostEntity> postEntitys, int IsUnitStaff, NetWorkCallBack netWorkCallBack) {
//        try {
//            JSONObject data = new JSONObject();
//            JSONArray array = new JSONArray();
//            for (PostEntity postEntity : postEntitys) {
//                array.add(postEntity.getPostID());
//            }
//            data.put("DeptID", DeptID);
//            data.put("IsUnitStaff", IsUnitStaff);
//            data.put("PostIDs", array);
//            StringEntity entity = new StringEntity(data.toString(), "UTF-8");
//            AsyncApiClient.post(entity, Urls.API_POST_ORGANIZATION_DEPT_POST, netWorkCallBack);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
}
