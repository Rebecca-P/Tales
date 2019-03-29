package com.example.tales.Controller.Interface_API;

import com.example.tales.Model.Objet.Response.ArteResponse;
import com.example.tales.Model.Objet.Response.ChaResponse;
import com.example.tales.Model.Objet.Response.Equi2Response;
import com.example.tales.Model.Objet.Response.EquiResponse;
import com.example.tales.Model.Objet.Response.ItemResponse;
import com.example.tales.Model.Objet.Response.LocResponse;
import com.example.tales.Model.Objet.Response.RecResponse;
import com.example.tales.Model.Objet.Response.SPResponse;
import com.example.tales.Model.Objet.Response.SkillResponse;
import com.example.tales.Model.Objet.Response.SynResponse;
import com.example.tales.Model.Objet.Response.SynoResponse;

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
    @GET("arme_second.json")
    Call<Equi2Response> getResultsecond();
    @GET("head.json")
    Call<Equi2Response> getResulthead();
    @GET("body.json")
    Call<Equi2Response> getResultbody();
    @GET("accessoire.json")
    Call<Equi2Response> getResultacce();


    @GET("skill.json")
    Call<SkillResponse> getResultSkill();


    @GET("recette.json")
    Call<RecResponse> getResultRecette();


    @GET("Information_Character.json")
    Call<ChaResponse> getResultChar();

    @GET("Search_Point.json")
    Call<SPResponse> getResultSP();


    @GET("location.json")
    Call<LocResponse> getResultLocalisation();
    @GET("synop.json")
    Call<SynoResponse> getResultSynopsis();

}