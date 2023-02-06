public class EstruturaDeRepetição01 {

    public static void main(String[] args) {
        //while, do while, for
        int count = 12;
        while(count < 10) {
            System.out.println(++count);}

        //Sem o "++count"  o código ficará contando zeros sem parar, o while executa a condição apenas se for compativel.

        do {
            System.out.println("Dentro do do-while");
        }while (count < 13);

        // O "do while" executa a condição de qualquer forma e depois avalia se continuará executando.

        for(int i;i<10;i++){

}      }
