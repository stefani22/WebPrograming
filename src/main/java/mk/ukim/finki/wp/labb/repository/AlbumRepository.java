package mk.ukim.finki.wp.labb.repository;


import mk.ukim.finki.wp.labb.bootstrap.DataHolder;
import mk.ukim.finki.wp.labb.model.Album;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AlbumRepository {
    public List<Album> findAll(){
        return DataHolder.albumList;
    }
    public Optional<Album> findById(Long id){
        return DataHolder.albumList.stream().filter(x->x.getId().equals(id)).findFirst();
    }
}