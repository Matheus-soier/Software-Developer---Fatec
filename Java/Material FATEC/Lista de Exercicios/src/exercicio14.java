import java.util.Scanner;

public class exercicio14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char resp1, resp2, resp3, resp4, resp5;
    int julgamento = 0;

    do {
      System.out.println("Telefone tocou para a Vitima? ");
      System.out.println("(S para sim / N para não)");
      resp1 = sc.nextLine().charAt(0);
    } while (resp1 != 'S' && resp1 != 's' && resp1 != 'N' && resp1 != 'n');
    if (resp1 == 'S' || resp1 == 's') {
      julgamento++;
    }

    do {
      System.out.println("Esteve no local do crime? ");
      System.out.println("(S para sim / N para não)");
      resp2 = sc.nextLine().charAt(0);
    } while (resp2 != 'S' && resp2 != 's' && resp2 != 'N' && resp2 != 'n');
    if (resp2 == 'S' || resp2 == 's') {
      julgamento++;
    }

    do {
      System.out.println("Mora perto da vitima? ");
      System.out.println("(S para sim / N para não)");
      resp3 = sc.nextLine().charAt(0);
    } while (resp3 != 'S' && resp3 != 's' && resp3 != 'N' && resp3 != 'n');
    if (resp3 == 'S' || resp3 == 's') {
      julgamento++;
    }

    do {
      System.out.println("Devia para a vitima? ");
      System.out.println("(S para sim / N para não)");
      resp4 = sc.nextLine().charAt(0);
    } while (resp4 != 'S' && resp4 != 's' && resp4 != 'N' && resp4 != 'n');
    if (resp4 == 'S' || resp4 == 's') {
      julgamento++;
    }

    do {
      System.out.println("Já trabalhou com a vitima? ");
      System.out.println("(S para sim / N para não)");
      resp5 = sc.nextLine().charAt(0);
    } while (resp5 != 'S' && resp5 != 's' && resp5 != 'N' && resp5 != 'n');
    if (resp5 == 'S' || resp5 == 's') {
      julgamento++;
    }

    switch (julgamento) {
      case 0:
        System.out.println("Você não é suspeito!");
        break;
      case 1:
        System.out.println("Você não é suspeito!");
        break;
      case 2:
        System.out.println("Você é suspeito!");
        break;
      case 3:
        System.out.println("Você é Cumplice!");
        break;
      case 4:
        System.out.println("Você é Cumplice!");
        break;
      case 5:
        System.out.println("Você é o Assassino!");
        break;
    }
    sc.close();
  }
}
