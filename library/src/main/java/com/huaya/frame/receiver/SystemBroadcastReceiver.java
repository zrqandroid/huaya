package com.huaya.frame.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;

import com.huaya.frame.network.NetworkUtils;

/**
 * Created by zhuruqiao on 2017/4/25.
 * e-mail:563325724@qq.com
 */

public class SystemBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {

        switch (intent.getAction()) {
            case ConnectivityManager.CONNECTIVITY_ACTION:
                NetworkUtils.STATE = NetworkUtils.getState(context);
                break;
        }

    }
}
