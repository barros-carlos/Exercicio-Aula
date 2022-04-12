import javax.swing.JOptionPane;

public class Ex06 {
    public static void main(String[] args) {
        int numAno;

        numAno = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero do ano"));
        
        if((((numAno % 4) == 0 && (numAno % 100) != 0) || (numAno % 400) == 0 ) && numAno > 0){
            JOptionPane.showMessageDialog(null, "o ano eh bissexto");
        }
        else if (numAno <= 0){
            JOptionPane.showMessageDialog(null, "o ano esta fora do alcance para calculo");
        }
        else{
            JOptionPane.showMessageDialog(null, "o ano nao eh bissexto");
        }
    }
}
