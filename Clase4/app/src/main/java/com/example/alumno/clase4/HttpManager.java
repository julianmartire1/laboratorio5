package com.example.alumno.clase4;

import android.util.Log;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by alumno on 11/04/2019.
 */

public class HttpManager {

    public String GetMethod(String url) {
        try {
            //http://www.lslutnfra.com/alumnos/practicas/listaPersonas.xml
            //https://jsonplaceholder.typicode.com/users
            URL urlGet = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlGet.openConnection();


            connection.setRequestMethod("GET");
            connection.connect();

            int res = connection.getResponseCode();

            if(res == 200 || res == 201){
                InputStream is = connection.getInputStream();
                ByteArrayOutputStream bao = new ByteArrayOutputStream();

                byte[] aux = new byte[1024];
                int cantidadBytesLeidos = 0;

                while ((cantidadBytesLeidos = is.read(aux)) != -1) {
                    bao.write(aux, 0, cantidadBytesLeidos);
                }

                is.close();
                String resp = new String(bao.toByteArray());
                //Log.d("connect", resp);
                return resp;
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "err";
    }

    public byte[] GetMethodImage(String url) {
        try {
            //http://www.lslutnfra.com/alumnos/practicas/listaPersonas.xml
            //https://jsonplaceholder.typicode.com/users
            URL urlGet = new URL(url);
            HttpURLConnection connection = (HttpURLConnection) urlGet.openConnection();


            connection.setRequestMethod("GET");
            connection.connect();

            int res = connection.getResponseCode();

            if(res == 200 || res == 201){
                InputStream is = connection.getInputStream();
                ByteArrayOutputStream bao = new ByteArrayOutputStream();

                byte[] aux = new byte[1024];
                int cantidadBytesLeidos = 0;

                while ((cantidadBytesLeidos = is.read(aux)) != -1) {
                    bao.write(aux, 0, cantidadBytesLeidos);
                }

                is.close();
                return bao.toByteArray();
            }

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }
}
