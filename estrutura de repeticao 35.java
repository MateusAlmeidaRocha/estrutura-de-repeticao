import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num, i, j, cont = 0;
    System.out.print("Informe um número inteiro: ");
    num = input.nextInt();
    for (i = 1; i <= num; i++){
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