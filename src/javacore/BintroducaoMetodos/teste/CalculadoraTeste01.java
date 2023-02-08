package javacore.BintroducaoMetodos.teste;

import javacore.BintroducaoMetodos.dominio.Calculadora;

public class CalculadoraTeste01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando Calculadora test1");
        calculadora.subtraiDoisNumero();
        // O programa está imprimindo o resultado pois o " System.out.println" está no dominio.


    }
}
