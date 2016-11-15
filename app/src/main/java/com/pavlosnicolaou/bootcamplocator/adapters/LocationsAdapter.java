package com.pavlosnicolaou.bootcamplocator.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.pavlosnicolaou.bootcamplocator.R;
import com.pavlosnicolaou.bootcamplocator.holders.LocationsViewHolder;
import com.pavlosnicolaou.bootcamplocator.model.Devslopes;

import java.util.ArrayList;

/**
 * Created by pn94 on 15/11/2016.
 */

public class LocationsAdapter extends RecyclerView.Adapter<LocationsViewHolder> {

    private ArrayList<Devslopes> locations;

    public LocationsAdapter(ArrayList<Devslopes> locations){
        this.locations = locations;
    }

    @Override
    public LocationsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View card = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_location, parent, false);
        return new LocationsViewHolder(card);
    }

    @Override
    public void onBindViewHolder(LocationsViewHolder holder, int position) {
        final Devslopes location = locations.get(position);
        holder.updateUI(location);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Load details page
            }
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
