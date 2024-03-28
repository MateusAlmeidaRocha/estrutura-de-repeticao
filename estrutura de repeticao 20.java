import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n;
    int fatorial = 1;
    System.out.println("Insira um número inteiro positivo e menor que 16: ");
    n = input.nextInt();
    if (n > 0 && n < 16){
      for (int i = 1; i <= n; i++){
        fatorial = fatorial * i;
      }
      System.out.println("O fatorial de " + n + " é " + fatorial);
    }else{
      System.out.println("Número inválido");
    }
  }
}