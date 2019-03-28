package com.example.tales.Menu_java;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tales.R;
import com.squareup.picasso.Picasso;
public class Personnage extends AppCompatActivity{
    //image
    private ImageView image;

    //Texte
    private TextView name;
    private TextView age;
    private TextView home;
    private TextView occup;
    private TextView taille;
    private TextView race;
    private TextView arme;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.personnage);
        Intent recupintent = getIntent();

        //
        image = (ImageView) this.findViewById(R.id.image);

        //
        name = (TextView) this.findViewById(R.id.titre);
        home = (TextView) this.findViewById(R.id.Hometown);
        age = (TextView) this.findViewById(R.id.Age);
        taille = (TextView) this.findViewById(R.id.Height);
        race = (TextView) this.findViewById(R.id.Race);
        occup = (TextView) this.findViewById(R.id.Occupation);
        arme = (TextView) this.findViewById(R.id.Weapon);

        Picasso.get().load(recupintent.getStringExtra("Image"))

                .into(this.image);
        name.setText(recupintent.getStringExtra("Name"));
        home.setText(recupintent.getStringExtra("Home"));
        age.setText(recupintent.getStringExtra("Age"));
        taille.setText(recupintent.getStringExtra("Taille"));
        race.setText(recupintent.getStringExtra("Race"));
        occup.setText(recupintent.getStringExtra("Occup"));
        arme.setText(recupintent.getStringExtra("Arme"));


    }


}
