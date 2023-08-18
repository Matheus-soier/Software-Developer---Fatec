//Public class precisar ter o mesmo nome do arquivo .java
import javax.swing.JOptionPane;

public class primeiroProg {
    public static void main(String[] args){
        //Declarando as variaveis
        String strN1, strN2, strResultado;
        float fltN1, fltN2, fltResultado;

        //Input tipo String para as variaveis declaradas
        strN1 = JOptionPane.showInputDialog(null, "Digite o primeiro valor: ");
        strN2 = JOptionPane.showInputDialog(null, "Digite o segundo valor: ");

        //Convertendo as variaveis de string para dentro das variaveis Float
        fltN1 = Float.parseFloat(strN1);
        fltN2 = Float.parseFloat(strN2);

        //Realizando o calculo dos floats
        fltResultado = fltN1 + fltN2;

        //Convertendo o resultado dos floats para string dentro da variavel string
        strResultado = String.valueOf(fltResultado);

        //Printando na tela o string do calculo feito em float
        JOptionPane.showMessageDialog(null, "Resultado da soma: " + strResultado);
    }
}