import java.util.Scanner;
public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[3][3];
        int soma;

        System.out.println("Digite números inteiros para ser somado a diagonal: ");
        for (int linha = 0; linha < 3; linha++) {
            for(int coluna = 0; coluna < 3; coluna++) {
                System.out.printf("Insite o valor de [%d][%d]: ", linha+1, coluna+1);
                matriz[linha][coluna] = sc.nextInt();
            }
        }

        soma = matriz[0][0] + matriz[1][1] + matriz[2][2];
        System.out.println("O resultado da soma: "+soma);

        sc.close();
    }
}
