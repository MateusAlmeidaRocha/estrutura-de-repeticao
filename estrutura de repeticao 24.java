import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Digite a quantidade de notas: ");
    int qtd = input.nextInt();
    double[] notas = new double[qtd];
    double soma = 0;
    for(int i = 0; i < qtd; i++){
      System.out.println("Digite a nota: ");
      notas[i] = input.nextDouble();
      soma += notas[i];
    }
    double media = soma / qtd;
    System.out.println("A média é: " + media);
  }
}