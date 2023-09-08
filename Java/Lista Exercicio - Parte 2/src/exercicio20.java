import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo;

        System.out.println("Digite o código do produto entre 1 e 10: ");
        codigo = sc.nextInt();

        if(codigo == 1) {
            System.out.println("numeroParcela");
        } else if (codigo == 2 || codigo == 2 || codigo == 3) {
            System.out.println("Alimento perecível");
        } else if (codigo == 5 || codigo == 6) {
            System.out.println("Vestuário");
        } else if (codigo == 7) {
            System.out.println("Higiene pessoal");
        } else if (codigo == 8 || codigo == 9 || codigo == 10) {
            System.out.println("Utensilios domésticos");
        } else {
            System.out.println("Código Inválido!");
        }
        
        sc.close();
    }
}
