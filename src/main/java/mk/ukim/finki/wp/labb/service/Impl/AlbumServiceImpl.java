package mk.ukim.finki.wp.labb.service.Impl;

import mk.ukim.finki.wp.labb.model.Album;
import mk.ukim.finki.wp.labb.repository.impl.AlbumRepositoryX;
import mk.ukim.finki.wp.labb.repository.jpa.AlbumRepository;
import mk.ukim.finki.wp.labb.service.AlbumService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlbumServiceImpl implements AlbumService {
    private final AlbumRepository albumRepository;

    public AlbumServiceImpl(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    @Override
    public List<Album> findAll() {
        return albumRepository.findAll();
    }

    @Override
    public Optional<Album> findById(Long id) {
        return albumRepository.findById(id);
    }

    @Override
    public List<Album> findByName(String title) {
        return albumRepository.findByName(title);
    }
}