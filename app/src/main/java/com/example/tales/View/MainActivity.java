package com.example.tales.View;

import android.os.Handler;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.tales.R;

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
