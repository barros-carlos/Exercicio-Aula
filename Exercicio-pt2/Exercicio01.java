import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Exercicio01{
    // Objetivo: calcular o valor em dolar, recebendo o valor da cotacao e o valor em dolares
    public static void main(String[] args){
        double cotacao, qte;

        cotacao = Double.parseDouble(JOptionPane.showInputDialog("digite o valor da cotacao do Dolar"));
        qte = Double.parseDouble(JOptionPane.showInputDialog("digite a quantidade de Dolares"));
        
        JOptionPane.showMessageDialog(null , "convertido para real: " + NumberFormat.getCurrencyInstance().format(qte * cotacao));
    }
}