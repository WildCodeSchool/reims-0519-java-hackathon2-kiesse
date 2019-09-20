package fr.kiesse.kiesseannuaire.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "home";
    }

    @GetMapping("/search")
    public String search() {
        return "filter-questions";
    }

    @GetMapping("/results")
    public String resultSearch() {

        return "kiesse";
    }

}