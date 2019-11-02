package SANDBOX;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.util.concurrent.atomic.AtomicReference;

public class TrafficLight extends JPanel implements ActionListener {

   final int TL_WIDTH = 40/2;
   final int TL_HEIGHT = 80/2+10;
   final int LIGHT_RADIUS =5;
   int TRAFFICLIGHT_CONDITION;

    private JPanel panel1;

   // Timer t = new Timer(5,this);



    private Rectangle myOffice = new Rectangle(150, 50, 32, 27);
    public void paint(Graphics g){
        this.setSize(80,160);

        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        g2d.setColor(Color.RED);
        g2d.translate(200,400);
        g2d.draw(myOffice);
        g.setColor(Color.black);
        g.fillRect(0,0,TL_WIDTH,TL_HEIGHT);
        if (TRAFFICLIGHT_CONDITION == 1) {
            g.setColor(Color.RED);     //light red
            g.fillOval(5, 2, 10, 10);
        }
        else{ g.setColor(Color.black);     //light red off
            g.fillOval(5, 2, 10, 10);}

        if(TRAFFICLIGHT_CONDITION == 2) {
            g.setColor(Color.YELLOW);     //light yellow
            g.fillOval(5, 15, 10, 10);
        }
        else{ g.setColor(Color.black);     //light yellow
            g.fillOval(5, 15, 10, 10);}
        if(TRAFFICLIGHT_CONDITION == 3) {
            g.setColor(Color.GREEN);      //light green
            g.fillOval(5, 32, 10, 10);
        }
        else{g.setColor(Color.black);      //light green
            g.fillOval(5, 32, 10, 10);}
        //t.start();

    }
    public void actionPerformed(ActionEvent e) {
        System.out.println("ABC Kitchen: Location Arizona");

    }
    public void setTrafficLightCondition(int Condition){TRAFFICLIGHT_CONDITION = Condition;}
}
