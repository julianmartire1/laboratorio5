package com.example.alumno.clase2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String nombre;
    private String apellido;
    private int dni;
    private int sexo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSave = (Button)super.findViewById(R.id.btnSave);

        MyListener myListener = new MyListener(this);

        btnSave.setOnClickListener(myListener);
    }

}
