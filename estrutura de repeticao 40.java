public class Main {
  public static void main(String[] args) {
    int codigo;
    int veiculos;
    int acidentes;
    int maiorIndice = 0;
    int menorIndice = 0;
    int somaVeiculos = 0;
    int somaAcidentes = 0;
    int contador = 0;
    int mediaVeiculos = 0;
    int mediaAcidentes = 0;
    for (int i = 0; i < 5; i++){
      System.out.println("Digite o código da cidade: ");
      codigo = Integer.parseInt(System.console().readLine());
      System.out.println("Digite o número de veículos de passeio: ");
      veiculos = Integer.parseInt(System.console().readLine());
      System.out.println("Digite o número de acidentes de trânsito com vítimas: ");
      acidentes = Integer.parseInt(System.console().readLine());
      if (i == 0){
        maiorIndice = acidentes;
        menorIndice = acidentes;
      }
      if (acidentes > maiorIndice){
        maiorIndice = acidentes;
      }
      if (acidentes < menorIndice){
        menorIndice = acidentes;
      }
      somaVeiculos += veiculos;
      if (veiculos < 2000){
        somaAcidentes += acidentes;
        contador++;
      }
    }
    mediaVeiculos = somaVeiculos / 5;
    mediaAcidentes = somaAcidentes / contador;
    System.out.println("O maior índice de acidentes de trânsito é: " + maiorIndice);
    System.out.println("O menor índice de acidentes de trânsito é: " + menorIndice);
    System.out.println("A média de veículos nas cinco cidades juntas é: " + mediaVeiculos);
    System.out.println("A média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio é: " + mediaAcidentes);
  }
}