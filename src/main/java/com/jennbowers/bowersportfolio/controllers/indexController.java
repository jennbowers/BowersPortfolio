package com.jennbowers.bowersportfolio.controllers;

import com.jennbowers.bowersportfolio.models.Portfolio;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
public class indexController {
    @RequestMapping("/")
    public String index (Model model){
        System.out.println("Working!");
//        Portfolio hangman = new Portfolio(1, "/img/portfolio/hangman-guesses-3.png", null, "https://github.com/jennbowers/week-5-project", "Hangman", "A simple game where a random word is generated, and a user has 8 turns to guess the correct letters that form the random word. They must first log in and then can begin guessing one letter at a time. All guessed letters appear at the bottom of the page after being guessed and at the end of the game the user is given the chance tto play again no matter if they won or lost.", "Summer 2017", "Node.js, Mustache", "Node.js");
//        Portfolio githubProfile = new Portfolio(2, "/img/portfolio/Githubprofile-project.png", "https://jennbowers.github.io/4.4-github-profile/", "https://github.com/jennbowers/4.4-github-profile", "GitHub Profile Re-Creation", "Given the API for GitHub, we were challenged to re-create our own GitHub profiles as closely as possible.", "Summer 2017", "JavaScript, API, HTML, CSS", "JavaScript");
//        Portfolio calculator = new Portfolio(3, "/img/portfolio/calc-project-1.png", "https://jennbowers.github.io/week-three-project/", "https://github.com/jennbowers/week-three-project", "Calculator", "A calculator built primarily with JavaScript, this application allows the user to enter in any numbers and perform simple math operations that are displayed on a screen. After the user is done with an equation, they can clear the screen and begin again.", "Summer 2017", "JavaScript, HTML, CSS", "JavaScript");
//        Portfolio gamePiece = new Portfolio(4, "/img/portfolio/gamepiece-main-1.png", null, "https://github.com/jennbowers/9.2-Assessment-GamePiece", "Game Piece", "Code the beginnings of a table top game, by creating a game piece that can be moved with x and y coordinates. The game piece should also freeze, and unfreeze according to game circumstances.", "Summer 2017", "Java", "Java");
//        Portfolio currencyConverter = new Portfolio(5, "/img/portfolio/currency-runner-1.png", null, "https://github.com/jennbowers/10.2-Currency-Converter", "Currency Converter", "Created an application that converts currency to currency utlizing a basic user interface. The user can choose from a list of currencies, enter the amount they would like converted, and the currency they would like to convert their money to. The application converts their currency to dollars and then converts the amount in dollars to their desired currency. There is also added functionality to compare currencies to see which is worth more.", "Summer 2017", "Java", "Java");
//        Portfolio virtualAtm = new Portfolio(6, "/img/portfolio/atm-class-2.png", null, "https://github.com/jennbowers/10.3-Assessment-SQL-ATM", "Virtual ATM", "An application that works are a user's personal ATM. A user can check their balance (which is calculated dynamically), make a withdrawal, and make a deposit, all with a user-friendly user interface.", "Summer 2017", "Java", "Java");

//        ArrayList<Portfolio> pieces = new ArrayList<>();
//        pieces.add(hangman);
//        pieces.add(githubProfile);
//        pieces.add(calculator);
//        pieces.add(gamePiece);
//        pieces.add(currencyConverter);
//        pieces.add(virtualAtm);
//
//        model.addAttribute("pieces", pieces);

        return "index";
    }

}
