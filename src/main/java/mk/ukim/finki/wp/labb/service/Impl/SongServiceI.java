package mk.ukim.finki.wp.labb.service.Impl;

import mk.ukim.finki.wp.labb.bootstrap.DataHolder;
import mk.ukim.finki.wp.labb.model.Artist;
import mk.ukim.finki.wp.labb.model.Song;
import mk.ukim.finki.wp.labb.repository.SongRepository;
import mk.ukim.finki.wp.labb.service.SongService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class SongServiceI implements SongService {
    private final SongRepository songRepository;

    public SongServiceI(SongRepository songRepository) {
        this.songRepository = songRepository;
    }

    @Override
    public List<Song> listSongs() {
        return songRepository.findAll();
    }

    @Override
    public Artist addArtistToSong(Artist artist, Song song) {
        return songRepository.addArtistToSong(song, artist);
    }

    @Override
    public Song findByTrackId(String trackId) {
        return songRepository.findByTrackId(trackId);
    }

    public List<Song> findSongByText(String text){
        return  songRepository.findAll().stream().
                filter(r->r.getTitle().toLowerCase().contains(text.toLowerCase())).collect(Collectors.toList());

    }

    @Override
    public void deleteSong(Long id) {
        songRepository.deleteSong(id);
    }

    @Override
    public Song findById(Long id) {
        return songRepository.findById(id);
    }

    @Override
    public void updateSong(Song song) {
        songRepository.update(song);
    }

}