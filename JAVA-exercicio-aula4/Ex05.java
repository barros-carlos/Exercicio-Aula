import javax.swing.JOptionPane;

public class Ex05{
    public static void main(String[] args) {
        int mes, diaMes;
        mes = Integer.parseInt(JOptionPane.showInputDialog("Digete o numero do mes:\n"));
        
        switch(mes){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diaMes = 31;
            break;
            case 2:
                diaMes = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaMes = 30;
                break;
            default:
                diaMes = 0;
                break;
            }
            JOptionPane.showMessageDialog(null, "o mes tem " + diaMes + " dias");
    }
}