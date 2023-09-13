import java.util.Scanner;

public class exercicio13 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        
        int valorSaque;
      
        do {
            System.out.print("Digite o valor do saque (entre 10 e 600 reais): ");
            valorSaque = scanner.nextInt();
        } while (valorSaque < 10 || valorSaque > 600);
        
        int notas100 = valorSaque / 100;
        valorSaque %= 100;
        
        int notas50 = valorSaque / 50;
        valorSaque %= 50;
        
        int notas10 = valorSaque / 10;
        valorSaque %= 10;
        
        int notas5 = valorSaque / 5;
        valorSaque %= 5;
        
        int notas1 = valorSaque;
        
        System.out.println("Notas a serem fornecidas:");
        if (notas100 > 0) {
            System.out.println(notas100 + " nota(s) de 100 reais");
        }
        if (notas50 > 0) {
            System.out.println(notas50 + " nota(s) de 50 reais");
        }
        if (notas10 > 0) {
            System.out.println(notas10 + " nota(s) de 10 reais");
        }
        if (notas5 > 0) {
            System.out.println(notas5 + " nota(s) de 5 reais");
        }
        if (notas1 > 0) {
            System.out.println(notas1 + " nota(s) de 1 real");
        }
        
        scanner.close();
  }
}

