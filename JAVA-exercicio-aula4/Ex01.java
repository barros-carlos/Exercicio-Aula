import javax.swing.JOptionPane;
public class Ex01{
    public static void main(String[] args) {
        int num = 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero que pertence aos conjunto dos inteiros"));

        if (num > 0) {JOptionPane.showMessageDialog(null, "O numero eh positivo");}
        else if (num < 0) {JOptionPane.showMessageDialog(null, "O numero eh negativo");}
        else {JOptionPane.showMessageDialog(null, "O numero eh zero");}
    }
}