package learn.com.placessearch;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import learn.com.placessearch.pojo_model.Venue;
import learn.com.placessearch.presenter.VenueDetailActivityPresenter;
import learn.com.placessearch.view.VenueDetailActivityView;


public class VenueDetailActivity extends AppCompatActivity implements VenueDetailActivityView {

    private TextView mVenueName;
    private TextView mPhoneNo;
    private TextView mTwitterAddress;
    private TextView mVenueCategory;
    private TextView mVenueAddress;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venue_detail);
        mVenueName = (TextView) findViewById(R.id.venueName);
        mPhoneNo = (TextView) findViewById(R.id.phoneNo);
        mTwitterAddress = (TextView) findViewById(R.id.twitter);
        mVenueCategory = (TextView) findViewById(R.id.venueCategory);
        mVenueAddress = (TextView) findViewById(R.id.venueAddress);
        Venue data = (Venue) getIntent().getSerializableExtra("venue");
        if (data != null) {
            VenueDetailActivityPresenter venueDetailActivityPresenter = new VenueDetailActivityPresenter(this);
            venueDetailActivityPresenter.setData(data);
        }
    }


    @Override
    public void setVenueName(String name) {
        if (mVenueName != null) {
            mVenueName.setText(name);
        }
    }

    @Override
    public void setVenuePhoneNo(String phoneNo) {
        if (mPhoneNo != null) {
            mPhoneNo.setText(phoneNo);
        }

    }

    @Override
    public void setVenueTwitterAddress(String address) {
        if (mTwitterAddress != null) {
            mTwitterAddress.setText(address);
        }
    }

    @Override
    public void setVenueCategory(String category) {
        if (mVenueCategory != null) {
            mVenueCategory.setText(category);
        }

    }

    @Override
    public void setVenueAddress(String address) {
        if (mVenueAddress != null) {
            mVenueAddress.setText(address);
        }
    }
}
