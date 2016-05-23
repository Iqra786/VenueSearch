package learn.com.placessearch;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import learn.com.placessearch.model.Venue;

/**
 * Created by muhammad ali
 * on 22/05/2016.
 */
public class VenueAdaptorViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    protected TextView venueName;
    protected TextView venueAddress;

    public VenueAdaptorViewHolder(View itemView) {
        super(itemView);
        venueName = (TextView) itemView.findViewById(R.id.venueName);
        venueName.setOnClickListener(this);
        venueAddress = (TextView) itemView.findViewById(R.id.venueAddress);
        venueAddress.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.venueName:
                callDetailActivity(v.getTag());
                break;
            case R.id.venueAddress:
                System.out.println("Yes I am clicked");
                break;
        }
    }

    private void callDetailActivity(Object data) {
        Intent intent = new Intent(venueAddress.getContext().getApplicationContext(), VenueDetailActivity.class);
        intent.putExtra("venue", (Venue) data);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        venueAddress.getContext().getApplicationContext().startActivity(intent);
    }
}
