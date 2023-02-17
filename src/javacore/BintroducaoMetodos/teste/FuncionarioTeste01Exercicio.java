package javacore.BintroducaoMetodos.teste;
/* Cria uma classe Funcionários com os seguintes atributos

nome
idade
salario// três salarios devem ser guardados.

Crie dois métodos

1. Para imprimir os dados
2. Para tirar a média dos salários e imprimir o resultado */

import javacore.BintroducaoMetodos.dominio.Funcionario;

public class FuncionarioTeste01Exercicio {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sanji");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1200, 987.32, 2000});
        funcionario.imprime();

    }

}
