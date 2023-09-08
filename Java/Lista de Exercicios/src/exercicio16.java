import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double qntMaca, qntMorango, valorTotal;
        
        do{
            System.out.println("Deseja comprar quantos Kg de maça? ");
            qntMaca = sc.nextDouble();
            System.out.println("Deseja comprar quantos Kg de Morango? ");
            qntMorango = sc.nextDouble();
            if (qntMaca < 0 || qntMorango < 0) {
                System.out.println("Resposta Inválida!");
            }
        }  while(qntMaca < 0 || qntMorango < 0);

        if (qntMaca == 0 && qntMorango > 0) {
             if(qntMorango <= 5) {
                valorTotal = qntMorango * 2.5;
                System.out.println("Você está comprando " + qntMorango + " kilos de morango, pelo valor de: " + valorTotal + " reais!");
             } else if(qntMorango > 5 && qntMorango <= 8) {
                valorTotal = qntMorango * 2.2;
                System.out.println("Você está comprando " + qntMorango + " kilos de morango, pelo valor de: " + valorTotal + " reais!");
            } else if (qntMorango > 8) {
                valorTotal = (qntMorango * 2.2) * 0.9;
                System.out.println("Você está comprando " + qntMorango + " kilos de morango, pelo valor de: " + valorTotal + " reais!");
            }
        } else if(qntMorango == 0 && qntMaca > 0) {
            if(qntMaca <= 5) {
                valorTotal = qntMaca * 1.8;
                System.out.println("Você está comprando " + qntMaca + " kilos de maça, pelo valor de: " + valorTotal + " reais!");
             } else if (qntMaca > 5 && qntMaca <= 8){
                valorTotal = qntMaca * 1.5;
                System.out.println("Você está comprando " + qntMaca + " kilos de maça, pelo valor de: " + valorTotal + " reais!");
            } else if(qntMaca > 8) {
                valorTotal = (qntMaca * 1.5) * 0.9;
                System.out.println("Você está comprando " + qntMorango + " kilos de morango, pelo valor de: " + valorTotal + " reais!");
            }
        }else if(qntMaca > 0 && qntMorango > 0){
            if (qntMaca <= 5 && qntMorango <= 5) {
                valorTotal = (qntMaca * 1.8) + (qntMorango * 2.5);
                System.out.println("Você está comprando " + qntMaca + " kilos de maça e " + qntMorango + " kilos de morango pelo valor de: " + valorTotal + " reais!");
            } else if (qntMaca <= 5 && qntMorango > 5 && qntMorango <= 8) {
                valorTotal = (qntMaca * 1.8) + (qntMorango * 2.2);
                System.out.println("Você está comprando " + qntMaca + " kilos de maça e " + qntMorango + " kilos de morango pelo valor de: " + valorTotal + " reais!");    
            } else if (qntMaca <= 5 && qntMorango > 8) {
                valorTotal = (qntMaca * 1.8) + ((qntMorango * 2.2) * 0.9);
                System.out.println("Você está comprando " + qntMaca + " kilos de maça e " + qntMorango + " kilos de morango pelo valor de: " + valorTotal + " reais!");
            } else if (qntMorango <= 5 && qntMaca > 5 && qntMaca <= 8) {
                valorTotal = (qntMorango * 2.5) + (qntMaca * 1.5);
                System.out.println("Você está comprando " + qntMaca + " kilos de maça e " + qntMorango + " kilos de morango pelo valor de: " + valorTotal + " reais!");
            } else if (qntMorango <= 5 && qntMaca > 8) {
                valorTotal = (qntMorango * 2.5) + ((qntMaca * 1.5) * 0.9);
                System.out.println("Você está comprando " + qntMaca + " kilos de maça e " + qntMorango + " kilos de morango pelo valor de: " + valorTotal + " reais!");
            } else if (qntMaca > 5 && qntMaca <= 8 && qntMorango > 5 && qntMorango <= 8) {
                valorTotal = (qntMaca * 1.5) + (qntMorango * 2.2);
                System.out.println("Você está comprando " + qntMaca + " kilos de maça e " + qntMorango + " kilos de morango pelo valor de: " + valorTotal + " reais!");
            } else if (qntMaca > 5 && qntMaca <= 8 && qntMorango > 8) {
                valorTotal = (qntMaca * 1.5) + ((qntMorango * 2.2) * 0.9);
                System.out.println("Você está comprando " + qntMaca + " kilos de maça e " + qntMorango + " kilos de morango pelo valor de: " + valorTotal + " reais!");
            } else if(qntMaca > 8 && qntMorango > 5 && qntMorango <= 8) {
                valorTotal = ((qntMaca * 1.5) * 0.9) + (qntMorango * 2.2);
                System.out.println("Você está comprando " + qntMaca + " kilos de maça e " + qntMorango + " kilos de morango pelo valor de: " + valorTotal + " reais!");
            } else if (qntMaca > 8 && qntMorango > 8) {
                valorTotal = ((qntMaca * 1.5) + (qntMorango * 2.2)) * 0.9;
                System.out.println("Você está comprando " + qntMaca + " kilos de maça e " + qntMorango + " kilos de morango pelo valor de: " + valorTotal + " reais!");
            }
        } else if(qntMaca == 0 && qntMorango == 0) {
            System.out.println("Você não está comprando nada...");
        }
        
        sc.close();        
    }
}
