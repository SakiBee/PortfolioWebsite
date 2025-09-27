package com.sakibee.portfolio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    /**
     * Helper method to set the page title dynamically.
     * @param model The Spring UI Model
     * @param title The page title string
     */
    private void setPageTitle(Model model, String title) {
        model.addAttribute("title", title);
    }

    @GetMapping("/")
    public String home(Model model) {
        setPageTitle(model, "Home");
        return "master"; // Returns master.html which includes home.html
    }

    @GetMapping("/resume")
    public String resume(Model model) {
        setPageTitle(model, "Resume");
        return "master"; // Returns master.html which includes resume.html
    }

    @GetMapping("/projects")
    public String projects(Model model) {
        setPageTitle(model, "Projects");
        return "master"; // Returns master.html which includes projects.html
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        setPageTitle(model, "Contact");
        // Optionally add a DTO for form binding, e.g., model.addAttribute("contactForm", new ContactForm());
        return "master"; // Returns master.html which includes contact.html
    }
}