package com.example.tales.View.Menu_java;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;

import com.example.tales.Controller.Adapters.MyAdapter5;
import com.example.tales.Controller.MainController;
import com.example.tales.Model.Objet.Skill_item;
import com.example.tales.R;
import com.example.tales.RecyclerTouchListener;

import java.util.ArrayList;

public class Menu3Skill extends AppCompatActivity {
    private RecyclerView rv_menu;
    private RecyclerView.Adapter rv_adapter;
    private RecyclerView.LayoutManager rv_layout;
    private MainController controller;
    private Intent nameIntent ;

    private ArrayList<Skill_item> all_equi;
    private ArrayList<Skill_item> perso;
    private ImageButton yur;
    private ImageButton est;
    private ImageButton rep;
    private ImageButton kar;
    private ImageButton jud;
    private ImageButton rav;
    private ImageButton fle;
    private ImageButton rit;
    private ImageButton pat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
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

        nameIntent = new Intent(this, Skilldetail.class);
        rv_menu = (RecyclerView) findViewById(R.id.par_perso);

        controller = new MainController(this);
        controller.onCreate();
        controller.skill_liste();

    }

    public void showYuri(View view)
    {
        perso=new ArrayList<Skill_item>();
        for (Skill_item actual: all_equi)
        {
            if (actual.getPerso().contains("YUR"))
            {
                perso.add(actual);
            }
        }
        rv_adapter= new MyAdapter5(perso);
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showEstelle(View view)
    {
        perso=new ArrayList<Skill_item>();
        for (Skill_item actual: all_equi)
        {
            if (actual.getPerso().contains("EST"))
            {
                perso.add(actual);
            }
        }
        rv_adapter= new MyAdapter5(perso);
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showKarol(View view)
    {
        perso=new ArrayList<Skill_item>();
        for (Skill_item actual: all_equi)
        {
            if (actual.getPerso().contains("KAR"))
            {
                perso.add(actual);
            }
        }
        rv_adapter= new MyAdapter5(perso);
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showRapede(View view)
    {
        perso=new ArrayList<Skill_item>();
        for (Skill_item actual: all_equi)
        {
            if (actual.getPerso().contains("RAP"))
            {
                perso.add(actual);
            }
        }
        rv_adapter= new MyAdapter5(perso);
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showFlynn(View view)
    {
        perso=new ArrayList<Skill_item>();
        for (Skill_item actual: all_equi)
        {
            if (actual.getPerso().contains("FRE"))
            {
                perso.add(actual);
            }
        }
        rv_adapter= new MyAdapter5(perso);
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showRita(View view)
    {
        perso=new ArrayList<Skill_item>();
        for (Skill_item actual: all_equi)
        {
            if (actual.getPerso().contains("RIT"))
            {
                perso.add(actual);
            }
        }
        rv_adapter= new MyAdapter5(perso);
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showRaven(View view)
    {
        perso=new ArrayList<Skill_item>();
        for (Skill_item actual: all_equi)
        {
            if (actual.getPerso().contains("RAV"))
            {
                perso.add(actual);
            }
        }
        rv_adapter= new MyAdapter5(perso);
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showJudy(View view)
    {
        perso=new ArrayList<Skill_item>();
        for (Skill_item actual: all_equi)
        {
            if (actual.getPerso().contains("JUD"))
            {
                perso.add(actual);
            }
        }
        rv_adapter= new MyAdapter5(perso);
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showPatty(View view)
    {
        perso=new ArrayList<Skill_item>();
        for (Skill_item actual: all_equi)
        {
            if (actual.getPerso().contains("PAT"))
            {
                perso.add(actual);
            }
        }
        rv_adapter= new MyAdapter5(perso);
        rv_adapter.notifyDataSetChanged();
        rv_menu.setAdapter(rv_adapter);
        rv_menu.invalidate();
        rv_menu.removeAllViews();
    }

    public void showSkill(final ArrayList<Skill_item> skill) {
        all_equi=skill;
        perso=skill;
        rv_menu.setHasFixedSize(true);
        rv_layout = new LinearLayoutManager(this);
        rv_menu.setLayoutManager(rv_layout);
        rv_adapter= new MyAdapter5(skill);
        rv_menu.setAdapter(rv_adapter);

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
                Skill_item skill_menu= perso.get(position);


                nameIntent.putExtra("icon", skill_menu.getIcon());
                nameIntent.putExtra("info", skill_menu.getInfo());
                nameIntent.putExtra("name", skill_menu.getName());
                nameIntent.putExtra("description", skill_menu.getDescription());
                nameIntent.putExtra("perso", skill_menu.getPerso());


                startActivity(nameIntent);

            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));
    }

}
