package ExerciciosJava;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/* Desenvolva uma aplicação no console(terminal) para calcular o valor da hora
 de um serviço.*/
public class CalcularValorHoraServiço
{ public static void main(String[] args) {

    //variaveis
    double remuneraçaoMensal, imposto,custooperacional,investimento,cargaHoraria,valorHora;

    //objetos

    Scanner teclado = new Scanner(System.in);
    DecimalFormat formatador = new DecimalFormat("#00000000.00");
    BigDecimal bigDecimal = new BigDecimal(2);


    //entrada

    System.out.println(" Hora de serviço ");
    System.out.print(" Informe sua remuneração mensal: ");
    remuneraçaoMensal = teclado.nextDouble();
    System.out.print("Informe seu custo operacional mensal: ");
    custooperacional = teclado.nextDouble();
    System.out.print("Informe a carga horária mensal: ");
    cargaHoraria = teclado.nextDouble();

    //Processamento
    imposto = remuneraçaoMensal * 0.03;
    investimento = remuneraçaoMensal * 0.02;


    valorHora = (remuneraçaoMensal + imposto + custooperacional + investimento) / cargaHoraria ;

    //Saída

    System.out.println(" O valor da hora trabalhada é: " + valorHora);








    }
}
