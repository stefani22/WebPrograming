package mk.ukim.finki.wp.labb.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Album {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String genre;
    private int releaseYear;

    @OneToMany(mappedBy = "album")
    private List<Song> songList;


    public Album(String name, int releaseYear, String genre) {
        this.genre = genre;
        this. releaseYear=releaseYear;
        this.name = name;
        //this.id=(long) (Math.random()*1000);
    }
}