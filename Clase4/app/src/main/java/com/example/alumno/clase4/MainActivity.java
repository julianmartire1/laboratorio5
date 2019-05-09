package com.example.alumno.clase4;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.media.ImageWriter;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MyOnItemClick, Handler.Callback
{
    MyAdapter adapter;
    List<PersonaModel> personas;
    public static final int TEXTO = 1;
    public static final int IMAGEN = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListener listener = new MyListener(this);
        Button btn = (Button) super.findViewById(R.id.btn);
        btn.setOnClickListener(listener);

        personas = new ArrayList<>();
        personas.add(new PersonaModel("Rodrigo","Balabasquer","4240-9124"));
        personas.add(new PersonaModel("Matias","Pinel","4356-2463"));
        personas.add(new PersonaModel("Pepe","Fulanito","4240-3842"));

        RecyclerView rvPersona = (RecyclerView) super.findViewById(R.id.rvPersonas);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvPersona.setLayoutManager(layoutManager);

        this.adapter = new MyAdapter(personas, this);
        rvPersona.setAdapter(this.adapter);

        Handler handler = new Handler(this);

        MyThread myThread = new MyThread(handler,"http://www.lslutnfra.com/alumnos/practicas/listaPersonas.xml", TEXTO);
        myThread.start();

        MyThread myThreadImagen = new MyThread(handler,"http://www.lslutnfra.com/pagina404/homer404.jpg", IMAGEN);
        myThreadImagen.start();
    }

    @Override
    public void onItemClick(int position) {
        Log.d("Posicion", Integer.toString(position));
    }

    @Override
    public boolean handleMessage(Message msg) {
        if (msg.arg1 == TEXTO) {
            //Log.d("Message", msg.obj.toString());
            TextView tw = (TextView) super.findViewById(R.id.text3);
            tw.setText(msg.obj.toString());
        } else if (msg.arg1 == IMAGEN) {
            //Log.d("Message", "Imagen");
            ImageView iw = (ImageView) super.findViewById(R.id.img);
            byte[] array = (byte[])msg.obj;
            Bitmap bmp = BitmapFactory.decodeByteArray(array, 0, array.length);

            iw.setImageBitmap(bmp);
        }
        return false;
    }
}
