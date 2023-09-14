import java.util.Scanner;

public class exercicio27 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char sexo;
		double altura, pesoIdeal;
		
		System.out.println("Qual seu sexo? ");
		System.out.println("(M para Masculino / F para Feminino)");
		sexo = sc.nextLine().charAt(0);
		System.out.println("Digite sua altura em metros: ");
		altura = sc.nextDouble();
		
		if(sexo == 'M' || sexo == 'm') {
			pesoIdeal = (72.7 * altura) - 58;
			System.out.println("Seu peso ideal é: " + pesoIdeal + " kilos");
		} else if(sexo == 'F' || sexo == 'f') {
			pesoIdeal = (62.1 * altura) - 44.7;
			System.out.println("Seu peso ideal é: " + pesoIdeal + " kilos");
		} else {
			System.out.println("Valor inválido!");
		}
		
		
		sc.close();
		
	}

}