package com.example.alumno.clase4;

import android.os.Handler;
import android.os.Message;
import android.util.Log;

public class MyThread extends Thread{

    private Handler handler;
    private String url;
    private int TEXTOIMAGEN;

    public MyThread(Handler handler, String url, int TEXTOIMAGEN) {
        this.handler = handler;
        this.url = url;
        this.TEXTOIMAGEN = TEXTOIMAGEN;
    }

    @Override
    public void run() {
        HttpManager manager = new HttpManager();
        Message m = new Message();

        if (this.TEXTOIMAGEN == MainActivity.TEXTO) {
            String s = manager.GetMethod(this.url);
            m.obj = s;
        } else if (this.TEXTOIMAGEN == MainActivity.IMAGEN){
            byte[] img = manager.GetMethodImage(this.url);
            m.obj = img;
        }

        m.arg1 = this.TEXTOIMAGEN;

        this.handler.sendMessage(m);

    }


}
