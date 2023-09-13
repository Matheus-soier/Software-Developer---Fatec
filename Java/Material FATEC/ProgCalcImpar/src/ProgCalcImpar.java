import java.util.Scanner;

public class ProgCalcImpar {
    public static void main(String[] args) throws Exception {
        int n1, n2, n3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = sc.nextInt();
        System.out.println("Digite o terceiro numero: ");
        n3 = sc.nextInt();

        if (n1 > n2 && n1 > n3) {
            if (n2 < n1 && n2 > n3) {
                System.out.println("Primeiro Lugar: " + n3 + " segundo Lugar: " + n2 + " terceiro lugar: " + n1);
            } else {
                System.out.println("Primeiro Lugar: " + n2 + " segundo Lugar: " + n3 + " terceiro lugar: " + n1);
            }
        } else if (n2 > n1 && n2 > n3) {
            if (n1 > n3) {
                System.out.println("Primeiro Lugar: " + n3 + " segundo Lugar: " + n1 + " terceiro lugar: " + n2);
            } else {
                System.out.println("Primeiro Lugar: " + n1 + " segundo Lugar: " + n3 + " terceiro lugar: " + n2);
            }
        } else if (n3 > n1 && n3 > n2) {
            if (n1 > n2) {
                System.out.println("Primeiro Lugar: " + n2 + " segundo Lugar: " + n1 + " terceiro lugar: " + n3);
            } else {
                System.out.println("Primeiro Lugar: " + n1 + " segundo Lugar: " + n2 + " terceiro lugar: " + n3);
            }
        } else if (n1 == n2 && n2 == n3) {
            System.out.println("Primeiro Lugar: " + n2 + " segundo Lugar: " + n3 + " terceiro lugar: " + n1);
        }
        sc.close();
    }
}
