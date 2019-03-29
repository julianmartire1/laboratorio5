package com.example.primerclase;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView)super.findViewById(R.id.textView);
        textView.setText(("Nuevo texto2"));

        Button btn = (Button)super.findViewById(R.id.button4);
        Button btn2 = (Button)super.findViewById(R.id.button);
        MyListener click = new MyListener(this);
        btn.setOnClickListener(click);
        btn2.setOnClickListener(click);
        EditText editText = (EditText)super.findViewById(R.id.editText);
        editText.setText("hola");


    }

}
