import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Exercicio03 {
    // Objetivo: receber quantidade e valor unitario e calcular comissao de 5% do vendedor
    public static void main(String[] args) {
        int qte = 0;
        double value = 0.0;

        value = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor unitario da peca"));
        qte = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de pecas vendida"));

        JOptionPane.showMessageDialog(null, "Comissao do vendedor é " + NumberFormat.getCurrencyInstance().format(value * qte * 0.05));
    }
}
