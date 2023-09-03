import java.util.Scanner;

public class exercicio11 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double nota1, nota2, mediaFinal;

    System.out.println("Digite a primeira Nota de 0 a 10: ");
    nota1 = sc.nextDouble();
    System.out.println("Digite a segunda nota de 0 a 10: ");
    nota2 = sc.nextDouble();

    mediaFinal = (nota1 + nota2) / 2;

    if(mediaFinal >= 0 && mediaFinal <= 10){
      if (mediaFinal >= 9 && mediaFinal <= 10) {
      System.out.println("Nota 1: " + nota1);
      System.out.println("Nota 2: " + nota2);
      System.out.println("Média Obtida: " + mediaFinal);
      System.out.println("Conceito A -> APROVADO");
    } else if (mediaFinal >= 7.5 && mediaFinal < 9) {
      System.out.println("Nota 1: " + nota1);
      System.out.println("Nota 2: " + nota2);
      System.out.println("Média Obtida: " + mediaFinal);
      System.out.println("Conceito B -> APROVADO");
    } else if (mediaFinal >= 6 && mediaFinal < 7.5) {
      System.out.println("Nota 1: " + nota1);
      System.out.println("Nota 2: " + nota2);
      System.out.println("Média Obtida: " + mediaFinal);
      System.out.println("Conceito C -> APROVADO");
    } else if (mediaFinal >= 4 && mediaFinal < 6) {
      System.out.println("Nota 1: " + nota1);
      System.out.println("Nota 2: " + nota2);
      System.out.println("Média Obtida: " + mediaFinal);
      System.out.println("Conceito D -> REPROVADO");
    } else if (mediaFinal >= 0 && mediaFinal < 4) {
      System.out.println("Nota 1: " + nota1);
      System.out.println("Nota 2: " + nota2);
      System.out.println("Média Obtida: " + mediaFinal);
      System.out.println("Conceito E -> REPROVADO");
    } 
} else {
  System.out.println("Você digitou notas inválidas!");
}
    sc.close();
  }
}
