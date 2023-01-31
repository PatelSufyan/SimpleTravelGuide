package com.example.whereto.api;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {


    static final String BASE_URL = "https://disease.sh/v3/covid-19/";
            // "https://corona.lmao.ninja/v2/";
            //"https://disease.sh/v3/covid-19/";
            //"https://disease.sh/v3/covid-19/countries/"

    @GET("countries")
    Call<List<CountryData>> getCountryData();


}
