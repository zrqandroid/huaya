package com.huaya.frame.download;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by zhuruqiao on 2017/4/25.
 * e-mail:563325724@qq.com
 */

public class DownloadThread extends Thread {

    private Task task;

    public DownloadThread(Task task) {
        this.task = task;
    }

    @Override
    public void run() {
        try {
            URL url = new URL(task.downloadUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setConnectTimeout(DownloadManager.TIME_OUT);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
