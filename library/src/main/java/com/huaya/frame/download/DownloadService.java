package com.huaya.frame.download;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;
import android.text.TextUtils;

import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by zhuruqiao on 2017/4/25.
 * e-mail:563325724@qq.com
 */

public class DownloadService extends Service {

    public static final String URL = "URL";

    public static final String SAVE_PATH = "save_path";

    public static final int TIME_OUT = 5000;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        final String downloadUrl = intent.getStringExtra(URL);
        if (!TextUtils.isEmpty(downloadUrl)) {
            URL url = null;
            try {

                url = new URL(downloadUrl);
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setConnectTimeout(TIME_OUT);
            } catch (Exception e) {
                e.printStackTrace();
            }


        }
        return super.onStartCommand(intent, flags, startId);
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
}
