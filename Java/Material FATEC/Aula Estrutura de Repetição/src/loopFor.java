import java.util.Scanner;

public class loopFor {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n=0, c , m=n;
        System.out.println("Digite um numero para ver seus multiplos: ");
        n = sc.nextInt();

        for (c=2; m<100; c++){
            System.out.println(m);
            m=c*n;
        }
        sc.close();
    }
}
