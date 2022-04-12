import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Exercicio09 {
    // Objetivo: Receber salario e porcentagem de reajuste e mostra salario rejustado
    public static void main(String[] args) {
        double salarioReajustado, salario, porcentagem;

        salario = Double.parseDouble(JOptionPane.showInputDialog("Qual o salário para reajuste?"));
        porcentagem = Double.parseDouble(JOptionPane.showInputDialog("Qual a porcentagem do reajuste em %?"));

        salarioReajustado = salario * (1 + (porcentagem/100));

        JOptionPane.showMessageDialog(null, "Salario ajustado: " + NumberFormat.getCurrencyInstance().format(salarioReajustado));
    }
}
