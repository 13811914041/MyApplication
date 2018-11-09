package com.example.dai.myapplication.net;

import com.example.dai.myapplication.AppApplication;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;

import org.apache.http.HttpVersion;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.HTTP;

import java.security.KeyStore;

public class AsyncApiClient {

    public static void get(String url, AsyncHttpResponseHandler asyncHttpResponseHandler) {
        AsyncHttpClient client = getNewHttpClient();
        try {
            client.get(AppApplication.getInstance(), url, null, "application/json", asyncHttpResponseHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void post(AbstractHttpEntity entity, String url, AsyncHttpResponseHandler asyncHttpResponseHandler) {
        AsyncHttpClient client = getNewHttpClient();
//        AsyncHttpClient client = new AsyncHttpClient();
        try {
            client.post(AppApplication.getInstance(), url, entity, "application/json", asyncHttpResponseHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void put(StringEntity entity, String url, AsyncHttpResponseHandler asyncHttpResponseHandler) {
        AsyncHttpClient client = getNewHttpClient();
        try {
            client.put(AppApplication.getInstance(), url, entity, "application/json", asyncHttpResponseHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void delete(StringEntity entity, String url, AsyncHttpResponseHandler asyncHttpResponseHandler) {
        AsyncHttpClient client = getNewHttpClient();
        try {
            client.delete(AppApplication.getInstance(), url, entity, "application/json", asyncHttpResponseHandler);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

//    private static AsyncHttpClient getNewHttpClient() {
//        KeyStore trustStore = null;
//        sslSocketFactory sf = null;
//        try {
//            trustStore = KeyStore.getInstance(KeyStore
//                    .getDefaultType());
//            trustStore.load(null, null);
//            sf = new sslSocketFactory(trustStore);
//            sf.setHostnameVerifier(sslSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);  //允许所有主机的验证
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        HttpParams params = new BasicHttpParams();
//        HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
//        HttpProtocolParams.setContentCharset(params, org.apache.http.protocol.HTTP.DEFAULT_CONTENT_CHARSET);
//        HttpProtocolParams.setUseExpectContinue(params, true);
//        SchemeRegistry schReg = new SchemeRegistry();
//        //schReg.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
//        //schReg.register(new Scheme("https", SSLSocketFactory.getSocketFactory(), 443));
//        schReg.register(new Scheme("http", PlainSocketFactory
//                .getSocketFactory(), 80));
//        schReg.register(new Scheme("https", sf, 443));
//        ClientConnectionManager conMgr = new ThreadSafeClientConnManager(params, schReg);
//        AsyncHttpClient mClient = new AsyncHttpClient(schReg);
////        mClient.cr(conMgr, params);
//
//        return mClient;
//    }

    // 可以访问https
    public static AsyncHttpClient getNewHttpClient() {
        try {
            KeyStore trustStore = KeyStore.getInstance(KeyStore.getDefaultType());
            trustStore.load(null, null);
            sslSocketFactory sf = new sslSocketFactory(trustStore);
            sf.setHostnameVerifier(sslSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            HttpParams params = new BasicHttpParams();
            HttpProtocolParams.setVersion(params, HttpVersion.HTTP_1_1);
            HttpProtocolParams.setContentCharset(params, HTTP.UTF_8);

            // 设置网络超时为20秒
            params.setIntParameter("http.socket.timeout", 20 * 1000);
            SchemeRegistry registry = new SchemeRegistry();
            registry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
            registry.register(new Scheme("https", sf, 443));
            ClientConnectionManager ccm = new ThreadSafeClientConnManager(params, registry);
            return new AsyncHttpClient(registry);
        } catch (Exception e) {
            return new AsyncHttpClient();
        }
    }
}
