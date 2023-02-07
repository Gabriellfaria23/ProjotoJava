package Introducao;

public class EstruturaDeRepetição01 {

    public static void main(String[] args) {
        //while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }
        //Sem o "++count"  o código ficará contando zeros sem parar, o while executa a condição apenas se for compativel.

        count = 0;
        do {
            System.out.println("Dentro do do-while "+ ++count);
        } while (count < 10);

        /* O "do while" executa a condição de qualquer forma e depois avalia se continuará executando, " + ++count" é
        para o do while imprimir ate o número dez e parar.*/

        for(int i=0 ;i < 11; i++) {
            System.out.println("for "+i  ); }
        /*Declarei uma variavel dentro do for informei o valor 11 que irá imprimir ate o dez e o "i++" para parar de
        rodar.*/
    }
     }

