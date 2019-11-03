import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Vehicle extends JPanel implements ActionListener {

    final int TL_WIDTH = 40/2;
    final int TL_HEIGHT = 80/2+10;
    final int LIGHT_RADIUS =5;
    int TRAFFICLIGHT_CONDITION;

    private JPanel panel1;

    //Timer t = new Timer(4000,this);

    public Vehicle() {

    }
    public void paint(Graphics g){
        this.setSize(20,50);

        super.paintComponent(g);



        g.setColor(Color.blue);

    }
    public void actionPerformed(ActionEvent e) {
        repaint();

    }
}
