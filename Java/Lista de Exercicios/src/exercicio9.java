import java.util.Scanner;

public class exercicio9 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double salBruto, salLiquido, salHoras, horasTrab, impostoRenda = 0, descontoInss, descontoFgts,
        descontoIr, totalDesconto;
    String porcIr = "";

    System.out.println("Digite quanto você ganha por hora trabalhada: ");
    salHoras = sc.nextDouble();
    System.out.println("Digite a quantidade de horas mensais trabalhadas: ");
    horasTrab = sc.nextDouble();

    salBruto = salHoras * horasTrab;

    if (salBruto <= 900) {
      impostoRenda = 1;
      porcIr = "0%";
    } else if (salBruto <= 1500) {
      impostoRenda = 0.95;
      porcIr = "5%";
    } else if (salBruto <= 2500) {
      impostoRenda = 0.90;
      porcIr = "10%";
    } else if (salBruto > 2500) {
      impostoRenda = 0.80;
      porcIr = "20%";
    }

    descontoIr = salBruto - (salBruto * impostoRenda);
    descontoFgts = salBruto - (salBruto * 0.89);
    descontoInss = salBruto - (salBruto * 0.90);

    totalDesconto = descontoInss + descontoIr;
    salLiquido = salBruto - totalDesconto;

    System.out.println("------------------------------------------------------------------------");
    System.out.println("Salário Bruto: (" + salHoras + " * " + horasTrab + "): " + "R$ " + salBruto);
    System.out.println("(-) IR (" + porcIr + ")                 : " + "R$ " + descontoIr);
    System.out.println("(-) INSS (10%)              : " + "R$ " + descontoInss);
    System.out.println("INSS (11%)                  : " + "R$ " + descontoFgts);
    System.out.println("Total de descontos          : " + "R$ " + totalDesconto);
    System.out.println("Salário Liquido             : " + "R$ " + salLiquido);
    System.out.println("------------------------------------------------------------------------");

    sc.close();
  }
}
