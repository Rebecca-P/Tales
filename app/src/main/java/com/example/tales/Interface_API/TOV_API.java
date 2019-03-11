package com.example.tales.Interface_API;

import com.example.tales.Response.ArteResponse;
import com.example.tales.Response.EquiResponse;
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
    Call<EquiResponse> getResultsword();
    @GET("axe.json")
    Call<EquiResponse> getResultaxe();
    @GET("spear.json")
    Call<EquiResponse> getResultspear();
    @GET("Maul.json")
    Call<EquiResponse> getResultmaul();
    @GET("Staff.json")
    Call<EquiResponse> getResultstaff();
    @GET("Mace_baguette.json")
    Call<EquiResponse> getResultmace();
    @GET("Belt.json")
    Call<EquiResponse> getResultbelt();
    @GET("Chain_Whip.json")
    Call<EquiResponse> getResultwhip();
    @GET("bow_light.json")
    Call<EquiResponse> getResultlight();
    @GET("bow_eavy.json")
    Call<EquiResponse> getResulteavy();
    @GET("dagger.json")
    Call<EquiResponse> getResultdagger();
    @GET("knife.json")
    Call<EquiResponse> getResultknife();


}
