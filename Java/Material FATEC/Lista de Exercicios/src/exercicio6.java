import java.util.Scanner;

public class exercicio6 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float n1, n2, n3;

    System.out.println("Digite o primeiro numero: ");
    n1 = sc.nextFloat();
    System.out.println("Digite o segundo numero: ");
    n2 = sc.nextFloat();
    System.out.println("Digite o terceiro numero: ");
    n3 = sc.nextFloat();

    if (n1 > n2 && n1 > n3) {
      if (n2 > n3) {
        System.out.println(n1 + " é o maior e " + n3 + " é o menor!");
      } else {
        System.out.println(n1 + " é o maior e " + n2 + " é o menor!");
      }
    } else if (n2 > n3 && n2 > n1) {
      if (n1 > n3) {
        System.out.println(n2 + " é o maior e " + n3 + " é o menor!");
      } else {
        System.out.println(n2 + " é o maior e " + n1 + " é o menor!");
      }
    } else if (n3 > n1 && n3 > n2) {
      if (n1 > n2) {
        System.out.println(n3 + " é o maior e " + n2 + " é o menor!");
      } else {
        System.out.println(n3 + " é o maior e " + n1 + " é o menor!");
      }
    } else if (n1 == n2 && n2 == n3) {
      System.out.println("Todos os numeros são iguais!");
    }
    sc.close();
  }
}
