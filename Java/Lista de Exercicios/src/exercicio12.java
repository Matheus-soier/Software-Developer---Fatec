import java.util.Scanner;

public class exercicio12 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numero, quantidadeDeDigitos = 0, calcCentena, calcDezena, calcUnidade;

    System.out.println("Digite um numero entre 0 e 1000: ");
    numero = sc.nextInt();

    int numeroCalc = numero;

    if (numero > 0 && numero < 1000) {
      while (numero != 0) {
        numero = numero / 10;
        quantidadeDeDigitos++;
      }
      if (quantidadeDeDigitos == 3) {
        calcCentena = numeroCalc / 100;
        calcDezena = (numeroCalc - (calcCentena * 100)) / 10;
        calcUnidade = (numeroCalc - (calcCentena * 100)) - (calcDezena * 10);
        System.out.println("O numero " + numeroCalc + " tem: " + calcCentena + " centenas, " + calcDezena
            + " dezenas e " + calcUnidade + " unidades.");
      } else if(quantidadeDeDigitos == 2) {
        calcDezena = numeroCalc / 10;
        calcUnidade = numeroCalc - (calcDezena * 10);
        System.out.println("O numero " + numeroCalc + " tem: " + calcDezena + " dezenas e " + calcUnidade + " unidades.");
      } else if (quantidadeDeDigitos == 1) {
        calcUnidade = numeroCalc;
        System.out.println("O numero " + numeroCalc + " tem: " + calcUnidade + " unidades.");
      }
    } else {
      System.out.println("Numero Inválido");
    }

    sc.close();
  }
}
