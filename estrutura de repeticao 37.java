import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int codigo = 1;
    double altura = 0;
    double peso = 0;
    double maiorAltura = 0;
    double menorAltura = 0;
    double maiorPeso = 0;
    double menorPeso = 0;
    double mediaAltura = 0;
    double mediaPeso = 0;
    int contador = 0;
    while (codigo != 0){
      System.out.println("Digite o código do cliente: ");
      codigo = entrada.nextInt();
    }
    System.out.println("Digite a altura do cliente: ");
    altura = entrada.nextDouble();
    System.out.println("Digite o peso do cliente: ");
    peso = entrada.nextDouble();
    if (altura > maiorAltura){
      maiorAltura = altura;
    }
    if (altura < menorAltura){
      menorAltura = altura;
    }
    if (peso > maiorPeso){
      maiorPeso = peso;
    }
    if (peso < menorPeso){
      menorPeso = peso;
    }
    mediaAltura = mediaAltura + altura;
    mediaPeso = mediaPeso + peso;
    contador++;
    System.out.println("O cliente mais alto tem código " + codigo + " e altura " + maiorAltura);
    System.out.println("O cliente mais baixo tem código " + codigo + " e altura " + menorAltura);
    System.out.println("O cliente mais gordo tem código " + codigo + " e peso " + maiorPeso);
    System.out.println("O cliente mais magro tem código " + codigo + " e peso " + menorPeso);
    System.out.println("A média das alturas é " + mediaAltura/contador);
    System.out.println("A média dos pesos é " + mediaPeso/contador);
  }
}