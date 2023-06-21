package model;

public class Movie {
    private String title;
    private String director;
    private String genre;
    private int year;
    private double rating;

    public Movie(String title, String director, String genre, int year, double rating) {
        this.title = title;
        this.director = director;
        this.genre = genre;
        this.year = year;
        this.rating = rating;
    }

    public Movie(Movie source) {
        this.title = source.title;
        this.director = source.director;
        this.genre = source.genre;
        this.year = source.year;
        this.rating = source.rating;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return this.director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getRating() {
        return this.rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return title + " (" + year + ") - Directed by " + director + ", Genre: " + genre + ", Rating: " + rating;
    }
}
