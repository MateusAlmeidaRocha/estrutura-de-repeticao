import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Digite um número inteiro: ");
     int num = input.nextInt();
     int div = 0;
     for (int i = 1; i <= num; i++){
       if (num % i == 0){
         div++;
       }
     } if (div == 2){
       System.out.println("O número é primo.");
     } else {
       System.out.println("O número não é primo.");
     }
  }
}