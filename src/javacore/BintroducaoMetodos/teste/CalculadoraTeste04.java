package javacore.BintroducaoMetodos.teste;

import javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste04 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int num1 = 1;
        int num2 = 2;
        calculadora.alteraDoisNumeros(num1,num2);
        System.out.println(num1);
        System.out.println(num2);

        /* Atenção: Dentro das sua classes quando vocÊ está passando um variaveis do tipo primitivo, a
        variavel original nunca vai se alterada, ou seja, você está passando uma cópia para a nova variável.
         */

    }



}
