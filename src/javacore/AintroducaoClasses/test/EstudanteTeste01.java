package javacore.AintroducaoClasses.test;

import javacore.AintroducaoClasses.dominio.Estudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {

        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        estudante.nome = "luffy";
        estudante.idade = 21;
        estudante.sexo = 'M';


        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
        System.out.println("------------------------");
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);



        System.out.println();
    }



}
