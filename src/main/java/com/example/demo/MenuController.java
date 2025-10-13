package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MenuController {

    @GetMapping("/")
    public String showMenu(Model model) {
        // You can pass menu options if needed
        model.addAttribute("menuTitle", "MENÚ PRINCIPAL");
        return "menu"; // Thymeleaf template
    }
}