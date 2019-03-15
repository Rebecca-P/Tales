package com.example.tales.Menu_java;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.tales.Adapters.MyAdapter10;
import com.example.tales.Adapters.MyAdapter6;
import com.example.tales.Controller.MainController;
import com.example.tales.Objet.Recette;
import com.example.tales.Objet.Synopsis;
import com.example.tales.R;
import com.example.tales.RecyclerTouchListener;

import java.util.ArrayList;

public class Menu6Syno extends AppCompatActivity {
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
        this.titre.setText("Synopsis");
        controller = new MainController(this);
        controller.onCreate();
        controller.syno_liste();

    }

    public void showsyno(final ArrayList<Synopsis> synolist) {
        rv_menu.setHasFixedSize(true);
        rv_layout = new LinearLayoutManager(this);
        rv_menu.setLayoutManager(rv_layout);
        rv_adapter= new MyAdapter10(synolist);
        rv_menu.setAdapter(rv_adapter);


    }

}
