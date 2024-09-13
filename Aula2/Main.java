import java.util.Scanner;
import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
  //Criando uma instancia do scanner
   Scanner scanner = new Scanner(System.in);

    //Solicitando o tamanho do array
     System.out.printf("Quantos numeros voce deseja inserir?");
    int tamanho = scanner.nextInt();

    //Criando o array
    int[] numeros = new int[tamanho];

    //Inserindo os numeros no array
    for(int i = 0; i < tamanho; i++){
      System.out.printf("Digite o numero: " + (i + 1)+":");
      numeros[i] = scanner.nextInt();
    }

      //Ordenando o array
      for(int i = 0; i < tamanho - 1; i++){
        System.out.println(numeros[i]);
      } 
    //Fechando o Scanner
    scanner.close();
  }

  
}