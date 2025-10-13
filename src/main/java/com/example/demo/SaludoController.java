package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SaludoController {

    @GetMapping("/hola")
    public String hola(@RequestParam(name = "nombre", required = false, defaultValue = "Mundo") String nombre, Model model) {
        model.addAttribute("nombre", nombre);
        model.addAttribute("titulo", "Página de Saludo");
        return "hola";
    }

    @GetMapping("/adios")
    public String adios(Model model) {
        model.addAttribute("titulo", "Página de Despedida");
        return "adios";
    }

}