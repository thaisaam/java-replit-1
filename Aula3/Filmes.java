public class Filmes{
  //Atributos 
  private String titulo;
  private int anoLancamentos;
  private int duracao;

  //Construtor
  public Filmes(String titulo, int anoLancamentos, int duracao){
  this.titulo = titulo;
  this.anoLancamentos = anoLancamentos;
  this.duracao = duracao;   
}

  //Métodos
  public String exibirInfo(){
    return "Titulo: " + titulo + ", Ano " + anoLancamentos + ", Duração: " + duracao;
    
  }
}