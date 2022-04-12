import javax.swing.JOptionPane;

public class Desafio01{
    public static void main(String[] args) {
        
        int horasInicio, horasFinal, minutoInicio, minutoFinal, segundoInicio, segundoFinal;
        String horasTotal = "", minutosTotal = "", segundoTotal = "";

        horasInicio = Integer.parseInt(JOptionPane.showInputDialog("Hora inicial"));
        minutoInicio = Integer.parseInt(JOptionPane.showInputDialog("Minuto inicial"));
        segundoInicio = Integer.parseInt(JOptionPane.showInputDialog("Segundo inicial"));
        horasFinal = Integer.parseInt(JOptionPane.showInputDialog("Hora Final"));
        minutoFinal = Integer.parseInt(JOptionPane.showInputDialog("Minuto final"));
        segundoFinal = Integer.parseInt(JOptionPane.showInputDialog("segundo final"));

        horasTotal = Integer.toString(horasFinal - horasInicio);
        minutosTotal =  Integer.toString(60 - minutoFinal - minutoInicio);
        segundoTotal =  Integer.toString(60 - segundoFinal - segundoInicio);

        if(minutoFinal < minutoInicio){
            horasTotal = Integer.toString(Integer.parseInt(horasTotal)-1);
        }

        JOptionPane.showMessageDialog(null, "Sua partida durou:\n" +
        horasTotal + ":" + minutosTotal.replaceAll("-", "") + ":" + segundoTotal.replaceAll("-", "") + 
        "\nSegundo totais:" + ((Integer.parseInt(horasTotal) * 60 * 60) + (Integer.parseInt(minutosTotal) * 60) + Integer.parseInt(segundoTotal)));


    }
}