import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int paisA = 80000;
    int paisB = 200000;
    int anos = 0;
    double taxaA = 0.03;
    double taxaB = 0.015;
    while (paisA <= paisB){
      paisA += paisA * taxaA;
      paisB += paisB * taxaB;
      anos++;
    }
      System.out.println("A população do país A ultrapassa ou iguala a população do país B em " + anos + " anos.");
  }
}