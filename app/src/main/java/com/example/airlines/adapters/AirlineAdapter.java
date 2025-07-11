package com.example.airlines.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.airlines.R;
import com.example.airlines.models.Airline;
import java.util.List;

public class AirlineAdapter extends RecyclerView.Adapter<AirlineAdapter.AirlineViewHolder> {
    private List<Airline> airlines;

    public AirlineAdapter(List<Airline> airlines) {
        this.airlines = airlines;
    }

    @NonNull
    @Override
    public AirlineViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_airline, parent, false);
        return new AirlineViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AirlineViewHolder holder, int position) {
        Airline airline = airlines.get(position);
        holder.airlineLogo.setImageResource(airline.getLogoResId());
        holder.airlineName.setText(airline.getName());
    }

    @Override
    public int getItemCount() {
        return airlines.size();
    }

    static class AirlineViewHolder extends RecyclerView.ViewHolder {
        ImageView airlineLogo;
        TextView airlineName;

        AirlineViewHolder(View itemView) {
            super(itemView);
            airlineLogo = itemView.findViewById(R.id.ivAirlineLogo);
            airlineName = itemView.findViewById(R.id.tvAirlineName);
        }
    }
} 