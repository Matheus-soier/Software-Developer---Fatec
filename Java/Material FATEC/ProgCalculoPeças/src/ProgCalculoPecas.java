import java.util.Scanner;

public class ProgCalculoPecas {
    public static void main(String[] args) throws Exception {

        int codigoPeca = 100110;
        int quantidadePeca;
        double valorPeca = 28.50;
        double resultadoFinal;

        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o código da peça quer consultar: ");
        int inputCodigo = sc.nextInt();

        if (inputCodigo == codigoPeca) {
            System.out.println("Qual a quantidade de peças? ");
            quantidadePeca = sc.nextInt();
            resultadoFinal = quantidadePeca * valorPeca;
            System.out.println("O valor total é igual a: " + resultadoFinal + " Reais.");
        } else {
            System.out.println("Código inválido!");
        }
        sc.close();
    }
}
