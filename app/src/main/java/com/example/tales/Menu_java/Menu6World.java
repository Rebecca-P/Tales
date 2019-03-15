package com.example.tales.Menu_java;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.tales.R;

public class Menu6World extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sousmenuworld);

    }

    public void goToSyno (View view)
    {
        Intent nameIntent = new Intent(this, Menu6Syno.class);
        startActivity(nameIntent);
    }

    public void goToLoca (View view)
    {
        Intent nameIntent = new Intent(this, Menu6Loca.class);
        startActivity(nameIntent);
    }

    public void goToOp (View view)
    {
        Intent nameIntent = new Intent(this, Menu1SP.class);
        startActivity(nameIntent);
    }
}
