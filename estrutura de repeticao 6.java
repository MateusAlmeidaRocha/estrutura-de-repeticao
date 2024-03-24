import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int i = 1;
    while (i <= 20){
      System.out.println(i);
      i++;
    }
    System.out.println(" ");
    for (int j = 1; j <= 20; j++){
      System.out.print(j + " ");
    }
  } 
}