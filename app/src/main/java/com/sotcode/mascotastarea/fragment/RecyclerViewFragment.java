package com.sotcode.mascotastarea.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.sotcode.mascotastarea.MascotaRaiting;
import com.sotcode.mascotastarea.pojo.Mascotas;
import com.sotcode.mascotastarea.R;
import com.sotcode.mascotastarea.adapter.MascotaAdaptador;

import java.util.ArrayList;


public class RecyclerViewFragment extends Fragment {
    ArrayList<Mascotas> mascota;
    private RecyclerView listaMascotas;
    private ImageView favoritos;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
           View v =  inflater.inflate(R.layout.fragment_recycler_view, container, false);
        ListaDeMascota();
        listaMascotas = (RecyclerView) v.findViewById(R.id.recycler);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        listaMascotas.setLayoutManager(llm);
        iniciarAdaptador();
        // addFab();
    return  v ;
    }
    public void ListaDeMascota() {
        mascota = new ArrayList<Mascotas>();
        mascota.add(new Mascotas("alex","2",R.drawable.leonsitotarea));
        mascota.add(new Mascotas("choper","8",R.drawable.choppersitotarea));
        mascota.add(new Mascotas("osito","3",R.drawable.panditatarea));
        mascota.add(new Mascotas("gatito","9",R.drawable.jaguarsitotarea));
        mascota.add(new Mascotas("cachorro","1",R.drawable.lobitotarea));




    }
    public void iniciarAdaptador(){
        MascotaAdaptador adaptador = new MascotaAdaptador(mascota, getActivity());
        listaMascotas.setAdapter(adaptador);
    }


}
