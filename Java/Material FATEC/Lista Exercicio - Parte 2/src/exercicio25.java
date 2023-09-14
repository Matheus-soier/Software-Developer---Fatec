import java.util.Scanner;

public class exercicio25 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade=0, maiorIdade=0, menorIdade=0, contagem=1;
		double media=0;
		
		while(contagem<=10) {
			System.out.println("Qual a idade do aluno "+ contagem + "? ");
			idade = sc.nextInt();
			
			if(idade >= 16) {
				maiorIdade++;
			} else {
				menorIdade++;
				media+=idade;
			}
			contagem++;
		}
		
		media = media / menorIdade;
		
		System.out.println("Alunos que podem votar: " + maiorIdade);
		System.out.println("Alunos que não podem votar: " + menorIdade);
		System.out.println("A media de idade dos alunos que não podem votar: " + media);
		sc.close();

	}

}