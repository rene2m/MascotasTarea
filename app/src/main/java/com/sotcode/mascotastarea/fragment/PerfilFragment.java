package com.sotcode.mascotastarea.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.sotcode.mascotastarea.R;
import com.sotcode.mascotastarea.adapter.MascotaAdaptador;
import com.sotcode.mascotastarea.adapter.PerfilAdaptador;
import com.sotcode.mascotastarea.pojo.Mascotas;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class PerfilFragment extends Fragment {
    ArrayList<Mascotas> mascota;
    private RecyclerView listaMascotas;
    private ImageView favoritos;
    public PerfilFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_perfil, container, false);
        ListaDeMascota();
        listaMascotas = (RecyclerView) v.findViewById(R.id.recycler_perfil);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        listaMascotas.setLayoutManager(llm);
        iniciarAdaptador();
        return v;
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
        PerfilAdaptador adapter = new PerfilAdaptador(mascota, getActivity());
        listaMascotas.setAdapter(adapter);
    }
}
