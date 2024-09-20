import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Double num1;
    Double num2;
    String operacao;

    System.out.println("Digite o primeiro número: ");
    num1 = scanner.nextDouble();

    System.out.println("Digite a operacao(+, -, *, /): ");
    operacao = scanner.next();

    System.out.println("Digite o segundo número: ");
    num2 = scanner.nextDouble();

    // realizando a operação escolhida pelo metodo calculo
    System.out.println("Resultado: " + calculo(num1, operacao, num2));

    scanner.close();
  }

  public static Double calculo(Double num1, String operacao, Double num2) {
    Double resposta = 0.0;

    if (operacao.equals("+")) {
      resposta = num1 + num2;

    }

    if (operacao.equals("-")) {
      resposta = num1 - num2;
    }

    if (operacao.equals("*")) {
      resposta = num1 * num2;
    }

    if (operacao.equals("/")) {
      resposta = num1 / num2;
    }
    return resposta;
  }
}
