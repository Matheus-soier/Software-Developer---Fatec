import java.util.Scanner;
public class exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorEmprestimo, salario, valorParcela, calcLiberar;
        int numeroParcela;
        
        System.out.println("Qual o valor de empréstimo? ");
        valorEmprestimo = sc.nextDouble();
        System.out.println("Quantas parcelas dejesa pagar o emprestimo? ");
        numeroParcela = sc.nextInt();
        System.out.println("Qual seu salário? ");
        salario = sc.nextDouble();

        valorParcela = valorEmprestimo / numeroParcela;
        calcLiberar = (valorParcela * 100) / salario;

        if(calcLiberar <= 30) {
            System.out.println("Empréstimo liberado!");
        } else {
            System.out.println("Emprestimo negado!");
        }
        
        sc.close();
    }
}
