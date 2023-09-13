import java.util.Scanner;

public class exercicio4 {
  public static void main(String[] args) {
    double n1, n2, mediaTotal;
		
		Scanner calcMedia = new Scanner(System.in);
		System.out.println("Digite o valor da média 1: ");
		n1=calcMedia.nextDouble();
		System.out.println("Digite o valor da média 2: ");
		n2=calcMedia.nextDouble();
		
		mediaTotal = (n1 + n2) / 2;
		
		System.out.println("O valor da média é igual a: " + mediaTotal);
		calcMedia.close();
  }  
}
