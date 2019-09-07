package org.jnosql.artemis.demo.se;

public class Movie {

    private String id;

    private String title;

    private String genre;

    @Deprecated
    public Movie() {
    }

    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                '}';
    }
}
