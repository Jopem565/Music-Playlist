package com.example.MusicPlaylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist {
    private PlaylistNode head;
    private PlaylistNode tail;
    private int size;

    public Playlist() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Add song to playlist
    public void addSong(Song song) {
        PlaylistNode newNode = new PlaylistNode(song);
        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.setNext(head);
        } else {
            tail.setNext(newNode);
            tail = newNode;
            tail.setNext(head);
        }
        size++;
    }

    // Remove song from playlist
    public void removeSong(Long songId) {
        if (head == null) {
            return;
        }

        PlaylistNode current = head;
        PlaylistNode previous = null;
        do {
            if (current.getSong().getId().equals(songId)) {
                if (previous == null) {
                    head = head.getNext();
                    tail.setNext(head);
                } else {
                    previous.setNext(current.getNext());
                    if (current == tail) {
                        tail = previous;
                    }
                }
                size--;
                return;
            }
            previous = current;
            current = current.getNext();
        } while (current != head);
    }

    // Shuffle playlist
    public void shuffle() {
        if (size <= 1) {
            return;
        }

        List<PlaylistNode> nodes = new ArrayList<>();
        PlaylistNode current = head;

        do {
            nodes.add(current);
            current = current.getNext();
        } while (current != head);

        Collections.shuffle(nodes);

        for (int i = 0; i < nodes.size(); i++) {
            nodes.get(i).setNext(nodes.get((i + 1) % nodes.size()));
        }

        head = nodes.get(0);
        tail = nodes.get(nodes.size() - 1);
        tail.setNext(head);
    }

    // Merge playlists
    public void merge(Playlist other) {
        if (other.head == null) {
            return;
        }

        if (this.head == null) {
            this.head = other.head;
            this.tail = other.tail;
        }

        else {
            this.tail.setNext(other.head);
            this.tail = other.tail;
            this.tail.setNext(this.head);
        }
        this.size += other.size;
    }

    // Getters and Setters
}