package mk.ukim.finki.wp.labb.service.Impl;

import mk.ukim.finki.wp.labb.model.Artist;
import mk.ukim.finki.wp.labb.repository.ArtistRepository;
import mk.ukim.finki.wp.labb.service.ArtistService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArtistServiceI implements ArtistService {
    private final ArtistRepository artistRepository;

    public ArtistServiceI(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @Override
    public List<Artist> listArtists() {
        return artistRepository.findAll();
    }

    @Override
    public Artist findById(Long id) {
        return artistRepository.findById(id).orElse(null);
    }
}