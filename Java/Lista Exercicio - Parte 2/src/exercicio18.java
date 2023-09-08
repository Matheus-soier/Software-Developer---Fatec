import java.util.Scanner;

public class exercicio18 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double salario;
    int tempoTrab;

    System.out.println("Qual seu salário");
    salario = sc.nextDouble();
    System.out.println("Quantos anos na empresa? ");
    tempoTrab = sc.nextInt();

    if (tempoTrab >=5) {
        salario = salario * 0.2;
        System.out.println("Seu bonus é de: " + salario + " reais!");
    } else {
        salario = salario * 0.1;
        System.out.println("Seu bonus é de: " + salario + " reais!");
    }
    sc.close();    
   } 
}
