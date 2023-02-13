package javacore.Dconstrutores.teste;
// A vantagem dos construtores é que eles te forçam a seguir algumas regrinhas. Atenção: Construtores não tem o void
import javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV",12, "Ação", "HONAYA");
        Anime anime2 = new Anime();
        anime.imprime();
        anime2.imprime();
    }
}


