import javax.swing.JOptionPane;

public class Exercicio05 {
    // Objetivo: receber altura e base do retangulo e mostrar a area
    public static void main(String[] args) {
        double altura, base;

        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do retangulo"));
        base = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do retangulo"));

        JOptionPane.showMessageDialog(null, "A area do retangulo é " + (altura * base));
    }    
}
