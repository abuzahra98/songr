package com.example.songr;

import org.springframework.data.repository.CrudRepository;

public interface SongRepository  extends CrudRepository<Song, Long> {
}
