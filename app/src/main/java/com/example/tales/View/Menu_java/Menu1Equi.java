package com.example.tales.View.Menu_java;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.tales.R;
import com.example.tales.View.SplashScreen;

public class Menu1Equi extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.sousmenuequ);
    }

    public void goToArme (View view)
    {

        Intent nameIntent = new Intent(this, SplashScreen.class);
        nameIntent.putExtra("choix", 1);

        startActivity(nameIntent);
    }
    public void goToSecond (View view)
    {
        //Intent nameIntent = new Intent(this, Menu2Second.class);
        Intent nameIntent = new Intent(this, SplashScreen.class);
        nameIntent.putExtra("choix", 2);
        startActivity(nameIntent);
    }
    public void goToHead (View view)
    {
        //Intent nameIntent = new Intent(this, Menu2Head.class);
        Intent nameIntent = new Intent(this, SplashScreen.class);
        nameIntent.putExtra("choix", 3);
        startActivity(nameIntent);
    }
    public void goToBody (View view)
    {
        //Intent nameIntent = new Intent(this, Menu2Body.class);
        Intent nameIntent = new Intent(this, SplashScreen.class);
        nameIntent.putExtra("choix", 4);
        startActivity(nameIntent);
    }
    public void goToAcce (View view)
    {
        //Intent nameIntent = new Intent(this, Menu2Acce.class);
        Intent nameIntent = new Intent(this, SplashScreen.class);
        nameIntent.putExtra("choix", 5);
        startActivity(nameIntent);
    }
}