import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int nota = 0;
    int acertos = 0;
    int cont = 0;
    int maior = 0;
    int menor = 0;
    int media = 0;
    int soma = 0;
    int aluno = 0;
    String resposta;
    String gabarito;
    gabarito = "AEDCEEADDC";
    System.out.println("Digite a quantidade de alunos: ");
    aluno = leitor.nextInt();
    for (int i = 0; i < aluno; i++){
    for (int e = 0; e < 10; e++){
      System.out.println("Digite a resposta da questão " + (e + 1));
      resposta = leitor.next();
      if (resposta == gabarito){
        acertos++;
      }else{
        nota++;
      }
    }
    }
    if (nota > maior){
      maior = nota;
    }
    if (nota < menor){
      menor = nota;
    }
    soma = soma + nota;
    media = soma / aluno;
    System.out.println("A maior nota é: " + maior);
    System.out.println("A menor nota é: " + menor);
    System.out.println("A média das notas é: " + media);
    
  }

  
}