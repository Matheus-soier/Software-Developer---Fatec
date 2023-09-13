public class ProgCondicional {
    public static void main(String[] args) throws Exception {
        // Utilizando o operador AND
        int idadeVotar = 70;
        boolean precisaVotar = idadeVotar >= 18 && idadeVotar <= 70;

        System.out.println(precisaVotar);

        // Utilizando o operador OR
        int nrAmarelo = 2, nrVermelho = 1;
        boolean suspensoJogo = nrAmarelo == 1 || nrVermelho == 1;

        System.out.println(suspensoJogo);

        // Utilizando o operador XOR
        int x = 9, y = 11;
        boolean operadorXor = x == 9 ^ y == 10;

        System.out.println(operadorXor);

        // Utilizando o operador NOT
        int idade = 18;
        boolean resultado = !(idade != 18);

        System.out.println(resultado);
    }
}
