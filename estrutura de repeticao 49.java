public class Main {
  public static void main(String[] args) {
    int n = 5;
    int m = 1;
    double soma = 0;
    for (int i = 1; i <= n; i++){
      soma += i/m;
      m += 2;
    }
    System.out.println(soma);
  }
}