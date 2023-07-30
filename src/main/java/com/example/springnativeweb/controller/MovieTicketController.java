package com.example.springnativeweb.controller;


import com.example.springnativeweb.entity.MovieTicket;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MovieTicketController {
    @GetMapping("/tickets")
    public String showMovieTickets(Model model) {
        // Sample data - Replace this with your actual data retrieval logic
        List<MovieTicket> movieTickets = getMovieTicketsFromDatabaseOrService();

        model.addAttribute("movieTickets", movieTickets);
        return "movie_tickets";
    }

    private List<MovieTicket> getMovieTicketsFromDatabaseOrService() {
        // Replace this method with your actual data retrieval logic
        // This could involve querying a database or calling a service to get the movie tickets.
        // For this example, we'll use some hardcoded data.
        List<MovieTicket> movieTickets = new ArrayList<>();

        movieTickets.add(new MovieTicket("Movie A", LocalDate.of(2023, 7, 30), LocalTime.of(14, 30), 10.99));
        movieTickets.add(new MovieTicket("Movie B", LocalDate.of(2023, 7, 30), LocalTime.of(19, 0), 12.50));
        movieTickets.add(new MovieTicket("Movie C", LocalDate.of(2023, 7, 31), LocalTime.of(16, 15), 8.75));

        return movieTickets;
    }
}
