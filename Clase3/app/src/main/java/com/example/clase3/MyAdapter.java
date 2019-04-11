package com.example.clase3;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by alumno on 04/04/2019.
 */

public class MyAdapter extends RecyclerView.Adapter<MyViewHoleder> {
    List<PersonaModel> personas;
    public MyAdapter(List<PersonaModel> personas){
        this.personas = personas;
    }

    @Override
    public MyViewHoleder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = null;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recy,parent,false);

        MyViewHoleder myViewHoleder = new MyViewHoleder(v);
        return myViewHoleder;
    }

    @Override
    public void onBindViewHolder(MyViewHoleder holder, int position) {
        PersonaModel p = this.personas.get(position);

        holder.tvApellido.setText(p.getApellido());
        holder.tvNombre.setText(p.getNombre());
    }

    @Override
    public int getItemCount() {
        return this.personas.size();
    }
}

