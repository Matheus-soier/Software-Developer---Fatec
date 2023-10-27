class ProdutoTestar {
    public static void main(String[] args) {

    Produto[] Produtos = new Produto[3];

    int i;

      Produto p1 = new Produto();
      p1.nome = "Caneta Preta";
      p1.marca = "bic";
      p1.valor = 2.5f;

      Produto p2 = new Produto("Caneta Vermelha", "Faber");
      p2.valor = 1.69f;

      Produto p3 = new Produto("Borracha", "Mercur", 1.8f);

      Produtos[0] = p1;
      Produtos[1] = p2;
      Produtos[2] = p3;

      for(i = 0; i < 3; i++) {
          System.out.println("Produto: " + Produtos[i].nome + "\nMarca: " + Produtos[i].marca + "\nValor: " + Produtos[i].valor + "\n");
      }
    }
}