package com.example.demo.model;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Jugador {
    private String nombre;

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    /*
    private String nombre;
    private int partidasJugadas;
    private int aciertos;
    private final ArrayList<Partida> historialPartidas = new ArrayList<>();

    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    // getters y setters
    public String getNombre() { return nombre; }
    public int getPartidasJugadas() { return partidasJugadas; }
    public int getAciertos() { return aciertos; }
    public ArrayList<Partida> getHistorialPartidas() { return historialPartidas; }

    public void registrarPartida(boolean acierto) {
        partidasJugadas++;
        if (acierto) aciertos++;
        historialPartidas.add(new Partida(LocalDateTime.now(), acierto));
    }

    // Clase interna para guardar cada partida
    private static class Partida {
        private final LocalDateTime fechaHora;
        private final boolean acierto;

        public Partida(LocalDateTime fechaHora, boolean acierto) {
            this.fechaHora = fechaHora;
            this.acierto = acierto;
        }

        public LocalDateTime getFechaHora() { return fechaHora; }
        public boolean isAcierto() { return acierto; }
    }
    */
}
