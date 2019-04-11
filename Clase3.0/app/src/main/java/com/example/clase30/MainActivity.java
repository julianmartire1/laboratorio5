package com.example.clase30;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements MyOnItemClick{
    MyAdapter adapter;
    List<PersonaModel> personas;

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
    }

    @Override
    public void onItemClick(int position) {
        Log.d("Posicion", Integer.toString(position));
    }
}
