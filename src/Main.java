import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String args[]){

        //Main Window
        JFrame f = new JFrame("Atmen Sim");

        JPanel content = new JPanel();
        content.setLayout(new BorderLayout());

        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(5,1));
        menu.setSize(200,200);

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(3, 3));


        //Corner Grid menu
        JPanel buttonsPanel2 = new JPanel();
        buttonsPanel2.setLayout(new GridLayout(2, 2));

    }
}
