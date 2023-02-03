import java.sql.SQLOutput;

public class Operadores {
    public static void main(String[] args) {
        //+-//
        int numero01 = 10;
        int numero02 = 20;
        System.out.println("Valor " +numero02+numero01);


        //< > <= >= == !=
        // Ctrl D para duplicar a linha
        boolean isDezMaiorQueVinte = 10>20;
        boolean isDezMenorQueVinte = 10<20;
        boolean isDezIgualVinte = 10==20;
        boolean isDezIgualDez = 10==10;
        boolean isDezDiferenteDez = 10!=10;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMaiorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezMaiorQueVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("IsDezDiferenteDez "+isDezDiferenteDez);

        // && (AND) // (OR) ! (NEGATIVE)  \\

        int idade = 35;
        float salario = 3500;
        boolean isDentroDaLeiMaiorQueTrinta = idade > 30 && salario > 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta"+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta"+isDentroDaLeiMenorQueTrinta);



    }
}
