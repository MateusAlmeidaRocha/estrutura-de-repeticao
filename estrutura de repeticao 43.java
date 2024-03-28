import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int codigo = 0;
    int qtd = 0;
    double total = 0;
    double preco = 0;
    System.out.println("Digite a quantidade de itens que deseja");
    int qtdItens = leitor.nextInt();
    for(int i = 0; i < qtdItens; i++){
      System.out.println("Digite o código do item");
      codigo = leitor.nextInt();
      System.out.println("Digite a quantidade do item");
      qtd = leitor.nextInt();
      switch(codigo){
        case 100:
          preco = 1.20;
          break;
        case 101:
          preco = 1.30;
          break;
        case 102:
          preco = 1.50;
          break;
        case 103:
          preco = 1.20;
          break;
        case 104:
          preco = 1.30;
          break;
        case 105:
          preco = 1.00;
          break;
        default:
          System.out.println("Código inválido");
          break;
      }
    }
     total = preco * qtd;
     System.out.println("O total do pedido é: " + total);
  }
}