import java.util.Scanner;
public class ExercicioProva2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matriz[][] = new String[10][4];
        int produto;

        System.out.println("DIGITE OS DADOS DE 10 MEDICAMENTOS:");
        for (int linha = 0; linha < 10; linha++) {
            System.out.printf("Digite o ID do produto [%s][1]: ", linha+1);
            matriz[linha][0] = sc.nextLine();
            System.out.printf("Digite o nome do produto [%s][2]: ", linha+1);
            matriz[linha][1] = sc.nextLine();
            System.out.printf("Digite o fabricante do produto [%s][3]: ", linha+1);
            matriz[linha][2] = sc.nextLine();
            System.out.printf("Digite o valor do produto [%s][4]: ", linha+1);
            matriz[linha][3] = sc.nextLine();
        }

        System.out.println("\nEscolha o produto a ser comprado: ");
        for (int linha = 0; linha < 10; linha++) {
            System.out.printf("Produto " + linha + ": " + matriz[linha][1]+"\n");
        }

        System.out.println("\nDigite o número do produto que deseja comprar: (0 a 9)");
        produto = sc.nextInt();

        if (produto == 0) {
            System.out.printf("Produto Escolhido: " + matriz[0][1]);
            System.out.printf("\nTotal a ser pago: " + matriz[0][3]);
        } else if (produto == 1) {
            System.out.printf("Produto Escolhido: " + matriz[1][1]);
            System.out.printf("\nTotal a ser pago: " + matriz[1][3]);
        } else if (produto == 2) {
            System.out.printf("Produto Escolhido: " + matriz[2][1]);
            System.out.printf("\nTotal a ser pago: " + matriz[2][3]);
        } else if (produto == 3) {
            System.out.printf("Produto Escolhido: " + matriz[3][1]);
            System.out.printf("\nTotal a ser pago: " + matriz[3][3]);
        } else if (produto == 4) {
            System.out.printf("Produto Escolhido: " + matriz[3][1]);
            System.out.printf("\nTotal a ser pago: " + matriz[4][3]);
        } else if (produto==5) {
            System.out.printf("Produto Escolhido: " + matriz[3][1]);
            System.out.printf("\nTotal a ser pago: " + matriz[5][3]);
        } else if (produto==6) {
            System.out.printf("Produto Escolhido: " + matriz[3][1]);
            System.out.printf("\nTotal a ser pago: " + matriz[6][3]);
        }else if (produto==7) {
            System.out.printf("Produto Escolhido: " + matriz[3][1]);
            System.out.printf("\nTotal a ser pago: " + matriz[7][3]);
        }else if (produto==8) {
            System.out.printf("Produto Escolhido: " + matriz[3][1]);
            System.out.printf("\nTotal a ser pago: " + matriz[8][3]);
        }else if (produto==9) {
            System.out.printf("Produto Escolhido: " + matriz[3][1]);
            System.out.printf("\nTotal a ser pago: " + matriz[9][3]);
        }
        sc.close();
    }
}
