import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;
    System.out.println("Digite um número: ");
    num = input.nextInt();
    while (num >= 0) {
      if (num >= 0 && num <= 25) {
        cont1++;
      } else if (num >= 26 && num <= 50) {
        cont2++;
      } else if (num >= 51 && num <= 75) {
        cont3++;
      } else if (num >= 76 && num <= 100) {
        cont4++;
      }
      System.out.println("Digite um número: ");
      num = input.nextInt();
    }
    System.out.println("Números no intervalo [0-25]: " + cont1);
    System.out.println("Números no intervalo [26-50]: " + cont2);
    System.out.println("Números no intervalo [51-75]: " + cont3);
    System.out.println("Números no intervalo [76-100]: " + cont4);
  }
}