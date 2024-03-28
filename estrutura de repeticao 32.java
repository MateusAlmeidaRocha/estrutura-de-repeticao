public class Main {
  public static void main(String[] args) {
    System.out.println("Dê um número inteiro para calcular o fatorial:");
    int numero = new java.util.Scanner(System.in).nextInt();
    int fatorial = 1;

    for(int i = 1; i <= numero; i++){
      fatorial = fatorial * i;
    }
    System.out.println("Fatorial de: " + numero);
    System.out.println(numero + "! = " + fatorial);
  }
}