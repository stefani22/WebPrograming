package mk.ukim.finki.wp.labb.service;

import mk.ukim.finki.wp.labb.model.Album;

import java.util.List;
import java.util.Optional;

public interface AlbumService {
    List<Album> findAll();
    Optional<Album> findById(Long id);

    List<Album> findByName(String title);
}
