package com.example.Jadwal_EPL_2549.ui.view;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.Jadwal_EPL_2549.R;
import com.example.Jadwal_EPL_2549.adapter.Adapter_sudahberlalu;
import com.example.Jadwal_EPL_2549.favorite.DataFaforit;
import com.example.Jadwal_EPL_2549.model.EventsItem;

import java.util.List;


public class Fragment_favorit extends Fragment {

    private List<EventsItem> listEvents;
    private RecyclerView rvFavorites;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_favorite, container, false);

        rvFavorites = view.findViewById(R.id.rv_favorite);
        rvFavorites.setHasFixedSize(true);
        rvFavorites.setLayoutManager(new LinearLayoutManager(getContext()));

        DataFaforit db = new DataFaforit(getContext());

        listEvents = db.getAllFavorite();
        if (listEvents.size() != 0){
            Adapter_sudahberlalu adapter = new Adapter_sudahberlalu(listEvents);
            rvFavorites.setAdapter(adapter);
        }

        return view;
    }
}