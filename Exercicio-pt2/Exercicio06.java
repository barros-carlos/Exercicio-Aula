import javax.swing.JOptionPane;

public class Exercicio06 {
    // Objetivo: calcular quanto dias de vida uma pessoa tem recebendo os anos de vida
    public static void main(String[] args) {
        int anosVida, result;
        
        anosVida = Integer.parseInt(JOptionPane.showInputDialog("Digete quantos anos de vida voce tem"));
        result = anosVida * 365;

        JOptionPane.showMessageDialog(null, "Voce tem aproximadamente " + result + " dias");
    }
    
}
