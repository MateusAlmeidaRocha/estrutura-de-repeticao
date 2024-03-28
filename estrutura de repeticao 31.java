import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    double produto1, produto2, produto3, total, dinheiro, troco;
    Scanner entrada = new Scanner(System.in);
    System.out.println("Lojas Tabajara");
    System.out.print("Produto 1: R$ ");
    produto1 = entrada.nextDouble();
    System.out.print("Produto 2: R$ ");
    produto2 = entrada.nextDouble();
    System.out.print("Produto 3: R$ ");
    produto3 = entrada.nextDouble();
    total = produto1 + produto2 + produto3;
    System.out.println("Total: R$ " + total);
    System.out.print("Dinheiro: R$ ");
    dinheiro = entrada.nextDouble();
    troco = dinheiro - total;
    System.out.println("Troco: R$ " + troco);
  }
}