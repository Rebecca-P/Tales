package com.example.tales;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;


public class Menu extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        RecyclerView rv_menu = (RecyclerView) findViewById(R.id.menu_list);
        rv_menu.setLayoutManager(this);
    }
}
