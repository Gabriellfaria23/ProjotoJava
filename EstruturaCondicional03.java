public class EstruturaCondicional03 {
    //EXERCICIO: Saber quanto tem que pagar de imposto baseado no salário atual//

    public static void main(String[] args) {
        double salarioAnual =7000;
        double primeiraFaixa = 9.7/100;
        double segundaFaixa = 37.35/100;
        double terceiraFaixa = 49.5/100;
        double valorImposto = 0;

        if(salarioAnual <= 34712) {
            salarioAnual = salarioAnual * primeiraFaixa;
        } else if(salarioAnual >=34713 && salarioAnual <= 68587){
            salarioAnual = salarioAnual * terceiraFaixa;}
        else {
            salarioAnual = salarioAnual * terceiraFaixa;
        }
        System.out.println(salarioAnual);

    }



    }

