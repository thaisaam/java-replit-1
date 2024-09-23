import java.util.Scanner;
import java.util.Random;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    int numeroSecreto = random.nextInt(100)+1;
    int tentativas = 0;
    int chute;
    boolean acertou = false;

    while(!acertou){
      //Solicitando um numero para usuario
      System.out.print("""
                       𝕁𝕠𝕘𝕠 𝕕𝕒 𝕒𝕕𝕚𝕧𝕚𝕟𝕙𝕒𝕔𝕒𝕠
                       """);
      System.out.println("Digite um numero entre 1 e 100");
      chute = scanner.nextInt();
      tentativas++;
      
      //verificando se o chute e maior ou menor que o numero secreto
      if(chute == numeroSecreto){
        System.out.println("Parabens! Voce acertou o numero secreto!" + tentativas + "tentativas");
        acertou = true;
      }else if(chute > numeroSecreto){
        System.out.println("O numero secreto e menor! Tente novamente");
      }else if(chute < numeroSecreto){
        System.out.println("O numero secreto e maior! Tente novamente");
      }
    }
    scanner.close(); 
  }
}