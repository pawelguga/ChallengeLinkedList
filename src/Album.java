import java.util.ArrayList;

public class Album {
    private String artist;
    private String title;
    private ArrayList<Song> albumList;

    public Album(String artist, String title) {
        this.artist = artist;
        this.title = title;
        this.albumList = new ArrayList<Song>();
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public Song getSong(int index) {
        return albumList.get(index);
    }

    private boolean findSong(String title) {
        for (int i = 0; i < albumList.size(); i++) {
            boolean titleCheck = albumList.get(i).getTitle().equals(title);
            if (titleCheck) {
                return true;
            }
        }
        return false;
    }

    public void addSong(String title, double duration) {
        Song song = new Song(title, duration);
        if (!findSong(title)) {
            albumList.add(song);
        } else
            System.out.println(title + " is already exists in this album...");
    }

    public void printListSongs() {
        System.out.println("==============================================");
        System.out.println("Artist: " + artist);
        System.out.println("Title: " + title);
        System.out.println("List of songs: \n----------------------------------------------");
        for (int i = 0; i < albumList.size(); i++) {
            System.out.println("No. " + (i + 1) + ". " + albumList.get(i).getTitle() + ", " + albumList.get(i).getDuration());
        }
        System.out.println("==============================================");
    }
}

