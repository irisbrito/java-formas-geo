package com.br.zup;

public class Triangulo implements FiguraGeometrica{
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int calculaArea() {
        return base * altura / 2 ;
    }
}
