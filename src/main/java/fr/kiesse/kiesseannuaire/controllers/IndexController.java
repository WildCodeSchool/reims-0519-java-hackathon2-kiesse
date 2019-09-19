package fr.kiesse.kiesseannuaire.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class IndexController {

    @GetMapping("/")
    public String index() {
        return "home";
    }

    @GetMapping("/search")
    public String search() {
        return "filter-question";
    }
}