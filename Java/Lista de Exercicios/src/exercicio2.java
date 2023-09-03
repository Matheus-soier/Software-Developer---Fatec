import java.util.Scanner;

public class exercicio2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n1;
    System.out.println("Digite qualquer numero: ");
    n1 = sc.nextDouble();
    if(n1 > 0) {
      System.out.println("Este é um numero positivo!");
    } else {
      System.out.println("Este é um numero negativo!");
    }
    sc.close();
  }
}
