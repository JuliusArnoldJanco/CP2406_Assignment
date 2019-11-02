
// SecondFrame.java
import SANDBOX.DataPoints;
import SANDBOX.TrafficLight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.Random;

public class RunSim extends JPanel implements ActionListener {
    private JFrame frame = new JFrame("Second");
    Timer t = new Timer(5,this);

    private JLayeredPane lpane = new JLayeredPane();
    JLayeredPane content = new JLayeredPane();

    JPanel gridPanel = new JPanel();

    DataPoints DP = new DataPoints();
    ImageSetup IS = new ImageSetup();

    int timeInSeconds = 1;

    private JLabel grid1 = new JLabel(IS.getImageFromArray(0));
    private JLabel grid2 = new JLabel(IS.getImageFromArray(1));
    private JLabel grid3 = new JLabel(IS.getImageFromArray(2));
    private JLabel grid4 = new JLabel(IS.getImageFromArray(3));
    private JLabel grid5 = new JLabel(IS.getImageFromArray(4));
    private JLabel grid6 = new JLabel(IS.getImageFromArray(5));
    private JLabel grid7 = new JLabel(IS.getImageFromArray(6));
    private JLabel grid8 = new JLabel(IS.getImageFromArray(7));
    private JLabel grid9 = new JLabel(IS.getImageFromArray(8));

    private TrafficLight TL = new TrafficLight();
    private TrafficLight TL2 = new TrafficLight();
    private TrafficLight TL3 = new TrafficLight();
    private TrafficLight TL4 = new TrafficLight();
    private TrafficLight TL5 = new TrafficLight();
    private TrafficLight TL6 = new TrafficLight();
    private TrafficLight TL7 = new TrafficLight();
    private TrafficLight TL8 = new TrafficLight();
    private TrafficLight TL9 = new TrafficLight();
    private TrafficLight TL10 = new TrafficLight();
    private TrafficLight TL11 = new TrafficLight();
    private TrafficLight TL12 = new TrafficLight();
    private TrafficLight TL13 = new TrafficLight();
    private TrafficLight TL14 = new TrafficLight();
    private TrafficLight TL15 = new TrafficLight();
    private TrafficLight TL16 = new TrafficLight();
    private TrafficLight TL17 = new TrafficLight();
    private TrafficLight TL18 = new TrafficLight();
    private TrafficLight TL19 = new TrafficLight();
    private TrafficLight TL20 = new TrafficLight();
    private TrafficLight TL21 = new TrafficLight();
    private TrafficLight TL22 = new TrafficLight();
    private TrafficLight TL23 = new TrafficLight();
    private TrafficLight TL24 = new TrafficLight();
    private TrafficLight TL25 = new TrafficLight();
    private TrafficLight TL26 = new TrafficLight();
    private TrafficLight TL27 = new TrafficLight();
    private TrafficLight TL28 = new TrafficLight();
    private TrafficLight TL29 = new TrafficLight();
    private TrafficLight TL30 = new TrafficLight();
    private TrafficLight TL31 = new TrafficLight();
    private TrafficLight TL32 = new TrafficLight();
    private TrafficLight TL33 = new TrafficLight();
    private TrafficLight TL34 = new TrafficLight();
    private TrafficLight TL35 = new TrafficLight();
    private TrafficLight TL36 = new TrafficLight();
    private TrafficLight TL50 = new TrafficLight();



    private  int rSeed = 0;
    private int carx = 0;
    private int cary =-2000;



    private Random randomGenerator = new Random();
    private int TLCondition;
    private int TL1Condition;
    private int TL2Condition;
    private int TL3Condition;
    private int TL4Condition;
    private int TL5Condition;
    private int TL6Condition;
    private int TL7Condition;
    private int TL8Condition;
    private int TL9Condition;
    private int TL10Condition;
    private int TL11Condition;
    private int TL13Condition;
    private int TL14Condition;
    private int TL15Condition;
    private int TL16Condition;
    private int TL17Condition;
    private int TL18Condition;
    private int TL19Condition;



