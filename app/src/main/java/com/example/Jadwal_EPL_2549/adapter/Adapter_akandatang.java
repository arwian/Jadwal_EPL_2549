package com.example.Jadwal_EPL_2549.adapter;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.Jadwal_EPL_2549.DetailActivity;
import com.example.Jadwal_EPL_2549.R;
import com.example.Jadwal_EPL_2549.model.EventsItem;


import java.util.List;

public class Adapter_akandatang extends RecyclerView.Adapter<Adapter_akandatang.ViewHolder>{

    private List<EventsItem> listEvents;

    public Adapter_akandatang(List<EventsItem> listEvents) {
        this.listEvents = listEvents;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row,parent,false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        EventsItem eventsItem = listEvents.get(position);

        holder.txtDate.setText(eventsItem.getDateEvent());
        holder.txtHome.setText(eventsItem.getStrHomeTeam());
        holder.txtScoreHome.setText(eventsItem.getIntHomeScore());
        holder.txtScoreAway.setText(eventsItem.getIntAwayScore());
        holder.txtAway.setText(eventsItem.getStrAwayTeam());



        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.itemView.getContext(),eventsItem.getStrEvent().toString(),Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra("EVENTS_ITEM",eventsItem);
                holder.itemView.getContext().startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return listEvents.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView txtDate;
        TextView txtHome;
        TextView txtScoreHome;
        TextView txtScoreAway;
        TextView txtAway;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            txtDate = itemView.findViewById(R.id.txtDate);
            txtHome = itemView.findViewById(R.id.txtHome);
            txtScoreHome = itemView.findViewById(R.id.txtScoreHome);
            txtScoreAway = itemView.findViewById(R.id.txtScoreAway);
            txtAway = itemView.findViewById(R.id.txtAway);

        }
    }
}
