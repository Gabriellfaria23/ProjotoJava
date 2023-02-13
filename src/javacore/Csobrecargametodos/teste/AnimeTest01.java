package javacore.Csobrecargametodos.teste;

import javacore.Csobrecargametodos.dominio.Anime;
/* Metodos sobrecarregados é ter um método com o mesmo nome só que a quantidade de parametros ou o tipo
     de parametros precisa ser diferente.*/
public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        anime.init("Akuma Drive","TV", 12,"Ação");
        anime.imprime();
    }
}


