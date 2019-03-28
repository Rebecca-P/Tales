package com.example.tales.View.Menu_java;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;


import com.example.tales.Controller.Adapters.MyAdapter7;
import com.example.tales.Controller.MainController;
import com.example.tales.Model.Objet.Character;

import com.example.tales.R;
import com.example.tales.RecyclerTouchListener;

import java.util.ArrayList;

public class Menu5Perso extends AppCompatActivity {
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
        titre = (TextView) findViewById(R.id.Titlething);
        this.titre.setText("Character");
        nameIntent = new Intent(this, Personnage.class);
        rv_menu = (RecyclerView) findViewById(R.id.thingslist);
        controller = new MainController(this);
        controller.onCreate();
        controller.character_liste();

    }

    public void showchar(final ArrayList<Character> charlist) {
        rv_menu.setHasFixedSize(true);
        rv_layout = new LinearLayoutManager(this);
        rv_menu.setLayoutManager(rv_layout);
        rv_adapter= new MyAdapter7(charlist);
        rv_menu.setAdapter(rv_adapter);

        rv_menu.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), rv_menu, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Character perso= charlist.get(position);



                nameIntent.putExtra("Name", perso.getName());
                nameIntent.putExtra("Image", perso.getImage());
                nameIntent.putExtra("Age", perso.getAge());
                nameIntent.putExtra("Home", perso.getHome());
                nameIntent.putExtra("Occup", perso.getOccup());
                nameIntent.putExtra("Taille", perso.getHeight());
                nameIntent.putExtra("Race", perso.getRace());
                nameIntent.putExtra("Arme", perso.getWeapon());


                startActivity(nameIntent);

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }

}
