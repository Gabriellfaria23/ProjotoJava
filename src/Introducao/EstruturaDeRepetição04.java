package Introducao;

public class EstruturaDeRepetição04 {
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela >= 1000) {
            }else{
                break; }
            System.out.println("Os valores das parcelas serão de: "+ parcela + " de " + valorParcela);

            // System.out.println está fora do if mas dentro do for.


        }
    }
}
