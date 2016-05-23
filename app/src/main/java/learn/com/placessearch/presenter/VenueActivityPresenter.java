package learn.com.placessearch.presenter;

import android.util.Log;

import java.util.List;

import learn.com.placessearch.BuildConfig;
import learn.com.placessearch.data_manager.ApiManager;
import learn.com.placessearch.model.Response;
import learn.com.placessearch.model.Result;
import learn.com.placessearch.model.Venue;
import learn.com.placessearch.view.VenueActivityView;

/**
 * Created by muhammad ali
 * on 22/05/2016.
 */
public class VenueActivityPresenter implements DataManagerResponse {

    private static final String TAG = VenueActivityPresenter.class.getSimpleName();
    private VenueActivityView venueActivityView;

    public VenueActivityPresenter(VenueActivityView venueActivityView) {
        this.venueActivityView = venueActivityView;
    }

    public void venuesSearch(String placeName, String location) {
        venueActivityView.showProgress();
        ApiManager apiManager = new ApiManager();
        apiManager.getNearestPlaces(placeName, location, this);
    }


    @Override
    public void onError(String error) {
        if (BuildConfig.DEBUG) {
            Log.e(TAG, error);
            if (venueActivityView != null) {
                venueActivityView.showError(error);
            }
        }
    }

    @Override
    public void onResponse(Result result) {
        Response response = result.getResponse();
        List<Venue> venues = response.getVenues();
        if (venueActivityView != null) {
        if (venues.size() > 0) {
                venueActivityView.renderList(venues);
                venueActivityView.onSearchComplete();
            }
            else {
            venueActivityView.noResult();
        }
        }
    }
}
