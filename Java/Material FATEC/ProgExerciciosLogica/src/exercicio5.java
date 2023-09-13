import java.util.Scanner;

public class exercicio5 {
  public static void main(String[] args) {
    double litrosGastos, distanciaTotal, consumoMedia;

    Scanner scConsumo = new Scanner(System.in);

    System.out.println("Digite a distancia total da viagem em KM: ");
    distanciaTotal = scConsumo.nextDouble();
    System.out.println("Digite quantos litros de combustivel foram gastos: ");
    litrosGastos = scConsumo.nextDouble();

    consumoMedia = litrosGastos / distanciaTotal;

    System.out.println("O consumo médio de litros por KM é de: " + consumoMedia);
    scConsumo.close();
  }
}
