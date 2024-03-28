import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, i, menor, maior, soma;
        System.out.println("Digite o número de valores: ");
        n = input.nextInt();
        int[] vetor = new int[n];
        for (i = 0; i < n; i++) {
            System.out.println("Digite o valor " + (i + 1) + ": ");
            vetor[i] = input.nextInt();
        }
      while (vetor[i] < 0 || vetor[i] > 1000) {
      System.out.println("Valor inválido. Digite novamente: ");
      vetor[i] = input.nextInt();
        menor = vetor[0];
        for (i = 1; i < n; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        maior = vetor[0];
        for (i = 1; i < n; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        soma = 0;
        for (i = 0; i < n; i++) {
            soma = soma + vetor[i];
        }
        System.out.println("O menor valor é " + menor);
        System.out.println("O maior valor é " + maior);
        System.out.println("A soma dos valores é " + soma);
    }
}
}
