import java.util.Scanner;
public class exercicio22 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int idade;

      System.out.println("Digite sua idade: ");
      idade = sc.nextInt();

      if(idade <= 10 && idade >= 0) {
        System.out.println("Sua idade é de: " + idade + " anos, o valor que deverá ser pago é de: R$30,00");
      } else if (idade > 10 && idade <= 29) {
         System.out.println("Sua idade é de: " + idade + " anos, o valor que deverá ser pago é de: R$60,00");
      } else if(idade > 29 && idade <= 45) {
         System.out.println("Sua idade é de: " + idade + " anos, o valor que deverá ser pago é de: R$120,00");
      } else if(idade > 45 && idade <= 59) {
         System.out.println("Sua idade é de: " + idade + " anos, o valor que deverá ser pago é de: R$150,00");
      } else if (idade > 59) {
         System.out.println("Sua idade é de: " + idade + " anos, o valor que deverá ser pago é de: R$300,00");
      } else if(idade < 0) {
        System.out.println("Idade inválida!");
      }
      
      sc.close();  
    }
}
