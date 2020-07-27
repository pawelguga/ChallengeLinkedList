import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<Album> albums = new ArrayList<Album>();
    public static ArrayList<Playlist> playlists = new ArrayList<Playlist>();
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) { // mp3 player
        // ### Create a program that implements a playlist for songs
        // ### Create a Song class having Title and Duration for a song.
        // ### The program will have an Album class containing a list of songs.
        // ### The albums will be stored in an ArrayList
        // ### Songs from different albums can be added to the playlist and will appear in the list in the order
        // ### they are added.
        // Once the songs have been added to the playlist, create a menu of options to:-
        // Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
        // List the songs in the playlist
        // A song must exist in an album before it can be added to the playlist (so you can only play songs that
        // you own).
        // Hint:  To replay a song, consider what happened when we went back and forth from a city before we
        // started tracking the direction we were going.
        // As an optional extra, provide an option to remove the current song from the playlist
        // (hint: listiterator.remove()

//        Album album = new Album("Dire Straits", "On The Night");
//        album.addSong("Calling Elvis", 10.25);
//        album.addSong("Walk Of Life", 5.06);
//        album.addSong("Heavy Fuel", 5.23);
//        album.addSong("Romeo And Juliet", 10.06);
//        album.addSong("Private Investigations", 9.43);
//        album.addSong("Your Latest Trick", 5.35);
//        album.addSong("On Every Street", 7.01);
//        album.addSong("You And Your Friend", 6.48);
//        album.addSong("Money For Nothing", 6.28);
//        album.addSong("Brothers In Arms", 8.55);
//        albums.add(album);
//        albums.get(0).printListSongs();
//
//        album = new Album("Sting", "Brand New Day");
//        album.addSong("A thousand years", 5.57);
//        album.addSong("Desert Rose", 4.46);
//        album.addSong("Big Lie Small World", 5.05);
//        album.addSong("After The Rain Has Fallen", 5.03);
//        album.addSong("Perfect Love...Gone Wrong", 5.25);
//        album.addSong("Tomorrow We'll See", 4.48);
//        album.addSong("Prelude To The End Of The Game", 0.19);
//        album.addSong("Fill Her Up", 5.38);
//        album.addSong("Ghost Story", 5.30);
//        album.addSong("Brand New Day", 6.20);
//        albums.add(album);
//        albums.get(1).printListSongs();
//
//        System.out.println("+++++++++++++++++ PLAYLIST +++++++++++++++++++");
//        Playlist playlist = new Playlist("Lata 90");
//        System.out.println("Playlist name: " + playlist.getName());
//        playlist.addToPlaylist(albums.get(0).getSong(3));
//        playlist.addToPlaylist(albums.get(1).getSong(5));
//        playlist.addToPlaylist(albums.get(1).getSong(9));
//        playlist.printListSongs();
        mainMenu();
    }

//    public static void availableOptions() {
//        boolean quit = false;
//        int choice = scanner.nextInt();
//        scanner.nextLine();
//        while (!quit) {
//            switch (choice) {
//                case 0:
//                    quit = true;
//                    break;
//                case 1: // next song
//                    break;
//                case 2: // previous song
//                    break;
//                case 3: // replay
//                    break;
//                case 4:
//                    break;
//                case 5: // print menu
//                    printMenu();
//                    break;
//            }
//        }
//    }

    public static void mainMenu() {
        boolean quit = false;
        System.out.print("==========Main Menu==========\n" +
                "0. Playlist\n" +
                "1. Albums\n" +
                "2. Shutdown player\n" +
                "Your choice: ");
        while (!quit) {
            switch (menuChoice()) {
                case 0:
                    menuPlaylist();
                    break;
                case 1:
                    menuAlbums();
                    break;
                case 2:
                    quit = true;
                    break;
            }
        }
    }

    private static void menuPlaylist() {
        System.out.print("==========Playlist menu==========\n" +
                "0. Show playlist\n" +
                "1. Add playlist\n" +
                "2. Remove playlist\n" +
                "3. Search playlist\n" +
                "4. Main menu\n" +
                "Your choice: ");
        switch (menuChoice()) {
            case 0:
                playlistShow();
                break;
            case 1:
                playlistAdd();
                break;
            case 2: // Remove existing playlist
                break;
            case 3: // Search playlist;
                break;
            case 4: // Main menu
                mainMenu();
                break;
        }
    }

    private static void playlistShow() {
        System.out.println("========== Playlists ==========");
        if (playlists.size() < 1) {
            System.out.println("No playlists defined.");
        } else {
            for (int i = 0; i < playlists.size(); i++) {
                System.out.println((i + 1) + ". " + playlists.get(i).getName());
            }
        }
    }

    private static void playlistAdd() {
        System.out.println("Adding new playlist");
        String name = playlistEnteringName();
        playlistSearch(name);

        playlists.add(new Playlist(playlistEnteringName()));
    }

    private static boolean playlistSearch() {
        System.out.println("Searching playlist: ");
        String name = playlistEnteringName();
        for (int i = 0; i < playlists.size(); i++) {
            if (playlists.get(i).getName().equals(name)) ;
            System.out.println("Playlist is already defined in your library.");
            return true;
        }
        System.out.println("Not found.");
        return false;
    }

    private static void menuAlbums() {
        System.out.print("==========Albums menu==========\n" +
                "0. Show albums\n" +
                "1. Add a new album\n" +
                "2. Remove existing album\n" +
                "3. Find album\n" +
                "4. Main menu\n" +
                "Your choice: ");
        switch (menuChoice()) {
            case 0: // show albums
                break;
            case 1: // Add a new album
                break;
            case 2: // Remove existing album
                break;
            case 3: // Find album
                break;
            case 4: // Main menu
                mainMenu();
                break;
        }
    }

    private static int menuChoice() {
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }

    private static String playlistEnteringName() {
        System.out.println("Please enter the name: ");
        return scanner.nextLine();
    }
}

