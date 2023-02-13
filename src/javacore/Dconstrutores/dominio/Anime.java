package javacore.Dconstrutores.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;
    private String estudio;
    // A vantagem dos construtores é que eles te forçam a seguir algumas regrinhas. Atenção: Construtores não tem o void.
    public Anime(String nome, String tipo, int episodios, String genero, String estudio){
        System.out.println("Dentro do construtor");
      this.nome = nome;
      this.tipo = tipo;
      this.episodios = episodios;
      this.genero = genero;
      this.estudio = estudio;
    }
    public Anime(){

    }

    /* Metodos sobrecarregados é ter um método com o mesmo nome só que a quantidade de parametros ou o tipo
     de parametros precisa ser diferente.*/



    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
    public int getEpisodios(){
        return this.episodios;
    }
}
