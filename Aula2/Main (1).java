import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Quantos numeros voce deseja inserir? ");
    int tamanho = scanner.nextInt();

    //Criando um array para armazenar os numeros
    int[] numeros = new int[tamanho];

    //Preenchendo todo o array
    for(int i = 0; i < tamanho; i++){
      System.out.println("Digite o " + (i + 1) + ":");
      numeros[i] = scanner.nextInt();
    }

    //Exibindo todos os valores do Array
    System.out.println("Voce inseriu os numeros:");
    for(int i = 0; i < tamanho; i++){
      System.out.println(numeros[i]);
    }
    scanner.close();
  }

}