package mk.ukim.finki.wp.labb.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;



import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
@Entity
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String trackId;

    private String title;

    private String genre;

    private int releaseYear;

    @ManyToMany
    List<Artist> performers;


    @ManyToOne
    private Album album;

    //public Song() {}

    public Song(String trackId, String title, String genre, int releaseYear, Album album) {

        this.trackId = trackId;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;


        performers = new ArrayList<>();

//        this.id=(long) (Math.random()*1000);
        this.album=album;
    }

    public Song(String title, String genre, int releaseYear,  String trackId, Album album, Long id) {
        this.genre = genre;
        this.performers = new ArrayList<>();
        this.releaseYear = releaseYear;
        this.title = title;
        this.trackId = trackId;
        this.id=id;
        this.album=album;
    }

    public void addPerformer(Artist performer){
        performers.removeIf(r->r.getId().equals(performer.getId()));
        performers.add(performer);
    }
}