package com.example.tales.Menu_java;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import com.example.tales.Adapters.MyAdapter1;
import com.example.tales.Adapters.MyAdapter2;
import com.example.tales.Controller.MainController;
import com.example.tales.Objet.Arte_Menu;
import com.example.tales.Objet.Item_Menu;
import com.example.tales.R;
import com.example.tales.RecyclerTouchListener;

public class Menu1Equi extends AppCompatActivity{
    private Intent nameIntent ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.sousmenuequ);
    }

    public void goToArme (View view)
    {
        Intent nameIntent = new Intent(this, Menu2Arme.class);
        startActivity(nameIntent);
    }
    public void goToSecond (View view)
    {
        Intent nameIntent = new Intent(this, Menu2Second.class);
        startActivity(nameIntent);
    }
    public void goToHead (View view)
    {
        Intent nameIntent = new Intent(this, Menu2Head.class);
        startActivity(nameIntent);
    }
    public void goToBody (View view)
    {
        Intent nameIntent = new Intent(this, Menu2Body.class);
        startActivity(nameIntent);
    }
    public void goToAcce (View view)
    {
        Intent nameIntent = new Intent(this, Menu2Acce.class);
        startActivity(nameIntent);
    }
}
