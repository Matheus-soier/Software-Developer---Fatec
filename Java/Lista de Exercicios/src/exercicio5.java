import java.util.Scanner;

public class exercicio5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float n1,n2,n3;

    System.out.println("Digite o primeiro numero: ");
    n1 = sc.nextFloat();
    System.out.println("Digite o segundo numero: ");
    n2 = sc.nextFloat();
    System.out.println("Digite o terceiro numero: ");
    n3 = sc.nextFloat();

    if (n1 > n2 && n1 > n3){
      System.out.println("Maior numero foi: " + n1);
    } else if(n2 > n1 && n2 > n3) {
      System.out.println("Maior numero foi: " + n2);
    } else {
      System.out.println("Maior numero foi: " + n3);
    }

    sc.close();
  }
}
