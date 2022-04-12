import java.awt.*;
import javax.swing.*;

public class MyFrame extends JFrame{
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    public void paint(Graphics g){

        Graphics2D g2D = (Graphics2D) g;

        g2D.drawLine(200, 300, 400, 400);
    }
}
