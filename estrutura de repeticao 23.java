import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    int n, i, j, cont = 0;
    System.out.print("Digite um número: ");
    n = input.nextInt();
    for (i = 2; i <= n; i++){
      for (j = 1; j <= i; j++){
        if (i % j == 0){
          cont++;
        }
      }
      if (cont == 2){
        System.out.println(i);
      }
      cont = 0;
    }
  }
}