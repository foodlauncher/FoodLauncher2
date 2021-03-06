package com.example.foodlauncher;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface ApiSearchInterface {

    @GET("search")
    Call<Search> getSearchResult(@Header("user-key") String apiKey, @Query("lat") double lat, @Query("lon") double lon,
                                   @Query("count") int count);
    @GET("search")
    Call<Search> getResultBy(@Header("user-key") String apiKey, @Query("lat") double lat, @Query("lon") double lon,
                                   @Query("count") int count, @Query("sort") String sortBy);

}
