package com.example.tales.View.Menu_java;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import com.example.tales.Controller.Adapters.MyAdapter4;
import com.example.tales.Controller.MainController;
import com.example.tales.Model.Objet.Equipement_item;
import com.example.tales.R;
import com.example.tales.RecyclerTouchListener;

import java.util.ArrayList;

public class Menu2Head extends AppCompatActivity{

    private RecyclerView rv_menu;
    private RecyclerView.Adapter rv_adapter;
    private RecyclerView.LayoutManager rv_layout;
    private MainController controller;
    private Intent nameIntent ;
    private int number_view;
    private ArrayList<Equipement_item> all_equi;
    private ArrayList<Equipement_item> perso;

    private ImageButton yur ;
    private ImageButton est ;
    private ImageButton rep ;
    private ImageButton kar ;
    private ImageButton jud ;
    private ImageButton rav ;
    private ImageButton fle ;
    private ImageButton rit ;
    private ImageButton pat ;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sousmenu_second);

        yur = findViewById(R.id.yuri);
        est = findViewById(R.id.estelle);
        rep = findViewById(R.id.repede);
        kar = findViewById(R.id.karol);
        jud = findViewById(R.id.judith);
        rav = findViewById(R.id.raven);
        fle = findViewById(R.id.flynn);
        rit = findViewById(R.id.rita);
        pat = findViewById(R.id.patty);

        yur.setEnabled(false);
        est.setEnabled(false);
        rep.setEnabled(false);
        kar.setEnabled(false);
        jud.setEnabled(false);
        rav.setEnabled(false);
        fle.setEnabled(false);
        rit.setEnabled(false);
        pat.setEnabled(false);

        nameIntent = new Intent(this, Equipementdetail.class);
        rv_menu = (RecyclerView) findViewById(R.id.par_perso);

        controller = new MainController(this);
        controller.onCreate();
        controller.head_liste();


    }

    public void showYuri(View view)
    {
        perso=new ArrayList<Equipement_item>();
        for (Equipement_item actual: all_equi)
        {
            if (actual.getUrl_perso().contains("YUR"))
            {
                perso.add(actual);
            }
        }
        rv_adapter= new MyAdapter4(perso);
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showEstelle(View view)
    {
        perso=new ArrayList<Equipement_item>();
        for (Equipement_item actual: all_equi)
        {
            if (actual.getUrl_perso().contains("EST"))
            {
                perso.add(actual);
            }
        }
        rv_adapter= new MyAdapter4(perso);
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showKarol(View view)
    {
        perso=new ArrayList<Equipement_item>();
        for (Equipement_item actual: all_equi)
        {
            if (actual.getUrl_perso().contains("KAR"))
            {
                perso.add(actual);
            }
        }
        rv_adapter= new MyAdapter4(perso);
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showRapede(View view)
    {
        perso=new ArrayList<Equipement_item>();
        for (Equipement_item actual: all_equi)
        {
            if (actual.getUrl_perso().contains("RAP"))
            {
                perso.add(actual);
            }
        }
        rv_adapter= new MyAdapter4(perso);
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showFlynn(View view)
    {
        perso=new ArrayList<Equipement_item>();
        for (Equipement_item actual: all_equi)
        {
            if (actual.getUrl_perso().contains("FRE"))
            {
                perso.add(actual);
            }
        }
        rv_adapter= new MyAdapter4(perso);
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showRita(View view)
    {
        perso=new ArrayList<Equipement_item>();
        for (Equipement_item actual: all_equi)
        {
            if (actual.getUrl_perso().contains("RIT"))
            {
                perso.add(actual);
            }
        }
        rv_adapter= new MyAdapter4(perso);
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showRaven(View view)
    {
        perso=new ArrayList<Equipement_item>();
        for (Equipement_item actual: all_equi)
        {
            if (actual.getUrl_perso().contains("RAV"))
            {
                perso.add(actual);
            }
        }
        rv_adapter= new MyAdapter4(perso);
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showJudy(View view)
    {
        perso=new ArrayList<Equipement_item>();
        for (Equipement_item actual: all_equi)
        {
            if (actual.getUrl_perso().contains("JUD"))
            {
                perso.add(actual);
            }
        }
        rv_adapter= new MyAdapter4(perso);
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showPatty(View view)
    {
        perso=new ArrayList<Equipement_item>();
        for (Equipement_item actual: all_equi)
        {
            if (actual.getUrl_perso().contains("PAT"))
            {
                perso.add(actual);
            }
        }
        rv_adapter= new MyAdapter4(perso);
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showHead(final ArrayList<Equipement_item> equi) {

        all_equi=equi;
        perso=equi;
        rv_menu.setHasFixedSize(true);
        rv_layout = new LinearLayoutManager(this);
        rv_menu.setLayoutManager(rv_layout);

        rv_adapter= new MyAdapter4(all_equi);

        rv_menu.setAdapter(rv_adapter);

        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();

        yur.setEnabled(true);
        est.setEnabled(true);
        rep.setEnabled(true);
        kar.setEnabled(true);
        jud.setEnabled(true);
        rav.setEnabled(true);
        fle.setEnabled(true);
        rit.setEnabled(true);
        pat.setEnabled(true);

        rv_menu.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), rv_menu, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {
               /* ArrayList<Equipement_item> temp = all_equi.get(number_view);
                Equipement_item equipement= temp.get(position);*/
                Equipement_item equipement= perso.get(position);

                nameIntent.putExtra("url_img", equipement.getUrl_img());
                nameIntent.putExtra("Nom", equipement.getName_equ());
                nameIntent.putExtra("Description", equipement.getDescription_equ());
                nameIntent.putExtra("Personnage", equipement.getUrl_perso());
                nameIntent.putExtra("Capacite", equipement.getCapacite());
                nameIntent.putExtra("Prix_Lieux", equipement.getPrix_lieux());
                nameIntent.putExtra("Stat", equipement.getStat());
                nameIntent.putExtra("Synthese1", equipement.getSyn1());
                nameIntent.putExtra("Synthese2", equipement.getSyn2());

                startActivity(nameIntent);

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }
}
