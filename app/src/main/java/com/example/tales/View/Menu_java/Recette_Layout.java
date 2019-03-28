package com.example.tales.View.Menu_java;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tales.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Recette_Layout extends AppCompatActivity{
    //image
    private ImageView icon;
    private ImageView perso1;
    private ImageView perso2;
    private ImageView perso3;
    private ImageView perso4;
    private ImageView perso5;
    private ImageView perso6;
    private ImageView perso7;
    private ImageView perso8;
    private ImageView perso9;
    private ImageView perso10;
    private ImageView perso11;
    private ImageView perso12;
    private ImageView perso13;
    private ImageView perso14;
    private ImageView perso15;
    private ImageView perso16;

    //Texte
    private TextView name;
    private TextView description;
    private TextView ingredient;
    private TextView effet;
    private TextView evolution;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recette_layout);

        Intent recupintent = getIntent();
        String lesdetail;
        ArrayList<String> vrai = new ArrayList<String>();

        lesdetail=recupintent.getStringExtra("Like");
        String lien="";
        int i=0;

        if (!lesdetail.isEmpty())
        {
            while (i<lesdetail.length())
            {
                if (lesdetail.charAt(i)!=' ' ){
                    lien+=lesdetail.charAt(i);
                }
                if (lesdetail.charAt(i)==' ' || i==lesdetail.length()-1){
                    vrai.add(lien);
                    lien="";
                }

                i++;


            }
        }


        String lesdetail2;
        ArrayList<String> vrai2 = new ArrayList<String>();

        lesdetail2=recupintent.getStringExtra("Dislikes");
        //String lien2="";
        i=0;

        if (!lesdetail2.isEmpty())
        {
            while (i<lesdetail2.length())
            {
                if (lesdetail2.charAt(i)!=' ' ){
                    lien+=lesdetail2.charAt(i);
                }
                if (lesdetail2.charAt(i)==' ' || i==lesdetail2.length()-1){
                    vrai2.add(lien);
                    lien="";
                }

                i++;


            }
        }

        String lesdetail3;
        ArrayList<String> vrai3 = new ArrayList<String>();

        lesdetail3=recupintent.getStringExtra("Good");

        i=0;

        if (!lesdetail3.isEmpty())
        {
            while (i<lesdetail3.length())
            {
                if (lesdetail3.charAt(i)!=' ' ){
                    lien+=lesdetail3.charAt(i);
                }
                if (lesdetail3.charAt(i)==' ' || i==lesdetail3.length()-1){
                    vrai3.add(lien);
                    lien="";
                }

                i++;


            }
        }

        String lesdetail4;
        ArrayList<String> vrai4 = new ArrayList<String>();

        lesdetail4=recupintent.getStringExtra("Bad");

        i=0;

        if (!lesdetail4.isEmpty())
        {
            while (i<lesdetail4.length())
            {
                if (lesdetail4.charAt(i)!=' ' ){
                    lien+=lesdetail4.charAt(i);
                }
                if (lesdetail4.charAt(i)==' ' || i==lesdetail4.length()-1){
                    vrai4.add(lien);
                    lien="";
                }

                i++;


            }
        }


        //image

        icon = (ImageView) this.findViewById(R.id.icon);
        perso1 = (ImageView) this.findViewById(R.id.icon_type01);
        perso2 = (ImageView) this.findViewById(R.id.icon_type02);
        perso3 = (ImageView) this.findViewById(R.id.icon_type03);
        perso4 = (ImageView) this.findViewById(R.id.icon_type04);
        perso5 = (ImageView) this.findViewById(R.id.icon_type5);
        perso6 = (ImageView) this.findViewById(R.id.icon_type6);
        perso7 = (ImageView) this.findViewById(R.id.icon_type7);
        perso8 = (ImageView) this.findViewById(R.id.icon_type8);
        perso9 = (ImageView) this.findViewById(R.id.icon_type9);
        perso10 = (ImageView) this.findViewById(R.id.icon_type10);
        perso11 = (ImageView) this.findViewById(R.id.icon_type11);
        perso12 = (ImageView) this.findViewById(R.id.icon_type12);
        perso13 = (ImageView) this.findViewById(R.id.icon_type13);
        perso14 = (ImageView) this.findViewById(R.id.icon_type14);
        perso15 = (ImageView) this.findViewById(R.id.icon_type15);
        perso16 = (ImageView) this.findViewById(R.id.icon_type16);


        //texte
        name = (TextView) this.findViewById(R.id.titre);
        description = (TextView) this.findViewById(R.id.descr);
        ingredient = (TextView) this.findViewById(R.id.ingre);
        effet = (TextView) this.findViewById(R.id.effet);
        evolution = (TextView) this.findViewById(R.id.evolu);


        Picasso.get().load(recupintent.getStringExtra("Icon"))
                //.resize(100,100)
                .into(this.icon);

        if (vrai.size()>= 1)
        {

            Picasso.get().load(vrai.get(0)).into(this.perso1);
        }
        if (vrai.size()>= 2)
        {

            Picasso.get().load(vrai.get(1)).into(this.perso2);
        }
        if (vrai.size()>= 3)
        {

            Picasso.get().load(vrai.get(2)).into(this.perso3);
        }
        if (vrai.size()>= 4)
        {

            Picasso.get().load(vrai.get(3)).into(this.perso4);
        }

        if (vrai2.size()>= 1)
        {

            Picasso.get().load(vrai2.get(0)).into(this.perso5);
        }
        if (vrai2.size()>= 2)
        {

            Picasso.get().load(vrai2.get(1)).into(this.perso6);
        }
        if (vrai2.size()>= 3)
        {

            Picasso.get().load(vrai2.get(2)).into(this.perso7);
        }
        if (vrai2.size()>= 4)
        {

            Picasso.get().load(vrai2.get(3)).into(this.perso8);
        }
        if (vrai3.size()>= 1)
        {

            Picasso.get().load(vrai3.get(0)).into(this.perso9);
        }
        if (vrai3.size()>= 2)
        {

            Picasso.get().load(vrai3.get(1)).into(this.perso10);
        }
        if (vrai3.size()>= 3)
        {

            Picasso.get().load(vrai3.get(2)).into(this.perso11);
        }
        if (vrai3.size()>= 4)
        {

            Picasso.get().load(vrai3.get(3)).into(this.perso12);
        }
        if (vrai4.size()>= 1)
        {

            Picasso.get().load(vrai4.get(0)).into(this.perso13);
        }
        if (vrai4.size()>= 2)
        {

            Picasso.get().load(vrai4.get(1)).into(this.perso14);
        }
        if (vrai4.size()>= 3)
        {

            Picasso.get().load(vrai4.get(2)).into(this.perso15);
        }
        if (vrai4.size()>= 4)
        {

            Picasso.get().load(vrai4.get(3)).into(this.perso16);
        }

        //texte
        name.setText(recupintent.getStringExtra("Name"));
        description.setText(recupintent.getStringExtra("Description"));
        ingredient.setText("Ingredient:\n"+recupintent.getStringExtra("Ingredient")+"\n");
        effet.setText("Effet :\n"+recupintent.getStringExtra("Effet")+"\n");
        evolution.setText("Evolution :\n"+recupintent.getStringExtra("Evolution")+"\n");

    }
}
