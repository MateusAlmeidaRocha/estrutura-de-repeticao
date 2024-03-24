import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String nome, senha;
      System.out.println("Digite o nome de usuário: ");
      nome = input.nextLine();
      System.out.println("Digite a senha: ");
      senha = input.nextLine();
      if(nome.equals(senha)){
        System.out.println("Erro! A senha não pode ser igual ao nome de usuário.");
      }
  }
}