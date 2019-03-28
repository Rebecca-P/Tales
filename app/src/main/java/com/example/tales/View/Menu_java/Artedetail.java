package com.example.tales.View.Menu_java;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import android.widget.ImageView;
import android.widget.TextView;

import com.example.tales.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.lang.String;

public class Artedetail extends AppCompatActivity {
    //TODO changer en public si probleme
    //image
    private ImageView url_img;
    private ImageView type;
    private ImageView detail1;
    private ImageView detail2;
    private ImageView detail3;
    private ImageView detail4;

    //Texte
    private TextView name_item;
    private TextView description_item;
    private TextView tp_level;
    private TextView alter;
    private TextView capacite;

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

            Picasso.get().load(vrai.get(0)).into(this.detail1);
        }
        if (vrai.size()>= 2)
        {

            Picasso.get().load(vrai.get(1)).into(this.detail2);
        }
        if (vrai.size()>= 3)
        {

            Picasso.get().load(vrai.get(2)).into(this.detail3);
        }
        if (vrai.size()>= 4)
        {

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
