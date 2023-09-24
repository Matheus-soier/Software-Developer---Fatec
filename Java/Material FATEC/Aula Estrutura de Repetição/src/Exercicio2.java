//EXERCICIO COM -> WHILE

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float n1, n2, n3, contador=1, media;
    
        while (contador <= 3) {
            System.out.println("Digite a nota do aluno " + contador);
            System.out.println("Digite a primeira nota: ");
            n1 = sc.nextFloat();
            System.out.println("Digite a segunda nota: ");
            n2 = sc.nextFloat();
            System.out.println("Digite a terceira nota: ");
            n3 = sc.nextFloat();

            media = (n1 + n2 + n3) / 3;
            System.out.println("A média do aluno "  + contador + " é igual a: " + media);
            contador++;
        }
        sc.close();
    }
}
