package learn.com.placessearch;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import learn.com.placessearch.model.Venue;

/**
 * Created by muhammad ali
 * on 22/05/2016.
 */
public class VenueAdaptor extends RecyclerView.Adapter<VenueAdaptorViewHolder> {

    List<Venue> venueList = new ArrayList<>();


    @Override
    public VenueAdaptorViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_venues_adaptor, parent, false);
        return new VenueAdaptorViewHolder(view);
    }

    @Override
    public void onBindViewHolder(VenueAdaptorViewHolder holder, int position) {
        String venueName = venueList.get(position).getName();
        holder.venueName.setText(venueName);
        holder.venueName.setTag(venueList.get(position));
        learn.com.placessearch.model.Location location = venueList.get(position).getLocation();
        if (location != null) {
            String address = location.getAddress() != null ? location.getAddress() : "";
            String postCode = location.getPostalCode() != null ? location.getPostalCode() : "";
            String city = location.getCity() != null ? location.getCity() : "";
            String country = location.getCountry() != null ? location.getCountry() : "";
            String completeAddress = address.concat(" ").concat(postCode).concat(" ").concat(city).concat(" ").concat(country);
            holder.venueAddress.setText(completeAddress);
        }
    }


    @Override
    public int getItemCount() {
        return venueList.size();
    }

    public void setData(List<Venue> venues) {
        venueList.clear();
        venueList.addAll(venues);
        notifyDataSetChanged();
    }
}
