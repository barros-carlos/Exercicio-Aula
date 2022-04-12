import javax.swing.JOptionPane;

public class Ex04 {
    public static void main(String[] args) {
        String[] diasSemana = {"Domingo","Segunda","Terca","Quarta","Quinta","Sexta","Sabado"};
        int numDia = 0;

        numDia = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia da semana ([1,7]):"))-1;

        switch(numDia){
            case 1:
                JOptionPane.showMessageDialog(null, diasSemana[numDia]);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, diasSemana[numDia]);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, diasSemana[numDia]);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, diasSemana[numDia]);
                break;
            case 5:
                JOptionPane.showMessageDialog(null, diasSemana[numDia]);
                break;
            case 6:
                JOptionPane.showMessageDialog(null, diasSemana[numDia]);
                break;
            case 7:
                JOptionPane.showMessageDialog(null, diasSemana[numDia]);
                break;
            default:
                JOptionPane.showMessageDialog(null, "Algo deu errado\n Tente novamente...");
                break;  
        }

        
    }
}
