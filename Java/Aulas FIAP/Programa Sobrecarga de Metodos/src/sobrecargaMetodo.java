public class sobrecargaMetodo {

     //Sobrecarga de Métodos

   double saldo;

   public void retirar(int valor) {
    saldo -= valor;
   }

   public void retirar(double valor, double taxa){
    saldo -= valor - taxa;
   }
}
