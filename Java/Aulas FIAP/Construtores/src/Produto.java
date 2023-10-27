public class Produto {
    String nome, marca;
    float valor;

    //construtores
    produto() {} //Contrutor padrão

    Produto(String nome) {
        this.nome = nome; // "this. referencia o parâmetro ao atributo criado na classe"
    }

    Produto(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    Produto(String nome, String marca, float valor) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }
}

