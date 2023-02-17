package javacore.Gassociação.teste;

import javacore.Gassociação.dominio.Aluno;
import javacore.Gassociação.dominio.Local;
import javacore.Gassociação.dominio.Professor;
import javacore.Gassociação.dominio.Seminario;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das larajeiras");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca","Pirata");
        Aluno[]alunosParaSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar one piace", alunosParaSeminario,local);

        Seminario[]seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
    }
}
