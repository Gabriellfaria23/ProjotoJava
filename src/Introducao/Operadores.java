package Introducao;

import java.sql.SQLOutput;

public class Operadores {
    public static void main(String[] args) {
        //+-//
        int numero01 = 10;
        int numero02 = 20;
        System.out.println("Valor " +numero02+numero01);


        //< > <= >= == !=
        // Ctrl D para duplicar a linha
        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgualVinte = 10==20;
        boolean isDezIgualDez = 10==10;
        boolean isDezDiferenteDez = 10!=10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMaiorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("IsDezDiferenteDez "+isDezDiferenteDez);

        // && (AND) || (OR) ! (NEGATIVE)  \\

        int idade = 35;
        float salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta"+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta"+isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000f;

        Boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // = += -= *= /= %=

        double bonus = 1800; //1800
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 3; //1200

        System.out.println(bonus); //vai imprimir 1200

        // ++ --

        int contador = 0;
        contador +=1; //vai imprimir 1;
        contador ++;  //vai imprimir 2;
        contador --; // vai imprimir 1;
        ++contador; // vai imprimir 2;
        System.out.println(contador);





        }



    }

