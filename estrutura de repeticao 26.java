import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int eleitores, voto, candidato1 = 0, candidato2 = 0, candidato3 = 0, nulo = 0, branco = 0;
    System.out.println("Digite o número de eleitores: ");
    eleitores = input.nextInt();
    for(int i = 1; i <= eleitores; i++){
      System.out.println("Digite o número do seu candidato: ");
      voto = input.nextInt();
      if(voto == 1){
        candidato1++;
      }
      else if(voto == 2){
        candidato2++;
      }
      else if(voto == 3){
        candidato3++;
      }
      else if(voto == 4){
        nulo++;
      }
      else if(voto == 5){
        branco++;
      }
    }
    System.out.println("Candidato 1: " + candidato1);
    System.out.println("Candidato 2: " + candidato2);
    System.out.println("Candidato 3: " + candidato3);
    System.out.println("Nulos: " + nulo);
    System.out.println("Brancos: " + branco);
  }
}