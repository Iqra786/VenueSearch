package learn.com.placessearch.view;

import java.util.List;

import learn.com.placessearch.model.Venue;

/**
 * Created by muhammad ali
 * on 23/05/2016.
 */

public interface VenueActivityView {
    void renderList(List<Venue> venues);

    void showProgress();

    void dismissProgress();

    void onSearchComplete();

    void noResult();

    void showError(String error);
}
