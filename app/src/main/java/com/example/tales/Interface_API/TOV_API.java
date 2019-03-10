package com.example.tales.Interface_API;

import com.example.tales.Response.ArteResponse;
import com.example.tales.Response.ItemResponse;
import com.example.tales.Response.SynResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TOV_API {

    @GET("item.json")
    Call<ItemResponse> getResultts();

    @GET("artes.json")
    Call<ArteResponse> getResultarte();

    @GET("synthese.json")
    Call<SynResponse> getResultsyn();
    //arme
    @GET("sword.json")
    Call<SynResponse> getResultsyn();
    @GET("axe.json")
    Call<SynResponse> getResultsyn();
    @GET("spear.json")
    Call<SynResponse> getResultsyn();
    @GET("Maul.json")
    Call<SynResponse> getResultsyn();
    @GET("Staff.json")
    Call<SynResponse> getResultsyn();
    @GET("Mace_baguette.json")
    Call<SynResponse> getResultsyn();
    @GET("belt.json")
    Call<SynResponse> getResultsyn();
    @GET("Chain_Whip.json")
    Call<SynResponse> getResultsyn();
    @GET("bow_light.json")
    Call<SynResponse> getResultsyn();
    @GET("bow_eavy.json")
    Call<SynResponse> getResultsyn();
    @GET("dagger.json")
    Call<SynResponse> getResultsyn();
    @GET("knife.json")
    Call<SynResponse> getResultsyn();
}
