package be.intecbrussel;

public class Song {

        private final String name;
        private final String artist;
        private final String album;
        private final String duration;

        public Song(String[] songDetails)
        {
            this.name = songDetails[0];
            this.artist = songDetails[1];
            this.album = songDetails[2];
            this.duration = songDetails[3];
        }
        public String getTitle() {
            return name;
        }
        public String getArtist()
        {
            return artist;
        }
        public String getAlbum ()
        {
            return album;
        }

        public String getTime ()
        {
            return duration ;
        }
        @Override
        public String toString( )
        {
            return name + " BY " + artist + " FROM " + album + " [" + duration + "]" ;

        }
    }

