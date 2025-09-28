package com.sakibee.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    private void setPageTitle(Model model, String title) {
        model.addAttribute("title", title);
    }

    @GetMapping("/")
    public String home(Model model) {
        setPageTitle(model, "Home");
        return "master";
    }

    @GetMapping("/resume")
    public String resume(Model model) {
        setPageTitle(model, "Resume");
        return "master";
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        setPageTitle(model, "Projects");
        return "master";
    }

    @GetMapping("/blogs")
    public String blogs(Model model) {
        setPageTitle(model, "Blogs");
        return "master";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        setPageTitle(model, "Contact");
        return "master";
    }
}