    public RunSim() throws FileNotFoundException {

        lpane.setBounds(0, 0, 600, 600);
        LoadGridConditions();

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
        frame.setPreferredSize(new Dimension(600, 640));
        frame.setLayout(new BorderLayout());
        frame.add(lpane, BorderLayout.CENTER);
        gridPanel.setBounds(0, 0, 600, 600);
        gridPanel.setOpaque(true);
        lpane.add(gridPanel, (0), 0);
        frame.pack();
        frame.setVisible(true);

        t.start();
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



    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        rSeed += 10;


            if(cary>600){cary=0;
                TL50.setBounds(100, cary, 20, 50);
                lpane.add(TL50, (2), 0);}

            if (cary <200 && TL3.getTrafficLightCondition()!=1) {
                carx += 5;
                cary += 5;
                TL50.setBounds(100, cary, 20, 50);
                lpane.add(TL50, (2), 0);
            }
            else if (cary <200 && TL3.getTrafficLightCondition()==1) {
            TL50.setBounds(100, cary, 20, 50);
            lpane.add(TL50, (2), 0);}



            else if (cary >199 && cary < 400 && TL16.getTrafficLightCondition()==1) {
                TL50.setBounds(100, cary, 20, 50);
                lpane.add(TL50, (2), 0);
            }
            else if (cary >199 && cary < 400 && TL16.getTrafficLightCondition()!=1) {
                carx += 5;
                cary += 5;
                TL50.setBounds(100, cary, 20, 50);
                lpane.add(TL50, (2), 0);
            }
            else if (cary >399 && TL28.getTrafficLightCondition()==1) {
            TL50.setBounds(100, cary, 20, 50);
            lpane.add(TL50, (2), 0);}

            else if (cary >399 && TL28.getTrafficLightCondition()!=1) {
                carx += 5;
                cary += 5;
            TL50.setBounds(100, cary, 20, 50);
            lpane.add(TL50, (2), 0);}


        RandomLightChanges();
        if (rSeed == timeInSeconds*1000) {
            System.out.println("G1: "+DP.getCond(0)+" G2: "+DP.getCond(1)+" G3: "+DP.getCond(2)+" G4: "+DP.getCond(3)+" G5: "+DP.getCond(4)+" G6: "+DP.getCond(5)+" G7: "+DP.getCond(6)+" G8: "+DP.getCond(7)+" G9: "+DP.getCond(8));
            for (int i = 0; i < DP.getGridIcons().length; i++) {

                ChangeTrafficLights(i);


            }
        } else if (rSeed > timeInSeconds*1000){rSeed =0;}
        else{}



        //System.out.println(TL1Condition);


    }

    public void RandomLightChanges() {
        TLCondition = randomGenerator.nextInt(3) + 1;
        TL1Condition = randomGenerator.nextInt(3) + 1;
        TL2Condition = randomGenerator.nextInt(3) + 1;
        TL3Condition = randomGenerator.nextInt(3) + 1;
        TL4Condition = randomGenerator.nextInt(3) + 1;
        TL5Condition = randomGenerator.nextInt(3) + 1;
        TL6Condition = randomGenerator.nextInt(3) + 1;
        TL7Condition = randomGenerator.nextInt(3) + 1;
        TL8Condition = randomGenerator.nextInt(3) + 1;
        TL9Condition = randomGenerator.nextInt(3) + 1;
        TL10Condition = randomGenerator.nextInt(3) + 1;
        TL11Condition = randomGenerator.nextInt(3) + 1;
        TL13Condition = randomGenerator.nextInt(3) + 1;
        TL14Condition = randomGenerator.nextInt(3) + 1;
        TL15Condition = randomGenerator.nextInt(3) + 1;
        TL16Condition = randomGenerator.nextInt(3) + 1;
        TL17Condition = randomGenerator.nextInt(3) + 1;
        TL18Condition = randomGenerator.nextInt(3) + 1;
        TL19Condition = randomGenerator.nextInt(3) + 1;
        TL.setTrafficLightCondition(TLCondition);
        TL2.setTrafficLightCondition(TLCondition);
        TL5.setTrafficLightCondition(TL2Condition);
        TL6.setTrafficLightCondition(TL2Condition);
        TL9.setTrafficLightCondition(TL3Condition);
        TL10.setTrafficLightCondition(TL3Condition);
        TL13.setTrafficLightCondition(TL4Condition);
        TL14.setTrafficLightCondition(TL4Condition);
        TL17.setTrafficLightCondition(TL5Condition);
        TL18.setTrafficLightCondition(TL5Condition);
        TL21.setTrafficLightCondition(TL6Condition);
        TL22.setTrafficLightCondition(TL6Condition);
        TL25.setTrafficLightCondition(TL7Condition);
        TL26.setTrafficLightCondition(TL7Condition);
        TL29.setTrafficLightCondition(TL8Condition);
        TL30.setTrafficLightCondition(TL8Condition);
        TL33.setTrafficLightCondition(TL9Condition);
        TL34.setTrafficLightCondition(TL9Condition);
    }

