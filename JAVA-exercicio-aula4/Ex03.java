import javax.swing.JOptionPane;

public class Ex03 {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do primeiro numero:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do segundo numero:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do terceiro numero:"));

        if(a > b && a > c){
            JOptionPane.showMessageDialog(null, "o numero " + a + " eh o maior");
        }else if (b > a && b >c){
            JOptionPane.showMessageDialog(null, "o numero " + b + " eh o maior");
        }else{
            JOptionPane.showMessageDialog(null, "o numero " + c + " eh o maior");
        }
    }
}
