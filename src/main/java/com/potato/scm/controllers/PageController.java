package com.potato.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        System.out.println("home page handler");

        // sending data to view
        model.addAttribute("name", "Potato");
        model.addAttribute("blah", "blah blah blah");
        model.addAttribute("githubRepo", "https://github.com/tushar-swarnkar?tab=repositories");
        return "home";
    }

    // about route
    @GetMapping("about")
    public String aboutPage() {
        System.out.println("aobut the page");
        return "about";
    }

    // services
    @GetMapping("services")
    public String servicesPage() {
        System.out.println("services page loading");
        return "services";
    }
}
