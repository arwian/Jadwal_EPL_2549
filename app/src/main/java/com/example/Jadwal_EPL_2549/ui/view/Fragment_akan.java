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
import com.example.Jadwal_EPL_2549.api.Ambil;
import com.example.Jadwal_EPL_2549.api.Service;
import com.example.Jadwal_EPL_2549.model.EventsItem;
import com.example.Jadwal_EPL_2549.model.Match_akandatang;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class Fragment_akan extends Fragment {

    private List<EventsItem> listEvents;
    private RecyclerView rvNextMatch;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_next, container, false);
        rvNextMatch = view.findViewById(R.id.rv_nextmatch);
        rvNextMatch.setHasFixedSize(true);
        rvNextMatch.setLayoutManager(new LinearLayoutManager(getContext()));

        Service service = Ambil.getRetrofitInstance().create(Service.class);
        Call<Match_akandatang> call = service.getNextMatch("4328");
        call.enqueue(new Callback<Match_akandatang>() {
            @Override
            public void onResponse(Call<Match_akandatang> call, Response<Match_akandatang> response) {
                listEvents = (List<EventsItem>) response.body().getEvents();

                Adapter_sudahberlalu previousMatchAdapter = new Adapter_sudahberlalu(listEvents);
                rvNextMatch.setAdapter(previousMatchAdapter);
            }

            @Override
            public void onFailure(Call<Match_akandatang> call, Throwable t) {

            }
        });

        return view;
    }
}