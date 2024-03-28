import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    int num, inicio, fim;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Digite o número que deseja saber a tabuada: ");
    num = teclado.nextInt();
    System.out.println("Digite o número que deseja que inicie a tabuada: ");
    inicio = teclado.nextInt();
    System.out.println("Digite o número que deseja que termine a tabuada: ");
    fim = teclado.nextInt();
    for (int i = inicio; i <= fim; i++) {
      System.out.println(num + " x " + i + " = " + num * i);
    }
  }
}