package com.example.tales.Menu_java;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.tales.R;


public class Menu1Item extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sousmenuconso);

    }

    public void goToConso (View view)
    {
        Intent nameIntent = new Intent(this, Menu1Conso.class);
        startActivity(nameIntent);
    }

    public void goToSynt (View view)
    {
        Intent nameIntent = new Intent(this, Menu1Item.class);
        startActivity(nameIntent);
    }
}
