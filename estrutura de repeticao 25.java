import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int idade, soma = 0, cont = 0;
     double media;
     System.out.println("Digite a idade de cada pessoa: ");
     idade = input.nextInt();
     while (idade != 0){
       soma += idade;
       cont++;
       idade = input.nextInt();
     }
     media = (double) soma / cont;
     if (media <= 25){
       System.out.println("A turma é jovem");
     }
     else if (media <= 60){
       System.out.println("A turma é adulta");
     }
     else {
       System.out.println("A turma é idosa");
     }
  }
}