import java.util.Scanner;

public class exercicio7 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double preco1, preco2, preco3;

    System.out.println("Digite o preço do primeiro produto: ");
    preco1 = sc.nextDouble();
    System.out.println("Digite o preço do segundo produto: ");
    preco2 = sc.nextDouble();
    System.out.println("Digite o preço do terceiro produto: ");
    preco3 = sc.nextDouble();

    if (preco1 < preco2 && preco1 < preco3) {
      System.out.println("Compre o primeiro produto, valor: " + preco1 + " reais!");
    } else if (preco2 < preco1 && preco2 < preco3) {
      System.out.println("Compre o segundo produto, valor: " + preco2 + " reais!");
    } else {
      System.out.println("Compre o terceiro produto, valor: " + preco3 + " reais!");
    }

    sc.close();
  }
}
