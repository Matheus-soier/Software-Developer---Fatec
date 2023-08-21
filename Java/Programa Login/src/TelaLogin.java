import java.util.Scanner;

public class TelaLogin {
    public static void main(String[] args) throws Exception {

        char ch;
        boolean login = false;

        do {
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Username: ");
            String username = sc.nextLine();
            System.out.println("Enter password: ");
            String password = sc.nextLine();

            if (username.equals("Soier123") && password.equals("Senha123")) {
                System.out.println("Welcome user!");
                break;
            } else {
                System.out.println("Acess denied!");
            }
            System.out.println("Do you want to continue? " + "Y for yes/ N for no");
            ch = sc.next().charAt(0);

            if (ch == 'n' || ch == 'N') {
                System.out.println("End login!");
            } else {
                login = true;
            }

        } while (login == true);
    }
}
