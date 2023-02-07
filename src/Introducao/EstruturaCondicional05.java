package Introducao;

public class EstruturaCondicional05 {
    // Dados os valores de 1 a 7, imprima se é dia útil ou final de semana.

    //Considerando 1 como domingo

    public static void main(String[] args) {

        int dia = 4;

        switch (dia) {
            case 1:
            case 7:
                System.out.println("final de Semana");
                break;
            case 2:

            case 3:

            case 4:
            case 5:
            case 6:
                System.out.println("dia útil");

                break;

            default: System.out.println("Opção invalida");

                break;

        }
    }

    }





