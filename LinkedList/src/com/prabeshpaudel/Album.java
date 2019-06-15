package com.prabeshpaudel;

import java.util.ArrayList;

public class Album {
    private String name;
    private ArrayList<Song> songs= new ArrayList<Song>();

    public Album(String name) {
        this.name = name;
    }

    public void addSongToTheAlbum(Song arg) {
        for (Song song: songs
             ) {
            if(song.getTitle().equals(arg.getTitle())) {
                songs.add(arg);
            }
        }
    }

    public boolean contains(Song arg) {
        for (Song song: songs
             ) {
            if(song.getTitle().equals(arg.getTitle())) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }
/*
    private int getIndex(Song arg) {
        for (Song song: songs
             ) {
            if(song.getTitle().equals(arg.getTitle())) {
                return songs.indexOf(arg);
            }
        }
        return -1;
    }*/

    public Song getSong(int index) {
        return songs.get(index);
    }
}
