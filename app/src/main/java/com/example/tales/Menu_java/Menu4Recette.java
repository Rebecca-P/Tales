package com.example.tales.Menu_java;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.tales.Adapters.MyAdapter3;
import com.example.tales.Adapters.MyAdapter6;
import com.example.tales.Controller.MainController;
import com.example.tales.Objet.Recette;
import com.example.tales.Objet.Synthese;
import com.example.tales.R;
import com.example.tales.RecyclerTouchListener;

import java.util.ArrayList;

public class Menu4Recette extends AppCompatActivity {
    private RecyclerView rv_menu;
    private RecyclerView.Adapter rv_adapter;
    private RecyclerView.LayoutManager rv_layout;
    private MainController controller;
    private Intent nameIntent ;
    public TextView titre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sousmenu);

        nameIntent = new Intent(this, Recette_Layout.class);
        rv_menu = (RecyclerView) findViewById(R.id.thingslist);
        titre = (TextView) findViewById(R.id.Titlething);
        this.titre.setText("Recette");
        controller = new MainController(this);
        controller.onCreate();
        controller.recette_liste();

    }

    public void showrecette(final ArrayList<Recette> recettelist) {
        rv_menu.setHasFixedSize(true);
        rv_layout = new LinearLayoutManager(this);
        rv_menu.setLayoutManager(rv_layout);
        rv_adapter= new MyAdapter6(recettelist);
        rv_menu.setAdapter(rv_adapter);

        rv_menu.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), rv_menu, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Recette recette_item= recettelist.get(position);


                nameIntent.putExtra("Icon", recette_item.getIcon());
                nameIntent.putExtra("Name", recette_item.getName());
                nameIntent.putExtra("Description", recette_item.getDescription());
                nameIntent.putExtra("Ingredient", recette_item.getIngredient());
                nameIntent.putExtra("Effet", recette_item.getEffet());
                nameIntent.putExtra("Evolution", recette_item.getEvolution());

                nameIntent.putExtra("Like", recette_item.getLike());
                nameIntent.putExtra("Dislikes", recette_item.getDislike());
                nameIntent.putExtra("Good", recette_item.getGood());
                nameIntent.putExtra("Bad", recette_item.getBad());

                startActivity(nameIntent);

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }

}
