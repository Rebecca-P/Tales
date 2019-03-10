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
import com.example.tales.Menu_java.Menu1Syn;
import com.example.tales.Objet.Arte_Menu;
import com.example.tales.Objet.Item_Menu;
import com.example.tales.Objet.Synthese;
import com.example.tales.Response.ArteResponse;
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


}
