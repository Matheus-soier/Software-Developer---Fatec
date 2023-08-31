public class testeConta {
    public static void main(String[] args) throws Exception {
        conta contaCorrente = new conta();
        conta contaPoupança = new conta();
        conta contaInvetimento = new conta();

        contaCorrente.numero = 11;
        contaCorrente.saldo = 1540.50;
        contaCorrente.cliente.nome = "Matheus Soier";
        contaCorrente.cliente.idade = 20;

        contaPoupança.numero = 22;
        contaPoupança.saldo = 1920.30;
        contaPoupança.cliente.nome = "José Pereira";
        contaPoupança.cliente.idade = 38;

        contaInvetimento.numero = 33;
        contaInvetimento.saldo = 1330.15;
        contaInvetimento.cliente.nome = "Eduarda Tavares";
        contaInvetimento.cliente.idade = 18;

        System.out.println("Cliente " + contaInvetimento.cliente.nome + ", com idade de " + contaInvetimento.cliente.idade + " anos.");
    }
}
