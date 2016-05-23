package learn.com.placessearch;

import android.content.Context;
import android.support.v4.view.MenuItemCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.ViewAnimator;

import java.util.List;

import learn.com.placessearch.pojo_model.Venue;
import learn.com.placessearch.presenter.VenueActivityPresenter;
import learn.com.placessearch.view.VenueActivityView;

public class VenueActivity extends AppCompatActivity implements VenueActivityView, View.OnClickListener {


    private static final int POSITION_LIST = 0;
    private static final int POSITION_LOADING = 1;
    private static final int POSITION_EMPTY = 2;
    private ViewAnimator mAnimator;
    private VenueAdaptor mVenueAdaptor;
    private EditText mSearchWithinLocation;
    private EditText mPlaceOfInterest;
    private MenuItem mSearchItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venues);
        mAnimator = (ViewAnimator) findViewById(R.id.animator);
        RecyclerView recyclerView = (RecyclerView) (mAnimator != null ? mAnimator.getChildAt(POSITION_LIST) : null);
        mVenueAdaptor = new VenueAdaptor();
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        if (recyclerView != null) {
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(mVenueAdaptor);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        mSearchItem = menu.findItem(R.id.action_websearch);
        View actionView = MenuItemCompat.getActionView(mSearchItem);
        if (actionView != null) {
            mSearchWithinLocation = (EditText) actionView.findViewById(R.id.actionBarLocation);
            mPlaceOfInterest = (EditText) actionView.findViewById(R.id.actionBarVenueName);
            ImageButton startSearch = (ImageButton) actionView.findViewById(R.id.actionBarSearch);
            startSearch.setOnClickListener(this);
        }
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public void renderList(List<Venue> venues) {
        mAnimator.setDisplayedChild(POSITION_LIST);
        mVenueAdaptor.setData(venues);
    }

    @Override
    public void showProgress() {
        mAnimator.setDisplayedChild(POSITION_LOADING);

    }

    @Override
    public void dismissProgress() {

    }

    @Override
    public void onSearchComplete() {
        MenuItemCompat.collapseActionView(mSearchItem);
        mPlaceOfInterest.setText("");
        mSearchWithinLocation.setText("");
    }

    @Override
    public void noResult() {
        mAnimator.setDisplayedChild(POSITION_EMPTY);
    }

    @Override
    public void showError(String error) {
        mAnimator.setDisplayedChild(POSITION_EMPTY);
        TextView displayError = (TextView) mAnimator.getChildAt(POSITION_EMPTY);
        displayError.setText(error);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.actionBarSearch:
                if (mPlaceOfInterest.getText().length() > 0 && mSearchWithinLocation.getText().length() > 0) {
                    VenueActivityPresenter venueActivityPresenter = new VenueActivityPresenter(this);
                    venueActivityPresenter.venuesSearch(mPlaceOfInterest.getText().toString(), mSearchWithinLocation.getText().toString());
                    dismissKeyBoard(v);

                }
        }

    }

    private void dismissKeyBoard(View v) {
        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(v.getWindowToken(), 0);
    }
}
