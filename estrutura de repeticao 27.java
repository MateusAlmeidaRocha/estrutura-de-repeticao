import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     System.out.println("Digite a quantidade de turmas: ");
     int turmas = input.nextInt();
     System.out.println("Digite a quantidade de alunos: ");
     int alunos = input.nextInt();
     int media = alunos / turmas;
     System.out.println("O número médio de alunos por turma é: " + media);
     if (media > 40){
       System.out.println("A turma não pode ter mais de 40 alunos.");
     }
  }
}