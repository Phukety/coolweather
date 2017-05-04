package com.yuanbw.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by abim on 2017/5/2.
 */

//发送okhttp请求工具类,以后调用时直接使用这个方法然后处理回调结果
public class HttpUtil {
    public static void sentOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
