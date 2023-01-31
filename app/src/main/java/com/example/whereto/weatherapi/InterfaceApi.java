package com.example.whereto.weatherapi;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface InterfaceApi {


    @GET("data/2.5/weather")
    Call<weatherData> getData(
            @Query("q") String q,
            @Query("appid") String APIKEY,
            @Query("units") String units
    );


}