    public void ChangeTrafficLights(int i) {
        if (DP.getCond(i) == 3) {

            if (i == 0) {
                TL.setBounds(230 - 210, 30, 20, 50);
                TL.setTrafficLightCondition(TLCondition);
                TL2.setBounds(350 - 210, 120, 20, 50);
                TL2.setTrafficLightCondition(TLCondition);
                if (TLCondition == 1) {
                    TL3.setTrafficLightCondition(3);
                    TL4.setTrafficLightCondition(3);
                } else if (TLCondition == 2) {
                    TL3.setTrafficLightCondition(1);
                    TL4.setTrafficLightCondition(1);
                } else {
                    TL3.setTrafficLightCondition(1);
                    TL4.setTrafficLightCondition(1);
                }
                TL3.setBounds(290 - 210, 0, 20, 50);
                TL4.setBounds(290 - 210, 140, 20, 50);


                lpane.add(TL, (1), 0);
                lpane.add(TL2, (1), 0);
                lpane.add(TL3, (1), 0);
                lpane.add(TL4, (1), 0);

            } else if (i == 1) {

                TL5.setBounds(230, 30, 20, 50);
                TL5.setTrafficLightCondition(TL2Condition);
                TL6.setBounds(350, 120, 20, 50);
                TL6.setTrafficLightCondition(TL2Condition);
                System.out.println("Traffic lights in a cross section at grid 1");
                if (TL2Condition == 1) {
                    TL7.setTrafficLightCondition(3);
                    TL8.setTrafficLightCondition(3);
                } else if (TL2Condition == 2) {
                    TL7.setTrafficLightCondition(1);
                    TL8.setTrafficLightCondition(1);
                } else {
                    TL7.setTrafficLightCondition(1);
                    TL8.setTrafficLightCondition(1);
                }
                TL7.setBounds(290, 0, 20, 50);
                TL8.setBounds(290, 140, 20, 50);

                lpane.add(TL5, (1), 0);
                lpane.add(TL6, (1), 0);
                lpane.add(TL7, (1), 0);
                lpane.add(TL8, (1), 0);


            } else if (i == 2) {
                TL9.setBounds(230 + 210, 30, 20, 50);
                TL9.setTrafficLightCondition(TL3Condition);
                TL10.setBounds(350 + 210, 120, 20, 50);
                TL10.setTrafficLightCondition(TL3Condition);
                if (TL3Condition == 1) {
                    TL11.setTrafficLightCondition(3);
                    TL12.setTrafficLightCondition(3);
                } else if (TL3Condition == 2) {
                    TL11.setTrafficLightCondition(1);
                    TL12.setTrafficLightCondition(1);
                } else {
                    TL11.setTrafficLightCondition(1);
                    TL12.setTrafficLightCondition(1);
                }
                TL11.setBounds(290 + 210, 0, 20, 50);
                TL12.setBounds(290 + 210, 140, 20, 50);
                lpane.add(TL9, (1), 0);
                lpane.add(TL10, (1), 0);
                lpane.add(TL11, (1), 0);
                lpane.add(TL12, (1), 0);
            } else if (i == 3) {
                TL13.setBounds(230 - 210, 220, 20, 50);
                TL13.setTrafficLightCondition(TL4Condition);
                TL14.setBounds(350 - 210, 330, 20, 50);
                TL14.setTrafficLightCondition(TL4Condition);
                if (TL4Condition == 1) {
                    TL15.setTrafficLightCondition(3);
                    TL16.setTrafficLightCondition(3);
                } else if (TL4Condition == 2) {
                    TL15.setTrafficLightCondition(1);
                    TL16.setTrafficLightCondition(1);
                } else {
                    TL15.setTrafficLightCondition(1);
                    TL16.setTrafficLightCondition(1);
                }
                TL15.setBounds(290 - 210, 205, 20, 50);
                TL16.setBounds(290 - 210, 330, 20, 50);
                lpane.add(TL13, (1), 0);
                lpane.add(TL14, (1), 0);
                lpane.add(TL15, (1), 0);
                lpane.add(TL16, (1), 0);
            } else if (i == 4) {
                TL17.setBounds(230, 220, 20, 50);
                TL17.setTrafficLightCondition(TL5Condition);
                TL18.setBounds(350, 330, 20, 50);
                TL18.setTrafficLightCondition(TL5Condition);
                if (TL5Condition == 1) {
                    TL19.setTrafficLightCondition(3);
                    TL20.setTrafficLightCondition(3);
                } else if (TL5Condition == 2) {
                    TL19.setTrafficLightCondition(1);
                    TL20.setTrafficLightCondition(1);
                } else {
                    TL19.setTrafficLightCondition(1);
                    TL20.setTrafficLightCondition(1);
                }
                TL19.setBounds(290, 205, 20, 50);
                TL20.setBounds(290, 330, 20, 50);
                lpane.add(TL17, (1), 0);
                lpane.add(TL18, (1), 0);
                lpane.add(TL19, (1), 0);
                lpane.add(TL20, (1), 0);
            } else if (i == 5) {
                TL21.setBounds(230 + 210, 220, 20, 50);
                TL21.setTrafficLightCondition(TL6Condition);
                TL22.setBounds(350 + 210, 330, 20, 50);
                TL22.setTrafficLightCondition(TL6Condition);
                if (TL6Condition == 1) {
                    TL23.setTrafficLightCondition(3);
                    TL24.setTrafficLightCondition(3);
                } else if (TL6Condition == 2) {
                    TL23.setTrafficLightCondition(1);
                    TL24.setTrafficLightCondition(1);
                } else {
                    TL23.setTrafficLightCondition(1);
                    TL24.setTrafficLightCondition(1);
                }
                TL23.setBounds(290 + 210, 205, 20, 50);
                TL24.setBounds(290 + 210, 330, 20, 50);
                lpane.add(TL21, (1), 0);
                lpane.add(TL22, (1), 0);
                lpane.add(TL23, (1), 0);
                lpane.add(TL24, (1), 0);
            } else if (i == 6) {
                TL25.setBounds(230 - 210, 220 + 210, 20, 50);
                TL25.setTrafficLightCondition(TL7Condition);
                TL26.setBounds(350 - 210, 330 + 210, 20, 50);
                TL26.setTrafficLightCondition(TL7Condition);
                if (TL7Condition == 1) {
                    TL27.setTrafficLightCondition(3);
                    TL28.setTrafficLightCondition(3);
                } else if (TL7Condition == 2) {
                    TL27.setTrafficLightCondition(1);
                    TL28.setTrafficLightCondition(1);
                } else {
                    TL27.setTrafficLightCondition(1);
                    TL28.setTrafficLightCondition(1);
                }
                TL27.setBounds(290 - 210, 205 + 210, 20, 50);
                TL28.setBounds(290 - 210, 330 + 210, 20, 50);
                lpane.add(TL25, (1), 0);
                lpane.add(TL26, (1), 0);
                lpane.add(TL27, (1), 0);
                lpane.add(TL28, (1), 0);
            } else if (i == 7) {
                TL29.setBounds(230, 220 + 210, 20, 50);
                TL29.setTrafficLightCondition(TL8Condition);
                TL30.setBounds(350, 330 + 210, 20, 50);
                TL30.setTrafficLightCondition(TL8Condition);
                if (TL8Condition == 1) {
                    TL31.setTrafficLightCondition(3);
                    TL32.setTrafficLightCondition(3);
                } else if (TL8Condition == 2) {
                    TL31.setTrafficLightCondition(1);
                    TL32.setTrafficLightCondition(1);
                } else {
                    TL31.setTrafficLightCondition(1);
                    TL32.setTrafficLightCondition(1);
                }
                TL31.setBounds(290, 205 + 210, 20, 50);
                TL32.setBounds(290, 330 + 210, 20, 50);
                lpane.add(TL29, (1), 0);
                lpane.add(TL30, (1), 0);
                lpane.add(TL31, (1), 0);
                lpane.add(TL32, (1), 0);
            } else {
                TL33.setBounds(230 + 210, 220 + 210, 20, 50);
                TL33.setTrafficLightCondition(TL9Condition);
                TL34.setBounds(350 + 210, 330 + 210, 20, 50);
                TL34.setTrafficLightCondition(TL9Condition);
                if (TL9Condition == 1) {
                    TL35.setTrafficLightCondition(3);
                    TL36.setTrafficLightCondition(3);
                } else if (TL9Condition == 2) {
                    TL35.setTrafficLightCondition(1);
                    TL36.setTrafficLightCondition(1);
                } else {
                    TL35.setTrafficLightCondition(1);
                    TL36.setTrafficLightCondition(1);
                }
                TL35.setBounds(290 + 210, 205 + 210, 20, 50);
                TL36.setBounds(290 + 210, 330 + 210, 20, 50);
                lpane.add(TL33, (1), 0);
                lpane.add(TL34, (1), 0);
                lpane.add(TL35, (1), 0);
                lpane.add(TL36, (1), 0);

            }
        } else if (DP.getCond(i) == 2) {

            if (i == 0) {
                //Depreciated System.out.println("Condition Met: DP.getCond() = 2");
                TL.setBounds(230 - 210, 30, 20, 50);
                TL.setTrafficLightCondition(TL10Condition);
                TL2.setBounds(350 - 210, 120, 20, 50);
                TL2.setTrafficLightCondition(TL10Condition);
                if (TL10Condition == 1) {
                    TL4.setTrafficLightCondition(3);
                } else if (TL10Condition == 2) {
                    TL4.setTrafficLightCondition(1);
                } else {
                    TL4.setTrafficLightCondition(1);
                }
                TL4.setBounds(290 - 210, 140, 20, 50);
                lpane.add(TL, (1), 0);
                lpane.add(TL2, (1), 0);
                lpane.add(TL3, (1), 0);
                lpane.add(TL4, (1), 0);
            } else if (i == 1) {
                //Depreciated System.out.println("Condition Met: DP.getCond() = 2");
                TL5.setBounds(230, 30, 20, 50);
                TL5.setTrafficLightCondition(TL11Condition);
                TL6.setBounds(350, 120, 20, 50);
                TL6.setTrafficLightCondition(TL11Condition);
                if (TL11Condition == 1) {
                    TL8.setTrafficLightCondition(3);
                } else if (TL11Condition == 2) {
                    TL8.setTrafficLightCondition(1);
                } else {
                    TL8.setTrafficLightCondition(1);
                }
                TL8.setBounds(290, 140, 20, 50);
                lpane.add(TL5, (1), 0);
                lpane.add(TL6, (1), 0);
                lpane.add(TL7, (1), 0);
                lpane.add(TL8, (1), 0);
            } else if (i == 2) {
                //Depreciated System.out.println("Condition Met: DP.getCond() = 2");
                TL9.setBounds(230 + 210, 30, 20, 50);
                TL9.setTrafficLightCondition(TL13Condition);
                TL10.setBounds(350 + 210, 120, 20, 50);
                TL10.setTrafficLightCondition(TL13Condition);
                if (TL13Condition == 1) {
                    TL12.setTrafficLightCondition(3);
                } else if (TL13Condition == 2) {
                    TL12.setTrafficLightCondition(1);
                } else {
                    TL12.setTrafficLightCondition(1);
                }
                //TL11.setBounds(290+210, 0, 20, 50);
                TL12.setBounds(290 + 210, 140, 20, 50);
                lpane.add(TL9, (1), 0);
                lpane.add(TL10, (1), 0);
                lpane.add(TL11, (1), 0);
                lpane.add(TL12, (1), 0);
            } else if (i == 3) {
                //Depreciated System.out.println("Condition Met: DP.getCond() = 2");
                TL13.setBounds(230 - 210, 220, 20, 50);
                TL13.setTrafficLightCondition(TL14Condition);
                TL14.setBounds(350 - 210, 330, 20, 50);
                TL14.setTrafficLightCondition(TL14Condition);
                if (TL14Condition == 1) {
                    TL16.setTrafficLightCondition(3);
                } else if (TL14Condition == 2) {
                    TL16.setTrafficLightCondition(1);
                } else {
                    TL16.setTrafficLightCondition(1);
                }
                //TL15.setBounds(290-210, 205, 20, 50);
                TL16.setBounds(290 - 210, 330, 20, 50);
                lpane.add(TL13, (1), 0);
                lpane.add(TL14, (1), 0);
                lpane.add(TL15, (1), 0);
                lpane.add(TL16, (1), 0);
            } else if (i == 4) {
                //Depreciated System.out.println("Condition Met: DP.getCond() = 2");
                TL17.setBounds(230, 220, 20, 50);
                TL17.setTrafficLightCondition(TL15Condition);
                TL18.setBounds(350, 330, 20, 50);
                TL18.setTrafficLightCondition(TL15Condition);
                if (TL15Condition == 1) {
                    TL20.setTrafficLightCondition(3);
                } else if (TL15Condition == 2) {
                    TL20.setTrafficLightCondition(1);
                } else {
                    TL20.setTrafficLightCondition(1);
                }
                //TL19.setBounds(290, 205, 20, 50);
                TL20.setBounds(290, 330, 20, 50);
                lpane.add(TL17, (1), 0);
                lpane.add(TL18, (1), 0);
                lpane.add(TL19, (1), 0);
                lpane.add(TL20, (1), 0);
            } else if (i == 5) {
                //Depreciated System.out.println("Condition Met: DP.getCond() = 2");
                TL21.setBounds(230 + 210, 220, 20, 50);
                TL21.setTrafficLightCondition(TL16Condition);
                TL22.setBounds(350 + 210, 330, 20, 50);
                TL22.setTrafficLightCondition(TL16Condition);
                if (TL16Condition == 1) {
                    TL24.setTrafficLightCondition(3);
                } else if (TL16Condition == 2) {
                    TL24.setTrafficLightCondition(1);
                } else {
                    TL23.setTrafficLightCondition(1);
                    TL24.setTrafficLightCondition(1);
                }
                TL24.setBounds(290 + 210, 330, 20, 50);
                lpane.add(TL21, (1), 0);
                lpane.add(TL22, (1), 0);
                lpane.add(TL23, (1), 0);
                lpane.add(TL24, (1), 0);
            } else if (i == 6) {
                //Depreciated System.out.println("Condition Met: DP.getCond() = 2");
                TL25.setBounds(230 - 210, 220 + 210, 20, 50);
                TL25.setTrafficLightCondition(TL17Condition);
                TL26.setBounds(350 - 210, 330 + 210, 20, 50);
                TL26.setTrafficLightCondition(TL17Condition);
                if (TL17Condition == 1) {
                    TL28.setTrafficLightCondition(3);
                } else if (TL17Condition == 2) {
                    TL28.setTrafficLightCondition(1);
                } else {
                    TL28.setTrafficLightCondition(1);
                }
                TL28.setBounds(290 - 210, 330 + 210, 20, 50);
                lpane.add(TL25, (1), 0);
                lpane.add(TL26, (1), 0);
                lpane.add(TL27, (1), 0);
                lpane.add(TL28, (1), 0);
            } else if (i == 7) {
                //Depreciated System.out.println("Condition Met: DP.getCond() = 2");
                TL29.setBounds(230, 220 + 210, 20, 50);
                TL29.setTrafficLightCondition(TL18Condition);
                TL30.setBounds(350, 330 + 210, 20, 50);
                TL30.setTrafficLightCondition(TL18Condition);
                if (TL18Condition == 1) {
                    TL32.setTrafficLightCondition(3);
                } else if (TL18Condition == 2) {
                    TL32.setTrafficLightCondition(1);
                } else {
                    TL32.setTrafficLightCondition(1);
                }
                TL32.setBounds(290, 330 + 210, 20, 50);
                lpane.add(TL29, (1), 0);
                lpane.add(TL30, (1), 0);
                lpane.add(TL31, (1), 0);
                lpane.add(TL32, (1), 0);
            } else {
                //Depreciated System.out.println("Condition Met: DP.getCond() = 2");
                TL33.setBounds(230 + 210, 220 + 210, 20, 50);
                TL33.setTrafficLightCondition(TL19Condition);
                TL34.setBounds(350 + 210, 330 + 210, 20, 50);
                TL34.setTrafficLightCondition(TL19Condition);
                if (TL19Condition == 1) {
                    TL36.setTrafficLightCondition(3);
                } else if (TL19Condition == 2) {
                    TL36.setTrafficLightCondition(1);
                } else {
                    TL36.setTrafficLightCondition(1);
                }
                TL36.setBounds(290 + 210, 330 + 210, 20, 50);
                lpane.add(TL33, (1), 0);
                lpane.add(TL34, (1), 0);
                lpane.add(TL35, (1), 0);
                lpane.add(TL36, (1), 0);

            }
        }
    }
}
