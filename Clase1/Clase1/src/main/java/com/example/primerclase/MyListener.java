package com.example.primerclase;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MyListener implements View.OnClickListener {
    public MainActivity act;
    public MyListener(MainActivity act){
        this.act = act;
    }
    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.button4){
            Log.d("Click", "Se hizo click en el boton");
        }
        else{
            Log.d("Click", "Se hizo click en el boton2");
            EditText text = (EditText)act.findViewById(R.id.editText);
            text.setText("");
        }
    }
}
