package com.br.zup;

public class Quadrado implements FiguraGeometrica{
    private int tamanhoDosLados;

    public Quadrado(int tamanhoDosLados) {
        this.tamanhoDosLados = tamanhoDosLados;
    }

    @Override
    public int calculaArea() {
        return tamanhoDosLados * tamanhoDosLados;
    }
}
