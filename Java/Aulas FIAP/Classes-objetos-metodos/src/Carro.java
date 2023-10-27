public class Carro {
    //Atributos
    String nome, marca;
    int ano, vel;

    //métodos
    void acelerar(int aceleracao) {
        vel+=aceleracao;
    }

    void freiar(int reduzir) {
        vel-=reduzir;   
    }

    void buzinar() {
        System.out.println("bibibi");
    }
}
