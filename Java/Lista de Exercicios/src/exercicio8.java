import java.util.Scanner;

public class exercicio8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char turno;

    System.out.println("Qual seu turno de estudos: ");
    System.out.println("(V para Vespertino)");
    System.out.println("(M para Matutino)");
    System.out.println("(N para Noturno)");
    turno = sc.nextLine().charAt(0);

    if (turno == 'V' || turno == 'v') {
      System.out.println("Bom dia!");
    } else if (turno == 'M' || turno == 'm') {
      System.out.println("Boa tarde!");
    } else if (turno == 'N' || turno == 'n') {
      System.out.println("Boa noite!");
    } else {
      System.out.println("Valor Inválido!");
    }

    sc.close();
  }
}
