import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Exercicio11 {
    // Objetivo: calcular salario do funcionario e no final calcular salario.
    public static void main(String[] args) {
        int numCarros;
        double totalVendas, salarioFixo, valorCarroVendido, salario;

        numCarros = Integer.parseInt(JOptionPane.showInputDialog("Quanto carros o funcionario vendeu?"));
        totalVendas = Double.parseDouble(JOptionPane.showInputDialog("Qual foi o valor total de carros vendido?"));
        salarioFixo = Double.parseDouble(JOptionPane.showInputDialog("Qual o valor do salario fixo do funcionario?"));
        valorCarroVendido = Double.parseDouble(JOptionPane.showInputDialog("Quanto e a taxa por carro vendido"));

        salario = salarioFixo + (numCarros * valorCarroVendido) + (totalVendas * 0.05);

        JOptionPane.showMessageDialog(null, "O salario do funcinario e igual a:\n" + NumberFormat.getCurrencyInstance().format(salario));
    }
}
