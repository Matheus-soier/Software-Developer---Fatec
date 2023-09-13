public class ProgMetodos {

    double saldo;

    public double recuperarSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }
}
