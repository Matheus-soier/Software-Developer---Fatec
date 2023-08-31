import java.util.Scanner;

public class exercicio3 {
 public static void main(String[] args) {
  double n1, n2, mediaTotal;
	
	Scanner calcMedia = new Scanner(System.in);
	
	System.out.println("Digite a primeira nota: ");
	n1 = calcMedia.nextDouble();
	
	System.out.println("Digite a segunda nota: ");
	n2 = calcMedia.nextDouble();
	
	mediaTotal = ((n1 * 2.5) + (n2 * 4.5)) / 2;
	
	System.out.println("A média das notas acima é igual a: " + mediaTotal);
	calcMedia.close();	 
 } 
}
