package com.example.tales.Interface_API;

import com.example.tales.Response.ItemResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TOV_API {

    @GET("item.json")
    Call<ItemResponse> getResultts();
}
