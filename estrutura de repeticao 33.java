import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int temperatura = 0;
     int menorTemperatura = 0;
     int maiorTemperatura = 0;
     int somaTemperatura = 0;
     int contador = 0;
     double mediaTemperatura = 0;
     System.out.println("Digite a temperatura: ");
     temperatura = input.nextInt();
     menorTemperatura = temperatura;
     maiorTemperatura = temperatura;
     somaTemperatura = temperatura;
     contador = 1;
     while (temperatura != -1){
       System.out.println("Digite a temperatura: ");
       temperatura = input.nextInt();
     }
     if (temperatura < menorTemperatura){
       menorTemperatura = temperatura;
     }
     if (temperatura > maiorTemperatura){
       maiorTemperatura = temperatura;
     }
     somaTemperatura = somaTemperatura + temperatura;
     contador = contador + 1;
     mediaTemperatura = somaTemperatura / contador;
     System.out.println("A menor temperatura é: " + menorTemperatura);
     System.out.println("A maior temperatura é: " + maiorTemperatura);
     System.out.println("A média das temperaturas é: " + mediaTemperatura);
  }

}