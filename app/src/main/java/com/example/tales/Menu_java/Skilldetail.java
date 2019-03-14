package com.example.tales.Menu_java;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tales.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Skilldetail extends AppCompatActivity {
    //image
    private ImageView icon;
    private ImageView perso1;
    private ImageView perso2;
    private ImageView perso3;
    private ImageView perso4;

    //Texte
    private TextView name;
    private TextView description;
    private TextView info;


    //View
    //public View layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.skill_layout);

        Intent recupintent = getIntent();
        //image
        icon = (ImageView) this.findViewById(R.id.icon);
        perso1 = (ImageView) this.findViewById(R.id.icon_type1);
        perso2 = (ImageView) this.findViewById(R.id.icon_type2);
        perso3 = (ImageView) this.findViewById(R.id.icon_type3);
        perso4 = (ImageView) this.findViewById(R.id.icon_type4);


        //texte
        name = (TextView) this.findViewById(R.id.titre);
        description = (TextView) this.findViewById(R.id.descr);
        info = (TextView) this.findViewById(R.id.info);


        //image
        Picasso.get().load(recupintent.getStringExtra("Icon"))
                .resize(100,100)
                .into(this.icon);


        String lesdetail;
        ArrayList<String> vrai = new ArrayList<String>();

        lesdetail=recupintent.getStringExtra("perso");
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
        name.setText(recupintent.getStringExtra("name"));
        description.setText(recupintent.getStringExtra("description"));
        info.setText(recupintent.getStringExtra("info"));

    }
}
