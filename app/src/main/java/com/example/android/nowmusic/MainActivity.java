package com.example.android.nowmusic;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MusicNow OnClickListener



        TextView musicNowTextView = (TextView) findViewById(R.id.music_now_button);


        musicNowTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MusicNowActivity.class);
                startActivity(intent);

            }

            }
        );
        //================================================================================

        //MyRun OnClickListener


        TextView myRunTextView = (TextView) findViewById(R.id.my_run_button);

        myRunTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MyRunActivity.class);
                startActivity(intent);

            }
        });

        //===================================================================================

        //TakeAChance OnClickListener


        TextView chanceTextView = (TextView) findViewById(R.id.take_a_chance_button);

        chanceTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TakeAChanceActivity.class);
                startActivity(intent);
            }
        });

        //====================================================================================

        //TakeMeHome OnClickListener


        TextView takeMeHomeTextView = (TextView) findViewById(R.id.take_me_home_button);

        takeMeHomeTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent  intent = new Intent(MainActivity.this, TakeMeHome.class);
                startActivity(intent);
            }
        });


    }
}
