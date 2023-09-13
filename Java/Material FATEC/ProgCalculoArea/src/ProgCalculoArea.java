import java.util.Scanner;

public class ProgCalculoArea {
    public static void main(String[] args) throws Exception {
        double raio, area;
        final double pi = 3.1415;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2);
        System.out.println("O valor da area é: " + area);
        sc.close();
    }
}
