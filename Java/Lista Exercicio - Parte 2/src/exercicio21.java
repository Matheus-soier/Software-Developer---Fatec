import java.util.Scanner;
public class exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salarioBase = 1200, comissao, valorVendido;

        System.out.println("Qual o valor vendido este mês pelo funcionário? ");
        valorVendido = sc.nextDouble();
        
        comissao = valorVendido * 0.1;

        if(valorVendido >= 2000) {
            salarioBase = salarioBase + comissao;
            System.out.println("Seu salário será de: " + salarioBase + " reais!");
        } else {
            System.out.println("Seu salário será de: " + salarioBase + " reais!");
        }
        sc.close();
    }
}
