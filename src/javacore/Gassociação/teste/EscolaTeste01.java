package javacore.Gassociação.teste;

import javacore.Gassociação.dominio.Escola;
import javacore.Gassociação.dominio.Professor;

public class EscolaTeste01 {
    public static void main(String[] args) {
        Professor professor = new Professor("Jiraya Sensei");
        Professor[] professores = {professor};
        Escola escola = new Escola("Konaha", professores);

        escola.imprime();
;    }
}
