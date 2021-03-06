package com.example.NasaInterview.Service.Nasa;

import com.example.NasaInterview.Model.Nasa.NearEarthObject;
import com.example.NasaInterview.Model.Nasa.NearEarthObjectFeed;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * NOTE:
 * For an "api_key" please use "DEMO_KEY", this is throttled
 * but fine for our purposes.
 *  - For the "detailed" param please use false.
 *  - Use the execute method to keep calls synchronous
 */
public interface NearEarthObjectService {

    @GET("/rest/v1/neo/{id}")
    Call<NearEarthObject> nearEarthObject(@Path("id") String asteroidId, @Query("api_key") String apiKey);

    // the default end date is 7 days after the start date
    @GET("/rest/v1/feed")
    Call<NearEarthObjectFeed> feed(@Query("start_date") String startDate,
                                   @Query("detailed") String detailed,
                                   @Query("api_key") String apiKey);

}
