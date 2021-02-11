package com.br.zup;

public class Losango implements FiguraGeometrica{
    private int diametroMaior;
    private int diametroMenor;

    public Losango(int diametroMaior, int diametroMenor) {
        this.diametroMaior = diametroMaior;
        this.diametroMenor = diametroMenor;
    }

    public int getDiametroMaior() {
        return diametroMaior;
    }

    public int getDiametroMenor() {
        return diametroMenor;
    }

    @Override
    public int calculaArea() {
        return diametroMaior * diametroMenor / 2;
    }
}
