package com.br.zup;

public class Retangulo implements FiguraGeometrica {
    private int tamanhoBase;
    private int tamanhoAltura;

    public Retangulo(int tamanhoBase, int tamanhoAltura) {
        this.tamanhoBase = tamanhoBase;
        this.tamanhoAltura = tamanhoAltura;
    }

    @Override
    public int calculaArea() {
        return tamanhoAltura * tamanhoBase;
    }
}
