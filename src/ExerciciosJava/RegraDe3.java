package ExerciciosJava;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Desenvolva uma aplicação no console (terminal) para calcular
o valor da porcentagem usando Regra de 3, conforme modelo abaixo:
 x% de y = valor */
public class RegraDe3 {
    public static void main(String[] args) {
        //variáveis
        double x,y,valor;
        //objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.0");
        //entrada
        System.out.println("Regra de 3");
        System.out.println("x% de y = valor");
        System.out.println("Digite o valor de x:");
        x = teclado.nextDouble();
        System.out.println("Digite o valor de y:");
        y = teclado.nextDouble();
        //processamento
        valor = (x * y) / 100;
        //saída
        System.out.println(x + "% de " + y + " = " + formatador.format(valor));
        teclado.close();
    }
}
