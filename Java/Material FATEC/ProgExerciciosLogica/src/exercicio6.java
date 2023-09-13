import java.util.Scanner;

public class exercicio6 {
  public static void main(String[] args) {
    double celsiusCalc, fahrenheitValue;

    Scanner temperatura = new Scanner(System.in);

    System.out.println("Digite uma temperatura em Fahrenheit: ");
    fahrenheitValue = temperatura.nextDouble();

    celsiusCalc = (fahrenheitValue - 32) * 5 / 9;

    System.out.println("O valor de " + fahrenheitValue + " Fahrenheit é igual a: " + celsiusCalc + " graus Celsius.");
    temperatura.close();
  }
}
