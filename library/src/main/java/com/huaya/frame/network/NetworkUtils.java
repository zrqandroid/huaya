package com.huaya.frame.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/**
 * Created by zhuruqiao on 2017/4/25.
 * e-mail:563325724@qq.com
 */

public class NetworkUtils {

    public static final int STATE_NONE = 0;
    public static final int STATE_WIFI = 1;
    public static final int STATE_CELLULAR = 2;

    public static int STATE;


    public static int getState(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            NetworkInfo cellularInfo = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);
            NetworkInfo wifiInfo = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
            if (wifiInfo != null && wifiInfo.isConnected()) {
                return STATE_WIFI;
            }
            if (cellularInfo != null && cellularInfo.isConnected()) {
                return STATE_CELLULAR;
            }

        } else {
            return STATE_NONE;
        }

        return STATE_NONE;

    }


}
