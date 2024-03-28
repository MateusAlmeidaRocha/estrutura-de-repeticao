public class Main {
  public static void main(String[] args) {
    int i;
    double preco;
    for(i=1;i<=50;i++){
      preco=i*1.99;
      System.out.printf("%d - R$ %.2f\n",i,preco);
    } 
  }
}