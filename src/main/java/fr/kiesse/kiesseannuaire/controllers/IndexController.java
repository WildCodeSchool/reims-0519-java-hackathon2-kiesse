package fr.kiesse.kiesseannuaire.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import fr.kiesse.kiesseannuaire.entities.Representative;
import fr.kiesse.kiesseannuaire.repositories.RepresentativeRepository;

@Controller
public class IndexController {

    @Autowired
    private RepresentativeRepository representativeRepository;

    @GetMapping("/")
    public String index() {
        return "home";
    }

    @GetMapping("/search")
    public String search() {
        List<Representative> representatives = representativeRepository.findAll();
        return "filter-questions";
    }

    @GetMapping("/results")
    public String resultSearch(Model model) {
        List<Representative> representatives = representativeRepository.findAll();
        model.addAttribute("representatives", representatives);
        return "kiesse";
    }

}