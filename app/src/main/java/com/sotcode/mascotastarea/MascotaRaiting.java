package com.sotcode.mascotastarea;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.sotcode.mascotastarea.adapter.MascotaAdaptador;
import com.sotcode.mascotastarea.pojo.Mascotas;

import java.util.ArrayList;

public class MascotaRaiting extends AppCompatActivity {
    private ImageView back;
    ArrayList<Mascotas> mascota;
    private RecyclerView listaMascotas;
    private ImageView fav;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mascota_raiting);
        atras();
        ListaDeMascota();
        listaMascotas = (RecyclerView) findViewById(R.id.recycler2);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        listaMascotas.setLayoutManager(llm);
        iniciarAdaptador();

    }
    public void atras(){
        back = (ImageView) findViewById(R.id.back);
        fav = (ImageView) findViewById(R.id.favoritos);
        fav.setImageResource(0);
        back.setImageResource(R.drawable.logoregresar);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),MainActivity.class);
                startActivity(intent);

            }
        });
    }
    public void ListaDeMascota() {
        mascota = new ArrayList<Mascotas>();

        mascota.add(new Mascotas("Pepe","8",R.drawable.lobitotarea));
        mascota.add(new Mascotas("Gaston","9",R.drawable.jaguarsitotarea));
        mascota.add(new Mascotas("Raspu","8",R.drawable.panditatarea));
        mascota.add(new Mascotas("Juan","10",R.drawable.choppersitotarea));
        mascota.add(new Mascotas("Fabian","10",R.drawable.leonsitotarea));



    }
    public void iniciarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascota, this);
        listaMascotas.setAdapter(adaptador);
    }
}
