package com.example.Jadwal_EPL_2549.api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Ambil {
    public static Retrofit retrofit;
    public static  final String BASE_URL = "https://www.thesportsdb.com/api/v1/json/1/";

    public static Retrofit getRetrofitInstance(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
