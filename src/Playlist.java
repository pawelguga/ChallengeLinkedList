import java.util.LinkedList;

public class Playlist {
    private String name;
    private LinkedList<Song> playlist = new LinkedList<Song>();

    public Playlist(String name) {
        this.name = name;
        this.playlist = playlist;
    }

    public String getName() {
        return name;
    }

    public boolean addToPlaylist(Song song) {
        playlist.add(song);
        return true;
    }

    public void printListSongs() {
        System.out.println("==============================================");
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println("No. " + (i + 1) + ". " + playlist.get(i).getTitle() + ", " + playlist.get(i).getDuration());
        }
        System.out.println("==============================================");
    }
}

