package SANDBOX;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.concurrent.atomic.AtomicReference;

public class TrafficLight extends JPanel implements ActionListener {


    private JPanel panel1;

   // Timer t = new Timer(5,this);




    public void paint(Graphics g){
        this.setSize(80,160);

        super.paintComponent(g);

        g.setColor(Color.black);
        g.fillRect(0,0,80,160);
        g.setColor(Color.RED);     //light red
        g.fillOval(20,10,40,40);
        g.setColor(Color.YELLOW);     //light yellow
        g.fillOval(20,60,40,40);
        g.setColor(Color.GREEN);      //light green
        g.fillOval(20,110,40,40);
        //t.start();

    }
    public void actionPerformed(ActionEvent e) {
        System.out.println("ABC Kitchen: Location Arizona");

    }
}
