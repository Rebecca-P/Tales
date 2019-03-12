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
    private ArrayList<ArrayList<Equipement_item>> all_equi;

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

    public void tosword(View view)
    {
        number_view=0;
        rv_adapter= new MyAdapter4(all_equi.get(number_view));
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();

    }

    public void toaxe(View view)
    {
        number_view=1;
        rv_adapter= new MyAdapter4(all_equi.get(number_view));
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void tospear(View view)
    {
        number_view=2;
        rv_adapter= new MyAdapter4(all_equi.get(number_view));
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void tomaul(View view)
    {
        number_view=3;
        rv_adapter= new MyAdapter4(all_equi.get(number_view));
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void tostaff(View view)
    {
        number_view=4;
        rv_adapter= new MyAdapter4(all_equi.get(number_view));
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void tomace(View view)
    {
        number_view=5;
        rv_adapter= new MyAdapter4(all_equi.get(number_view));
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void toecharpe(View view)
    {
        number_view=6;
        rv_adapter= new MyAdapter4(all_equi.get(number_view));
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void tochaine(View view)
    {
        number_view=7;
        rv_adapter= new MyAdapter4(all_equi.get(number_view));
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void tolight(View view)
    {
        number_view=8;
        rv_adapter= new MyAdapter4(all_equi.get(number_view));
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void toeavy(View view)
    {
        number_view=9;
        rv_adapter= new MyAdapter4(all_equi.get(number_view));
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void todagger(View view)
    {
        number_view=10;
        rv_adapter= new MyAdapter4(all_equi.get(number_view));
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void toknnife(View view)
    {
        number_view=11;
        rv_adapter= new MyAdapter4(all_equi.get(number_view));
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showArme(final ArrayList<ArrayList<Equipement_item>> equi) {
    //public void showArme(final ArrayList<Equipement_item> all_equi) {
        //number_view=1;
        all_equi=equi;
        rv_menu.setHasFixedSize(true);
        rv_layout = new LinearLayoutManager(this);
        rv_menu.setLayoutManager(rv_layout);

        rv_adapter= new MyAdapter4(all_equi.get(3));

        rv_menu.setAdapter(rv_adapter);

        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();

        //.notifyItemRangeChanged(0, itemList.size());
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
