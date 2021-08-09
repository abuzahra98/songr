package com.example.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;

@Controller
public class SongCount {


    @GetMapping("/hello")
    @ResponseBody
    public String renderHelloPage() {
        return "helloworld";
    }

    @GetMapping("/capitalize/{var}")
    public String renderCapitalizePage(Model m, @PathVariable String var){
        m.addAttribute("name",var.toUpperCase());
        return "hello.html";
    }

    @GetMapping("/")
    public String Splash(){
        return "splash.html";
    }

    static ArrayList<Album> arr = new ArrayList<>();

    {
        arr.add(
                new Album("Jak", "word", 12, 34.56, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR8lQ8d1HNZEsHBR8ueNcsVT07FOZf4z0YtRw&usqp=CAU")
        );
        arr.add(
                new Album("JON", "ocean", 13, 55.4, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTdB0kmI91C9-1iCNQOcqV69MDQsxJGR6IrCw&usqp=CAU")
        );
        arr.add(
                new Album("Jeane", "sky", 16, 53.12, "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ0PSnJr0m7yezNk6G2B-m6ZQLc490ey9yurw&usqp=CAU")
        );
        System.out.println(arr.get(1).artist);
        System.out.println("fffffffffff");

    }

    @GetMapping("/album")
    public String viewAlbum(Model m){
        m.addAttribute("albumList", arr);
        return "Album.html";


    }
}
