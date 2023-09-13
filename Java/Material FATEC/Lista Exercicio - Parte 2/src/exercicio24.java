import java.util.Scanner;
public class exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario;

        System.out.println("Digite seu salário: ");
        salario = sc.nextDouble();

        if(salario <= 600) {
            System.out.println("Isento de INSS");
        } else if(salario >= 600 && salario <= 1200) {
            salario = salario * 0.2;
            System.out.println("O desconto do INSS é de: " + salario);
        } else if(salario > 1200 && salario <= 2000) {
            salario = salario * 0.25;
            System.out.println("O desconto do INSS é de: " + salario);
        } else if(salario > 2000) {
            salario = salario * 0.30;
            System.out.println("O desconto do INSS é de: " + salario);
        }
        sc.close();

    }
}
