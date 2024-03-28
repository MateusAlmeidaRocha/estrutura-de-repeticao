import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Informe o nome do atleta: ");
    String nome = sc.nextLine();
    System.out.println("Informe os saltos do atleta: ");
    double salto1 = sc.nextDouble();
    double salto2 = sc.nextDouble();
    double salto3 = sc.nextDouble();
    double salto4 = sc.nextDouble();
    double salto5 = sc.nextDouble();
    double[] saltos = {salto1, salto2, salto3, salto4, salto5};
    double maior = saltos[0];
    double menor = saltos[0];
    double media = 0;
    for(int i = 0; i < saltos.length; i++){
      if(saltos[i] > maior){
        maior = saltos[i];
      }
      if(saltos[i] < menor){
        menor = saltos[i];
      }
      media += saltos[i];
    }
    media -= maior;
    media -= menor;
    media /= 3;
    System.out.println("Atleta: " + nome);
    System.out.println("Maior salto: " + maior);
    System.out.println("Menor salto: " + menor);
    System.out.println("Média dos demais saltos: " + media);
    System.out.println("Resultado final: ");
    System.out.println(nome + ": " + media);
  }
}