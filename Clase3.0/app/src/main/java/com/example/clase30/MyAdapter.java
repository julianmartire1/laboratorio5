package com.example.clase30;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyViewHoleder> {
    private List<PersonaModel> personas;
    private MyOnItemClick listener;

    public MyAdapter(List<PersonaModel> personas, MyOnItemClick listener){
        this.personas = personas;
        this.listener = listener;
    }

    @Override
    public MyViewHoleder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recy,parent,false);

        MyViewHoleder myViewHoleder = new MyViewHoleder(v, listener);
        return myViewHoleder;
    }

    @Override
    public void onBindViewHolder(MyViewHoleder holder, int position) {
        PersonaModel p = this.personas.get(position);

        holder.tvApellido.setText(p.getApellido());
        holder.tvNombre.setText(p.getNombre());
        holder.setPosition(position);
    }

    @Override
    public int getItemCount() {
        return this.personas.size();
    }
}
