import java.util.Scanner;

public class TelaLogin {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        char ch;
        boolean login = false;

        do {
            System.out.println("Enter Username: ");
            String username = sc.nextLine();
            System.out.println("Enter password: ");
            String password = sc.nextLine();

            if (username.equalsIgnoreCase("Soier123") && password.equals("Senha123")) {
                System.out.println("Welcome user!");
                break;
            } else {
                System.out.println("Acess denied!");
            }
            System.out.println("Do you want to continue? (Y/N)");
            ch = sc.next().charAt(0);
            sc.nextLine();

            if (ch == 'n' || ch == 'N') {
                System.out.println("End login!");
            } else {
                login = true;
            }

        } while (login);
        sc.close();
    }
}
