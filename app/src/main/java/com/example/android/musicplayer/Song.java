package com.example.android.musicplayer;



/**
 * Created by Wafa on 12/18/2017.
 */

public class Song {

    /** Default translation for the word */
    private String mSongName;

    /** Miwok translation for the word */
    private String mArtistName;

    private String mArtistName1;

    // private int mImageResourceId;

    /**
     * Create a new Word object.
     *
     * @param songName is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param artistName is the word in the Miwok language
     */
    public Song(String songName, String artistName, String artistName1) {
        mSongName = songName;
        mArtistName = artistName;
        mArtistName1 = artistName1;

        // mImageResourceId = imageResourceId;
    }

    /**
     * Get the default translation of the word.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getArtistName() {
        return mArtistName;
    }

    public String getArtistName1() {
        return mArtistName1;
    }


//    public int getImageResourceId() {return mImageResourceId;}


}
