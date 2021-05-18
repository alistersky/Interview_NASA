package com.example.NasaInterview.Service.Nasa;

import com.example.NasaInterview.Model.Nasa.NearEarthObject;
import com.example.NasaInterview.Model.Nasa.NearEarthObjectFeed;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface NearEarthObjectService {

   @GET("/rest/v1/feed")
    Call<NearEarthObjectFeed> feed(@Query("start_date") String startDate,
                                   @Query("end_date") String endDate,
                                   @Query("detailed") String detailed,
                                   @Query("api_key") String apiKey);
    @GET("/rest/v1/feed")
    Call<NearEarthObjectFeed> feed(@Query("start_date") String startDate,
                                   @Query("detailed") String detailed,
                                   @Query("api_key") String apiKey);

    @GET("/rest/v1/neo/{id}")
    Call<NearEarthObject> nearEarthObject(@Path("id") String asteroidId, @Query("api_key") String apiKey);

}
