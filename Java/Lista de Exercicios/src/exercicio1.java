import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        float n1, n2;

        System.out.println("Digite o primeiro numero: ");
        n1 = sc.nextFloat();
        System.out.println("Digite o segundo numero: ");
        n2 = sc.nextFloat();

        if(n1 > n2) {
            System.out.println(n1 + " é maior que " + n2);
        } else {
            System.out.println(n2 + " é maior que " + n1);
        }
        sc.close();    
    }
}
