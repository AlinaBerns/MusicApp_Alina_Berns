package be.intecbrussel;

public class Main {
    public static void main(String[] args) {

        System.out.println("***OPDRACHT 1***");

        String[] song_1 = {"Airbag ", "Radiohead ", "OK Computer ", "4:35"};

        String[] song_2 = {"Paranoid Android ", "Radiohead ", "OK Computer ", "2:55 "};

        String[] song_3 = {"Exit Music ", "Radiohead ", "OK Computer ", "3:20"};

        String[] song_4 = {"Karma Police ", "Radiohead ", "OK Computer ", "3:15 "};

        String[] song_5 = {"Let Down ", "Radiohead ", "OK Computer ", "3:10 "};

        String[] song_6 = {"Intro ", "Muse ", "Absolution ", "3:14"};

        String[] song_7 = {"Hysteria ", "Muse ", "Absolution ", "5:20"};

        String[] song_8 = {"Blackout ", "Muse ", "Absolution ", "2:15"};

        String[] song_9 = {"Interlude ", "Muse ", "Absolution ", "1:34"};

        String[] song_10 = {"Endlessly ", "Muse ", "Absolution ","4:26 "};

        String[] song_11 = {"Intro ", "M83 ", "Harry up, We're Dreaming ", "4:55 "};

        String[] song_12 = {"Reunion ", "M83 ", "Harry up, We're Dreaming ", "2:43 "};

        String [] song_13 = {"Wait ", "M83 ", "Harry up, We're Dreaming ", "1:43 "};

        String[] song_14 = {"Ok Pal ", "M83 ", "Harry up, We're Dreaming ", "2:45 "};

        String[] song_15 = {"Splendor ","M83 ", "Harry up, We're Dreaming ", "1:45 "};

        String[] song_16 = {"Wonderwall ", "Oasis ","Remastered ", "4:35 "};

        String[] song_17 = {"Live Forever ", "Oasis ","Remastered ","4:25 "};

        String[] song_18 = {"SCYHN ", "Oasis ","Remastered ","3:55 "};

        String[] song_19 = {"CS ", "Oasis ","Remastered ", "4:45 "};

        String[] song_20 = {"DLBIA ", "Oasis ","Remastered ","2:25 "};

        System.out.println("***OPDRACHT 2***");



        Album album1 = new Album("Album 1", "Artist 1", new Song[] {new Song(song_1), new Song(song_2), new Song(song_3), new Song(song_4), new Song(song_5)});

        Album album2 = new Album("Album 2", "Artist 2", new Song[] {new Song(song_6), new Song(song_7), new Song(song_8), new Song(song_9), new Song(song_10)});

        Album album3 = new Album("Album 3", "Artist 3", new Song[] {new Song(song_11), new Song(song_12), new Song(song_13), new Song(song_14), new Song(song_15)});

        Album album4 = new Album("Album 4", "Artist 4", new Song[] {new Song(song_16), new Song(song_17), new Song(song_18), new Song(song_19), new Song(song_20)});

        System.out.println("***OPDRACHT 3***");

        Song[] mySongs = new Song[] {
                new Song(song_3),
                new Song(song_6),
                new Song(song_8),
                new Song(song_10),
                new Song(song_16),
                new Song(song_19),
                new Song(song_11),
                new Song(song_12)
        };
        Album myAlbum = new Album("MyAlbum", "Various Artists", mySongs);


        System.out.println("ALBUM 1:" );
        for (Song song : album1.getSongs()) {
            System.out.println(song.toString());
        }
        System.out.println();
        System.out.println("ALBUM 2:");
        for (Song song : album2.getSongs()) {
            System.out.println(song.toString());
        }
        System.out.println();
        System.out.println("ALBUM 3:");
        for (Song song : album3.getSongs()) {
            System.out.println(song.toString());
        }
        System.out.println();
        System.out.println("ALBUM 4:");
        for (Song song : album4.getSongs()) {
            System.out.println(song.toString());
        }
        System.out.println();
        System.out.println( "ALBUM Berns:");
        for (Song song : myAlbum.getSongs()) {
            System.out.println(song.toString());
        }

        System.out.println("***OPDRACHT 4***");

        System.out.println();
        PartyAlbum partyAlbum = new PartyAlbum(album1, album2, album3, album4, myAlbum);
        partyAlbum.Mix();
    }
}

