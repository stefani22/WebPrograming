package mk.ukim.finki.wp.labb.repository.impl;

import mk.ukim.finki.wp.labb.bootstrap.DataHolder;
import mk.ukim.finki.wp.labb.model.Artist;
import mk.ukim.finki.wp.labb.model.Song;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SongRepositoryX {
    public List<Song> findAll() {
        return DataHolder.songs;
    }

    public Song findByTrackId(String trackId) {
        return DataHolder.songs.stream().filter(s -> s.getTrackId().equals(trackId)).findFirst().orElse(null);
    }

    public Artist addArtistToSong(Song song, Artist artist) {
        for (Song s : DataHolder.songs) {
            if (s.getTrackId() == (song.getTrackId())) {
                s.addPerformer(artist);
                return artist;
            }
        }
        return null;
    }
    public void deleteSong(Long id){
        DataHolder.songs.removeIf(r->r.getId().equals(id));
    }

    public Song findById(Long id){
        return DataHolder.songs.stream().filter(song -> song.getId().equals(id)).findFirst().orElse(null);
    }

    public void update(Song song){
        DataHolder.songs.removeIf(x->x.getId().equals(song.getId()));
        DataHolder.songs.add(song);
    }
}