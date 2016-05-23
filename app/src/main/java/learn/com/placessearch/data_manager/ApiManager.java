package learn.com.placessearch.data_manager;


import android.util.Log;

import learn.com.placessearch.BuildConfig;
import learn.com.placessearch.model.Result;
import learn.com.placessearch.presenter.DataManagerResponse;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;


/**
 * Created by muhammad ali
 * on 23/05/2016.
 */


public class ApiManager {

    private static final String TAG = ApiManager.class.getSimpleName();
    private static final String API = "https://api.foursquare.com";
    private static final Retrofit retrofit = new Retrofit.Builder().baseUrl(API).addConverterFactory(GsonConverterFactory.create()).addCallAdapterFactory(RxJavaCallAdapterFactory.create()).build();
    private static final ApiServiceManager API_SERVICE_MANAGER = retrofit.create(ApiServiceManager.class);


    /**
     * @param placeOfInterest     -  Name of the place
     * @param location            - Location
     * @param dataManagerResponse - Data Manager Response
     */

    public void getNearestPlaces(String placeOfInterest, String location, final DataManagerResponse dataManagerResponse) {
        rx.Observable<Result> status = API_SERVICE_MANAGER.loadResult(placeOfInterest, location, "L24ZU0MN5MZLEZYM0UGR3P44ZFBVOVU311GFT4Q21VC35KGQ", "W2JMXADQYGGOUWMM0I3UTOPEXU2C0RP2VWBCLOSR5JAL4Z1T", "20160522").subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
        status.subscribe(new Subscriber<Result>() {
            @Override
            public void onCompleted() {
                if (BuildConfig.DEBUG) Log.i(TAG, "on Complete");
            }

            @Override
            public void onError(Throwable e) {
                if (BuildConfig.DEBUG) {
                    Log.e(TAG, e.getMessage());
                    e.printStackTrace();
                    if (dataManagerResponse != null) {
                        dataManagerResponse.onError(e.getMessage());
                    }
                }
            }

            @Override
            public void onNext(Result result) {
                if (dataManagerResponse != null) {
                    dataManagerResponse.onResponse(result);
                }
            }
        });
    }


}
