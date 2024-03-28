import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;
    double h = 0;
    System.out.print("Digite o valor de N: ");
    n = input.nextInt();
    for (int i = 1; i <= n; i++) {
      h += 1.0 / i;
    }
    System.out.println("O valor de H com " + n + " termos é: " + h);
  }
}