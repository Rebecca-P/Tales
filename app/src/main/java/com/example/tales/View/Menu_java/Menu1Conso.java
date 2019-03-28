package com.example.tales.View.Menu_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.tales.Controller.Adapters.MyAdapter1;
import com.example.tales.Controller.MainController;
import com.example.tales.Model.Objet.Item_Menu;
import com.example.tales.R;

import java.util.ArrayList;

public class Menu1Conso extends AppCompatActivity {
    private RecyclerView rv_menu;
    private RecyclerView.Adapter rv_adapter;
    private RecyclerView.LayoutManager rv_layout;
    private MainController controller;
    public TextView titre;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sousmenu);
        titre = (TextView) findViewById(R.id.Titlething);
        this.titre.setText("Consomable");
        rv_menu = (RecyclerView) findViewById(R.id.thingslist);
        controller = new MainController(this);
        controller.onCreate();
        controller.item_liste();

    }

    public void showItem(ArrayList<Item_Menu> objet_conso) {
        rv_menu.setHasFixedSize(true);
        rv_layout = new LinearLayoutManager(this);
        rv_menu.setLayoutManager(rv_layout);
        rv_adapter= new MyAdapter1(objet_conso);
        rv_menu.setAdapter(rv_adapter);
    }

}
