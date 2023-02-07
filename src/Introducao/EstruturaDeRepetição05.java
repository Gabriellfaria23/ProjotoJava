package Introducao;

public class EstruturaDeRepetição05 {
    // Código semelhante a da aula Introducao.EstruturaDeRepetição04, porém com a função continue e al
    public static void main(String[] args) {
        int valorTotal = 30000;
        for (int parcela =  valorTotal; parcela >= 1; parcela--) {
            int valorParcela = valorTotal / parcela;
            if(valorParcela < 1000) {
                continue;
            }
            System.out.println("parcela " + parcela +" R$ " + valorParcela);
        }


        }
    }

