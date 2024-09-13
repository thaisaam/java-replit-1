//Definir a clase pessoa
class Pessoa{
  //Atributos da classe 
  String nome;
  int idade;


//Contructor para inicializar os atributos
public Pessoa(String nome, int idade){
  this.nome = nome;
  this.idade = idade ;
}
  //Metodo para exibir as informaçoes da pessoa
  public void exibirInformacoes(){
    System.out.println("Nome: " + nome);
    System.out.println("Idade: " + idade);
  }
}
 public class Main {
   public static void main(String[] args){
     //Criando um objetivo pessoa 
     Pessoa pessoa1 = new Pessoa("Miguel", 17);
     Pessoa pessoa2 = new Pessoa("Maryssa", 18);
     Pessoa pessoa3 = new Pessoa("Thaisa", 17);

     pessoa1.exibirInformacoes();
     pessoa2.exibirInformacoes();
     pessoa3.exibirInformacoes();
  }
 
  }

  
