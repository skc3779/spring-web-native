package com.example.springnativeweb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
public class MovieTicket {
    private String movieTitle;
    private LocalDate date;
    private LocalTime time;
    private double price;
}
