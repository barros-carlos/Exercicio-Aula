import javax.swing.JOptionPane;

public class Exercicio07 {
    // Objetivo: receber anos, meses e dias e mostra o tempo de vida expresso em dias
    public static void main(String[] args) {
        int anos, meses, dias, result;

        anos = Integer.parseInt(JOptionPane.showInputDialog("Digite seus anos de vida"));
        meses = Integer.parseInt(JOptionPane.showInputDialog("Digite seus meses de vida"));
        dias = Integer.parseInt(JOptionPane.showInputDialog("Digite seus dias de vida"));
       
        result = anos * 365 + meses * 30 + dias;

        JOptionPane.showMessageDialog(null, "Voce tem " + result + " dias");
    }
}
