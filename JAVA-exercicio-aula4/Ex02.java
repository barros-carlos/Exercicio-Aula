import javax.swing.JOptionPane;

public class Ex02 {
    public static void main(String[] args) {
        double a = 0, b = 0, c = 0, delta = 0 , x1, x2;

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de a:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de b:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de c:"));

        if(a != 0){
            delta = (b * b) - (4 * a * c);

            if(delta > 0){
                x1 = ( (b*-1) + Math.sqrt(delta)) / (2 * a);
                x2 = ( (b*-1) - Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "possui duas raizes a funcao\n raiz 1 = " + x1 + "\nraiz 2 = " + x2);
            }
            else if(delta < 0){
                JOptionPane.showMessageDialog(null, "nao possui raiz a funcao");
            }
            else{
                x1 = ( (b*-1) + Math.sqrt(delta)) / (2 * a);
                JOptionPane.showMessageDialog(null, "possui uma raiz a funcao\nRaiz igua a " + x1);
            }
        }else{
            JOptionPane.showMessageDialog(null, "dnão é uma funca do segundo grau");
        }


        
        

    }
}
