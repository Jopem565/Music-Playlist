package com.example.MusicPlaylist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService {
    @Autowired
    private SongRepository songRepository;
    private Playlist playlist = new Playlist();

    public Song addSong(Song song) {
        Song savedSong = songRepository.save(song);
        playlist.addSong(savedSong);
        return savedSong;
    }

    public void removeSong(Long songId) {
        //songRepository.deleteById(songId);
        playlist.removeSong(songId);
    }

    public void shufflePlaylist() {
        playlist.shuffle();
    }

    public void mergePlaylists(Playlist other) {
        playlist.merge(other);
    }


}