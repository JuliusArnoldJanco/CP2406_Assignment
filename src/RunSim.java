
// SecondFrame.java
import SANDBOX.DataPoints;
import SANDBOX.TrafficLight;

import javax.swing.*;
import java.awt.*;
import java.io.FileNotFoundException;

public class RunSim {
    private JFrame frame = new JFrame("Second");

    private JLayeredPane lpane = new JLayeredPane();
    JLayeredPane content = new JLayeredPane();

    JPanel gridPanel = new JPanel();

    DataPoints DP = new DataPoints();
    ImageSetup IS = new ImageSetup();
    TrafficLight TL = new TrafficLight();
    TrafficLight TL2 = new TrafficLight();


    JLabel grid1 = new JLabel(IS.getImageFromArray(0));
    JLabel grid2 = new JLabel(IS.getImageFromArray(1));
    JLabel grid3 = new JLabel(IS.getImageFromArray(2));
    JLabel grid4 = new JLabel(IS.getImageFromArray(3));
    JLabel grid5 = new JLabel(IS.getImageFromArray(4));
    JLabel grid6 = new JLabel(IS.getImageFromArray(5));
    JLabel grid7 = new JLabel(IS.getImageFromArray(6));
    JLabel grid8 = new JLabel(IS.getImageFromArray(7));
    JLabel grid9 = new JLabel(IS.getImageFromArray(8));



    public RunSim() throws FileNotFoundException {
        LoadGridConditions();
        TL.setTrafficLightCondition(3);
        TL2.setTrafficLightCondition(2);
        gridPanel.setLayout(new GridLayout(3, 3));
        gridPanel.add(grid1);
        gridPanel.add(grid2);
        gridPanel.add(grid3);
        gridPanel.add(grid4);
        gridPanel.add(grid5);
        gridPanel.add(grid6);
        gridPanel.add(grid7);
        gridPanel.add(grid8);
        gridPanel.add(grid9);
        gridPanel.setOpaque(true);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(600, 600));
        frame.setLayout(new BorderLayout());
        frame.add(lpane, BorderLayout.CENTER);
        lpane.setBounds(0, 0, 600, 400);
        gridPanel.setBackground(Color.BLUE);
        gridPanel.setBounds(0, 0, 600, 600);
        gridPanel.setOpaque(true);

        TL.setBounds(200, 300, 20, 50);
        TL2.setBounds(300, 300, 20, 50);

        lpane.add(gridPanel, new Integer(0), 0);
        lpane.add(TL, new Integer(1), 0);
        lpane.add(TL2, new Integer(1), 0);
        frame.pack();
        frame.setVisible(true);

    }



    private void LoadGridConditions() throws FileNotFoundException {
        LoadGame LG = new LoadGame();
        int[] LoadedGame = LG.getGridArray();

        DP.InputCondition(LoadedGame[0],0);
        DP.InputCondition(LoadedGame[1],1);
        DP.InputCondition(LoadedGame[2],2);
        DP.InputCondition(LoadedGame[3],3);
        DP.InputCondition(LoadedGame[4],4);
        DP.InputCondition(LoadedGame[5],5);
        DP.InputCondition(LoadedGame[6],6);
        DP.InputCondition(LoadedGame[7],7);
        DP.InputCondition(LoadedGame[8],8);

        IS.InputImageIntoArray(0,LoadedGame[0]);
        IS.InputImageIntoArray(1,LoadedGame[1]);
        IS.InputImageIntoArray(2,LoadedGame[2]);
        IS.InputImageIntoArray(3,LoadedGame[3]);
        IS.InputImageIntoArray(4,LoadedGame[4]);
        IS.InputImageIntoArray(5,LoadedGame[5]);
        IS.InputImageIntoArray(6,LoadedGame[6]);
        IS.InputImageIntoArray(7,LoadedGame[7]);
        IS.InputImageIntoArray(8,LoadedGame[8]);

        grid1.setIcon(IS.getImageFromArray(0));
        grid2.setIcon(IS.getImageFromArray(1));
        grid3.setIcon(IS.getImageFromArray(2));
        grid4.setIcon(IS.getImageFromArray(3));
        grid5.setIcon(IS.getImageFromArray(4));
        grid6.setIcon(IS.getImageFromArray(5));
        grid7.setIcon(IS.getImageFromArray(6));
        grid8.setIcon(IS.getImageFromArray(7));
        grid9.setIcon(IS.getImageFromArray(8));
        System.out.println("Loaded Game, function Ran.");
    }
}
