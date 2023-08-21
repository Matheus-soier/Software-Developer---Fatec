import java.util.Scanner;

public class progImc {
    public static void main(String[] args) throws Exception {
        Scanner calculoImc = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        float fltAltura = calculoImc.nextFloat();
        System.out.println("Digite a seu peso: ");
        float fltPeso = calculoImc.nextFloat();

        float resultadoImc = fltPeso / (fltAltura * fltAltura);

        if (resultadoImc >= 18.5 && resultadoImc <= 25) {
            System.out.println("Você está no peso ideal, seu IMC é de: " + resultadoImc);
        } else {
            System.out.println("Você não está no peso ideal, seu IMC é de: " + resultadoImc);
        }
        calculoImc.close();
    }
}
