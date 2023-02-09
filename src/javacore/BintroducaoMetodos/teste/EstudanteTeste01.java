package javacore.BintroducaoMetodos.teste;

import javacore.BintroducaoMetodos.dominio.Estudante;
import javacore.BintroducaoMetodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();
        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante01.nome = "Sakura";
        estudante01.idade = 16;
        estudante01.sexo = 'F';

        impressora.imprime(estudante01);

        System.out.println(estudante01.nome);
        System.out.println(estudante01.sexo);
        System.out.println(estudante01.idade);
        System.out.println("-------------------------------");
        System.out.println(estudante02.nome);
        System.out.println(estudante02.sexo);
        System.out.println(estudante02.idade);




    }
}
