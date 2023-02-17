package javacore.Hherança.teste;

import javacore.Hherança.dominio.Endereço;
import javacore.Hherança.dominio.Funcionario;
import javacore.Hherança.dominio.Pessoa;

public class HerançaTeste01 {
    public static void main(String[] args) {
        Endereço endereço = new Endereço();
        endereço.setRua("Rua 3");
        endereço.setCep("012345-209");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohisa shimazu");
        pessoa.setCpf("1111111");
        pessoa.setEndereço(endereço);
        pessoa.imprime();
        System.out.println("--------------");
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("222222");
        funcionario.setEndereço(endereço);
        funcionario.setSalario(20000);

        funcionario.imprime();
    }
}
