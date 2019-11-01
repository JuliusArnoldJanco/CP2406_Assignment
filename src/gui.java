import SANDBOX.DataPoints;
import SANDBOX.TrafficLight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.IOException;

class gui implements ActionListener {
    ImageSetup IS = new ImageSetup();
    DataPoints DP = new DataPoints();
    private JLabel statusbar;
    Handlerclass handler = new Handlerclass();
    //Handlerclass2 handler2 = new Handlerclass2();

    ImageIcon micon1 = IS.getIcon5();
    ImageIcon micon2 = IS.getIcon6();
    ImageIcon micon3 = IS.getIcon7();
    ImageIcon micon4 = IS.getIcon8();

    ImageIcon icon1 = IS.getIcon1();
    ImageIcon icon2 = IS.getIcon2();
    ImageIcon icon3 = IS.getIcon3();
    ImageIcon icon4 = IS.getIcon4();

    JLabel gicon1 = new JLabel(icon1);
    JLabel gicon2 = new JLabel(icon2);
    JLabel gicon3 = new JLabel(icon3);
    JLabel gicon4 = new JLabel(icon4);

    JLabel grid1 = new JLabel(IS.getImageFromArray(0));
    JLabel grid2 = new JLabel(IS.getImageFromArray(1));
    JLabel grid3 = new JLabel(IS.getImageFromArray(2));
    JLabel grid4 = new JLabel(IS.getImageFromArray(3));
    JLabel grid5 = new JLabel(IS.getImageFromArray(4));
    JLabel grid6 = new JLabel(IS.getImageFromArray(5));
    JLabel grid7 = new JLabel(IS.getImageFromArray(6));
    JLabel grid8 = new JLabel(IS.getImageFromArray(7));
    JLabel grid9 = new JLabel(IS.getImageFromArray(8));



    public gui() {



        //Main Window
        JFrame f = new JFrame("Traffic Sim");

        JPanel overlay = new JPanel();
        JPanel content = new JPanel();
        overlay.setLayout(new OverlayLayout(overlay));

        content.setLayout(new BorderLayout());

        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(5, 1));

        menu.setSize(200, 600);

