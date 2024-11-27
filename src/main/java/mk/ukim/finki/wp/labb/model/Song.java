package mk.ukim.finki.wp.labb.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Song {

    private String trackId;
    private String title;
    private String genre;
    private int releaseYear;
    List<Artist> performers;

    private Long id;
    private Album album;

    public Song() {}

    public Song(String trackId, String title, String genre, int releaseYear, Album album) {

        this.trackId = trackId;
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;


        performers = new ArrayList<>();

        this.id=(long) (Math.random()*1000);
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

    public void addPerformer(Artist performer) {
        performers.add(performer);
    }
}
