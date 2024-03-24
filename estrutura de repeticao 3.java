import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String nome, sexo, estadocivil;
      int idade, salario;
      sexo = "a";
      estadocivil = "b";
      System.out.print("Insira o nome do usuário: ");
      nome = input.nextLine();
      while (nome.length() <= 3){
        System.out.println("Nome inválido, insira o nome com mais de 3 caracteres : ");
      nome = input.nextLine();  
    } System.out.print("Insira a idade do usuário: ");
      idade = input.nextInt();
      while (idade <= 0 || idade >= 150){
      System.out.print("Idade inválida, insira uma idade entre 0 e 150 anos: ");
      idade = input.nextInt();  
    }  System.out.print("Insira o salário do usuário: ");
      salario = input.nextInt();
      while (salario <= 0){ 
      System.out.print("Salário inválido, insira um salário maior que 0: ");
      salario = input.nextInt(); 
    }  
      while(!sexo.equals("f") && !sexo.equals("m")){
          System.out.println("Insira um sexo valido entre f ou m:");
          sexo = input.next();
      }
      while(!estadocivil.equals("c") && !estadocivil.equals("v") && !estadocivil.equals("s") && !estadocivil.equals("d") ){
      System.out.println("Insira  apenas o caractere inicial do seu estado civil");
      estadocivil = input.next();

}
}
}