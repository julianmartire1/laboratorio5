package com.example.clase3;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MyViewHoleder extends RecyclerView.ViewHolder implements  View.OnClickListener {

    public TextView tvNombre;
    public TextView tvApellido;

    public MyViewHoleder(View v){
        super(v);
        v.setOnClickListener(this);
        tvNombre = (TextView) v.findViewById(R.id.tvNombre);
        tvApellido = (TextView) v.findViewById(R.id.tvApellido);
    }

    @Override
    public void onClick(View v) {
        Log.d("Click", (String) tvNombre.getText());

    }
}
