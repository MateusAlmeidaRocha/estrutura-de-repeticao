import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    System.out.println("Atleta: ");
    String atleta = entrada.nextLine();
    System.out.println("Nota: ");
    double nota1 = entrada.nextDouble();
    System.out.println("Nota: ");
    double nota2 = entrada.nextDouble();
    System.out.println("Nota: ");
    double nota3 = entrada.nextDouble();
    System.out.println("Nota: ");
    double nota4 = entrada.nextDouble();
    System.out.println("Nota: ");
    double nota5 = entrada.nextDouble();
    System.out.println("Nota: ");
    double nota6 = entrada.nextDouble();
    System.out.println("Nota: ");
    double nota7 = entrada.nextDouble();
    double[] notas = {nota1, nota2, nota3, nota4, nota5, nota6, nota7};
    double maior = notas[0];
    double menor = notas[0];
    for(int i = 0; i < notas.length; i++){
      if(notas[i] > maior){
        maior = notas[i];
      }
      if(notas[i] < menor){
        menor = notas[i];
      }
    }
    double soma = 0;
    for(int i = 0; i < notas.length; i++){
      soma += notas[i];
    }
    double media = (soma - maior - menor) / 5;
    System.out.println("Resultado final:");
    System.out.println("Atleta: " + atleta);
    System.out.println("Melhor nota: " + maior);
    System.out.println("Pior nota: " + menor);
    System.out.println("Média: " + media);
  }
}