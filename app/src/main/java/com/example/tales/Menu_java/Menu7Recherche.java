package com.example.tales.Menu_java;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.tales.Adapters.MyAdapter4;
import com.example.tales.Adapters.MyAdapter5;
import com.example.tales.Adapters.RechercheAdapter;
import com.example.tales.Controller.MainController;
import com.example.tales.Controller.RechercheController;
import com.example.tales.Objet.Arte_Menu;
import com.example.tales.Objet.Equipement_item;
import com.example.tales.Objet.Item_Menu;
import com.example.tales.Objet.Loca;
import com.example.tales.Objet.Recette;
import com.example.tales.Objet.Skill_item;
import com.example.tales.Objet.Synthese;
import com.example.tales.Objet.Character;
import com.example.tales.R;
import com.example.tales.RecyclerTouchListener;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Menu7Recherche extends AppCompatActivity {
    private RecyclerView rv_menu;
    private RecyclerView.Adapter rv_adapter;
    private RecyclerView.LayoutManager rv_layout;
    private RechercheController controller;

    private String aTrouver;
    private  ArrayList resultat_finaux;
    private EditText users;
    private ConstraintLayout en_cours;
    private ConstraintLayout pas_trouve;
    private Button recherche;
    private  int compteur;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recherche_layout);
        compteur=0;

        rv_menu = (RecyclerView) findViewById(R.id.recherche_liste);
        en_cours= (ConstraintLayout) findViewById(R.id.cherchons) ;
        pas_trouve= (ConstraintLayout) findViewById(R.id.pas) ;
        users = (EditText) findViewById(R.id.need);
        recherche = (Button) findViewById(R.id.button_find) ;

        recherche.setEnabled(false);

        rv_menu.setVisibility(View.GONE);
        pas_trouve.setVisibility(View.GONE);

        controller = new RechercheController(this);
        users.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.toString().length()>= 3)
                {
                    recherche.setEnabled(true);
                    aTrouver=s.toString();


                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        controller.onCreate();

    }

    public void enRecherche(View view)
    {

        rv_menu.setVisibility(View.VISIBLE);
        en_cours.setVisibility(View.INVISIBLE);
        pas_trouve.setVisibility(View.INVISIBLE);

        controller.setUsers(aTrouver);
        compteur ++;




    }


    public void showfind(ArrayList resultat) {

        Log.wtf("Avant", "il y a"+resultat.size());


        if (compteur>1){
            resultat_finaux.clear();
            resultat_finaux=new ArrayList(resultat);

            rv_adapter = new RechercheAdapter(resultat_finaux);
            rv_adapter.notifyDataSetChanged();
            rv_menu.setAdapter(rv_adapter);
            rv_menu.invalidate();
            rv_menu.removeAllViews();

        }else resultat_finaux=resultat;
        Log.wtf("Apres", "il y a"+resultat.size());
        Log.wtf("Apres", "il y a"+resultat_finaux.size());
        Log.wtf("Apres", "commpteur"+compteur);
        rv_menu.setHasFixedSize(true);
        rv_layout = new LinearLayoutManager(this);
        rv_menu.setLayoutManager(rv_layout);

        if (resultat.size()>0){

            /*rv_menu.setVisibility(View.VISIBLE);
            en_cours.setVisibility(View.GONE);
            pas_trouve.setVisibility(View.GONE);*/


            rv_adapter = new RechercheAdapter(resultat_finaux);

            rv_adapter.notifyDataSetChanged();
            rv_menu.setAdapter(rv_adapter);
            if (compteur>1){

                //rv_adapter = new RechercheAdapter(resultat_finaux);
                rv_adapter.notifyDataSetChanged();
                rv_menu.setAdapter(rv_adapter);
                rv_menu.invalidate();
                rv_menu.removeAllViews();
            }



            rv_menu.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), rv_menu, new RecyclerTouchListener.ClickListener() {
                @Override
                public void onClick(View view, int position) {

                    Object actual = resultat_finaux.get(position);

                    if (actual instanceof Item_Menu)
                    {
                        //Intent nameIntent = new Intent(getApplicationContext(), Artedetail.class);


                    }else if (actual instanceof Arte_Menu)
                    {
                        Intent nameIntent = new Intent(getApplicationContext(), Artedetail.class);

                        Arte_Menu arte_menu= (Arte_Menu) actual;


                        nameIntent.putExtra("url_img", arte_menu.getUrl_img());
                        nameIntent.putExtra("type", arte_menu.getType());
                        nameIntent.putExtra("name_item", arte_menu.getName_item());
                        nameIntent.putExtra("description_item", arte_menu.getDescription_item());
                        nameIntent.putExtra("detail", arte_menu.getDetail());
                        nameIntent.putExtra("tp_level", arte_menu.getTp_level());
                        nameIntent.putExtra("alter", arte_menu.getAlter());
                        nameIntent.putExtra("capacite", arte_menu.getCapacite());

                        startActivity(nameIntent);
                        /*if (resultat_finaux!=null)
                        {
                            resultat_finaux.clear();
                        }*/

                    }else if (actual instanceof Synthese)
                    {
                        Intent nameIntent = new Intent(getApplicationContext(), Syndetail.class);
                        Synthese synthese_item= (Synthese) actual;


                        nameIntent.putExtra("Icon", synthese_item.getIcon());
                        nameIntent.putExtra("Name", synthese_item.getName());
                        nameIntent.putExtra("Description", synthese_item.getDescription());
                        nameIntent.putExtra("Dropped", synthese_item.getDropped());
                        nameIntent.putExtra("Stolen", synthese_item.getStolen());
                        nameIntent.putExtra("Search_Points", synthese_item.getSp());


                        startActivity(nameIntent);
                        /*if (resultat_finaux!=null)
                        {
                            resultat_finaux.clear();
                        }*/

                    }else if (actual instanceof Equipement_item)
                    {
                        Intent nameIntent = new Intent(getApplicationContext(), Equipementdetail.class);
                        Equipement_item equipement= (Equipement_item) actual;

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
                        /*if (resultat_finaux!=null)
                        {
                            resultat_finaux.clear();
                        }*/


                    }else if (actual instanceof Skill_item)
                    {
                        Intent nameIntent = new Intent(getApplicationContext(), Skilldetail.class);
                        Skill_item skill_menu= (Skill_item) actual;


                        nameIntent.putExtra("icon", skill_menu.getIcon());
                        nameIntent.putExtra("info", skill_menu.getInfo());
                        nameIntent.putExtra("name", skill_menu.getName());
                        nameIntent.putExtra("description", skill_menu.getDescription());
                        nameIntent.putExtra("perso", skill_menu.getPerso());


                        startActivity(nameIntent);
                        /*if (resultat_finaux!=null)
                        {
                            resultat_finaux.clear();
                        }*/

                    }else if (actual instanceof Recette)
                    {
                        Intent nameIntent = new Intent(getApplicationContext(), Recette_Layout.class);
                        Recette recette_item= (Recette) actual;


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
                        /*if (resultat_finaux!=null)
                        {
                            resultat_finaux.clear();
                        }*/

                    }else if (actual instanceof Character)
                    {
                        Intent nameIntent = new Intent(getApplicationContext(), Personnage.class);
                        Character perso= (Character) actual;

                        nameIntent.putExtra("Name", perso.getName());
                        nameIntent.putExtra("Image", perso.getImage());
                        nameIntent.putExtra("Age", perso.getAge());
                        nameIntent.putExtra("Home", perso.getHome());
                        nameIntent.putExtra("Occup", perso.getOccup());
                        nameIntent.putExtra("Taille", perso.getHeight());
                        nameIntent.putExtra("Race", perso.getRace());
                        nameIntent.putExtra("Arme", perso.getWeapon());


                        startActivity(nameIntent);
                        /*if (resultat_finaux!=null)
                        {
                            resultat_finaux.clear();
                        }*/

                    }else if (actual instanceof Loca)
                    {
                        //Intent nameIntent = new Intent(getApplicationContext(), Equipementdetail.class);

                    }




                }

                @Override
                public void onLongClick(View view, int position) {

                }
            }));



        }/*else {
            rv_menu.setVisibility(View.GONE);
            en_cours.setVisibility(View.GONE);
            pas_trouve.setVisibility(View.VISIBLE);
        }*/

    }
}
