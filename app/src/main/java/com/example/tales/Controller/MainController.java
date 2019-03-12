package com.example.tales.Controller;

import com.example.tales.Interface_API.TOV_API;
import com.example.tales.MainActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.example.tales.Menu_java.Menu1Arte;
import com.example.tales.Menu_java.Menu1Conso;
import com.example.tales.Menu_java.Menu1Equi;
import com.example.tales.Menu_java.Menu1Syn;
import com.example.tales.Menu_java.Menu2Arme;
import com.example.tales.Objet.Arte_Menu;
import com.example.tales.Objet.Equipement_item;
import com.example.tales.Objet.Item_Menu;
import com.example.tales.Objet.Synthese;
import com.example.tales.Response.ArteResponse;
import com.example.tales.Response.EquiResponse;
import com.example.tales.Response.ItemResponse;
import com.example.tales.Response.SynResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class MainController {
    private Menu1Conso view_conso;
    private Menu1Arte view_Arte;
    private Menu1Syn view_Syn;
    private Menu2Arme view_arme;
    //
    private int i;
    private  ArrayList<ArrayList<Equipement_item>> all_equi ;





    public Gson gson ;
    public Retrofit retrofit ;
    public TOV_API tov_api;

    public MainController(Menu1Conso view_conso) {
        this.view_conso = view_conso;
    }
    public MainController(Menu1Arte view_Arte) {
        this.view_Arte = view_Arte;
    }
    public MainController(Menu1Syn view_Syn) {
        this.view_Syn = view_Syn;
    }
    public MainController(Menu2Arme view_arme) {
        this.view_arme = view_arme;
    }

    public void onCreate() {
        gson= new GsonBuilder()
                .setLenient()
                .create();

        retrofit = new Retrofit.Builder()
                .baseUrl("https://raw.githubusercontent.com/Rebecca-P/Tales_ofData/master/")
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();

        tov_api =  retrofit.create(TOV_API.class);

    }

    public void item_liste()
    {
        Call<ItemResponse> call = tov_api.getResultts();
        call.enqueue(new Callback<ItemResponse>() {
            @Override
            public void onResponse(Call<ItemResponse> call, Response<ItemResponse> response) {
                ItemResponse itemResponse = response.body();
                ArrayList<Item_Menu> itemlist = itemResponse.getItem_element();
                view_conso.showItem(itemlist);
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
                view_Arte.showArte(artelist);
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
                view_Syn.showSyn(synlist);
            }

            @Override
            public void onFailure(Call<SynResponse> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });
    }

    /*public Call callequipement(int i)
    {
        Call<EquiResponse> call;
        switch (i) {
            case 1:
                 call = tov_api.getResultsword();
                break;
            case 2:
                 call = tov_api.getResultaxe();
                break;
            case 3:
                 call = tov_api.getResultspear();
                break;
            case 4:
                 call = tov_api.getResultmaul();
                break;
            case 5:
                 call = tov_api.getResultstaff();
                break;
            case 6:
                 call = tov_api.getResultmace();
                break;
            case 7:
                 call = tov_api.getResultbelt();
                break;
            case 8:
                 call = tov_api.getResultwhip();
                break;
            case 9:
                 call = tov_api.getResultlight();
                break;
            case 10:
                 call = tov_api.getResulteavy();
                break;
            case 11:
                 call = tov_api.getResultdagger();
                break;
            case 12:
                call = tov_api.getResultknife();
                break;

                default:
                     call = tov_api.getResultsword();
                    break;

        }

        return call;
    }*/

    public void arme_liste()
    {
        all_equi = new ArrayList<ArrayList<Equipement_item>>();
        /*for (i=1 ; i<13; i++)
        {
            Call<EquiResponse> call = callequipement(i);

            call.enqueue(new Callback<EquiResponse>() {
                @Override
                public void onResponse(Call<EquiResponse> call, Response<EquiResponse> response) {
                    EquiResponse equiResponse = response.body();
                    ArrayList<Equipement_item> equilist;
                    switch (i) {
                        case 1:
                            equilist = equiResponse.getSword();
                            break;
                        case 2:
                            equilist = equiResponse.getAxe();
                            break;
                        case 3:
                            equilist = equiResponse.getSpear();
                            break;
                        case 4:
                            equilist = equiResponse.getMaul();
                            break;
                        case 5:
                            equilist = equiResponse.getStaff();
                            break;
                        case 6:
                            equilist = equiResponse.getMace();
                            break;
                        case 7:
                            equilist = equiResponse.getBelt();
                            break;
                        case 8:
                            equilist = equiResponse.getChaine();
                            break;
                        case 9:
                            equilist = equiResponse.getLight();
                            break;
                        case 10:
                            equilist = equiResponse.getEavy();
                            break;
                        case 11:
                            equilist = equiResponse.getDagger();
                            break;
                        case 12:
                            equilist = equiResponse.getKnife();
                            break;
                        default:
                            equilist = equiResponse.getSword();
                            break;



                    }

                    all_equi.add(equilist);


                }

                @Override
                public void onFailure(Call<EquiResponse> call, Throwable t) {
                    Log.d("ERROR", "Api Error");
                }
            });
        }
        view_arme.showArme(all_equi);*/

        Call<EquiResponse> call = tov_api.getResultArme();
        call.enqueue(new Callback<EquiResponse>() {
            @Override
            public void onResponse(Call<EquiResponse> call, Response<EquiResponse> response) {
                EquiResponse armResponse = response.body();
                all_equi.add(armResponse.getSword());
                all_equi.add(armResponse.getAxe());
                all_equi.add(armResponse.getSpear());
                all_equi.add(armResponse.getMaul());
                all_equi.add(armResponse.getMace());
                all_equi.add(armResponse.getBelt());
                all_equi.add(armResponse.getChaine());
                all_equi.add(armResponse.getLight());
                all_equi.add(armResponse.getEavy());
                all_equi.add(armResponse.getDagger());
                all_equi.add(armResponse.getKnife());

                /*ArrayList<Equipement_item> synlist = armResponse.getSword();
                ArrayList<Equipement_item> synlist = armResponse.getAxe();
                ArrayList<Equipement_item> synlist = armResponse.getSpear();
                ArrayList<Equipement_item> synlist = armResponse.getMaul();
                ArrayList<Equipement_item> synlist = armResponse.getMace();
                ArrayList<Equipement_item> synlist = armResponse.getBelt();
                ArrayList<Equipement_item> synlist = armResponse.getChaine();
                ArrayList<Equipement_item> synlist = armResponse.getLight();
                ArrayList<Equipement_item> synlist = armResponse.getEavy();
                ArrayList<Equipement_item> synlist = armResponse.getDagger();
                ArrayList<Equipement_item> synlist = armResponse.getKnife();*/

                view_arme.showArme(all_equi);
            }

            @Override
            public void onFailure(Call<EquiResponse> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });

    }


}
