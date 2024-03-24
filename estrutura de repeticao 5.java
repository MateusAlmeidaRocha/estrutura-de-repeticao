import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int paisA , paisB ; 
    double taxaA , taxaB ;
    int anos = 0 ;

    System.out.println("Informe a população do país A: ");
    paisA = input.nextInt();
    System.out.println("Informe a população do país B: ");
    paisB = input.nextInt();
    System.out.print("Informe a taxa de crescimento do país A: ");
    taxaA = input.nextDouble();
    System.out.print("Informe a taxa de crescimento do país B: ");
    taxaB = input.nextDouble();
    while (paisA <= paisB){
      paisA += paisA * taxaA;
      paisB += paisB * taxaB;
      anos++;
    }
      System.out.println("A população do país A ultrapassa ou iguala a população do país B em " + anos + " anos.");
}
}