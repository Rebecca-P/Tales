package com.example.tales.Interface_API;

import com.example.tales.Response.ArteResponse;
import com.example.tales.Response.Equi2Response;
import com.example.tales.Response.EquiResponse;
import com.example.tales.Response.ItemResponse;
import com.example.tales.Response.SynResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface TOV_API {

    @GET("item.json")
    Call<ItemResponse> getResultts();

    @GET("synthese.json")
    Call<SynResponse> getResultsyn();

    //
    @GET("artes.json")
    Call<ArteResponse> getResultarte();

    //
    @GET("Arme.json")
    Call<EquiResponse> getResultArme();
    @GET("arme_second.json")//TODO achanger
    Call<Equi2Response> getResultsecond();
    @GET("head.json")//TODO achanger
    Call<Equi2Response> getResulthead();
    @GET("body.json")//TODO achanger
    Call<Equi2Response> getResultbody();
    @GET("accessoire.json")//TODO achanger
    Call<Equi2Response> getResultacce();

    //TODO skill
    /*@GET("Arme.json")
    Call<EquiResponse> getResultArme();

    //TODO RECIPES
    @GET("Arme.json")
    Call<EquiResponse> getResultArme();

    //TODO character
    @GET("Arme.json")
    Call<EquiResponse> getResultArme();

    //TODO WORLD
    @GET("Arme.json")
    Call<EquiResponse> getResultArme();
*/
}
