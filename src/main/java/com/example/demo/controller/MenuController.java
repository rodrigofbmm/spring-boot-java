package com.example.demo.controller;

import com.example.demo.model.GuessGame;
import com.example.demo.model.Jugador;
import com.example.demo.service.JugadorService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@Controller
public class MenuController {

    private final JugadorService jugadorService;
    private GuessGame juegoActual;
    private Jugador jugadorActual;

    public MenuController(JugadorService jugadorService) {
        this.jugadorService = jugadorService;
    }

    @GetMapping("/")
    public String menu() {
        return "menu";
    }

    @GetMapping("/jugadores")
    public String formJugadores(Model model) {
        model.addAttribute("jugador", new Jugador());
        model.addAttribute("jugadores", jugadorService.listar());
        return "jugadores";
    }

    @PostMapping("/jugadores")
    public String addJugador(@Valid Jugador jugador, BindingResult result, Model model) {
        if (result.hasErrors()) {
            model.addAttribute("jugadores", jugadorService.listar());
            return "jugadores";
        }

        if (!jugador.getPassword().equals(jugador.getPasswordConfirm())) {
            model.addAttribute("error", "Las contraseñas no coinciden");
            model.addAttribute("jugadores", jugadorService.listar());
            return "jugadores";
        }

        jugadorService.guardar(jugador);
        return "redirect:/jugadores";
    }

    @GetMapping("/jugar")
    public String jugar(@RequestParam(value = "nombre", required = false) String nombre,
                        @RequestParam(value = "password", required = false) String password,
                        Model model) {

        var jugadores = jugadorService.listar();
        if (jugadores.isEmpty()) {
            model.addAttribute("error", "No hay jugadores. Debes crear uno primero.");
            return "menu";
        }

        if (nombre == null) {
            model.addAttribute("mostrarSeleccion", true);
            model.addAttribute("jugadores", jugadores);
            return "juego";
        }

        Optional<Jugador> optionalJugador = jugadorService.buscarPorNombre(nombre);
        if (optionalJugador.isEmpty()) {
            return "redirect:/";
        }

        jugadorActual = optionalJugador.get();

        // Validar contraseña
        if (password == null || !jugadorActual.getPassword().equals(password)) {
            model.addAttribute("mostrarSeleccion", true);
            model.addAttribute("jugadores", jugadores);
            model.addAttribute("error", "Contraseña incorrecta o no introducida");
            return "juego";
        }

        juegoActual = new GuessGame();
        model.addAttribute("mensaje", "Turno de " + jugadorActual.getNombre() + ". Adivina un número del 1 al 10. Vidas: 3");
        model.addAttribute("juegoActivo", true);
        model.addAttribute("mostrarSeleccion", false);

        return "juego";
    }

    @PostMapping("/intento")
    public String verificarIntento(@RequestParam int numero, Model model) {
        String resultado = juegoActual.intentar(numero);
        boolean juegoGanado = false;

        switch (resultado) {
            case "ACERTADO" -> {
                model.addAttribute("mensaje", "¡ACERTADO! El número era " + juegoActual.getNumeroSecreto());
                model.addAttribute("juegoActivo", false);
                juegoGanado = true;
            }
            case "GAMEOVER" -> {
                model.addAttribute("mensaje", "GAME OVER. El número era " + juegoActual.getNumeroSecreto());
                model.addAttribute("juegoActivo", false);
            }
            default -> {
                model.addAttribute("mensaje", "Incorrecto. Te quedan " + juegoActual.getVidas() + " vidas.");
                model.addAttribute("juegoActivo", true);
            }
        }

        if (!Boolean.TRUE.equals(model.getAttribute("juegoActivo"))) {
            jugadorActual.sumarPartida(juegoGanado);
            jugadorService.guardar(jugadorActual);
        }

        model.addAttribute("mostrarSeleccion", false);
        return "juego";
    }

    @GetMapping("/estadisticas")
    public String verEstadisticas(Model model) {
        model.addAttribute("jugadores", jugadorService.listar());
        return "estadisticas";
    }
}
