package mk.ukim.finki.wp.labb.service;
import mk.ukim.finki.wp.labb.model.Artist;

import java.util.List;
public interface ArtistService{
    List<Artist> listArtists();
    Artist findById(Long id);
}

