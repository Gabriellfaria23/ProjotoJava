package ExerciciosJava;


import java.text.DecimalFormat;
import java.util.Scanner;

/* Desenvolva uma aplicação no console(terminal) de ponto de vendas(PDV),
 conforme modelo abaixo:
 * Valor total: 200
 * Desconto (%):5
 * Total com desconto: 190,00(valor calculado)
 * Valor pago: 200
 * Troco: 10,00 (valor calculado) */
public class PontoDeVenda {
    public static void main(String[] args) {
        //variaveis
        double valorTotal,totalComDesconto, troco;
        double desconto;

        //objetos

        Scanner teclado = new Scanner(System.in);
        DecimalFormat formatador = new DecimalFormat("#0.00");

        //entrada

        System.out.println("Ponto de venda");
        System.out.print(" Valor total: ");
        valorTotal = teclado.nextDouble();

        //Processamento

        desconto = 0.05;
        troco = 190 * desconto;
        totalComDesconto = valorTotal - troco;


        //Saída
        System.out.println(" O valor com desconto será: R$ " + formatador.format(totalComDesconto) + " e seu troco será: R$ "
                + formatador.format(troco));

    }
}
