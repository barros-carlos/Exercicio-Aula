import javax.swing.JOptionPane;
import java.text.NumberFormat;

public class Exercicio08 {
    // Objetivo: Clacular a porcentagem de votos e mostar em porcetagem
    public static void main(String[] args) {
        double votosTotal, votosBrancos, votosNulos, votosValidos;

        votosBrancos = Integer.parseInt(JOptionPane.showInputDialog("Insira o total de votos brancos"));
        votosNulos = Integer.parseInt(JOptionPane.showInputDialog("Insira o total de votos nulos"));
        votosValidos = Integer.parseInt(JOptionPane.showInputDialog("Insira o total de votos validos"));

        votosTotal = votosBrancos + votosNulos + votosValidos;

        JOptionPane.showMessageDialog(null,
                "Votos Branco: " + NumberFormat.getPercentInstance().format(votosBrancos / votosTotal) +
                "\nVotos nulos: " + NumberFormat.getPercentInstance().format(votosNulos / votosTotal) +
                "\nVotos validos: " + NumberFormat.getPercentInstance().format(votosValidos / votosTotal) +
                "\nVotos totais: " + (votosTotal));
}
}
