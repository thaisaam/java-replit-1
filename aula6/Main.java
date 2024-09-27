import java.util.Arrays;
import java.util.Collections;

public class Main {
  public static void main(String[] args) {
    //1- Criação de um array 
    int[] numbers = {2, 10, 6, 8, 4};
    System.out.println("Meu array de numeros: " + Arrays.toString(numbers));

    //2- Acessando um elemento pelo index[]
    System.out.println("O elemento da posição 2 e: " + numbers[2]);

    //3- Modificando um valor especifico no array
    numbers[2] = 0;
    System.out.println("O novo valor da posição 2 e: " + Arrays.toString(numbers));

    //4- Criando um array de strings
    String[] frutas = {"Pera","Maça","Manga","Melão","Uva","Melancia","Morango","Goiaba"};
    //Exibindo a lista de frutas
    for (int i = 0; i < frutas.length; i++){
      System.out.println("Fruta " + (i+1) + ": " + frutas[i]);
    }
    System.out.println("---------------");
    //5- Iniciando um array de strings
    String[] carros = new String[4];
    carros[0] = "BMW";
    carros[1] = "Mercedes";
    carros[2] = "Audi";
    carros[3] = "Tesla";

    for(int i = 0; i < carros.length; i++){
      System.out.println("Carro" + (i+1) + ": " + carros[i]);
    }
    //6- Ordenando um array ordem crescente 
    Arrays.sort(numbers);
    System.out.println("Array ordenado:" + Arrays.toString(numbers));

    Integer[] numeros = {2, 10, 6, 8, 4};
    Arrays.sort(numeros,Collections.reverseOrder());
    System.out.println("Arrays em ordem decrescente: " + Arrays.toString(numeros));

    //7- Buscando um elementos no array pelo metodo binarySearch
    int index = Arrays.binarySearch(numbers, 10);
    if(index >= 0){
      System.out.println("Valor encontrado  na posição: " + index);
    }else{
      System.out.println("Valor nao encontrado" + index);
    }

    //8-Preencher um array com um determinado valor
    int[ ] array = new int[4];
    Arrays.fill(lista,0);
    System.out.println("Lista preenchida: " + Arrays.toString(lista)")
  }
}