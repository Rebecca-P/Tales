package com.example.tales.Menu_java;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.tales.Adapters.MyAdapter1;
import com.example.tales.Adapters.MyAdapter2;
import com.example.tales.Controller.MainController;
import com.example.tales.Objet.Arte_Menu;
import com.example.tales.Objet.Item_Menu;
import com.example.tales.R;
import com.example.tales.RecyclerTouchListener;


import java.util.ArrayList;

public class Menu1Arte extends AppCompatActivity {
    private RecyclerView rv_menu;
    private RecyclerView.Adapter rv_adapter;
    private RecyclerView.LayoutManager rv_layout;
    private MainController controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sousmenu);


        rv_menu = (RecyclerView) findViewById(R.id.thingslist);

        controller = new MainController(this);
        controller.onCreate();
        controller.arte_liste();

    }

    public void showArte(final ArrayList<Arte_Menu> arte) {
        rv_menu.setHasFixedSize(true);
        rv_layout = new LinearLayoutManager(this);
        rv_menu.setLayoutManager(rv_layout);
        rv_adapter= new MyAdapter2(arte);
        rv_menu.setAdapter(rv_adapter);

        rv_menu.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), rv_menu, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Arte_Menu arte_menu= arte.get(position);

                Intent nameIntent = new Intent(this, pointjav.class);
                nameIntent.putExtra("url_img", arte_menu.getUrl_img());
                nameIntent.putExtra("type", arte_menu.getType());
                nameIntent.putExtra("name_item", arte_menu.getName_item());
                nameIntent.putExtra("description_item", arte_menu.getDescription_item());
                nameIntent.putExtra("detail", arte_menu.getDetail());
                nameIntent.putExtra("tp_level", arte_menu.getTp_level());
                nameIntent.putExtra("alter", arte_menu.getAlter());
                nameIntent.putExtra("capacite", arte_menu.getCapacite());

                startActivity(nameIntent);

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }

}
