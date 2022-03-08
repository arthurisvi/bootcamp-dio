package com.example.models;

public class Curso extends Conteudo {
    private Integer cargaHoraria;

    public Curso() {
    }

    public Curso(Integer cargaHoraria) {
        super();
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

}