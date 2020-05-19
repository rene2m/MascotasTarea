package com.sotcode.mascotastarea.adapter;

import android.app.Activity;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.sotcode.mascotastarea.MascotaRaiting;
import com.sotcode.mascotastarea.R;
import com.sotcode.mascotastarea.pojo.Mascotas;

import java.util.ArrayList;

public class PerfilAdaptador extends RecyclerView.Adapter<PerfilAdaptador.PerfilViewHolder>{
    ArrayList<Mascotas> mascota;
    Activity activity;
    public PerfilAdaptador(ArrayList<Mascotas> mascota, Activity activity){
        this.mascota = mascota;
        this.activity = activity;
    }
    @NonNull
    @Override
    public PerfilViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_perfil,parent,false);
        return new PerfilAdaptador.PerfilViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PerfilViewHolder holder, int position) {
        Mascotas masc = mascota.get(position);
        holder.imagen.setImageResource(masc.getFoto());
        holder.nombre.setText(masc.getNombre());
        holder.raiting.setText(masc.getRaiting());
        holder.imagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity, "error", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(activity, MascotaRaiting.class);
                activity.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return mascota.size();
    }

    public static class PerfilViewHolder extends RecyclerView.ViewHolder {
        private ImageView imagen;
        private TextView nombre;
        private TextView raiting;
        public PerfilViewHolder(@NonNull View itemView) {
            super(itemView);
            imagen  = (ImageView) itemView.findViewById(R.id.imagen);
            nombre  = (TextView) itemView.findViewById(R.id.nombreMascota);
            raiting = (TextView) itemView.findViewById(R.id.raiting);
        }
    }
}
