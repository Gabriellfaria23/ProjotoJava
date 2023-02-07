package Introducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida){
            System.out.println("Autorizado a comprar bebida alcoolica");

        }
        else{
                System.out.println("Não autorizado a comprar bebida alcoolica");

                //Pra existir um else precisa ter um if //

            // Exercicio idade < 15 categoria infantil
            // idade >= 15 && idade < 18 categoria juvenil
            // idade >=18 categoria adulto

            int idadeHomem = 17;

            if(idade < 15){
                System.out.println("categoria Infatil"); }

            if(idade == 15 || idade < 18){
                System.out.println("categoria juvenil");}

            if(idade >= 18){
                System.out.println("categoria adulto");

            }    ;



            }

        }
    }

