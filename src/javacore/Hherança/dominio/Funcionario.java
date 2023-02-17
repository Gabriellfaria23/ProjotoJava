package javacore.Hherança.dominio;

/*funcionario com o extends vai ter todos os atributos e métodos que a pessoa tem quando
eu nao quero que a classe tenha uma extenção eu uso a palavar final* Ex:public final class
string*/
public class Funcionario extends Pessoa {

    private  double salario;
    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