        JPanel gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(3, 3));
        menu.setSize(600, 600);

        statusbar = new JLabel("default");
        f.add(statusbar, BorderLayout.SOUTH);
        //Corner Grid menu
        JPanel buttonsPanel2 = new JPanel();
        buttonsPanel2.setLayout(new GridLayout(2, 2));


        TrafficLight TL = new TrafficLight();




        //Listeners have been added to these objects
        JLabel rdCnr = new JLabel(micon1, JLabel.CENTER);
        JLabel rdStr8 = new JLabel(micon4, JLabel.CENTER);
        JLabel rdXsec = new JLabel(micon3, JLabel.CENTER);
        JLabel rdTsec = new JLabel(micon2, JLabel.CENTER);
        
        JButton startBtn =new JButton("SAVE");
        JButton stopBtn =new JButton("LOAD");
        
        rdCnr.addMouseListener(handler);
        rdStr8.addMouseListener(handler);
        rdXsec.addMouseListener(handler);
        rdTsec.addMouseListener(handler);
        //Listeners are created here
        startBtn.addMouseListener(handler);
        stopBtn.addMouseListener(handler);
        grid1.addMouseListener(handler); //for mouse but not motion
        grid2.addMouseListener(handler); //for motion events
        grid3.addMouseListener(handler); //for motion events
        grid4.addMouseListener(handler); //for motion events
        grid5.addMouseListener(handler); //for motion events
        grid6.addMouseListener(handler); //for motion events
        grid7.addMouseListener(handler); //for motion events
        grid8.addMouseListener(handler); //for motion events
        grid9.addMouseListener(handler); //for motion events


        buttonsPanel2.add(rdCnr);
        buttonsPanel2.add(rdXsec);
        buttonsPanel2.add(rdTsec);
        buttonsPanel2.add(rdStr8);

        menu.add(buttonsPanel2);
        menu.add(startBtn);
        menu.add(stopBtn);
        menu.add(TL);

        gridPanel.add(grid1);
        gridPanel.add(grid2);
        gridPanel.add(grid3);
        gridPanel.add(grid4);
        gridPanel.add(grid5);
        gridPanel.add(grid6);
        gridPanel.add(grid7);
        gridPanel.add(grid8);
        gridPanel.add(grid9);

        content.add(gridPanel, BorderLayout.CENTER);
        content.add(menu, BorderLayout.WEST);
        overlay.add(content,BorderLayout.CENTER);

        f.add(overlay,BorderLayout.CENTER);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(690, 650);

        f.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (DP.getPressX()<100 && DP.getPressY()<200){
            grid1= gicon1;
            statusbar.setText(String.format("Action acknowledged"));
        }
    }








    // finally our handler class
    public class Handlerclass2 implements MouseListener, MouseMotionListener {


        public void mouseClicked(MouseEvent event) {
            // whenever the mouse is states the position where it clicked with x and y in the statusbar
            // statusbar.setText(String.format("Clicked at %d, %d", event.getXOnScreen(), event.getYOnScreen()));
            System.out.println("Hello");
        }

        public void mousePressed(MouseEvent event) {
           
        }
        public void mouseReleased(MouseEvent event) {
           
        }
        //when the mouse entered the area(our window) this happens
        public void mouseEntered(MouseEvent event){


      

            // mousepanel.setBackground(Color.RED);

        }
        // when mouse exists the window this happens
        public void mouseExited(MouseEvent event) {
        
        }

        // these are mouse Motion listeners
        public void mouseDragged(MouseEvent event) {
            statusbar.setText("u r dragging the mouse!!");
        }
        public void mouseMoved(MouseEvent event) {
            //DP.setX(event.getXOnScreen());
            // DP.setY(event.getYOnScreen());
            //  statusbar.setText(String.format("X: %d & Y: %d",DP.getX(),DP.getY()));
        }




    }
    // finally our handler class
    public class Handlerclass implements MouseListener, MouseMotionListener {


        public void mouseClicked(MouseEvent event) {
            // whenever the mouse is states the position where it clicked with x and y in the statusbar
            // statusbar.setText(String.format("Clicked at %d, %d", event.getXOnScreen(), event.getYOnScreen()));
            if (DP.getPressX()>8 && DP.getPressX()<75 && DP.getPressY()>70 && DP.getPressY()<267){
                CsvWriter saveGame;

                saveGame = new CsvWriter();
                saveGame.setImageIcon(0, DP.getCond(0));
                saveGame.setImageIcon(1, DP.getCond(1));
                saveGame.setImageIcon(2, DP.getCond(2));
                saveGame.setImageIcon(3, DP.getCond(3));
                saveGame.setImageIcon(4, DP.getCond(4));
                saveGame.setImageIcon(5, DP.getCond(5));
                saveGame.setImageIcon(6, DP.getCond(6));
                saveGame.setImageIcon(7, DP.getCond(7));
                saveGame.setImageIcon(8, DP.getCond(8));
                saveGame.Save();

            }

            if (DP.getPressX()>8 && DP.getPressX()<75 && DP.getPressY()>268 && DP.getPressY()<368) {

                try {
                    LoadGame LG = new LoadGame();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
            }

        }

        public void mousePressed(MouseEvent event) {
            DP.setPressX(event.getXOnScreen());
            DP.setPressY(event.getYOnScreen());
            statusbar.setText(String.format("Pressed at %d, %d", DP.getPressX(), DP.getPressY()));
        }

        public void mouseReleased(MouseEvent event) {
            DP.setReleaseX(event.getXOnScreen());
            DP.setReleaseY(event.getYOnScreen());
            statusbar.setText(String.format("Released at %d, %d", DP.getReleaseX(), DP.getReleaseY()));

            gridIcons();
        }

        //when the mouse entered the area(our window) this happens
        public void mouseEntered(MouseEvent event) {


            statusbar.setText("u entered the area");

            // mousepanel.setBackground(Color.RED);

        }

        // when mouse exists the window this happens
        public void mouseExited(MouseEvent event) {
            //   statusbar.setText(String.format("Stored value in DataPoints is: %d, %d", DP.getX(), DP.getY()));
            // mousepanel.setBackground(Color.WHITE);

        }

        // these are mouse Motion listeners
        public void mouseDragged(MouseEvent event) {
            statusbar.setText("u r dragging the mouse!!");
        }

        public void mouseMoved(MouseEvent event) {
            //DP.setX(event.getXOnScreen());
            // DP.setY(event.getYOnScreen());
            //  statusbar.setText(String.format("X: %d & Y: %d",DP.getX(),DP.getY()));
        }


        public void gridIcons() {

            //Grid Icon 1

            if (DP.getPressX() < 46 && DP.getPressY() < 86 && DP.getReleaseX() > 86 && DP.getReleaseX() < 275 && DP.getReleaseY() < 230 && DP.getReleaseY() > 30) {
                grid1.setIcon(icon1);
                DP.InputCondition(1, 0);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 46 && DP.getPressX() < 86 && DP.getPressY() < 86 && DP.getPressY() > 30 && DP.getReleaseX() > 86 && DP.getReleaseX() < 275 && DP.getReleaseY() < 230 && DP.getReleaseY() > 30) {
                grid1.setIcon(icon3);
                DP.InputCondition(3, 0);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 10 && DP.getPressX() < 46 && DP.getPressY() > 86 && DP.getPressY() < 160 && DP.getReleaseX() > 86 && DP.getReleaseX() < 275 && DP.getReleaseY() < 230 && DP.getReleaseY() > 30) {
                grid1.setIcon(icon4);
                DP.InputCondition(4, 0);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 46 && DP.getPressX() < 86 && DP.getPressY() > 86 && DP.getPressY() < 160 && DP.getReleaseX() > 86 && DP.getReleaseX() < 275 && DP.getReleaseY() < 230 && DP.getReleaseY() > 30) {
                grid1.setIcon(icon2);
                DP.InputCondition(2, 0);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            }


            //Grid Icon 2


            else if (DP.getPressX() < 46 && DP.getPressY() < 86 && DP.getReleaseX() > 286 && DP.getReleaseX() < 484 && DP.getReleaseY() < 230 && DP.getReleaseY() > 30) {
                grid2.setIcon(icon1);
                DP.InputCondition(1, 1);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 46 && DP.getPressX() < 86 && DP.getPressY() < 86 && DP.getPressY() > 30 && DP.getReleaseX() > 286 && DP.getReleaseX() < 484 && DP.getReleaseY() < 230 && DP.getReleaseY() > 30) {
                grid2.setIcon(icon3);
                DP.InputCondition(3, 1);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 10 && DP.getPressX() < 46 && DP.getPressY() > 86 && DP.getPressY() < 160 && DP.getReleaseX() > 286 && DP.getReleaseX() < 484 && DP.getReleaseY() < 230 && DP.getReleaseY() > 30) {
                grid2.setIcon(icon4);
                DP.InputCondition(4, 1);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 46 && DP.getPressX() < 86 && DP.getPressY() > 86 && DP.getPressY() < 160 && DP.getReleaseX() > 286 && DP.getReleaseX() < 484 && DP.getReleaseY() < 230 && DP.getReleaseY() > 30) {
                grid2.setIcon(icon2);
                DP.InputCondition(2, 1);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            }

            // Grid Icon 3

            else if (DP.getPressX() < 46 && DP.getPressY() < 86 && DP.getReleaseX() > 491 && DP.getReleaseX() < 686 && DP.getReleaseY() < 230 && DP.getReleaseY() > 30) {
                grid3.setIcon(new RotatedIcon(icon1, 90.0));
                DP.InputCondition(1, 2);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 46 && DP.getPressX() < 86 && DP.getPressY() < 86 && DP.getPressY() > 30 && DP.getReleaseX() > 491 && DP.getReleaseX() < 686 && DP.getReleaseY() < 230 && DP.getReleaseY() > 30) {
                grid3.setIcon(icon3);
                DP.InputCondition(3, 2);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 10 && DP.getPressX() < 46 && DP.getPressY() > 86 && DP.getPressY() < 160 && DP.getReleaseX() > 491 && DP.getReleaseX() < 686 && DP.getReleaseY() < 230 && DP.getReleaseY() > 30) {
                grid3.setIcon(icon4);
                DP.InputCondition(4, 2);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 46 && DP.getPressX() < 86 && DP.getPressY() > 86 && DP.getPressY() < 160 && DP.getReleaseX() > 491 && DP.getReleaseX() < 686 && DP.getReleaseY() < 230 && DP.getReleaseY() > 30) {
                grid3.setIcon(icon2);
                DP.InputCondition(2, 2);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            }

            //Grid Icon 4

            if (DP.getPressX() < 46 && DP.getPressY() < 86 && DP.getReleaseX() > 86 && DP.getReleaseX() < 275 && DP.getReleaseY() < 433 && DP.getReleaseY() > 230) {
                grid4.setIcon(icon1);
                DP.InputCondition(1, 3);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 46 && DP.getPressX() < 86 && DP.getPressY() < 86 && DP.getPressY() > 30 && DP.getReleaseX() > 86 && DP.getReleaseX() < 275 && DP.getReleaseY() < 433 && DP.getReleaseY() > 230) {
                grid4.setIcon(icon3);
                DP.InputCondition(3, 3);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 10 && DP.getPressX() < 46 && DP.getPressY() > 86 && DP.getPressY() < 160 && DP.getReleaseX() > 86 && DP.getReleaseX() < 275 && DP.getReleaseY() < 433 && DP.getReleaseY() > 230) {
                grid4.setIcon(icon4);
                DP.InputCondition(4, 3);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 46 && DP.getPressX() < 86 && DP.getPressY() > 86 && DP.getPressY() < 160 && DP.getReleaseX() > 86 && DP.getReleaseX() < 275 && DP.getReleaseY() < 433 && DP.getReleaseY() > 230) {
                grid4.setIcon(icon2);
                DP.InputCondition(2, 3);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            }


            //Grid Icon 5


            else if (DP.getPressX() < 46 && DP.getPressY() < 86 && DP.getReleaseX() > 286 && DP.getReleaseX() < 484 && DP.getReleaseY() < 433 && DP.getReleaseY() > 230) {
                grid5.setIcon(icon1);
                DP.InputCondition(1, 4);
                System.out.println(String.format("Action acknowledged 0"));
            } else if (DP.getPressX() > 46 && DP.getPressX() < 86 && DP.getPressY() < 86 && DP.getPressY() > 30 && DP.getReleaseX() > 286 && DP.getReleaseX() < 484 && DP.getReleaseY() < 433 && DP.getReleaseY() > 230) {
                grid5.setIcon(icon3);
                DP.InputCondition(3, 4);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 10 && DP.getPressX() < 46 && DP.getPressY() > 86 && DP.getPressY() < 160 && DP.getReleaseX() > 286 && DP.getReleaseX() < 484 && DP.getReleaseY() < 433 && DP.getReleaseY() > 230) {
                grid5.setIcon(icon4);
                DP.InputCondition(4, 4);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 46 && DP.getPressX() < 86 && DP.getPressY() > 86 && DP.getPressY() < 160 && DP.getReleaseX() > 286 && DP.getReleaseX() < 484 && DP.getReleaseY() < 433 && DP.getReleaseY() > 230) {
                grid5.setIcon(icon2);
                DP.InputCondition(2, 4);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            }


            //Grid Icon 6

            else if (DP.getPressX() < 46 && DP.getPressY() < 86 && DP.getReleaseX() > 491 && DP.getReleaseX() < 686 && DP.getReleaseY() < 433 && DP.getReleaseY() > 230) {
                grid6.setIcon(icon1);
                DP.InputCondition(1, 5);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 46 && DP.getPressX() < 86 && DP.getPressY() < 86 && DP.getPressY() > 30 && DP.getReleaseX() > 491 && DP.getReleaseX() < 686 && DP.getReleaseY() < 433 && DP.getReleaseY() > 230) {
                grid6.setIcon(icon3);
                DP.InputCondition(3, 5);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 10 && DP.getPressX() < 46 && DP.getPressY() > 86 && DP.getPressY() < 160 && DP.getReleaseX() > 491 && DP.getReleaseX() < 686 && DP.getReleaseY() < 433 && DP.getReleaseY() > 230) {
                grid6.setIcon(icon4);
                DP.InputCondition(4, 5);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 46 && DP.getPressX() < 86 && DP.getPressY() > 86 && DP.getPressY() < 160 && DP.getReleaseX() > 491 && DP.getReleaseX() < 686 && DP.getReleaseY() < 433 && DP.getReleaseY() > 230) {
                grid6.setIcon(icon2);
                DP.InputCondition(2, 5);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            }

            if (DP.getCond(5) == 4 && DP.getReleaseX() > 491 && DP.getReleaseX() < 686 && DP.getReleaseY() < 433 && DP.getReleaseY() > 230 && DP.getPressX() == DP.getReleaseX()) {
                if (DP.getPressX() == DP.getReleaseX()) {
                    DP.setStr8Rotation();
                    DP.InputCondition(41, 5);
                    grid6.setIcon(new RotatedIcon(icon4, DP.getStr8Rotation()));
                    System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
                }
            }

            //Grid Icon 7

            if (DP.getPressX() < 46 && DP.getPressY() < 86 && DP.getReleaseX() > 86 && DP.getReleaseX() < 275 && DP.getReleaseY() < 633 && DP.getReleaseY() > 430) {
                grid7.setIcon(new RotatedIcon(icon1, 270));
                DP.InputCondition(1, 6);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 46 && DP.getPressX() < 86 && DP.getPressY() < 86 && DP.getPressY() > 30 && DP.getReleaseX() > 86 && DP.getReleaseX() < 275 && DP.getReleaseY() < 633 && DP.getReleaseY() > 430) {
                grid7.setIcon(icon3);
                DP.InputCondition(3, 6);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 10 && DP.getPressX() < 46 && DP.getPressY() > 86 && DP.getPressY() < 160 && DP.getReleaseX() > 86 && DP.getReleaseX() < 275 && DP.getReleaseY() < 633 && DP.getReleaseY() > 430) {
                grid7.setIcon(icon4);
                DP.InputCondition(4, 6);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 46 && DP.getPressX() < 86 && DP.getPressY() > 86 && DP.getPressY() < 160 && DP.getReleaseX() > 86 && DP.getReleaseX() < 275 && DP.getReleaseY() < 633 && DP.getReleaseY() > 430) {
                grid7.setIcon(icon2);
                DP.InputCondition(2, 6);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            }


            //Grid Icon 8


            else if (DP.getPressX() < 46 && DP.getPressY() < 86 && DP.getReleaseX() > 286 && DP.getReleaseX() < 484 && DP.getReleaseY() < 633 && DP.getReleaseY() > 430) {
                grid8.setIcon(icon1);
                DP.InputCondition(1, 7);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 46 && DP.getPressX() < 86 && DP.getPressY() < 86 && DP.getPressY() > 30 && DP.getReleaseX() > 286 && DP.getReleaseX() < 484 && DP.getReleaseY() < 633 && DP.getReleaseY() > 430) {
                grid8.setIcon(icon3);
                DP.InputCondition(3, 7);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 10 && DP.getPressX() < 46 && DP.getPressY() > 86 && DP.getPressY() < 160 && DP.getReleaseX() > 286 && DP.getReleaseX() < 484 && DP.getReleaseY() < 633 && DP.getReleaseY() > 430) {
                grid8.setIcon(icon4);
                DP.InputCondition(4, 7);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 46 && DP.getPressX() < 86 && DP.getPressY() > 86 && DP.getPressY() < 160 && DP.getReleaseX() > 286 && DP.getReleaseX() < 484 && DP.getReleaseY() < 633 && DP.getReleaseY() > 430) {
                grid8.setIcon(icon2);
                DP.InputCondition(2, 7);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            }


            //Grid Icon 9

            else if (DP.getPressX() < 46 && DP.getPressY() < 86 && DP.getReleaseX() > 491 && DP.getReleaseX() < 686 && DP.getReleaseY() < 633 && DP.getReleaseY() > 430) {
                grid9.setIcon(new RotatedIcon(icon1, 180.0));
                DP.InputCondition(1, 8);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 46 && DP.getPressX() < 86 && DP.getPressY() < 86 && DP.getPressY() > 30 && DP.getReleaseX() > 491 && DP.getReleaseX() < 686 && DP.getReleaseY() < 633 && DP.getReleaseY() > 430) {
                grid9.setIcon(icon3);
                DP.InputCondition(3, 8);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 10 && DP.getPressX() < 46 && DP.getPressY() > 86 && DP.getPressY() < 160 && DP.getReleaseX() > 491 && DP.getReleaseX() < 686 && DP.getReleaseY() < 633 && DP.getReleaseY() > 430) {
                grid9.setIcon(icon4);
                DP.InputCondition(4, 8);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            } else if (DP.getPressX() > 46 && DP.getPressX() < 86 && DP.getPressY() > 86 && DP.getPressY() < 160 && DP.getReleaseX() > 491 && DP.getReleaseX() < 686 && DP.getReleaseY() < 633 && DP.getReleaseY() > 430) {
                grid9.setIcon(icon2);
                DP.InputCondition(2, 8);
                System.out.println(String.format("Idx1: %d Idx2: %d Idx3: %d Idx4: %d Idx5: %d Idx6: %d Idx7: %d Idx8: %d Idx9: %d ", DP.getCond(0), DP.getCond(1), DP.getCond(2), DP.getCond(3), DP.getCond(4), DP.getCond(5), DP.getCond(6), DP.getCond(7), DP.getCond(8)));
            }
        }
    }

}
