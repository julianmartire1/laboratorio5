package com.example.alumno.clase2;

import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

/**
 * Created by alumno on 28/03/2019.
 */

public class MyListener implements View.OnClickListener {

    public MainActivity act;
    public MyListener(MainActivity act){
        this.act = act;
    }

    @Override
    public void onClick(View v) {
        EditText etNombre = (EditText)act.findViewById(R.id.nombre);
        EditText etApellido = (EditText)act.findViewById(R.id.apellido);
        EditText etDni = (EditText)act.findViewById(R.id.dni);
        RadioButton etSexo = (RadioButton)act.findViewById(R.id.radioHombre);

        String sexo = "";

        if(etSexo.isChecked()) {
            sexo = "Hombre";
        } else {
            sexo = "Mujer";
        }

        Persona persona = new Persona(etNombre.getText().toString(),etApellido.getText().toString(),Integer.parseInt(etDni.getText().toString()),sexo);

        if(v.getId() == R.id.btnSave){
            Log.d("Click", persona.toString());
        }
        else{
            Log.d("Click", "Se hizo click en el boton2");
        }
    }
}
