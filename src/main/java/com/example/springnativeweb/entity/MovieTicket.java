package com.example.springnativeweb.entity;

import java.time.LocalDate;
import java.time.LocalTime;

public class MovieTicket {
    public MovieTicket(String movieTitle, LocalDate date, LocalTime time, double price) {
        this.movieTitle = movieTitle;
        this.date = date;
        this.time = time;
        this.price = price;
    }

    private String movieTitle;

    private LocalDate date;
    private LocalTime time;
    private double price;


    public String getMovieTitle() {
        return movieTitle;
    }

    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
