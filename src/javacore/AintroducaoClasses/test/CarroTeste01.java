package javacore.AintroducaoClasses.test;

import javacore.AintroducaoClasses.dominio.Carro;
import javacore.AintroducaoClasses.dominio.Professor;

public class CarroTeste01 {

    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        carro.nome = "Saveiro";
        carro.modelo = "Trend";
        carro.ano = 2013;


        System.out.println("Nome do Carro: "+ carro.nome + "/ modelo: "+ carro.modelo + "/ ano: "+ carro.ano);

        System.out.println("--------------");

        carro2.nome = "Ecosport";
        carro2.modelo = "Freestyle";
        carro2.ano = 2015;


        System.out.println("Nome do Carro: "+ carro2.nome + "/ modelo: "+ carro2.modelo + "/ ano: "+ carro2.ano);






    }
}
