package com.example.tales.Menu_java;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tales.R;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class Syndetail extends AppCompatActivity {
    //image
    public ImageView url_img;


    //Texte
    public TextView name_item;
    public TextView description_item;
    public TextView sp;
    public TextView dropped;
    public TextView stolen;

    //View
    //public View layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.synthese_layout);

        Intent recupintent = getIntent();
        //image
        url_img = (ImageView) this.findViewById(R.id.icon_syn);


        //texte
        description_item = (TextView) this.findViewById(R.id.des_syn);
        sp = (TextView) this.findViewById(R.id.sp_syn);
        dropped = (TextView) this.findViewById(R.id.droppe);
        stolen = (TextView) this.findViewById(R.id.stole);
        name_item = (TextView) this.findViewById(R.id.titre_syn);

        //image
        Picasso.get().load(recupintent.getStringExtra("Icon"))
                .resize(100,100)
                .into(this.url_img);



        //texte
        name_item.setText(recupintent.getStringExtra("Name"));
        sp.setText("Search Point: \n"+recupintent.getStringExtra("Search_Points"));
        dropped.setText("Droppen: \n"+recupintent.getStringExtra("Dropped"));
        stolen.setText("Stolen: \n"+recupintent.getStringExtra("Stolen"));
        description_item.setText(recupintent.getStringExtra("Description"));



    }
}
