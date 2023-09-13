import java.util.Scanner;
public class exercicio23 {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double peso, altura, imc;

    System.out.println("Digite seu  peso em KG: ");
    peso = sc.nextDouble();
    System.out.println("Digite sua altura em M: ");
    altura = sc.nextDouble();

    imc = peso / (altura * altura);

    if (imc < 18.5) {
System.out.println("Abaixo do Peso");
    } else if (imc >= 18.5 && imc <= 25) {
        System.out.println("Saudável");
    } else if(imc > 25 && imc <= 30) {
        System.out.println("Peso em excesso");
    } else if(imc > 30 && imc <= 35) {
        System.out.println("Obesidade Grau 1");
    } else if(imc > 35 && imc < 40) {
        System.out.println("Obesidade Grau 2 (severa)");
    } else if(imc >= 40 ) {
        System.out.println("Obesidade Grau 3 (mórbida)");
    }
    sc.close();
   } 
}
