public class ProdutoTestar {
    public static void main(String[] args) {
       //Construtor padrão
        Produto p1 = new Produto(); 
        p1.nome = "Caneta preta";
        p1.marca = "Bic";
        p1.valor = 1.50f;

        //Construtor de 2 parâmetros
        Produto p2 = new Produto("Caneta Vermelha", "Faber");
        p2.valor = 1.69f;

        //Construtor de 3 parâmetros
        Produto p3 = new Produto("Borracha", "Mercur", 1.89f);

        System.out.println("Produto: " + p1.nome + "\nMarca: " + p1.marca + "\nValor: " + p1.valor);
    }
}
