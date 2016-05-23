package learn.com.placessearch.presenter;

import learn.com.placessearch.model.Result;

/**
 * Created by muhammad ali
 * on 22/05/2016.
 */
public interface DataManagerResponse {
    void onError(String error);

    void onResponse(Result result);
}
