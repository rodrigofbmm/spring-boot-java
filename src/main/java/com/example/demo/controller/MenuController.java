package com.example.demo.controller;

import com.example.demo.model.Jugador;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class MenuController {

    private final ArrayList<Jugador> jugadores = new ArrayList<>();

    @GetMapping("/")
    public String showMenu(Model model) {
        model.addAttribute("menuTitle", "MENÚ PRINCIPAL");
        return "menu";
    }

    @GetMapping("/jugadores")
    public String showForm(Model model) {
        model.addAttribute("jugadores", jugadores);
        return "jugadores";
    }

    @PostMapping("/jugadores")
    public String addJugador(@RequestParam String nombre, Model model) {
        if (!nombre.isBlank()) {
            jugadores.add(new Jugador(nombre));
        }
        model.addAttribute("jugadores", jugadores);
        return "redirect:/jugadores";
    }
}