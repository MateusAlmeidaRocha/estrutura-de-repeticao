import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n1, n2;
    float x, pa;
    System.out.print("Digite o primeiro número: ");
    n1 = input.nextInt();
    System.out.print("Digite o segundo número: ");
    n2 = input.nextInt();
    if (n1 < n2){
     for (x = n1; x <= n2; x++){
       System.out.println(x);
     } pa = (n1+n2)*x/2 ;
       System.out.print("A soma dos números é: " + pa);

}
}
}