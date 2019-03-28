package com.example.tales;

import android.os.Handler;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.tales.Menu_java.Menu2Acce;
import com.example.tales.Menu_java.Menu2Arme;
import com.example.tales.Menu_java.Menu2Body;
import com.example.tales.Menu_java.Menu2Head;
import com.example.tales.Menu_java.Menu2Second;
import com.example.tales.Menu_java.Menu7Recherche;

public class MainActivity extends AppCompatActivity {
    //private Button mPlayButton ;
    private  static  int SPLASH_TIME_OUT = 16000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(MainActivity.this, Menu.class);
                startActivity(i);
                finish();
            }
        }, SPLASH_TIME_OUT);
    }

    public void goToMenu (View view)
    {

        Intent nameIntent = new Intent(this, Menu.class);
        startActivity(nameIntent);
        finish();
    }


}
