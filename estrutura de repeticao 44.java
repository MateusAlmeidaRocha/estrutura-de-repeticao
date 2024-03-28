import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int voto, c1=0, c2=0, c3=0, c4=0, nulo=0, branco=0;
    System.out.println("Digite o número do seu candidato: ");
    voto = input.nextInt();
    while(voto != 0){
      if(voto == 1){
        c1++;
      }
      else if(voto == 2){
        c2++;
      }
      else if(voto == 3){
        c3++;
      }
      else if(voto == 4){
        c4++;
      }
      else if(voto == 5){
        nulo++;
      }
      else if(voto == 6){
        branco++;
      }
      System.out.println("Digite o número do seu candidato: ");
      voto = input.nextInt();
    }
    System.out.println("Candidato 1: "+c1);
    System.out.println("Candidato 2: "+c2);
    System.out.println("Candidato 3: "+c3);
    System.out.println("Candidato 4: "+c4);
    System.out.println("Votos nulos: "+nulo);
    System.out.println("Votos em branco: "+branco);
    int total = c1+c2+c3+c4+nulo+branco;
    double porcNulo = (double)nulo/total*100;
    double porcBranco = (double)branco/total*100;
    System.out.println("Porcentagem de votos nulos: "+porcNulo+"%");
    System.out.println("Porcentagem de votos em branco: "+porcBranco+"%");
  }  
}