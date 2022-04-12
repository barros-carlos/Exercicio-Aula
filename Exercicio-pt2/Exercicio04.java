import javax.swing.JOptionPane;

public class Exercicio04 {
    // Objetivo: Receber um Integer e mostrar seu antecessor
    public static void main(String[] args) {
        int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero para ver seu antecessor"));
        JOptionPane.showMessageDialog(null, "O antecessor de " + number + " é " + (number-1));
    } 
}
