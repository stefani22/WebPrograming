package mk.ukim.finki.wp.labb.service;
import mk.ukim.finki.wp.labb.model.Artist;

import java.util.List;
import java.util.Optional;

public interface ArtistService{
    List<Artist> listArtists();
    Optional<Artist> findById(Long id);



}

