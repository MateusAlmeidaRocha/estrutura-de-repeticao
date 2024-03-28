import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int n, maior, menor, soma;
     maior = 0;
     menor = 0;
     soma = 0;
     System.out.print("Digite a quantidade de números: ");
     n = input.nextInt();
     int[] numeros = new int[n];
     for (int i = 0; i < n; i++){
       System.out.print("Digite o " + (i+1) + "º número: ");
       numeros[i] = input.nextInt();
       if (i == 0){
         maior = numeros[i];
         menor = numeros[i];
       }
       if (numeros[i] > maior){
         maior = numeros[i];
       }
       if (numeros[i] < menor){
         menor = numeros[i];
       }
       soma += numeros[i];
     }
     System.out.println("O maior valor é " + maior);
     System.out.println("O menor valor é " + menor);
     System.out.println("A soma dos valores é " + soma);
  } 
}