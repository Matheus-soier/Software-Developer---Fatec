import java.util.Scanner;
import java.lang.Math;

public class exercicio2 {
  public static void main(String[] args) {
    double inputRaio, areaRaio, outputRaio, piValue = 3.1415;
		
		Scanner calcRaio = new Scanner(System.in);
		
		System.out.println("Insira um valor interiro para ser usado como raio de um circulo: ");
		inputRaio = calcRaio.nextInt();
		
		areaRaio = Math.pow(inputRaio, 3);
		outputRaio = piValue * areaRaio;
		
		System.out.println("O volume é de: " + outputRaio);
		
		calcRaio.close();
  }
}
