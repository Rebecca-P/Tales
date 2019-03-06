package com.example.tales.Menu_java;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
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

public class Artedetail extends AppCompatActivity {
    //image
    public ImageView url_img;
    public ImageView type;
    public ImageView detail1;
    public ImageView detail2;
    public ImageView detail3;

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

        //image
        url_img = (ImageView) this.findViewById(R.id.icon_perso_arte);
        type = (ImageView) this.findViewById(R.id.icon_type);
        detail1 = (ImageView) this.findViewById(R.id.icon_type1);
        detail2 = (ImageView) this.findViewById(R.id.icon_type2);
        detail3 = (ImageView) this.findViewById(R.id.icon_type3);
        //texte
        name_item = (TextView) this.findViewById(R.id.titre_art);
        description_item = (TextView) this.findViewById(R.id.descrip1);
        tp_level = (TextView) this.findViewById(R.id.descrip2);
        alter = (TextView) this.findViewById(R.id.alter);
        capacite = (TextView) this.findViewById(R.id.skill);

        //image
        url_img.setText(recupintent.getStringExtra(""));
        type
        detail1
        detail2
        detail3
        //texte
        name_item
        description_item
        tp_level
        alter
        capacite
        /*
        TODO
        finir avec limage
         */


    }
}
