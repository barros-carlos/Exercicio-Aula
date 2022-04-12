import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Exercicio10 {
    // Objetivo: receber valor de fabrica do automovel e calcular o preço de venda usando valores de porcentagens estabelecidos
    public static void main(String[] args) {

        double valorFabrica, valorTotal;

        valorFabrica = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do automovel de fabrica"));

        valorTotal = valorFabrica * 1.28 * 1.45;

        JOptionPane.showMessageDialog(null, "Valor de venda do automovel eh" + NumberFormat.getCurrencyInstance().format(valorTotal));
    }
}
