import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    double salario, aumento;
    int ano;
    System.out.println("Digite o ano: ");
    ano = teclado.nextInt();
    System.out.println("Digite o salário: ");
    salario = teclado.nextDouble();
    if (ano == 1995){
      System.out.println("Salário atual: R$ " + salario);
    }
    else{
      if (ano > 1995 && ano < 1997){
        aumento = salario * 1.5 / 100;
        salario = salario + aumento;
        System.out.println("Salário atual: R$ " + salario);
      }
      }
      for (int i = 1997; i <= ano; i++){
        aumento = salario * 2 / 100;
        salario = salario + aumento;
      }
      System.out.println("Salário atual: R$ " + salario);
    }
  }

  
