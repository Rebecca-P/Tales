package com.example.tales.Menu_java;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.tales.Adapters.MyAdapter1;
import com.example.tales.Adapters.MyAdapter2;
import com.example.tales.Adapters.MyAdapter4;
import com.example.tales.Controller.MainController;
import com.example.tales.Objet.Arte_Menu;
import com.example.tales.Objet.Equipement_item;
import com.example.tales.Objet.Item_Menu;
import com.example.tales.R;
import com.example.tales.RecyclerTouchListener;

import java.util.ArrayList;

public class Menu2Arme extends AppCompatActivity{
    private RecyclerView rv_menu;
    private RecyclerView.Adapter rv_adapter;
    private RecyclerView.LayoutManager rv_layout;
    private MainController controller;
    private Intent nameIntent ;
    private int number_view;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sousmenu_arme);

        nameIntent = new Intent(this, Artedetail.class);
        rv_menu = (RecyclerView) findViewById(R.id.arme_list);

        controller = new MainController(this);
        controller.onCreate();
        controller.arme_liste();
    }

    public void tosword()
    {
        number_view=0;
    }

    public void toaxe()
    {
        number_view=1;
    }

    public void tospear()
    {
        number_view=2;
    }

    public void tomaul()
    {
        number_view=3;
    }

    public void tostaff()
    {
        number_view=4;
    }

    public void tomace()
    {
        number_view=5;
    }

    public void toecharpe()
    {
        number_view=6;
    }

    public void tochaine()
    {
        number_view=7;
    }

    public void tolight()
    {
        number_view=8;
    }

    public void toeavy()
    {
        number_view=9;
    }

    public void todagger()
    {
        number_view=10;
    }

    public void toknnife()
    {
        number_view=11;
    }

    public void showArme(final ArrayList<ArrayList<Equipement_item>> all_equi) {
    //public void showArme(final ArrayList<Equipement_item> all_equi) {
        number_view=1;
        rv_menu.setHasFixedSize(true);
        rv_layout = new LinearLayoutManager(this);
        rv_menu.setLayoutManager(rv_layout);
        rv_adapter= new MyAdapter4(all_equi.get(number_view));
        //rv_adapter= new MyAdapter4(all_equi);
        rv_menu.setAdapter(rv_adapter);

        rv_menu.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), rv_menu, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
                //Arte_Menu arte_menu= arte.get(position);


                /*nameIntent.putExtra("url_img", arte_menu.getUrl_img());
                nameIntent.putExtra("type", arte_menu.getType());
                nameIntent.putExtra("name_item", arte_menu.getName_item());
                nameIntent.putExtra("description_item", arte_menu.getDescription_item());
                nameIntent.putExtra("detail", arte_menu.getDetail());
                nameIntent.putExtra("tp_level", arte_menu.getTp_level());
                nameIntent.putExtra("alter", arte_menu.getAlter());
                nameIntent.putExtra("capacite", arte_menu.getCapacite());

                startActivity(nameIntent);*/

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }
}
