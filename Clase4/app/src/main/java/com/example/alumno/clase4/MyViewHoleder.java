package com.example.alumno.clase4;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MyViewHoleder extends RecyclerView.ViewHolder implements  View.OnClickListener {
    public TextView tvNombre;
    public TextView tvApellido;

    private MyOnItemClick listener;
    private int position;

    public MyViewHoleder(View v,MyOnItemClick listener){
        super(v);
        v.setOnClickListener(this);
        tvNombre = (TextView) v.findViewById(R.id.tvNombre);
        tvApellido = (TextView) v.findViewById(R.id.tvApellido);
        this.listener = listener;
    }

    @Override
    public void onClick(View v) {
        //Log.d("Click", (String) tvNombre.getText());
        this.listener.onItemClick(this.position);
    }

    public void setPosition(int position)
    {
        this.position = position;
    }
}
