import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Quantos CDs você possui?");
    int quantidade = input.nextInt();
    double soma = 0;
    for (int i = 1; i <= quantidade; i++){
      System.out.println("Informe o valor do CD " + i);
      double valor = input.nextDouble();
      soma = soma + valor;
    }
    System.out.println("O valor total investido é: " + soma);
  }
}