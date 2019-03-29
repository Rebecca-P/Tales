package com.example.tales.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;

import com.example.tales.View.Menu_java.Menu1Arte;
import com.example.tales.View.Menu_java.Menu1Equi;
import com.example.tales.View.Menu_java.Menu1Item;
import com.example.tales.View.Menu_java.Menu3Skill;
import com.example.tales.View.Menu_java.Menu4Recette;
import com.example.tales.View.Menu_java.Menu5Perso;
import com.example.tales.View.Menu_java.Menu6World;
import com.example.tales.R;


public class Menu extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

    }

    public void goToItem (View view)
    {
        Intent nameIntent = new Intent(this, Menu1Item.class);
        startActivity(nameIntent);
    }

    public void goToArtes (View view)
    {
        Intent nameIntent = new Intent(this, Menu1Arte.class);
        startActivity(nameIntent);
    }

    public void goToEquipement (View view)
    {
        Intent nameIntent = new Intent(this, Menu1Equi.class);
        startActivity(nameIntent);
    }

    public void goToSkill (View view)
    {
        Intent nameIntent = new Intent(this, Menu3Skill.class);
        startActivity(nameIntent);
    }

    public void goToWorld (View view)
    {
        Intent nameIntent = new Intent(this, Menu6World.class);
        startActivity(nameIntent);
    }

    public void goToCharacters (View view)
    {
        Intent nameIntent = new Intent(this, Menu5Perso.class);
        startActivity(nameIntent);
    }

    public void goToRecipe (View view)
    {
        Intent nameIntent = new Intent(this, Menu4Recette.class);
        startActivity(nameIntent);
    }

    public void goToRecherche (View view)
    {
        //Intent nameIntent = new Intent(this, Menu7Recherche.class);
        Intent nameIntent = new Intent(this, SplashScreen.class);
        nameIntent.putExtra("choix", 6);
        startActivity(nameIntent);
    }



}
