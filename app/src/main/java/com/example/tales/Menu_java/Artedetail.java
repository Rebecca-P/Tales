package com.example.tales.Menu_java;

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

public class Artedetail extends AppCompatActivity {
    //image
    public ImageView url_img;
    public ImageView type;
    public ImageView detail1;
    public ImageView detail2;
    public ImageView detail3;
    public ImageView detail4;

    //Texte
    public TextView name_item;
    public TextView description_item;
    public TextView tp_level;
    public TextView alter;
    public TextView capacite;

    //View
    //public View layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.arteslayout);

        Intent recupintent = getIntent();
        String lesdetail;
        ArrayList<String> vrai = new ArrayList<String>();

        lesdetail=recupintent.getStringExtra("detail");


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
        url_img = (ImageView) this.findViewById(R.id.icon_perso_arte);
        type = (ImageView) this.findViewById(R.id.icon_type);
        detail1 = (ImageView) this.findViewById(R.id.icon_type1);
        detail2 = (ImageView) this.findViewById(R.id.icon_type2);
        detail3 = (ImageView) this.findViewById(R.id.icon_type3);
        detail4 = (ImageView) this.findViewById(R.id.icon_type4);
        //texte
        name_item = (TextView) this.findViewById(R.id.titre_art);
        description_item = (TextView) this.findViewById(R.id.descrip1);
        tp_level = (TextView) this.findViewById(R.id.descrip2);
        alter = (TextView) this.findViewById(R.id.alter);
        capacite = (TextView) this.findViewById(R.id.skill);

        //image
        Picasso.get().load(recupintent.getStringExtra("url_img"))
                .resize(100,100)
                .into(this.url_img);
        Picasso.get().load(recupintent.getStringExtra("type"))
                .resize(100,100)
                .into(this.type);
        if (vrai.size()>= 1)
        {
            Log.wtf("vrai 0",vrai.get(0));
            Picasso.get().load(vrai.get(0)).into(this.detail1);
        }
        if (vrai.size()>= 2)
        {
            Log.wtf("vrai 1",vrai.get(1));
            Picasso.get().load(vrai.get(1)).into(this.detail2);
        }
        if (vrai.size()>= 3)
        {
            Log.wtf("vrai 2",vrai.get(2));
            Picasso.get().load(vrai.get(2)).into(this.detail3);
        }
        if (vrai.size()>= 4)
        {
            Log.wtf("vrai 3",vrai.get(3));
            Picasso.get().load(vrai.get(3)).into(this.detail4);
        }


        //texte
        name_item.setText(recupintent.getStringExtra("name_item"));
        description_item.setText(recupintent.getStringExtra("description_item"));
        tp_level.setText(recupintent.getStringExtra("tp_level"));
        alter.setText(recupintent.getStringExtra("alter"));
        capacite.setText(recupintent.getStringExtra("capacite"));



    }
}
