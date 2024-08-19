package com.example.MusicPlaylist;
public class PlaylistNode {
    private Song song;
    private PlaylistNode next;

    public PlaylistNode(Song song) {
        this.song = song;
    }

    public Song getSong() {
        return song;
    }

    public PlaylistNode getNext() {
        return next;
    }
    public void setNext(PlaylistNode n) {
        next = n;
    }
    public void setSong(Song s) {
        song = s;
    }
}