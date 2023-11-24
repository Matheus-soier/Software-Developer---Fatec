import java.util.Scanner;
public class ExercicioProva1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String matriz[][] = new String[10][4];
        char produto;

        System.out.println("DIGITE OS DADOS DE 10 MEDICAMENTOS:");
    for (int linha = 0; linha < 2; linha++) {
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
    for (int linha = 0; linha < 2; linha++) {
        System.out.printf("Produto " + linha + ": " + matriz[linha][1]+"\n");
    }

        System.out.println("\nDigite o número do produto que deseja comprar: (0 a 9)");
        produto = sc.nextLine().charAt(0);
    sc.close();
         }
}
