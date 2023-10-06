import java.util.Scanner;

public class eleiçãoArray {
    public static void main(String[] args) throws Exception {

		int[] candidatos = new int[5];
		String[] nomes = new String[5];
		nomes[0] = "KIM KATAGUIRI";
		nomes[1] = "RICARDO NUNES";
		nomes[2] = "GUILHERME BOULOS";
		nomes[3] = "MARCOS PONTES";
		nomes[4] = "TABATA AMARAL";
		int contador = 0, candidato = 1;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("CANDIDATOS PARA A ELEIÇÃO DE PREFEITURA DE SP \n\n1 - KIM KATAGUIRI \n2 - RICARDO NUNES \n3 - GUILHERME BOULOS \n4 - MARCOS PONTES \n5 - TABATA AMARAL\n");
		
		while(contador < 5) {
		System.out.println("Digite a quantidade de votos obtidos pelo candidato " + candidato + ": ");
		candidatos[contador] = sc.nextInt();
		System.out.println(candidatos[contador] + " votos para o candidato " + candidato+"\n");
		contador++;
		candidato++;
		}

		 candidato = 1;
		 
	        for (int i = 0; i < 5; i++) {
	            System.out.println(candidatos[i] + " Votos para o candidato " + nomes[i]);
	            candidato++;
	        }
        
		sc.close();
	
	}

}

