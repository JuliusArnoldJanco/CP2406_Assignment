package SANDBOX;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*This is the traffic light class
* paints a traffic light 20*50 and stores its light conditions
* red =1
* yellow =2
* green =3
* */


public class TrafficLight extends JPanel implements ActionListener {

   final int TL_WIDTH = 40/2;
   final int TL_HEIGHT = 80/2+10;
   final int LIGHT_RADIUS =5;
   int TRAFFICLIGHT_CONDITION;

    private JPanel panel1;


public TrafficLight() {

}
    public void paint(Graphics g){
        this.setSize(20,50);

        super.paintComponent(g);



        g.setColor(Color.DARK_GRAY);

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
        repaint();

    }
    //Getters and setters for the traffic light condition
    public void setTrafficLightCondition(int Condition){TRAFFICLIGHT_CONDITION = Condition;}
    public int getTrafficLightCondition(){return TRAFFICLIGHT_CONDITION;}
}


