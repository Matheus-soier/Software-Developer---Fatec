import java.util.Scanner;

public class exercicio26 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	double numero1, numero2, resultado;
	char calc;
	
	
	System.out.println("Digite um primeiro numero para ser calculado: ");
	numero1 = sc.nextDouble();
	System.out.println("Digite um segundo numero para ser calculado: ");
	numero2 = sc.nextDouble();
	sc.nextLine();
	do {
	System.out.println("Escolha se quer SOMAR, SUBTRAIR, MULTIPLICAR OU DIVIDIR os numeros: ");
	System.out.println("(+ para SOMAR / - para SUBTRAIR / * para MULTIPLICAR / para DIVIDIR)");
	calc = sc.nextLine().charAt(0);
	if(calc != '+' && calc != '-' && calc != '*' && calc != '/') {
		System.out.println("Valor digitado inválido!");
	}
	
	} while(calc != '+' && calc != '-' && calc != '*' && calc != '/');
	
	switch(calc) {
	case '+':
		resultado = numero1 + numero2;
		System.out.println("O resultado da soma é: " + resultado);
		break;
	case '-':
		resultado = numero1 - numero2;
		System.out.println("O resultado da subtração é: " + resultado);
		break;
	case '*':
		resultado = numero1 * numero2;
		System.out.println("O resultado da multiplicação é: " + resultado);
		break;
	case '/':
		if(numero2 != 0) {
			resultado = numero1 / numero2;
			System.out.println("O resultado da divisão é: " + resultado);
		} else {
			System.out.println("Não é possivel dividir um numero por 0!");
		}
		break;
	}
	sc.close();
	}
}