package javacore.Gassociação.teste;

import javacore.Gassociação.dominio.Jogador;

import javacore.Gassociação.dominio.Time;


public class JogadorTeste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        jogador1.imprime();
        Time time = new Time("Seleção Brasileira");

        jogador1.setTime(time);
    }
}
