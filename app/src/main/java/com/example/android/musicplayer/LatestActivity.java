package com.example.android.musicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import android.widget.AdapterView.OnItemClickListener;


import java.util.ArrayList;

public class LatestActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.song_grid);


        ArrayList<Song> songs = new ArrayList<Song>();


        songs.add(new Song("one", "lutti", ""));
        songs.add(new Song("two", "otiiko",""));
        songs.add(new Song("three", "tolookosu",""));
        songs.add(new Song("four", "oyyisa",""));
        songs.add(new Song("five", "massokka",""));



        SongAdapter adapter = new SongAdapter(this, songs);


       // ListView listView = (ListView) findViewById(R.id.list);

        //listView.setAdapter(adapter);

        GridView gridView = findViewById(R.id.grid);

        gridView.setAdapter(adapter);

        gridView.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NumbersActivity}
                Intent latestSongsIntent = new Intent(LatestActivity.this, LatestActivity.class);

                // Start the new activity
                startActivity(latestSongsIntent);
            }
        });




    }

}
