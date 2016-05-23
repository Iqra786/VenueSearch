package learn.com.placessearch.data_manager;

import learn.com.placessearch.pojo_model.Result;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by muhammad ali
 * on 20/05/2016.
 */
public interface ApiServiceManager {
    @GET("/v2/venues/search")
    Observable<Result> loadResult(@Query("query") String placeOfInterest, @Query("near") String location, @Query("client_id") String client_Id, @Query("client_secret") String client_Secret, @Query("v") String v);
}
