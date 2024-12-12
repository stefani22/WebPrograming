package mk.ukim.finki.wp.labb.repository.jpa;

import mk.ukim.finki.wp.labb.model.Album;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
    List<Album> findByName(String name);
}
