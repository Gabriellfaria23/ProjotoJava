package javacore.BintroducaoMetodos.teste;

import javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(15,2);
        System.out.println(result);
    }
}
