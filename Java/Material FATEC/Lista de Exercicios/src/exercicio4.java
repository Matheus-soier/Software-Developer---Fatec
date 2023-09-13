import java.util.Scanner;

public class exercicio4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nota1, nota2, mediaNota;

    System.out.println("Digite a primeira nota do aluno de 0 a 10: ");
    nota1 = sc.nextDouble();
    System.out.println("Digite a  segunda nota do aluno de 0 a 10: ");
    nota2 = sc.nextDouble();

    mediaNota = (nota1 + nota2) / 2;

    System.out.println("A média do aluno foi de: " + mediaNota + " pontos.");
    if (mediaNota >= 7 && mediaNota < 10) {
      System.out.println("APROVADO!");
    } else if (mediaNota < 7) {
      System.out.println("REPROVADO!");
    } else if (mediaNota == 10) {
      System.out.println("APROVADO COM DISTINÇÃO!");
    }

    sc.close();
  }
}
