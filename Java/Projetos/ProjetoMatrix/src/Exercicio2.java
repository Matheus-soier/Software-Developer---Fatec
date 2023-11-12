import java.util.Scanner;
public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[3][4];
        int matrizImpar[][] = new int[3][4];
        int impares = 0;
        System.out.println("Preencha os espaços a seguir com valores inteiros: ");
        for(int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                System.out.printf("Insira o valor de [%d][%d]: ", linha+1, coluna+1);
                matriz[linha][coluna] = sc.nextInt();
                if(matriz[linha][coluna] % 2 != 0) {
                    matrizImpar[linha][coluna] = matriz[linha][coluna];
                    impares++;
                } else {
                    matrizImpar[linha][coluna] = 0;
                }
            }
        }
        for(int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 4; coluna++) {
                if(matrizImpar[linha][coluna] != 0) {
                    System.out.printf("Valor Ímpar: matriz[%d][%d] = " + matrizImpar[linha][coluna], linha+1, coluna+1);
                    System.out.println();
                }
            }
        }
        System.out.println("O total de numeros impares foi de: " + impares);
        sc.close();
    }
}
