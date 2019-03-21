package com.example.tales;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;
import android.view.View;
import android.content.Intent;

import com.example.tales.Menu_java.Menu2Acce;
import com.example.tales.Menu_java.Menu2Arme;
import com.example.tales.Menu_java.Menu2Body;
import com.example.tales.Menu_java.Menu2Head;
import com.example.tales.Menu_java.Menu2Second;
import com.example.tales.Menu_java.Menu7Recherche;

public class SplashScreen extends AppCompatActivity{

    private  static  int SPLASH_TIME_OUT = 4000;
    private  Intent recup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chargement);
        recup=getIntent();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                int choix = recup.getIntExtra("choix", 0);
                Intent i;
                switch (choix){
                    case 1:
                        i= new Intent(SplashScreen.this, Menu2Arme.class);
                        break;
                    case 2:
                        i= new Intent(SplashScreen.this, Menu2Second.class);
                        break;
                    case 3:
                        i= new Intent(SplashScreen.this, Menu2Head.class);
                        break;
                    case 4:
                        i= new Intent(SplashScreen.this, Menu2Body.class);
                        break;
                    case 5:
                        i= new Intent(SplashScreen.this, Menu2Acce.class);
                        break;
                    case 6:
                        i= new Intent(SplashScreen.this, Menu7Recherche.class);
                        SPLASH_TIME_OUT = 15000;
                        break;

                        default:
                            i= new Intent(SplashScreen.this, Menu.class);
                            break;
                }



                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);

    }
}
