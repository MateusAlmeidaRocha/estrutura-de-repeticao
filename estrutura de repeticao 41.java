import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    double valorDivida, valorJuros;
    int quantidadeParcelas;
    double valorParcela = 0;
    System.out.print("Digite o valor da dívida: ");
    valorDivida = Double.parseDouble(System.console().readLine());
    System.out.print("Digite a quantidade de parcelas entre 1, 3, 6, 9, 12: ");
    quantidadeParcelas = Integer.parseInt(System.console().readLine());
    if (quantidadeParcelas == 1){
      valorJuros = 0;
      System.out.printf("Valor da Dívida: R$ %.2f\n" + valorDivida);
      System.out.printf("Quantidade de Parcelas: %d\n" + quantidadeParcelas);
      System.out.printf("Valor da Parcela: R$ %.2f\n" + valorParcela);
    }
    else if (quantidadeParcelas == 3){
      valorParcela = valorDivida * 0.10;
      System.out.printf("Valor da Dívida: R$ %.2f\n" + valorDivida);
      System.out.printf("Quantidade de Parcelas: %d\n" + quantidadeParcelas);
      System.out.printf("Valor da Parcela: R$ %.2f\n" + valorParcela);
    }
    else if (quantidadeParcelas == 6){
      valorParcela = valorDivida * 0.15;
      System.out.printf("Valor da Dívida: R$ %.2f\n" + valorDivida);
      System.out.printf("Quantidade de Parcelas: %d\n" + quantidadeParcelas);
      System.out.printf("Valor da Parcela: R$ %.2f\n" + valorParcela);
    }
    else if (quantidadeParcelas == 9){
      valorParcela = valorDivida * 0.20;
      System.out.printf("Valor da Dívida: R$ %.2f\n" + valorDivida);
      System.out.printf("Quantidade de Parcelas: %d\n" + quantidadeParcelas);
      System.out.printf("Valor da Parcela: R$ %.2f\n" + valorParcela);
    }
    else if (quantidadeParcelas == 12){
      valorParcela = valorDivida * 0.25;
      System.out.printf("Valor da Dívida: R$ %.2f\n" + valorDivida);
      System.out.printf("Quantidade de Parcelas: %d\n" + quantidadeParcelas);
      System.out.printf("Valor da Parcela: R$ %.2f\n" + valorParcela);
    }
  }
}