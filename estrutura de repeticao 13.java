import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int base, expoente, resultado = 1;
    System.out.print("Digite a base: ");
    base = input.nextInt();
    System.out.print("Digite o expoente: ");
    expoente = input.nextInt();
    for (int i = 1; i <= expoente; i++){
      resultado *= base;
    }
    System.out.println("O resultado é: " + resultado);
  }
}