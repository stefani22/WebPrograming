package mk.ukim.finki.wp.labb.repository.jpa;

import mk.ukim.finki.wp.labb.model.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArtistRepository extends JpaRepository<Artist, Long> {
}
