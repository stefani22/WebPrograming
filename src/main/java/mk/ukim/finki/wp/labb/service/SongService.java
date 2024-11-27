package mk.ukim.finki.wp.labb.service;
import mk.ukim.finki.wp.labb.model.Artist;
import mk.ukim.finki.wp.labb.model.Song;

import java.util.List;
public interface SongService{
    List<Song> listSongs();
    Artist addArtistToSong(Artist artist, Song song);
    public Song findByTrackId(String trackId);
    List<Song> findSongByText(String text);
    void deleteSong(Long id);
    Song findById(Long id);
    void updateSong(Song song);
}

