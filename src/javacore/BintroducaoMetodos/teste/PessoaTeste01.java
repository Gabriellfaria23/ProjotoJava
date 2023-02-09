package javacore.BintroducaoMetodos.teste;

import javacore.BintroducaoMetodos.dominio.Pessoa;

public class PessoaTeste01 {
    public static void main(String[] args) {
     Pessoa pessoa = new Pessoa();
     //pessoa.nome = "Jiraya";
     pessoa.setNome("Jiraya");
     pessoa.setIdade(24);
     //pessoa.imprime();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());

    }
}

