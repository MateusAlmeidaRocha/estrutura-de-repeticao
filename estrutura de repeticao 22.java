import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    int num, i, cont=0;
    System.out.println("Digite um número: ");
    num = input.nextInt();
    for(i=1; i<=num; i++){
      if(num%i==0){
        cont++;
        System.out.println(i);
      }
    }
    if(cont==2){
      System.out.println("O número é primo");
    }else{
      System.out.println("O número não é primo");
    }
    
  } 
}