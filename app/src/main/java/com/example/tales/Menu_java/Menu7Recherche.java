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
    private ArrayList resultat_finaux;
    private ArrayList resultat_demande;
    private EditText users;
    private ConstraintLayout en_cours;
    private ConstraintLayout pas_trouve;
    private Button recherche;
    private  int compteur;
    private boolean uneRecherche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recherche_layout);
        compteur=0;
        uneRecherche=false;
        rv_menu = (RecyclerView) findViewById(R.id.recherche_liste);
        en_cours= (ConstraintLayout) findViewById(R.id.cherchons) ;
        pas_trouve= (ConstraintLayout) findViewById(R.id.pas) ;
        users = (EditText) findViewById(R.id.need);
        recherche = (Button) findViewById(R.id.button_find) ;

       // recherche.setEnabled(false);
        rv_menu.setVisibility(View.GONE);
        pas_trouve.setVisibility(View.GONE);

        controller = new RechercheController(this);
        controller.onCreate();
        controller.recupDonne();


    }

    public void recuperons()
    {
        //if (compteur>0)
        if (uneRecherche)
        {
            resultat_demande.clear();
        }
        if (aTrouver!=null)
        if (aTrouver.length()>2  )
        {
            rv_menu.setVisibility(View.GONE);
            en_cours.setVisibility(View.VISIBLE);
            pas_trouve.setVisibility(View.GONE);

            //compteur ++;
            uneRecherche=true;
            changement();
            chargementDonne();


        }
    }

    public void enRecherche(View view)
    {
        //rv_menu.setVisibility(View.VISIBLE);
        en_cours.setVisibility(View.VISIBLE);
        pas_trouve.setVisibility(View.GONE);




        aTrouver=users.getText().toString();
        String temp = aTrouver.toLowerCase();
        aTrouver = temp;
        //if (compteur==0)
        /*if (!uneRecherche)
        {

            Log.wtf("aaaaaaaaa", "Je rentre et c'est pas normal");
        }else*/ recuperons();



    }

    public void recherchons()
    {
        resultat_demande=new ArrayList();
        for (Object actual: resultat_finaux ) {

            if (actual instanceof Item_Menu)
            {
                Item_Menu item= (Item_Menu) actual;
                if (item.getName_item().toLowerCase().contains(aTrouver))
                    resultat_demande.add(actual);

            }else if (actual instanceof Arte_Menu)
            {
                Arte_Menu arte_menu= (Arte_Menu) actual;
                if (arte_menu.getName_item().toLowerCase().contains(aTrouver))
                    resultat_demande.add(actual);

            }else if (actual instanceof Synthese)
            {
                Synthese item= (Synthese) actual;
                if (item.getName().toLowerCase().contains(aTrouver))
                    resultat_demande.add(actual);

            }else if (actual instanceof Equipement_item)
            {
                Equipement_item item= (Equipement_item) actual;
                if (item.getName_equ().toLowerCase().contains(aTrouver))
                    resultat_demande.add(actual);

            }else if (actual instanceof Skill_item)
            {
                Skill_item item= (Skill_item) actual;
                if (item.getName().toLowerCase().contains(aTrouver))
                    resultat_demande.add(actual);

            }else if (actual instanceof Recette)
            {
                Recette item= (Recette) actual;
                if (item.getName().toLowerCase().contains(aTrouver))
                    resultat_demande.add(actual);

            }else if (actual instanceof Character)
            {
                Character item= (Character) actual;
                if (item.getName().toLowerCase().contains(aTrouver))
                    resultat_demande.add(actual);

            }

        }


    }


    public void changement()
    {
        //if (compteur!=0)
            if (uneRecherche)
        {
            recherchons();
            rv_adapter = new RechercheAdapter(resultat_demande);
            rv_adapter.notifyDataSetChanged();
            rv_menu.setAdapter(rv_adapter);
            rv_menu.invalidate();
            rv_menu.removeAllViews();
        }
    }

    public void showfind(ArrayList recuperation) {

        resultat_finaux=(ArrayList) recuperation.clone();
        recuperons();

    }

    public void chargementDonne(){
        rv_menu.setVisibility(View.GONE);
        en_cours.setVisibility(View.VISIBLE);
        pas_trouve.setVisibility(View.GONE);

        rv_adapter = new RechercheAdapter(resultat_demande);


        rv_menu.setHasFixedSize(true);
        rv_layout = new LinearLayoutManager(this);
        rv_menu.setLayoutManager(rv_layout);

        rv_menu.setAdapter(rv_adapter);

        rv_menu.addOnItemTouchListener(new RecyclerTouchListener(getApplicationContext(), rv_menu, new RecyclerTouchListener.ClickListener() {
            @Override
            public void onClick(View view, int position) {

                Object actual = resultat_demande.get(position);
                Intent nameIntent = new Intent(getApplicationContext(), Personnage.class);

                if (actual instanceof Arte_Menu)
                {
                    nameIntent = new Intent(getApplicationContext(), Artedetail.class);

                    Arte_Menu arte_menu= (Arte_Menu) actual;


                    nameIntent.putExtra("url_img", arte_menu.getUrl_img());
                    nameIntent.putExtra("type", arte_menu.getType());
                    nameIntent.putExtra("name_item", arte_menu.getName_item());
                    nameIntent.putExtra("description_item", arte_menu.getDescription_item());
                    nameIntent.putExtra("detail", arte_menu.getDetail());
                    nameIntent.putExtra("tp_level", arte_menu.getTp_level());
                    nameIntent.putExtra("alter", arte_menu.getAlter());
                    nameIntent.putExtra("capacite", arte_menu.getCapacite());



                }else if (actual instanceof Synthese)
                {
                    nameIntent = new Intent(getApplicationContext(), Syndetail.class);
                    Synthese synthese_item= (Synthese) actual;


                    nameIntent.putExtra("Icon", synthese_item.getIcon());
                    nameIntent.putExtra("Name", synthese_item.getName());
                    nameIntent.putExtra("Description", synthese_item.getDescription());
                    nameIntent.putExtra("Dropped", synthese_item.getDropped());
                    nameIntent.putExtra("Stolen", synthese_item.getStolen());
                    nameIntent.putExtra("Search_Points", synthese_item.getSp());


                    //startActivity(nameIntent);
                        /*if (resultat_finaux!=null)
                        {
                            resultat_finaux.clear();
                        }*/

                }else if (actual instanceof Equipement_item)
                {
                    nameIntent = new Intent(getApplicationContext(), Equipementdetail.class);
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




                }else if (actual instanceof Skill_item)
                {
                    nameIntent = new Intent(getApplicationContext(), Skilldetail.class);
                    Skill_item skill_menu= (Skill_item) actual;


                    nameIntent.putExtra("icon", skill_menu.getIcon());
                    nameIntent.putExtra("info", skill_menu.getInfo());
                    nameIntent.putExtra("name", skill_menu.getName());
                    nameIntent.putExtra("description", skill_menu.getDescription());
                    nameIntent.putExtra("perso", skill_menu.getPerso());




                }else if (actual instanceof Recette)
                {
                    nameIntent = new Intent(getApplicationContext(), Recette_Layout.class);
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



                }else if (actual instanceof Character)
                {
                    nameIntent = new Intent(getApplicationContext(), Personnage.class);
                    Character perso= (Character) actual;

                    nameIntent.putExtra("Name", perso.getName());
                    nameIntent.putExtra("Image", perso.getImage());
                    nameIntent.putExtra("Age", perso.getAge());
                    nameIntent.putExtra("Home", perso.getHome());
                    nameIntent.putExtra("Occup", perso.getOccup());
                    nameIntent.putExtra("Taille", perso.getHeight());
                    nameIntent.putExtra("Race", perso.getRace());
                    nameIntent.putExtra("Arme", perso.getWeapon());

                }
                startActivity(nameIntent);
                //finish();




            }

            @Override
            public void onLongClick(View view, int position) {

            }
        }));


        if (resultat_demande.size()!=0 || resultat_demande!=null){
            rv_menu.setVisibility(View.VISIBLE);
            en_cours.setVisibility(View.GONE);
            pas_trouve.setVisibility(View.GONE);

        }else {
            rv_menu.setVisibility(View.GONE);
            en_cours.setVisibility(View.GONE);
            pas_trouve.setVisibility(View.VISIBLE);
        }
    }
}
//Todo
/*
* Ajouter un bouton permettant de voir les 10 derniere recherche
* faire une seul et recuperer les donnée dans ce fichier et non l'autre
* recuperer la liste seulement apres traitement
* etape a suivre
* 1.recuperer toute la liste et la mettre dans CE fichier
* puis en fonction de ce que l'user veut faire la meme chose mais seulement ici
*
* */
