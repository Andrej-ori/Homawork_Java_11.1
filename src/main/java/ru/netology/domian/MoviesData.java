package ru.netology.domian;

public class MoviesData {
    // объявляем переменные (Id фильма и его название)
    private int id;
    private String movieName;

    // Сеттеры и геттеры

    public int getId() {
        return id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    // конструкты
    public MoviesData() {
    }

    public MoviesData(int id, String movieName) {
        this.id = id;
        this.movieName = movieName;
    }
}