package com.example.songr;

import javax.persistence.*;

import javax.persistence.Entity;
import java.util.List;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    @Column(columnDefinition="TEXT")
    @OneToMany(mappedBy="albumSongs", cascade = CascadeType.ALL)
    List<Song> song;
    String artist;
    String title;
    int songCount;
    double length;
    String imgUrl;
    public Album(){}
    public Album(String artist, String title, int songCount, double length, String imgUrl){
        this.artist = artist;
        this.title = title;
        this.songCount = songCount;
        this.length = length;
        this.imgUrl = imgUrl;
    }
    public String getArtist(){
        return artist;
    }
    public void setArtist(String artist){
        this.artist = artist;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public int getSongCount(){
        return songCount;
    }
    public void setSongCount(int songCount){
        this.songCount = songCount;
    }
    public double getLength(){
        return length;
    }
    public void setLength(int length){
        this.length = length;
    }
    public String getImgUrl(){
        return imgUrl;
    }
    public void setImgUrl(String imgUrl){
        this.imgUrl = imgUrl;
    }


}
