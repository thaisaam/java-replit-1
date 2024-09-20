import java.util.Scanner;

//Comparando tipos primitivos que serao 

public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    //Solicitando um dado de entrada 
    System.out.println("Digite alguma coisa: ");
    String dadoDigitado = entrada.nextLine();

    //Tentando converter o valor digitado para um inteiro
    try{
      int numero = Integer.parseInt(dadoDigitado);
      System.out.println("Você digitou um inteiro:");
    } catch (NumberFormatException e){
      System.out.println("Voce digitou uma string" );
    }
    entrada.close();
  }
}