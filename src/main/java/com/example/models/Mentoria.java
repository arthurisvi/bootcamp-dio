package com.example.models;

import java.time.LocalDate;

public class Mentoria extends Conteudo{
    
    private LocalDate data;

    public Mentoria() {
    }

    public Mentoria(LocalDate data) {
        super();
        this.data = data;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

}