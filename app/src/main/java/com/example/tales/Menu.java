package com.example.tales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;

import com.example.tales.Menu_java.Menu1Arte;
import com.example.tales.Menu_java.Menu1Equi;
import com.example.tales.Menu_java.Menu1Item;
import com.example.tales.Menu_java.Menu3Skill;
import com.example.tales.Menu_java.Menu4Recette;


public class Menu extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        /*
        RecyclerView rv_menu = (RecyclerView) findViewById(R.id.menu_list);
        rv_menu.setLayoutManager(new LinearLayoutManager(this));
        rv_menu.setAdapter(new MyAdapter1());
        */
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
        Intent nameIntent = new Intent(this, Menu1Item.class);
        startActivity(nameIntent);
    }

    public void goToCharacters (View view)
    {
        Intent nameIntent = new Intent(this, Menu1Item.class);
        startActivity(nameIntent);
    }

    public void goToRecipe (View view)
    {
        Intent nameIntent = new Intent(this, Menu4Recette.class);
        startActivity(nameIntent);
    }



}

