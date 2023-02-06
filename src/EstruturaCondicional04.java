public class EstruturaCondicional04 {
 //Imprima o dia da semana considerando o primeiro como domingo//
    public static void main(String[] args) {
        byte dia = 6;
        switch (dia){
            case 1 :
                System.out.println("Domingo");
                break;
            case 2 :
                System.out.println("Segunda");
                break;
            case 3 :
                System.out.println("Terça");
                break;
            case 4 :
                System.out.println("Quarta");
                break;
            case 5 :
                System.out.println("Quinta");
                break;
            case 6 :
                System.out.println("Sexta");
                break;
            case 7 :
                System.out.println("Sábado");
                break;

            default:
                System.out.println("Opção invalida");
                // colocar o break senão o programa irá imprimir todos os dias depois do que eu selecionei//
                /* Se eu colocar um número invalido para o dia da semana pro exemplo 10, o default irá atuar e irá
                imprimir opção invalida */
    }
} }
