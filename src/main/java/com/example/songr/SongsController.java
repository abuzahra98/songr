package com.example.songr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SongsController {
    @Autowired
    Repo Repo;
    @Autowired
    SongRepository SongRepository;
    @GetMapping("/addSongs")
    public String addAlbum(){
        return "addSongs.html";
    }

    @PostMapping("/addSongs")
    public RedirectView addSongs(String title, int length, int trackNumber, long id){
        Album singleAlbum = Repo.findById(id).get();
        Song song = new Song(title, singleAlbum, length, trackNumber);
        SongRepository.save(song);
        return new RedirectView("/addSongs");
    }

}
