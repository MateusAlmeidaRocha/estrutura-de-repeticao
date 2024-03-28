import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    System.out.print("Digite um número: ");
    num = input.nextInt();
    if(num % 2 == 0){
      System.out.println("O número é composto");
    }
    else{
      System.out.println("O número é primo");
    }
  }
}