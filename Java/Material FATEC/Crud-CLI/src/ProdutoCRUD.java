import java.util.Scanner;

public class ProdutoCRUD {
	public static int MAX_PRODUTOS = 100;
	public static Produto[] produtos = new Produto[MAX_PRODUTOS];
	public static Scanner input = new Scanner(System.in);
	public static int indice = 0;
	
	public static void listar() {
		System.out.println("Nome\t\tPreço");
		for (int i = 0; i < indice; i++) {
			Produto p = produtos[i];
			if (p != null) {
			System.out.println(p.nome + "\t\t" + p.preco);
			}
		}
	}
	
	public static void remover() {
		System.out.println("REMOVER PRODUTO");
		System.out.println("Digite o nome do produto a ser removido: ");
		String nome = input.nextLine();
		for (int i = 0; i < indice; i++) {
			Produto p = produtos[i];
			if (p != null && p.nome.equalsIgnoreCase(nome)) {
			produtos[i] = null;
			System.out.println("Produto removido com sucesso!");
			break;
			}
		}
	}
	
	public static void alterar() {
		System.out.println("ALTERAR PRODUTO");
		System.out.println("Digite o nome do produto a ser alterado: ");
		String nome = input.nextLine();
		for (int i = 0; i < indice; i++) {
			Produto p = produtos[i];
			
			if (p != null && p.nome.equalsIgnoreCase(nome)) {
				System.out.println("Digite o novo nome do produto: ");
				p.nome = input.nextLine();
				System.out.println("Digite o novo preço do produto: ");
				p.preco = input.nextDouble();
				input.nextLine();
				System.out.println("Produto alterado com sucesso!");
				break;
			}
		}
	}
	
	public static void procurar() {
		System.out.println("PROCURAR PRODUTO");
		System.out.println("Digite o nome do produto a ser procurado: ");
		String nome = input.nextLine();
		
		for (int i = 0; i < indice; i++) {
			Produto p = produtos[i];
			
			if (p != null && p.nome.contains(nome)) {
				System.out.println("Produto Encontrado!");
				System.out.println("Nome: " + p.nome);
				System.out.println("Preço: " + p.preco);
			}
		}
	}
	
	public static void cadastrar() {
		System.out.println("CADASTRAR PRODUTO");
		System.out.println("Digite os dados do produto");
		System.out.println("Digite o nome do produto: ");
		String nome = input.nextLine();
		System.out.println("Digite o preço do produto: ");
		double preco = input.nextDouble();
		input.nextLine();
		Produto p = new Produto();
		p.nome = nome;
		p.preco = preco;
		p.id = indice+1;
		produtos[indice] = p;
		indice++;
	}
	
	public static void menu() {
		boolean terminar = false;
		while(!terminar) {
		System.out.println("GESTÃO DE PRODUTOS");
		System.out.println("(C) Cadastrar");
		System.out.println("(P) Procurar");
		System.out.println("(A) Alterar");
		System.out.println("(R) Remover");
		System.out.println("(L) Listar");
		System.out.println("(S) Sair");
		System.out.println("Por favor esscolha uma opção: ");
		String escolha = input.nextLine();
		
		if (escolha.length() > 0) {
		char op = escolha.toLowerCase().charAt(0);
		if (op == 'c') {
			cadastrar(); 
				} else if (op == 's') {
				System.out.println("Até logo...");
				terminar = true;
				} else if (op == 'p') {
				procurar();
				}
				else if (op == 'a') {
					alterar();
				} else if (op == 'r') {
					remover();
				} else if (op == 'l') {
					listar();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		menu();
	}
}
