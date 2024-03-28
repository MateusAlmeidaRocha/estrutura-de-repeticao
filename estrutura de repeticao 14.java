import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num, par = 0, impar = 0;
    for (int i = 0; i < 10; i++){
      System.out.print("Digite um número: ");
      num = input.nextInt();
      if (num % 2 == 0){
        par++;
      } else {
        impar++;
      }
    }
    System.out.println("A quantidade de números pares é: " + par);
    System.out.println("A quantidade de números ímpares é: " + impar);
  }
}