package com.jennbowers.bowersportfolio.controllers;

import com.jennbowers.bowersportfolio.interfaces.PortfolioRepository;
import com.jennbowers.bowersportfolio.models.Portfolio;
import com.jennbowers.bowersportfolio.repositories.PortfolioRepositoryImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class indexController {
    @Autowired
    private PortfolioRepository repo;

    @RequestMapping("/")
    public String index (Model model){
        System.out.println("Working!");

        List<Portfolio> allPieces = repo.findAll();
        model.addAttribute("pieces", allPieces);

        return "index";
    }

}
