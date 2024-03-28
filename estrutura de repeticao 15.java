import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Informe o valor de n: ");
    int n = input.nextInt();
    int a = 1;
    int b = 1;
    int c = 0;
    for (int i = 0; i < n; i++){
      c = a + b;
      a = b;
      b = c;
      System.out.println(c);
    }
  }
}