//package com.example.MusicPlaylist;

//@RestController
//@RequestMapping("/playlist")
//public class PlaylistController {
//    @Autowired
//    private PlaylistService playlistService;
//
//    @PostMapping("/add")
//    public ResponseEntity<Song> addSong(@RequestBody Song song) {
//        Song savedSong = playlistService.addSong(song);
//        return new ResponseEntity<>(savedSong, HttpStatus.CREATED);
//    }
//
//    @DeleteMapping("/remove/{id}")
//    public ResponseEntity<Void> removeSong(@PathVariable Long id) {
//        playlistService.removeSong(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
//
//    @PostMapping("/shuffle")
//    public ResponseEntity<Void> shufflePlaylist() {
//        playlistService.shufflePlaylist();
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    @PostMapping("/merge")
//    public ResponseEntity<Void> mergePlaylists(@RequestBody Playlist other) {
//        playlistService.mergePlaylists(other);
//        return new ResponseEntity<>(HttpStatus.OK);
//    }
//
//    // Other methods
//}