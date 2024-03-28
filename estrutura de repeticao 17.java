import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite um número inteiro: ");
    int num = input.nextInt();
    int fat = 1;
    for (int i = 1; i <= num; i++){
      fat = fat * i;
     }
    System.out.println("O fatorial de " + num + " é " + fat);
  }
}