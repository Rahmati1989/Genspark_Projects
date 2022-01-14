package com.example.movie.entity;

import javax.persistence.*;

@Entity
@Table (name = "movie")
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "title")
    private String title;
    @Column(name = "director")
    private String director;
    @Column(name = "metascore")
    private String metascore;
    @Column(name = "stars")
    private String stars;

    public Movie() {
    }

    public Movie(String title, String director, String metascore, String stars) {
        this.title = title;
        this.director = director;
        this.metascore = metascore;
        this.stars = stars;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getMetascore() {
        return metascore;
    }

    public void setMetascore(String metascore) {
        this.metascore = metascore;
    }

    public String getStars() {
        return stars;
    }

    public void setStars(String stars) {
        this.stars = stars;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", metascore='" + metascore + '\'' +
                ", stars='" + stars + '\'' +
                '}';
    }
}
