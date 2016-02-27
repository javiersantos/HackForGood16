package com.servis.servis.fragments;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.servis.servis.R;
import com.servis.servis.bindablelayouts.MicroserviceLayout;
import com.servis.servis.models.Microservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;
import io.nlopez.smartadapters.SmartAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class NearestFragment extends Fragment {


    @Bind(R.id.rvNearest)
    RecyclerView mRecyclerViewNearest;

    public NearestFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =  inflater.inflate(R.layout.fragment_nearest, container, false);
        ButterKnife.bind(this, rootView);

        configureRecyclerView();

        return rootView;
    }


    @Override
    public void onDestroyView() {
        super.onDestroyView();
        ButterKnife.unbind(this);
    }


    private void configureRecyclerView(){
        mRecyclerViewNearest.setHasFixedSize(true);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getContext());
        mRecyclerViewNearest.setLayoutManager(layoutManager);


        SmartAdapter.items(getFicticialItems())
                .map(Microservice.class, MicroserviceLayout.class)
                .into(mRecyclerViewNearest); //add listener
    }


    private List<Microservice> getFicticialItems(){

        Microservice m1 = new Microservice("Carpinteria", "Av. Reina Mercedes", 2.5, 10., "Aqui descripción", "Pedro Llamas", ContextCompat.getDrawable(getContext(), R.drawable.carpinteria));
        Microservice m2 = new Microservice("Clases Particulares", "Av. La Palmera", 4., 11., "Aqui descripcion", "Antonio Burguillos", ContextCompat.getDrawable(getContext(), R.drawable.clases));
        Microservice m3 = new Microservice("Limpieza", "Calle Torneo", 5., 9., "Aqui descripcion", "Jesús Pineda", ContextCompat.getDrawable(getContext(), R.drawable.limpiar));

        return Arrays.asList(m1, m2,m3);
    }
}
