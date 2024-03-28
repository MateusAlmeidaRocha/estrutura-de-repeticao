public class Main {
  public static void main(String[] args) {
    double preco = 0.18;
    for (int i = 1; i <= 50; i++){
      System.out.println(i + " - R$ " + preco);
      preco += 0.18;
    }
  }
}