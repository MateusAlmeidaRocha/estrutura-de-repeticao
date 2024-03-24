import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n1, n2, i;
    System.out.print("Digite o primeiro número: ");
    n1 = input.nextInt();
    System.out.print("Digite o segundo número: ");
    n2 = input.nextInt();
    if (n1 < n2){
     for (i = n1; i <= n2; i++){
       System.out.println(i);
     }
    }
  }
}