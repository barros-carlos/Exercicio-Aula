import javax.swing.JOptionPane;

public class Exercicio02 {
    // Objetivo: Receber 4 numero e elevar ao quadrado, somar os quatro resultados e mostrar para o usuario
    public static void main(String[] args){
        double times[], result = 0;
        times = new double[4];
        for(int i = 0; i < 4; i++ ){
            times[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite o " + (i+1) + "º numero"));
            times[i] *= times[i];
            result += times[i];
        }
        JOptionPane.showMessageDialog(null, "Total igual a " + result);
    }
}
