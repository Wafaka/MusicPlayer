package com.example.android.musicplayer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.GridView;
import android.widget.TextView;
import android.util.Log;
import android.widget.AdapterView;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;
import android.app.Activity;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView latestSongs = (TextView) findViewById(R.id.text_latest_songs);

        TextView albums = (TextView) findViewById(R.id.text_albums);


        // Set a click listener on that View
        latestSongs.setOnClickListener(new OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent latestSongsIntent = new Intent(MainActivity.this, LatestActivity.class);

                // Start the new activity
                startActivity(latestSongsIntent);
            }
        });





    }
}
