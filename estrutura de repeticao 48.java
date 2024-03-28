import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite um número inteiro positivo: ");
    int num = input.nextInt();
    int numInvertido = 0;
    while(num != 0) {
      int digito = num % 10;
      numInvertido = numInvertido * 10 + digito;
      num /= 10;
    }
    System.out.println("O número invertido é: " + numInvertido);
  }
}