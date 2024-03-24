import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Informe um número de 1 a 10: ");
    int num = input.nextInt();
    int i = 1;
    while (i <= 10){
      System.out.println(num + " x " + i + " = " + num * i);
      i++;
    } 
  }
}