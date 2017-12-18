package com.example.android.musicplayer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class AlbumActivity extends AppCompatActivity {


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


        GridView gridView = findViewById(R.id.grid);

        gridView.setAdapter(adapter);
    }
}
