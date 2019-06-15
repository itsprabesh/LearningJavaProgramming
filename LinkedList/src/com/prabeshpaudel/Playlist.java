package com.prabeshpaudel;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Playlist {
    private String title;
    private LinkedList<Song> songLinkedList = new LinkedList<Song>();

    public Playlist(String title) {
        this.title = title;
    }

    private boolean addSong(String arg1, Album arg2) {
        for (Song song: arg2.getSongs()
             ) {
            if(song.getTitle().equals(arg1)) {
                songLinkedList.add(song);
                System.out.println("The song was successfully added to the playlist");
                return true;
            }
        }
        System.out.println("The song does not exist in the album!");
        return false;
    }

    private boolean containsSong(Song arg) {
        for( Song song: songLinkedList
             ) {
            if(song.getTitle().equals(arg.getTitle()) && song.getDuration() == arg.getDuration()) {
                return true;
            }
        }
        return false;
    }

    private boolean removeSong(Song arg) {
        for(int i = 0; i < songLinkedList.size(); i++) {
            if (songLinkedList.get(i).getTitle().equals(arg.getTitle())) {
                songLinkedList.remove(i);
                return true;
            }
        }
        return false;
    }

    public void printMenu() {
        System.out.println("Available Actions: \n press:");
        System.out.println("0-> Quit!\n" +
                "1-> Add a song to the playlist \n" +
                "2-> Forward \n" +
                "3-> Replay the song \n" +
                "4-> Remove the song");
    }

    public void play(Album arg) {
        ListIterator<Song> iterator = songLinkedList.listIterator();
        System.out.println("Now playing the playlist " + this.title);
        boolean playing = true;
        Scanner scanner = new Scanner(System.in);

        while(playing) {
            System.out.print("What do you want to do?  ");
            int num = scanner.nextInt();
            switch (num) {
                case 0:
                    System.out.println("Bye Bye!");
                    playing=false;
                    break;

                case 1:
                    System.out.print("Enter the name of the song:  ");
                    String temp = scanner.nextLine();
                    addSong(temp,arg);
                    break;

                case 2:
                    if(iterator.hasNext()) {
                        System.out.println("Playing: " + iterator.next().getTitle());
                    } else {
                        System.out.println("You are at the end of the playlist!");
                    }
                    break;

                case 3:
                    if(iterator.hasPrevious()) {
                        System.out.println("Playing: " + iterator.previous().getTitle());
                    } else {
                        System.out.println("You are at the beginning of the list");
                    }
                    break;

                case 4:
                    if(removeSong(new Song(scanner.nextLine(), 0))) {
                        System.out.println("Successful");
                    }
                    else {
                        System.out.println("The song is not in your playlist!");
                    }

            }
        }
    }
}
