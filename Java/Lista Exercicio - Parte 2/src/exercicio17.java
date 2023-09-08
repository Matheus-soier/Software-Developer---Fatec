import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorTotal, qntCarne = 0;
        char carne, cartao;
        boolean cartaoLoja = false;
do {
        System.out.println("Bem vindo ao açougue do mercado Tabajara!");
        System.out.println("Hoje temos Bisteca, Picanha e Coxa de Frango!");
        System.out.println("Bisteca (kg) - R$12,5");
        System.out.println("Picanha (kg) - R$16,8");
        System.out.println("Coxa de Frango (kg) - R$9,5");
        System.out.println("(B para Bisteca / P para Picanha / C para Coxa de Frango)");
        carne = sc.nextLine().charAt(0);
        if (carne != 'B' && carne != 'b' && carne != 'P' && carne != 'p' && carne != 'C' && carne != 'c') {
            System.out.println("Valor Inválido!");
        }
    } while(carne != 'B' && carne != 'b' && carne != 'P' && carne != 'p' && carne != 'C' && carne != 'c');

        do {
            System.out.println("Quantos Kilos? ");
            qntCarne = sc.nextDouble();
            if (qntCarne < 0) {
                System.out.println("Valor Inválido!");
            }
        } while (qntCarne < 0);

        sc.nextLine();

        do {
        System.out.println("Irá realizar o pagamento com o cartão da loja? (DESCONTO DE 5% NA COMPRA)");
        System.out.println("(S para Sim / N para Não)");
        cartao = sc.nextLine().charAt(0);
        if (cartao != 'S' && cartao != 's' && cartao != 'N' && cartao != 'n') {
            System.out.println("Resposta Inválida");
        }
    } while(cartao != 'S' && cartao != 's' && cartao != 'N' && cartao != 'n');
        if(cartao == 'S' || cartao == 's') {
            cartaoLoja = true;
        } 
        
        if (carne == 'B' || carne == 'b') {
            if(cartaoLoja) {
                valorTotal = (qntCarne * 12.5) * 0.95;
                System.out.println("Você está levando " + qntCarne + " kilos de bisteca por: " + valorTotal + "reais!");
            } else {
            valorTotal = qntCarne * 12.5;
            System.out.println("Você está levando " + qntCarne + " kilos de bisteca por: " + valorTotal + "reais!");
            }
        }
        if (carne == 'P' || carne == 'p') {
            if(cartaoLoja) {
                valorTotal = (qntCarne * 16.8) * 0.95;
                System.out.println("Você está levando " + qntCarne + " kilos de picanha por: " + valorTotal + "reais!");
            } else {
            valorTotal = qntCarne * 16.8;
            System.out.println("Você está levando " + qntCarne + " kilos de picanha por: " + valorTotal + "reais!");
            }
        }
        if (carne == 'C' || carne == 'c') {
            if(cartaoLoja) {
                valorTotal = (qntCarne * 9.5) * 0.95;
                System.out.println("Você está levando " + qntCarne + " kilos de Coxa de frango por: " + valorTotal + "reais!");
            } else {
            valorTotal = qntCarne * 9.5;
            System.out.println("Você está levando " + qntCarne + " kilos de Coxa de frango por: " + valorTotal + "reais!");
            }
        }
        sc.close();
    }
}
