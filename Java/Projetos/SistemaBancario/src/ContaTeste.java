public class ContaTeste {
    public static void main(String[] args) {
        Conta contaCorrente = new Conta();
        Conta contaPoupança = new Conta(111, 222, 200);

        contaCorrente.agencia = 321;
        contaCorrente.numero = 123;
        contaCorrente.saldo = 150;

        contaCorrente.depositar(1000);
        System.out.println("Saldo conta corrente: " + contaCorrente.verificarSaldo());

        contaPoupança.sacar(25);
        System.out.println("Saldo conta poupança: " + contaPoupança.verificarSaldo());

    }
}
