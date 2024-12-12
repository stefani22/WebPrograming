package mk.ukim.finki.wp.labb.service.Impl;

import mk.ukim.finki.wp.labb.model.Artist;
import mk.ukim.finki.wp.labb.repository.impl.ArtistRepositoryX;
import mk.ukim.finki.wp.labb.repository.jpa.ArtistRepository;
import mk.ukim.finki.wp.labb.service.ArtistService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Optional<Artist> findById(Long id) {
        return artistRepository.findById(id);
    }
}