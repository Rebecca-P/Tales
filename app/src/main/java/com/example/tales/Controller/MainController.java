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
import com.example.tales.Menu_java.Menu2Acce;
import com.example.tales.Menu_java.Menu2Arme;
import com.example.tales.Menu_java.Menu2Body;
import com.example.tales.Menu_java.Menu2Head;
import com.example.tales.Menu_java.Menu2Second;
import com.example.tales.Menu_java.Menu3Skill;
import com.example.tales.Menu_java.Menu4Recette;
import com.example.tales.Objet.Arte_Menu;
import com.example.tales.Objet.Equipement_item;
import com.example.tales.Objet.Item_Menu;
import com.example.tales.Objet.Recette;
import com.example.tales.Objet.Skill_item;
import com.example.tales.Objet.Synthese;
import com.example.tales.Response.ArteResponse;
import com.example.tales.Response.Equi2Response;
import com.example.tales.Response.EquiResponse;
import com.example.tales.Response.ItemResponse;
import com.example.tales.Response.RecResponse;
import com.example.tales.Response.SkillResponse;
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

    private Menu2Second view_second;

    private Menu2Body view_body;
    private Menu2Head view_head;
    private Menu2Acce view_acce;


    private Menu3Skill view_skill;
    //TODO  modificagtion a faire
    private Menu4Recette view_recette;
    /*private Menu5Perso view_perso;
    private Menu6Monde view_monde;
    */

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
    public MainController(Menu2Second view_second) {
        this.view_second = view_second;
    }
    public MainController(Menu2Head view_head) {
        this.view_head = view_head;
    }
    public MainController(Menu2Body view_body) {
        this.view_body = view_body;
    }
    public MainController(Menu2Acce view_acce) {
        this.view_acce = view_acce;
    }
    public MainController(Menu3Skill view_skill) {
        this.view_skill = view_skill;
    }
    public MainController(Menu4Recette view_recette) {
        this.view_recette = view_recette;
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

                view_arme.showArme(all_equi);
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
                view_second.showSecond(secondlist);
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
                view_head.showHead(headlist);
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
                view_body.showBody(bodylist);
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
                view_acce.showAcce(accelist);//TODO a changer
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
                view_skill.showSkill(skilllist);//TOD
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
                view_recette.showrecette(recettelist);//TOD
            }

            @Override
            public void onFailure(Call<RecResponse> call, Throwable t) {
                Log.d("ERROR", "Api Error");
            }
        });
    }
}
