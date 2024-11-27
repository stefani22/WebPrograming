package mk.ukim.finki.wp.labb.bootstrap;

import jakarta.annotation.PostConstruct;
import mk.ukim.finki.wp.labb.model.Album;
import mk.ukim.finki.wp.labb.model.Artist;
import mk.ukim.finki.wp.labb.model.Song;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class DataHolder {
    public static List<Artist> artistList = new ArrayList<>();
    public static List<Song> songs = new ArrayList<>();
    public static List<Album> albumList=new ArrayList<>();

    @PostConstruct
    public void init() {
        artistList.add(new Artist(1L, "Selena", "Gomez", "Selena Gomez Bio"));
        artistList.add(new Artist(2L, "Shawn", "Mendes", "Shawn Mendes Bio"));
        artistList.add(new Artist(3L, "Camila", "Cabello", "Taylor Swift Bio"));
        artistList.add(new Artist(4L, "Bruno", "Mars", "Bruno Mars Bio"));
        artistList.add(new Artist( 5L, "Billie", "Eilish", "Billie Eilish Bio"));


        Album album1= new Album("Black&White", 2024,"pop");
        albumList.add(album1);
        Album album2= new Album("Memories", 2016,"funk");
        albumList.add(album2);
        Album album3= new Album("Love", 1991,"pop");
        albumList.add(album3);
        Album album4= new Album("TwentyTwo", 2012,"pop");
        albumList.add(album4);
        Album album5= new Album("TheBest", 2023,"pop");
        albumList.add(album5);


        songs.add(new Song("001", "Calm Down", "Pop", 2019, album1));
        songs.add(new Song("002", "Stiches", "Pop", 2017, album2));
        songs.add(new Song("003", "Senorita", "Pop", 2014, album5));
        songs.add(new Song("004", "Grenade", "Pop", 2014, album3));
        songs.add(new Song("005", "Lovely", "Pop", 2019, album4));


    }
}
