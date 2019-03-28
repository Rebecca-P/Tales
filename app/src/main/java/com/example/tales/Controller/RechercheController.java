package com.example.tales.Controller;

import android.util.Log;

import com.example.tales.Controller.Interface_API.TOV_API;
import com.example.tales.View.Menu_java.Menu7Recherche;
import com.example.tales.Model.Objet.Arte_Menu;
import com.example.tales.Model.Objet.Character;
import com.example.tales.Model.Objet.Equipement_item;
import com.example.tales.Model.Objet.Item_Menu;
import com.example.tales.Model.Objet.Loca;
import com.example.tales.Model.Objet.Recette;
import com.example.tales.Model.Objet.Skill_item;
import com.example.tales.Model.Objet.Synthese;
import com.example.tales.Model.Objet.Response.ArteResponse;
import com.example.tales.Model.Objet.Response.ChaResponse;
import com.example.tales.Model.Objet.Response.Equi2Response;
import com.example.tales.Model.Objet.Response.EquiResponse;
import com.example.tales.Model.Objet.Response.ItemResponse;
import com.example.tales.Model.Objet.Response.LocResponse;
import com.example.tales.Model.Objet.Response.RecResponse;
import com.example.tales.Model.Objet.Response.SkillResponse;
import com.example.tales.Model.Objet.Response.SynResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RechercheController {
    private Menu7Recherche recherche;


    private String users;


    //
    private int i;
    private  ArrayList<ArrayList<Equipement_item>> all_equi ;
    private ArrayList resultat;

    public Gson gson ;
    public Retrofit retrofit ;
    public TOV_API tov_api;

    public RechercheController(Menu7Recherche recherche) {
        this.recherche = recherche;
    }


    public void onCreate() {
        resultat = new ArrayList();
        gson= new GsonBuilder()
                .setLenient()
                .create();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/Rebecca-P/Tales_ofData/master/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        tov_api =  retrofit.create(TOV_API.class);

    }

    public void recupDonne() {

        item_liste();
        arte_liste();
        syn_liste();
        arme_liste();
        second_liste();
        head_liste();
        body_liste();
        acce_liste();
        skill_liste();
        recette_liste();
        character_liste();
        location_liste();



    }

    public void item_liste()
    {
        Call<ItemResponse> call = tov_api.getResultts();
        call.enqueue(new Callback<ItemResponse>() {
            @Override
            public void onResponse(Call<ItemResponse> call, Response<ItemResponse> response) {
                ItemResponse itemResponse = response.body();
                ArrayList<Item_Menu> itemlist = itemResponse.getItem_element();
                //TODO a comparer avec la recherche de l'utilisateur
                for (Item_Menu actual: itemlist ) {
                        //if (actual.getName_item().toLowerCase().contains(users))
                        //{
                            resultat.add(actual);


                        //}
                }
            }

            @Override
            public void onFailure(Call<ItemResponse> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });
    }

    public void arte_liste()
    {
        Call<ArteResponse> call = tov_api.getResultarte();
        call.enqueue(new Callback<ArteResponse>() {
            @Override
            public void onResponse(Call<ArteResponse> call, Response<ArteResponse> response) {
                ArteResponse arteResponse = response.body();
                ArrayList<Arte_Menu> artelist = arteResponse.getArte_element();
                //TODO a comparer avec la recherche de l'utilisateur
                for (Arte_Menu actual: artelist ) {
                    //if (actual.getName_item().toLowerCase().contains(users))
                    //{
                        resultat.add(actual);
                        //Log.wtf("aaaaaaaaa", actual.getName_item());

                    //}
                }
            }

            @Override
            public void onFailure(Call<ArteResponse> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });
    }

    public void syn_liste()
    {
        Call<SynResponse> call = tov_api.getResultsyn();
        call.enqueue(new Callback<SynResponse>() {
            @Override
            public void onResponse(Call<SynResponse> call, Response<SynResponse> response) {
                SynResponse synResponse = response.body();
                ArrayList<Synthese> synlist = synResponse.getSynthese_element();
                //TODO a comparer avec la recherche de l'utilisateur
                for (Synthese actual: synlist ) {
                   // if (actual.getName().toLowerCase().contains(users))
                   // {
                        resultat.add(actual);


                  //  }
                }
            }

            @Override
            public void onFailure(Call<SynResponse> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });
    }


    public void arme_liste()
    {
        all_equi = new ArrayList<ArrayList<Equipement_item>>();
        Call<EquiResponse> call = tov_api.getResultArme();
        call.enqueue(new Callback<EquiResponse>() {
            @Override
            public void onResponse(Call<EquiResponse> call, Response<EquiResponse> response) {
                EquiResponse armResponse = response.body();
                all_equi.add(armResponse.getSword());
                all_equi.add(armResponse.getAxe());
                all_equi.add(armResponse.getSpear());
                all_equi.add(armResponse.getMaul());
                all_equi.add(armResponse.getStaff());
                all_equi.add(armResponse.getMace());
                all_equi.add(armResponse.getBelt());
                all_equi.add(armResponse.getChaine());
                all_equi.add(armResponse.getLight());
                all_equi.add(armResponse.getEavy());
                all_equi.add(armResponse.getDagger());
                all_equi.add(armResponse.getKnife());

                //TODO a comparer avec la recherche de l'utilisateur
                for (ArrayList<Equipement_item> liste: all_equi ) {
                    for (Equipement_item actual:liste ) {
                        //if (actual.getName_equ().toLowerCase().contains(users))
                        //{
                            resultat.add(actual);


                        //}
                    }

                }
            }

            @Override
            public void onFailure(Call<EquiResponse> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });

    }

    public void second_liste()
    {
        Call<Equi2Response> call = tov_api.getResultsecond();
        call.enqueue(new Callback<Equi2Response>() {
            @Override
            public void onResponse(Call<Equi2Response> call, Response<Equi2Response> response) {
                Equi2Response secondResponse = response.body();
                ArrayList<Equipement_item> secondlist = secondResponse.getSecond();
                //TODO a comparer avec la recherche de l'utilisateur
                for (Equipement_item actual: secondlist ) {
                   // if (actual.getName_equ().toLowerCase().contains(users))
                    //{
                        resultat.add(actual);

                    //}
                }
            }

            @Override
            public void onFailure(Call<Equi2Response> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });
    }

    public void head_liste()
    {
        Call<Equi2Response> call = tov_api.getResulthead();
        call.enqueue(new Callback<Equi2Response>() {
            @Override
            public void onResponse(Call<Equi2Response> call, Response<Equi2Response> response) {
                Equi2Response headResponse = response.body();
                ArrayList<Equipement_item> headlist = headResponse.getHead();
                //TODO a comparer avec la recherche de l'utilisateur
                for (Equipement_item actual: headlist ) {
                   // if (actual.getName_equ().toLowerCase().contains(users))
                   // {
                        resultat.add(actual);

                   // }
                }
            }

            @Override
            public void onFailure(Call<Equi2Response> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });
    }

    public void body_liste()
    {
        Call<Equi2Response> call = tov_api.getResultbody();
        call.enqueue(new Callback<Equi2Response>() {
            @Override
            public void onResponse(Call<Equi2Response> call, Response<Equi2Response> response) {
                Equi2Response bodyResponse = response.body();
                ArrayList<Equipement_item> bodylist = bodyResponse.getBody();
                //TODO a comparer avec la recherche de l'utilisateur
                for (Equipement_item actual: bodylist ) {
                  //  if (actual.getName_equ().toLowerCase().contains(users))
                  //  {
                        resultat.add(actual);

                   // }
                }
            }

            @Override
            public void onFailure(Call<Equi2Response> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });
    }

    public void acce_liste()
    {
        Call<Equi2Response> call = tov_api.getResultacce();
        call.enqueue(new Callback<Equi2Response>() {
            @Override
            public void onResponse(Call<Equi2Response> call, Response<Equi2Response> response) {
                Equi2Response acceResponse = response.body();
                ArrayList<Equipement_item> accelist = acceResponse.getAcce();
                //TODO a comparer avec la recherche de l'utilisateur
                for (Equipement_item actual: accelist ) {
                    //if (actual.getName_equ().toLowerCase().contains(users))
                    //{
                        resultat.add(actual);

                    //}
                }
            }

            @Override
            public void onFailure(Call<Equi2Response> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });
    }

    public void skill_liste()
    {
        Call<SkillResponse> call = tov_api.getResultSkill();
        call.enqueue(new Callback<SkillResponse>() {
            @Override
            public void onResponse(Call<SkillResponse> call, Response<SkillResponse> response) {
                SkillResponse skillResponse = response.body();
                ArrayList<Skill_item> skilllist = skillResponse.getSkill_element();

                for (Skill_item actual: skilllist ) {
                   // if (actual.getName().toLowerCase().contains(users))
                   // {
                        resultat.add(actual);

                  //  }
                }
            }

            @Override
            public void onFailure(Call<SkillResponse> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });
    }

    public void recette_liste()
    {
        Call<RecResponse> call = tov_api.getResultRecette();
        call.enqueue(new Callback<RecResponse>() {
            @Override
            public void onResponse(Call<RecResponse> call, Response<RecResponse> response) {
                RecResponse recResponse = response.body();
                ArrayList<Recette> recettelist = recResponse.getRecette_element();

                for (Recette actual: recettelist ) {
                  //  if (actual.getName().toLowerCase().contains(users))
                   // {
                        resultat.add(actual);

                    //}
                }
            }

            @Override
            public void onFailure(Call<RecResponse> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });
    }

    public void character_liste()
    {
        Call<ChaResponse> call = tov_api.getResultChar();
        call.enqueue(new Callback<ChaResponse>() {
            @Override
            public void onResponse(Call<ChaResponse> call, Response<ChaResponse> response) {
                ChaResponse chaResponse = response.body();
                ArrayList<Character> characterslist = chaResponse.getCharacter_element();


                for (Character actual: characterslist ) {

                   // if (actual.getName().toLowerCase().contains(users))
                   // {
                        resultat.add(actual);


                   // }
                }
            }

            @Override
            public void onFailure(Call<ChaResponse> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });
    }



    public void location_liste()
    {
        Call<LocResponse> call = tov_api.getResultLocalisation();
        call.enqueue(new Callback<LocResponse>() {
            @Override
            public void onResponse(Call<LocResponse> call, Response<LocResponse> response) {
                LocResponse locResponse = response.body();
                ArrayList<Loca> localist = locResponse.getLocation_element();

                for (Loca actual: localist ) {
                    //if (actual.getLieu().toLowerCase().contains(users))
                    //{
                        resultat.add(actual);

                   // }
                }
                Log.wtf("aaaaaaaaa", " taille:"+resultat.size());

                recherche.showfind(resultat);

                //resultat.clear();
                //return;


            }

            @Override
            public void onFailure(Call<LocResponse> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });


    }




}
