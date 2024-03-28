import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n1 = 0;
    int n2 = 1;
    int n3 = 0;
    int cont = 0;
    while (n3 < 500){
      n3 = n1 + n2;
      n1 = n2;
      n2 = n3;
      cont++;
      System.out.println(n3);
    }
    System.out.println("O número de termos é: " + cont);
  }
}