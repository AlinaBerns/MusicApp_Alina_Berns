package be.intecbrussel;

import java.util.Arrays;

public class Album {
    private String title;
    private String artist;
    private Song [] songs;
    private int count;

    public Album(String title, String artist, Song[] songs )  {
        this.title = title;
        this.artist = artist;
        this.songs = songs;
        this.count =  songs.length;
    }

    public void addSong(Song song) {
        Song[] newSongs  = Arrays.copyOf(songs, count + 1 );
        newSongs[count] = song;
        songs = newSongs;
        count++ ;
    }

    public  String getTitle() {
        return title;
    }
    public void setTitle (String title) {
        this.title = title;
    }
    public String getArtist( ) {
        return artist;
    }
    public void setArtist(String artist ) {
        this.artist = artist;
    }
    public Song [] getSongs() {
        return songs;
    }
    public void setSongs(Song[] songs) {
        this.songs = songs;
    }
    public int getSongCount() {
        return count;
    }
    public void setSongCount (int songCount) {
        this.count = songCount;
    }
}
