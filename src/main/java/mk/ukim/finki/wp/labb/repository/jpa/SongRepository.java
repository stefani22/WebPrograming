package mk.ukim.finki.wp.labb.repository.jpa;

import mk.ukim.finki.wp.labb.model.Artist;
import mk.ukim.finki.wp.labb.model.Song;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SongRepository extends JpaRepository<Song, Long> {

    List<Song> findAllByAlbum_Id(Long albumId);

    Song findByTrackId(String trackId);

    void deleteById(Long id);

    Optional<Song> findById(Long id);

    List<Song> findByAlbum_Id(Long id);
}


