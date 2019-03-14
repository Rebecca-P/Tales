package com.example.tales.Menu_java;

import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.util.LogPrinter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tales.Adapters.MyAdapter1;
import com.example.tales.Adapters.MyAdapter2;
import com.example.tales.Controller.MainController;
import com.example.tales.Objet.Arte_Menu;
import com.example.tales.Objet.Item_Menu;
import com.example.tales.R;
import com.example.tales.RecyclerTouchListener;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.lang.String;
import java.lang.Integer;
import java.util.*;
import java.lang.Class;

public class Equipementdetail extends AppCompatActivity{
    //image
    private ImageView url_img;
    private ImageView perso1;
    private ImageView perso2;
    private ImageView perso3;
    private ImageView perso4;

    //Texte
    private TextView name_item;
    private TextView description_item;
    private TextView price;
    private TextView stat;
    private TextView capacite;
    private TextView syn1;
    private TextView syn2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.equipement_layout);

        Intent recupintent = getIntent();
        String lesdetail;
        ArrayList<String> vrai = new ArrayList<String>();

        lesdetail=recupintent.getStringExtra("Personnage");
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
        //image

        url_img = (ImageView) this.findViewById(R.id.icon_equi);
        perso1 = (ImageView) this.findViewById(R.id.icon_type1);
        perso2 = (ImageView) this.findViewById(R.id.icon_type2);
        perso3 = (ImageView) this.findViewById(R.id.icon_type3);
        perso4 = (ImageView) this.findViewById(R.id.icon_type4);

        //texte
        name_item = (TextView) this.findViewById(R.id.titre_equi);
        description_item = (TextView) this.findViewById(R.id.descrip);
        price = (TextView) this.findViewById(R.id.price);
        stat = (TextView) this.findViewById(R.id.Stat);
        capacite = (TextView) this.findViewById(R.id.capacite);
        syn1 = (TextView) this.findViewById(R.id.syn1);
        syn2 = (TextView) this.findViewById(R.id.syn2);

        Picasso.get().load(recupintent.getStringExtra("url_img"))
                .resize(100,100)
                .into(this.url_img);

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

        //texte
        name_item.setText(recupintent.getStringExtra("Nom"));
        description_item.setText(recupintent.getStringExtra("Description"));
        price.setText(recupintent.getStringExtra("Prix_Lieux"));
        stat.setText("Statistique :\n"+recupintent.getStringExtra("Stat"));
        capacite.setText(recupintent.getStringExtra("Capacite"));
        syn1.setText(recupintent.getStringExtra("Synthese1"));
        syn2.setText(recupintent.getStringExtra("Synthese2"));
    }
}
