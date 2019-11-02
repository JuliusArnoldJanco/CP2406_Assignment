
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



    JLabel grid1 = new JLabel(IS.getImageFromArray(0));
    JLabel grid2 = new JLabel(IS.getImageFromArray(1));
    JLabel grid3 = new JLabel(IS.getImageFromArray(2));
    JLabel grid4 = new JLabel(IS.getImageFromArray(3));
    JLabel grid5 = new JLabel(IS.getImageFromArray(4));
    JLabel grid6 = new JLabel(IS.getImageFromArray(5));
    JLabel grid7 = new JLabel(IS.getImageFromArray(6));
    JLabel grid8 = new JLabel(IS.getImageFromArray(7));
    JLabel grid9 = new JLabel(IS.getImageFromArray(8));

    TrafficLight TL = new TrafficLight();
    TrafficLight TL2 = new TrafficLight();
    TrafficLight TL3 = new TrafficLight();
    TrafficLight TL4 = new TrafficLight();
    TrafficLight TL5 = new TrafficLight();
    TrafficLight TL6 = new TrafficLight();
    TrafficLight TL7 = new TrafficLight();
    TrafficLight TL8 = new TrafficLight();
    TrafficLight TL9 = new TrafficLight();
    TrafficLight TL10 = new TrafficLight();
    TrafficLight TL11 = new TrafficLight();
    TrafficLight TL12 = new TrafficLight();
    TrafficLight TL13 = new TrafficLight();
    TrafficLight TL14 = new TrafficLight();
    TrafficLight TL15 = new TrafficLight();
    TrafficLight TL16 = new TrafficLight();
    TrafficLight TL17 = new TrafficLight();
    TrafficLight TL18 = new TrafficLight();
    TrafficLight TL19 = new TrafficLight();
    TrafficLight TL20 = new TrafficLight();
    TrafficLight TL21 = new TrafficLight();
    TrafficLight TL22 = new TrafficLight();
    TrafficLight TL23 = new TrafficLight();
    TrafficLight TL24 = new TrafficLight();
    TrafficLight TL25 = new TrafficLight();
    TrafficLight TL26 = new TrafficLight();
    TrafficLight TL27 = new TrafficLight();
    TrafficLight TL28 = new TrafficLight();
    TrafficLight TL29 = new TrafficLight();
    TrafficLight TL30 = new TrafficLight();
    TrafficLight TL31 = new TrafficLight();
    TrafficLight TL32 = new TrafficLight();
    TrafficLight TL33 = new TrafficLight();
    TrafficLight TL34 = new TrafficLight();
    TrafficLight TL35 = new TrafficLight();
    TrafficLight TL36 = new TrafficLight();


    public RunSim() throws FileNotFoundException {
        lpane.setBounds(0, 0, 600, 600);
        LoadGridConditions();

        LoadTrafficLights();


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
        frame.setPreferredSize(new Dimension(610, 610));
        frame.setLayout(new BorderLayout());
        frame.add(lpane, BorderLayout.CENTER);


        gridPanel.setBounds(0, 0, 610, 610);
        gridPanel.setOpaque(true);



        lpane.add(gridPanel, new Integer(0), 0);

        frame.pack();
        frame.setVisible(true);

    }

    private void LoadTrafficLights() {
        for(int i =0; i<DP.getGridIcons().length;i++) {
            
            if (DP.getCond(i) == 3) {

                if (i == 0){
                    TL.setBounds(230-210, 30, 20, 50);
                    TL2.setBounds(350-210, 120, 20, 50);
                    TL3.setBounds(290-210, 0, 20, 50);
                    TL4.setBounds(290-210, 140, 20, 50);
                    lpane.add(TL, new Integer(1), 0);
                    lpane.add(TL2, new Integer(1), 0);
                    lpane.add(TL3, new Integer(1), 0);
                    lpane.add(TL4, new Integer(1), 0);
                }


                else if (i == 1){
                        TL5.setBounds(230, 30, 20, 50);
                        TL6.setBounds(350, 120, 20, 50);
                        TL7.setBounds(290, 0, 20, 50);
                        TL8.setBounds(290, 140, 20, 50);
                        lpane.add(TL5, new Integer(1), 0);
                        lpane.add(TL6, new Integer(1), 0);
                        lpane.add(TL7, new Integer(1), 0);
                        lpane.add(TL8, new Integer(1), 0);
                }


                else if (i == 2){
                        TL9.setBounds(230+210, 30, 20, 50);
                        TL10.setBounds(350+210, 120, 20, 50);
                        TL11.setBounds(290+210, 0, 20, 50);
                        TL12.setBounds(290+210, 140, 20, 50);
                        lpane.add(TL9, new Integer(1), 0);
                        lpane.add(TL10, new Integer(1), 0);
                        lpane.add(TL11, new Integer(1), 0);
                        lpane.add(TL12, new Integer(1), 0);
                }


                else if (i == 3){
                        TL13.setBounds(230-210, 220, 20, 50);
                        TL14.setBounds(350-210, 330, 20, 50);
                        TL15.setBounds(290-210, 205, 20, 50);
                        TL16.setBounds(290-210, 330, 20, 50);
                        lpane.add(TL13, new Integer(1), 0);
                        lpane.add(TL14, new Integer(1), 0);
                        lpane.add(TL15, new Integer(1), 0);
                        lpane.add(TL16, new Integer(1), 0);
                }


                else if (i == 4){
                        TL17.setBounds(230, 220, 20, 50);
                        TL18.setBounds(350, 330, 20, 50);
                        TL19.setBounds(290, 205, 20, 50);
                        TL20.setBounds(290, 330, 20, 50);
                        lpane.add(TL17, new Integer(1), 0);
                        lpane.add(TL18, new Integer(1), 0);
                        lpane.add(TL19, new Integer(1), 0);
                        lpane.add(TL20, new Integer(1), 0);
                }


                else if (i == 5){
                        TL21.setBounds(230+210, 220, 20, 50);
                        TL22.setBounds(350+210, 330, 20, 50);
                        TL23.setBounds(290+210, 205, 20, 50);
                        TL24.setBounds(290+210, 330, 20, 50);
                        lpane.add(TL21, new Integer(1), 0);
                        lpane.add(TL22, new Integer(1), 0);
                        lpane.add(TL23, new Integer(1), 0);
                        lpane.add(TL24, new Integer(1), 0);
                }


                else if (i == 6){
                        TL25.setBounds(230-210, 220+210, 20, 50);
                        TL26.setBounds(350-210, 330+210, 20, 50);
                        TL27.setBounds(290-210, 205+210, 20, 50);
                        TL28.setBounds(290-210, 330+210, 20, 50);
                        lpane.add(TL25, new Integer(1), 0);
                        lpane.add(TL26, new Integer(1), 0);
                        lpane.add(TL27, new Integer(1), 0);
                        lpane.add(TL28, new Integer(1), 0);
                }


                else if (i == 7) {
                    TL29.setBounds(230, 220 + 210, 20, 50);
                    TL30.setBounds(350, 330 + 210, 20, 50);
                    TL31.setBounds(290, 205 + 210, 20, 50);
                    TL32.setBounds(290, 330 + 210, 20, 50);
                    lpane.add(TL29, new Integer(1), 0);
                    lpane.add(TL30, new Integer(1), 0);
                    lpane.add(TL31, new Integer(1), 0);
                    lpane.add(TL32, new Integer(1), 0);
                }else{
                        TL33.setBounds(230+210, 220+210, 20, 50);
                        TL34.setBounds(350+210, 330+210, 20, 50);
                        TL35.setBounds(290+210, 205+210, 20, 50);
                        TL36.setBounds(290+210, 330+210, 20, 50);
                        lpane.add(TL33, new Integer(1), 0);
                        lpane.add(TL34, new Integer(1), 0);
                        lpane.add(TL35, new Integer(1), 0);
                        lpane.add(TL36, new Integer(1), 0);

                }
            }
            else  if (DP.getCond(i) == 2) {

                if (i == 0) {
                    //Depreciated System.out.println("Condition Met: DP.getCond() = 2");
                    TL.setBounds(230 - 210, 30, 20, 50);
                    TL2.setBounds(350 - 210, 120, 20, 50);
                    //TL3.setBounds(290-210, 0, 20, 50);
                    TL4.setBounds(290 - 210, 140, 20, 50);
                    lpane.add(TL, new Integer(1), 0);
                    lpane.add(TL2, new Integer(1), 0);
                    lpane.add(TL3, new Integer(1), 0);
                    lpane.add(TL4, new Integer(1), 0);
                }else if(i==1){
                        //Depreciated System.out.println("Condition Met: DP.getCond() = 2");
                        TL5.setBounds(230, 30, 20, 50);
                        TL6.setBounds(350, 120, 20, 50);
                        //TL7.setBounds(290, 0, 20, 50);
                        TL8.setBounds(290, 140, 20, 50);
                        lpane.add(TL5, new Integer(1), 0);
                        lpane.add(TL6, new Integer(1), 0);
                        lpane.add(TL7, new Integer(1), 0);
                        lpane.add(TL8, new Integer(1), 0);
                }else if(i==2){
                        //Depreciated System.out.println("Condition Met: DP.getCond() = 2");
                        TL9.setBounds(230+210, 30, 20, 50);
                        TL10.setBounds(350+210, 120, 20, 50);
                        //TL11.setBounds(290+210, 0, 20, 50);
                        TL12.setBounds(290+210, 140, 20, 50);
                        lpane.add(TL9, new Integer(1), 0);
                        lpane.add(TL10, new Integer(1), 0);
                        lpane.add(TL11, new Integer(1), 0);
                        lpane.add(TL12, new Integer(1), 0);
                }else if(i==3){
                        //Depreciated System.out.println("Condition Met: DP.getCond() = 2");
                        TL13.setBounds(230-210, 220, 20, 50);
                        TL14.setBounds(350-210, 330, 20, 50);
                        //TL15.setBounds(290-210, 205, 20, 50);
                        TL16.setBounds(290-210, 330, 20, 50);
                        lpane.add(TL13, new Integer(1), 0);
                        lpane.add(TL14, new Integer(1), 0);
                        lpane.add(TL15, new Integer(1), 0);
                        lpane.add(TL16, new Integer(1), 0);
                }else if(i==4){
                        //Depreciated System.out.println("Condition Met: DP.getCond() = 2");
                        TL17.setBounds(230, 220, 20, 50);
                        TL18.setBounds(350, 330, 20, 50);
                        //TL19.setBounds(290, 205, 20, 50);
                        TL20.setBounds(290, 330, 20, 50);
                        lpane.add(TL17, new Integer(1), 0);
                        lpane.add(TL18, new Integer(1), 0);
                        lpane.add(TL19, new Integer(1), 0);
                        lpane.add(TL20, new Integer(1), 0);
                }else if(i==5){
                        //Depreciated System.out.println("Condition Met: DP.getCond() = 2");
                        TL21.setBounds(230+210, 220, 20, 50);
                        TL22.setBounds(350+210, 330, 20, 50);
                        //TL23.setBounds(290+210, 205, 20, 50);
                        TL24.setBounds(290+210, 330, 20, 50);
                        lpane.add(TL21, new Integer(1), 0);
                        lpane.add(TL22, new Integer(1), 0);
                        lpane.add(TL23, new Integer(1), 0);
                        lpane.add(TL24, new Integer(1), 0);
                }else if(i==6){
                        //Depreciated System.out.println("Condition Met: DP.getCond() = 2");
                        TL25.setBounds(230-210, 220+210, 20, 50);
                        TL26.setBounds(350-210, 330+210, 20, 50);
                        //TL27.setBounds(290-210, 205+210, 20, 50);
                        TL28.setBounds(290-210, 330+210, 20, 50);
                        lpane.add(TL25, new Integer(1), 0);
                        lpane.add(TL26, new Integer(1), 0);
                        lpane.add(TL27, new Integer(1), 0);
                        lpane.add(TL28, new Integer(1), 0);
                }else if(i==7){
                        //Depreciated System.out.println("Condition Met: DP.getCond() = 2");
                        TL29.setBounds(230, 220+210, 20, 50);
                        TL30.setBounds(350, 330+210, 20, 50);
                       // TL31.setBounds(290, 205+210, 20, 50);
                        TL32.setBounds(290, 330+210, 20, 50);
                        lpane.add(TL29, new Integer(1), 0);
                        lpane.add(TL30, new Integer(1), 0);
                        lpane.add(TL31, new Integer(1), 0);
                        lpane.add(TL32, new Integer(1), 0);
                }else{
                        //Depreciated System.out.println("Condition Met: DP.getCond() = 2");
                        TL33.setBounds(230+210, 220+210, 20, 50);
                        TL34.setBounds(350+210, 330+210, 20, 50);
                       // TL35.setBounds(290+210, 205+210, 20, 50);
                        TL36.setBounds(290+210, 330+210, 20, 50);
                        lpane.add(TL33, new Integer(1), 0);
                        lpane.add(TL34, new Integer(1), 0);
                        lpane.add(TL35, new Integer(1), 0);
                        lpane.add(TL36, new Integer(1), 0);

                }
            }



        }
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
