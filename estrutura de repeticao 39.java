import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int numAlunoMaisAlto = 0;
    int numAlunoMaisBaixo = 0;
    double alturaMaisAlto = 0;
    double alturaMaisBaixo = Double.MAX_VALUE;
    for (int i = 1; i <= 10; i++){
      System.out.println("Digite o número do aluno " + i + ": ");
      int numAluno = input.nextInt();
      System.out.println("Digite a altura do aluno " + i + " em centímetros: ");
      double altura = input.nextDouble();
      if (altura > alturaMaisAlto){
        alturaMaisAlto = altura;
        numAlunoMaisAlto = numAluno;
      }
      if (altura < alturaMaisBaixo){
        alturaMaisBaixo = altura;
        numAlunoMaisBaixo = numAluno;
      }
    }
    System.out.println("O aluno mais alto é o número " + numAlunoMaisAlto + " com altura de " + alturaMaisAlto + " centímetros.");
    System.out.println("O aluno mais baixo é o número " + numAlunoMaisBaixo + " com altura de " + alturaMaisBaixo + " centímetros.");
  }
}