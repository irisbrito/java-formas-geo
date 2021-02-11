package com.br.zup;

public class Sistema {

    public void menu(){
        System.out.println("Digite 1 para calcular área do quadrado \n 2 para triangulo \n 3 para retangulo  \n 4 para sair");
    }

    public void executarSistema() {
        boolean continuar = true;
        while (continuar) {
            menu();
            int resposta = IO.criarScanner().nextInt();

            if (resposta == 1) {
                IO.mostrarTexto("Digite o valor dos lados");
                Quadrado quadrado = new Quadrado(IO.criarScanner().nextInt());
                IO.mostrarTexto("O total da área é: " + quadrado.calculaArea());
            } else if (resposta == 2) {
                IO.mostrarTexto("Digite o valor da base e da altura");
                int base = IO.criarScanner().nextInt();
                int altura = IO.criarScanner().nextInt();
                Triangulo triangulo = new Triangulo(base, altura);
                IO.mostrarTexto("O total da área é: " + triangulo.calculaArea());
            } else if (resposta == 3) {
                IO.mostrarTexto("Digite o valor da base e da altura");
                int lado1 = IO.criarScanner().nextInt();
                int lado2 = IO.criarScanner().nextInt();
                Retangulo retangulo = new Retangulo(lado1, lado2);
                IO.mostrarTexto("O total da área é: " + retangulo.calculaArea());
            } else if (resposta == 4) {
                continuar = false;;
            }
        }
    }
}
