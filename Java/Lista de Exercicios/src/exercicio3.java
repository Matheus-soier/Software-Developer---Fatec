import java.util.Scanner;

public class exercicio3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char sexo;
    System.out.println("Digite seu sexo: (F / M)");
    sexo = sc.nextLine().charAt(0);
    if(sexo == 'M' || sexo == 'm'){
      System.out.println("Sexo Masculino");
    } else if(sexo == 'F' || sexo == 'f') {
      System.out.println("Sexo Feminino");
    } else {
      System.out.println("Sexo Invalido");
    }

    sc.close();
  }
}
