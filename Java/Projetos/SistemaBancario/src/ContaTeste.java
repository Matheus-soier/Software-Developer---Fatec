public class ContaTeste {
    public static void main(String[] args) {
        Conta contaCorrente = new Conta();
       contaCorrente.setAgencia(123);
       contaCorrente.setNumero(321);
       contaCorrente.depositar(500);

    contaCorrente.sacar(200);
        System.out.println(contaCorrente.getSaldo());
    }

    Conta contaCorrente = new Conta(123,321,1000);
}
