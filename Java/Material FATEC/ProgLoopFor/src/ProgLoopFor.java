import java.util.Scanner;

public class ProgLoopFor {
    public static void main(String[] args) throws Exception {
        String nome, nomeGeral = "";
        char sexo;
        int i, sexoM = 0, sexoF = 0;
        float salarioTotal = 0, salario;

        Scanner sc = new Scanner(System.in);

        for (i = 0; i <= 4; i++) {
            System.out.println("Digite um nome: ");
            nome = sc.next();

            // System.out.println("Qual a idade? ");
            // idade = sc.nextInt();

            System.out.println("Qual o sexo? (M para Masculino/ F para Feminino");
            sexo = sc.next().charAt(0);

            System.out.println("Qual o salário? ");
            salario = sc.nextFloat();
            sc.close();

            salarioTotal = salarioTotal + salario;
            nomeGeral = nomeGeral + nome;

            if (sexo == 'M' || sexo == 'm') {
                sexoM++;
            } else {
                sexoF++;
            }
        }

        System.out.println("Tivemos " + sexoM + " homens e " + sexoF + " mulheres.");
        System.out.println("O salário Total dos entrevistados foi de: " + salarioTotal + "reais.");
    }
}
