import java.util.Scanner;
public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float notasAluno[][] = new float[5][4];
        int aprovados=0, reprovados=0;
     
        System.out.println("Digite as notas tiradas pelos alunos: ");

        for(int linha = 0; linha < 5; linha++){
            for(int coluna = 0; coluna < 4; coluna++)  {
                System.out.printf("Digite a nota do aluno [%d][%d]: ", linha+1, coluna+1);
                notasAluno[linha][coluna] = sc.nextFloat();
            }
        }

        System.out.println("\nA nota dos alunos ficou: \n");
        for(int linha = 0; linha < 5; linha++) {
            for(int coluna = 0; coluna < 4; coluna++) {
                System.out.printf("\t %.2f \t", notasAluno[linha][coluna]);
                if(notasAluno[linha][coluna] < 7) {
                    reprovados++;
                } else {
                    aprovados++;
                }
            }
            System.out.println();
        }

        System.out.println("\nNesta lista de notas tivemos:\n" + aprovados + " alunos aprovados\n" + reprovados + " alunos reprovados");

        sc.close();
    }
}
