import java.util.Scanner;

public class ProgCondicional {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma idade: ");
        int idade = sc.nextInt();

        if (idade >= 18 && idade < 70) {
            System.out.println("Você é um adulto!");
        } else if (idade >= 70 && idade < 100) {
            System.out.println("Você é um idoso!");
        } else if (idade >= 14 && idade < 18) {
            System.out.println("Você é um adolescente!");
        } else if (idade > 0 && idade < 14) {
            System.out.println("Você é uma criança!");
        } else if (idade >= 100 && idade <= 120) {
            System.out.println("Você é um idoso!");
            System.out.println("Chegou a idade Centenária");
        } else {
            System.out.println("Idade Inválida");
        }

        sc.close();
    }
}
