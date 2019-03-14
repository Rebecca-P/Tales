package com.example.tales.Menu_java;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.tales.Adapters.MyAdapter1;
import com.example.tales.Adapters.MyAdapter3;
import com.example.tales.Controller.MainController;
import com.example.tales.Objet.Arte_Menu;
import com.example.tales.Objet.Item_Menu;
import com.example.tales.Objet.Synthese;
import com.example.tales.R;
import com.example.tales.RecyclerTouchListener;

import java.util.ArrayList;

public class Menu1Syn extends AppCompatActivity {
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
        this.titre.setText("Materiaux de Synthese");
        nameIntent = new Intent(this, Syndetail.class);
        rv_menu = (RecyclerView) findViewById(R.id.thingslist);
        controller = new MainController(this);
        controller.onCreate();
        controller.syn_liste();

    }

    public void showSyn(final ArrayList<Synthese> synlist) {
        rv_menu.setHasFixedSize(true);
        rv_layout = new LinearLayoutManager(this);
        rv_menu.setLayoutManager(rv_layout);
        rv_adapter= new MyAdapter3(synlist);
        rv_menu.setAdapter(rv_adapter);

        rv_menu.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), rv_menu, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Synthese synthese_item= synlist.get(position);


                nameIntent.putExtra("Icon", synthese_item.getIcon());
                nameIntent.putExtra("Name", synthese_item.getName());
                nameIntent.putExtra("Description", synthese_item.getDescription());
                nameIntent.putExtra("Dropped", synthese_item.getDropped());
                nameIntent.putExtra("Stolen", synthese_item.getStolen());
                nameIntent.putExtra("Search_Points", synthese_item.getSp());


                startActivity(nameIntent);

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }

}
