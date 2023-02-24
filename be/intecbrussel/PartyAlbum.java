package be.intecbrussel;

import java.util.Random;

import java.util.Random;

public class PartyAlbum {private Song[] songs;
    private int count;

    public PartyAlbum(Album album1, Album album2, Album album3, Album album4, Album myAlbum) {
        songs = new Song[10] ;
        count = 0 ;
        Random random = new Random() ;
        for (int i = 0; i < 2; i++) {
            Song song = album1.getSongs()[random.nextInt(album1.getSongCount())];
            songs[count] = song;
            count++;
        }
        for (int i = 0; i < 2; i++ ) {
            Song song = album2.getSongs()[random.nextInt(album2.getSongCount())];
            songs[count]  = song;
            count++ ;
        }

        for (int i = 0; i < 2; i++) {
            Song song = album3.getSongs()[random.nextInt(album3.getSongCount())];
            songs[count] = song;
            count++;
        }
        for (int i = 0; i < 2; i++) {
            Song song = album4.getSongs()[random.nextInt(album4.getSongCount())];
            songs[count] = song;
            count++;
        }
        for (int i = 0; i < 2; i++) {
            Song song = myAlbum.getSongs()[random.nextInt(myAlbum.getSongCount())];
            songs[count] = song;
            count++;
        }
    }
    public Song[] getSongs() {
        return songs;
    }
    public int getSongCount() {
        return count;
    }
    public void Mix() {
        System.out.println("Party SONGS :");
        for (int i = 0; i < count; i++) {

            System.out.println((i+1) + ". " + songs[i].getTitle() +  "on the Album " +songs[i].getAlbum() + "from " + songs[i].getArtist());
        }
    }
}
