package com.example.hongproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingsController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "harann");
        return "greetings";
    }

    @GetMapping("/bye")
    public String goodBye(Model model) {
        model.addAttribute("nickname", "harann");
        return "goodbye";
    }
}
