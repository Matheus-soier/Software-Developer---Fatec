import java.util.Scanner;

public class exercicio15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double gasolinaPreco = 2.5, alcoolPreco = 1.9, quantidadecliente, precoTotal;
    char opcao;

    do {
      System.out.println("Você deseja abastecer com alcool ou gasolina? ");
      System.out.println("(A para Alcool / G para Gasolina)");
      opcao = sc.nextLine().charAt(0);
    } while (opcao != 'G' && opcao != 'g' && opcao != 'A' && opcao != 'a');

    if (opcao == 'A' || opcao == 'a') {
      System.out.println("Quantos litros você deseja abastecer de Alcool? ");
      quantidadecliente = sc.nextDouble();

      if (quantidadecliente <= 20) {
        precoTotal = quantidadecliente * alcoolPreco * 0.97;
        System.out.println("Valor final para " + quantidadecliente + " Litros é de: " + precoTotal + " Reais!");
      } else {
        precoTotal = quantidadecliente * alcoolPreco * 0.95;
        System.out.println("Valor final para " + quantidadecliente + " Litros é de: " + precoTotal + " Reais!");
      }
    } else {
      System.out.println("Quantos litros você deseja abastecer de Gasolina? ");
      quantidadecliente = sc.nextDouble();

      if (quantidadecliente <= 20) {
        precoTotal = quantidadecliente * gasolinaPreco * 0.96;
        System.out.println("Valor final para " + quantidadecliente + " Litros é de: " + precoTotal + " Reais!");
      } else {
        precoTotal = quantidadecliente * gasolinaPreco * 0.94;
        System.out.println("Valor final para " + quantidadecliente + " Litros é de: " + precoTotal + " Reais!");
      }
    }

    sc.close();
  }
}
