package com.example.clase3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
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
        personas.add(new PersonaModel("Lautaro","Cosme","4240-7810"));
        personas.add(new PersonaModel("Sheldon","Cooper","4831-6842"));
        personas.add(new PersonaModel("Peny","Lalalala","4789-3651"));
        personas.add(new PersonaModel("Seiya","Pegaso","4012-9864"));
        personas.add(new PersonaModel("Goku","Kakaroto","4653-7436"));
        personas.add(new PersonaModel("Lui","Kang","4589-1258"));
        personas.add(new PersonaModel("David","Caceres","4332-6842"));

        RecyclerView rvPersona = (RecyclerView) super.findViewById(R.id.rvPersonas);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rvPersona.setLayoutManager(layoutManager);

        MyAdapter adapter = new MyAdapter(personas);
        rvPersona.setAdapter(adapter);
    }
    public void Llamar(int index){

    }
}

