import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num, soma = 0;
    float media;
    for (int i = 0; i < 5; i++){
      System.out.print("Digite um número: ");
      num = input.nextInt();
      soma += num;
    }
    media = soma / 5;
    System.out.println("A soma dos números é: " + soma);
    System.out.println("A média dos números é: " + media); 
  }
}