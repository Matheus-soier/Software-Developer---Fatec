import java.util.Scanner;

public class ProjetoIntegrador {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String user, password, verifPassword;
        
            System.out.println("");
            System.out.println("|----------------------|");
            System.out.println("|----CRIE SUA CONTA----|");
            System.out.println("|----------------------|");
            System.out.println("");
            do {
            System.out.println("Crie um Usuário: ");
            user = sc.nextLine();
            System.out.println("");
            System.out.println("Crie uma Senha: ");
            password = sc.nextLine();
            System.out.println("");
            System.out.println("Confirme sua Senha: ");
            verifPassword = sc.nextLine();
            System.out.println("");
            if(!password.equals(verifPassword)) {
                System.out.println("Você digitou senhas diferentes!");
            }
            if(user.isEmpty() || password.isEmpty() || verifPassword.isEmpty()){
                System.out.println("Preencha todos os campos!");
            }
        } while(!password.equals(verifPassword) || user.isEmpty() || password.isEmpty() || verifPassword.isEmpty());
        System.out.println("Usuário Criado com Sucesso!");

        sc.close();
    }
}
