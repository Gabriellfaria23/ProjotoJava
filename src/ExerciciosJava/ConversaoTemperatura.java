package ExerciciosJava;

import java.text.DecimalFormat;
import java.util.Scanner;

/*Nos Estados Unidos a temperatura em geral é medida em uma escala denominada
 fahrenheit. Desenvolva uma aplicação no console(terminal) que faça a
 conversão de temperatura em fahrenheit para celsius*/
public class ConversaoTemperatura {
    public static void main(String[] args) {
    //variáveis
    double c,f;
    //objetos
        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.0");
        //para formartar o resultado para apenas uma linha decimal.
        //entrada
        System.out.println("Conversão de temperatura");
        System.out.print("Digite a temperatura em fahrenheit: ");
        f = teclado.nextDouble();
        //processamento
        c = (5 * (f - 32)) / 9;
        //saída
        System.out.println("Temperatura em celsius: " + formatador.format(c)+
        formatador.format(c) + "ºC");

    }
}
