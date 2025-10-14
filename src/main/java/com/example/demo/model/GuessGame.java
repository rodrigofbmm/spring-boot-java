package com.example.demo.model;

import java.util.Random;

public class GuessGame {
    private final int numeroSecreto;
    private int vidas;

    public GuessGame() {
        this.numeroSecreto = new Random().nextInt(10) + 1;
        this.vidas = 3;
    }

    public int getNumeroSecreto() {
        return numeroSecreto;
    }

    public int getVidas() {
        return vidas;
    }

    public String intentar(int numero) {
        if (numero == numeroSecreto) {
            return "ACERTADO";
        } else {
            vidas--;
            if (vidas <= 0) {
                return "GAMEOVER";
            }
            return "FALLIDO";
        }
    }
}