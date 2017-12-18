package com.example.android.musicplayer;

import android.content.Context;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Wafa on 12/18/2017.
 */

public class SongAdapter extends ArrayAdapter<Song> {

    public SongAdapter(Activity context, ArrayList<Song> songs) {
        //constructor?
        super(context, 0, songs);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

//        View listItemView = convertView;

        View gridItemView = convertView;

        //check null
  //      if (listItemView == null) {
    //        listItemView = LayoutInflater.from(getContext()).inflate(
      //              R.layout.list_item, parent, false);
        //}

        if (gridItemView == null) {
            gridItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.grid_item, parent, false);
        }

        //get position
        Song currentSong = getItem(position);
        //hi
        //find textview list
     //   TextView songTextViewL = listItemView.findViewById(R.id.text_song_name);
        TextView songTextViewG = gridItemView.findViewById(R.id.text_song_name);
      //  songTextViewL.setText(currentSong.getSongName());
        songTextViewG.setText(currentSong.getSongName());

      //  TextView defaultTextViewL = listItemView.findViewById(R.id.text_artist_name);
        TextView defaultTextViewG = gridItemView.findViewById(R.id.text_artist_name);
      //  defaultTextViewL.setText(currentSong.getArtistName());
        defaultTextViewG.setText(currentSong.getArtistName());

      //  TextView default1TextView1L = listItemView.findViewById(R.id.image_list_item_icon);
        //default1TextView1L.setText(currentSong.getArtistName1());
        TextView default1TextView1G = gridItemView.findViewById(R.id.image_list_item_icon);
        default1TextView1G.setText(currentSong.getArtistName1());

        /**ImageView albumIconView = (ImageView) listItemView.findViewById(R.id.image_list_item_icon);
        // Get the image resource ID from the current AndroidFlavor object and
        // set the image to iconView
        albumIconView.setImageResource(currentSong.getImageResourceId());*/

        return gridItemView;

    }

}
