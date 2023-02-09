package javacore.BintroducaoMetodos.dominio;
/* Cria uma classe Funcionários com os seguintes atributos

nome
idade
salario// três salarios devem ser guardados

Crie dois métodos

1. Para imprimir os dados
2. Para tirar a média dos salários e imprimir o resultado */
public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        if(salarios != null)
        for(double salario: salarios){
            System.out.print(salario + " "); }
        // System.out.print é pra imprimir na mesma linha, System.out.println é pra imprimir descendo.
    }
    public void imprimeMediaSalario() {
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        // salarios.lenght significa que vai dividir o salário pela quantidade de arrays no caso 3.
        System.out.println("Media salarial é " + media);
    }
    }

