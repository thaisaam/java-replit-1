
public class Main {
  public static void main(String[] args) {
    Filmes filme1 = new Filmes("O Senhor dos Aneis", 2001, 178);
    Filmes filme2 = new Filmes("1917", 2013, 138);
    Filmes filme3 = new Filmes("Vingadores Ultimato", 2019 , 100);
    System.out.println(filme1.exibirInfo());
    System.out.println(filme2.exibirInfo());
    System.out.println(filme3.exibirInfo());
  }


}