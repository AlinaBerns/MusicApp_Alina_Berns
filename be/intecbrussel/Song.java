package be.intecbrussel;

public class Song {

        private String name;
        private String artist;
        private String album;
        private String duration;

        public Song(String[] songInfo)
        {
            this.name = songInfo[0];
            this.artist = songInfo[1];
            this.album = songInfo[2];
            this.duration = songInfo[3];
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
            return name + " by " + artist + " from " + album + " (" + duration + ")" ;

        }
    }

