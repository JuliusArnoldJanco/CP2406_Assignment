/*
* This class simulates the road conditions.
* Depending on what road type is on what grid tile the appropriate traffic lights will populate and animate by changing colours.
* car animation isn't complete or currently really functioning. its there but quite poor.
* only logic for 1 car is programmed but the structure for more cars is there.
* car will progress vertically based on traffic tight condition in front of it.
* the user has no interaction other than to close the window*/

import SANDBOX.DataPoints;
import SANDBOX.TrafficLight;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.Random;

public class RunSim extends JPanel implements ActionListener {

    //Creates the window
    private JFrame frame = new JFrame("Running simulation");

    //Timer for animations
    Timer t = new Timer(10,this);

    //using a layered pane for displaying the moving animations
    private JLayeredPane lpane = new JLayeredPane();
    JLayeredPane content = new JLayeredPane();

    //init a grid panel for the road types
    JPanel gridPanel = new JPanel();

    //crating and instance of imagesetup and datapoints
    //loads the correct road types & then loads the road icons onto the grid
    DataPoints DP = new DataPoints();
    ImageSetup IS = new ImageSetup();

    //Loading the created grid
    LoadGame LG = new LoadGame();

    //This is used to store the position and road type each car is currently on
    RoadPositions RP = new RoadPositions();


    //limit of the counter (*1000)
    int timeInSeconds = 1;



    //Populating grid with images
    private JLabel grid1 = new JLabel(IS.getImageFromArray(0));
    private JLabel grid2 = new JLabel(IS.getImageFromArray(1));
    private JLabel grid3 = new JLabel(IS.getImageFromArray(2));
    private JLabel grid4 = new JLabel(IS.getImageFromArray(3));
    private JLabel grid5 = new JLabel(IS.getImageFromArray(4));
    private JLabel grid6 = new JLabel(IS.getImageFromArray(5));
    private JLabel grid7 = new JLabel(IS.getImageFromArray(6));
    private JLabel grid8 = new JLabel(IS.getImageFromArray(7));
    private JLabel grid9 = new JLabel(IS.getImageFromArray(8));

    //Crating all trafficlight instances
    //creates maximum number of traffic lights
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

    //Populating vehicles
    private Vehicle TL50 = new Vehicle();
    private Vehicle TL51 = new Vehicle();



    //vehicle moving variables
    private  int MovementIncrement = 0;
    private int carx = 700;
    private int cary =0;
    private boolean horizontal = true;

    //counting variable
    private int counter =0;

    // Used to randomize the traffic light conditions
    private Random randomGenerator = new Random();

    //These are used to control half the traffic lights
    //as the other half are dependent on the condition of these
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
    //creating a car variable with grid referencing
    int[] car1;


    //Where the simulation begins

    public RunSim() throws FileNotFoundException {

        //Loads all the JPanels with a layered pane.

        lpane.setBounds(0, 0, 600, 600);

        //Logic for function found at line 182
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

        //Start timer
        t.start();
        }


    private void LoadGridConditions() throws FileNotFoundException {


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

        MovementIncrement += 1;

        //if car is outside window return to origin
        if (cary>600){cary=0;}



        //Logic to move the car depending on its grid position/direction/trafficlight condition

        //Logic to move the car if its going in a horizontal direction
        //approach was check grid position/check road type and then
        //check traffic light condition
        //if traffic light isn't red proceed
        //if the bottom right time is a corner change to horizontal movement.
        //this was going to be further implemented to change direction (horizontal: true/false) based on traffic light conditions
        if (RP.getCar1Grid()==0 && horizontal == false){
            if (TL3.getTrafficLightCondition() != 1) {
                car1YDirectionPos();
                car1 = MoveCar(TL50, cary, Vertical1(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical1()[0],cary);
                horizontal = false;
                }
            else{

                car1 = MoveCar(TL50, cary, Vertical1(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical1()[0],cary);
                horizontal = false;
                }
            }


        else if (RP.getCar1Grid()==1 && horizontal == false){
            if (TL7.getTrafficLightCondition() != 1) {
                car1YDirectionPos();
                car1 = MoveCar(TL50, cary, Vertical2(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical2()[0],cary);
                horizontal = false;
            }
            else{

                car1 = MoveCar(TL50, cary, Vertical2(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical2()[0],cary);
                horizontal = false;
            }

        }
        else if (RP.getCar1Grid()==2 && horizontal == false){
            if (TL11.getTrafficLightCondition() != 1) {
                car1YDirectionPos();
                car1 = MoveCar(TL50, cary, Vertical3(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical3()[0],cary);
                horizontal = false;
            }
            else{

                car1 = MoveCar(TL50, cary, Vertical3(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical3()[0],cary);
                horizontal = false;
            }
        }
        else if (RP.getCar1Grid()==3 && horizontal == false){
            if (TL15.getTrafficLightCondition() != 1) {
                car1YDirectionPos();
                car1 = MoveCar(TL50, cary, Vertical1(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical1()[0],cary);
                horizontal = false;
            }
            else{

                car1 = MoveCar(TL50, cary, Vertical1(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical1()[0],cary);
                horizontal = false;
            }
        }
        else if (RP.getCar1Grid()==4 && horizontal == false){
            if (TL19.getTrafficLightCondition() != 1) {
                car1YDirectionPos();
                car1 = MoveCar(TL50, cary, Vertical2(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical2()[0],cary);
                horizontal = false;
            }
            else{

                car1 = MoveCar(TL50, cary, Vertical2(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical2()[0],cary);
                horizontal = false;
            }
        }
        else if (RP.getCar1Grid()==5 && horizontal == false){
            if (TL23.getTrafficLightCondition() != 1) {
                car1YDirectionPos();
                car1 = MoveCar(TL50, cary, Vertical3(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical3()[0],cary);
                horizontal = false;
            }
            else{

                car1 = MoveCar(TL50, cary, Vertical3(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical3()[0],cary);
                horizontal = false;
            }
        }
        else if (RP.getCar1Grid()==6 && horizontal == false){
            if (TL27.getTrafficLightCondition() != 1) {
                car1YDirectionPos();
                car1 = MoveCar(TL50, cary, Vertical1(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical1()[0],cary);
                horizontal = false;
            }
            else{

                car1 = MoveCar(TL50, cary, Vertical1(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical1()[0],cary);
                horizontal = false;
            }
        }
        else if (RP.getCar1Grid()==7 && horizontal == false){
            if (TL31.getTrafficLightCondition() != 1) {
                car1YDirectionPos();
                car1 = MoveCar(TL50, cary, Vertical2(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical2()[0],cary);
                horizontal = false;
            }
            else{

                car1 = MoveCar(TL50, cary, Vertical2(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical2()[0],cary);
                horizontal = false;
            }
        }
        else if (RP.getCar1Grid()==8 && horizontal == false){
            if (TL35.getTrafficLightCondition() != 1) {
                car1YDirectionPos();

                car1 = MoveCar(TL50, cary, Vertical3(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical3()[0],cary);
                horizontal = false;
            }
            else{

                car1 = MoveCar(TL50, cary, Vertical3(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical3()[0],cary);
                horizontal = false;
            }


            if (RP.getCar1Road()==1){ car1YDirectionPos();
                car1XDirectionNeg();
                car1 = MoveCar(TL50, carx, Horizontal3(), lpane);
                RP.setCar1(car1[1],car1[0],Horizontal3()[0],cary);
                horizontal = true;
            }
        }
        else{System.out.println("Spazzing out");}



        //Logic to move the car if its going in a horizontal direction
        //approach was check grid position/check road type and then
        //check traffic light condition
        //if traffic light isn't red proceed

        if (RP.getCar1Grid()==0 && horizontal == true){
            if (TL.getTrafficLightCondition() != 1) {
                car1YDirectionPos();
                car1 = MoveCar(TL50, cary, Vertical1(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical1()[0],cary);
                horizontal = true;
            }
            else{

                car1 = MoveCar(TL50, cary, Vertical1(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical1()[0],cary);
                horizontal = true;
            }
        }


        else if (RP.getCar1Grid()==1 && horizontal == true){
            if (TL5.getTrafficLightCondition() != 1) {
                car1YDirectionPos();
                car1 = MoveCar(TL50, cary, Vertical2(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical2()[0],cary);
                horizontal = true;
            }
            else{

                car1 = MoveCar(TL50, cary, Vertical2(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical2()[0],cary);
                horizontal = true;
            }

        }
        else if (RP.getCar1Grid()==2 && horizontal == true){
            if (TL9.getTrafficLightCondition() != 1) {
                car1YDirectionPos();
                car1 = MoveCar(TL50, cary, Vertical3(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical3()[0],cary);
                horizontal = true;
            }
            else{

                car1 = MoveCar(TL50, cary, Vertical3(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical3()[0],cary);
                horizontal = true;
            }
        }
        else if (RP.getCar1Grid()==3 && horizontal == true){
            if (TL13.getTrafficLightCondition() != 1) {
                car1YDirectionPos();
                car1 = MoveCar(TL50, cary, Vertical1(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical1()[0],cary);
                horizontal = true;
            }
            else{

                car1 = MoveCar(TL50, cary, Vertical1(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical1()[0],cary);
                horizontal = true;
            }
        }
        else if (RP.getCar1Grid()==4 && horizontal == true){
            if (TL17.getTrafficLightCondition() != 1) {
                car1YDirectionPos();
                car1 = MoveCar(TL50, cary, Vertical2(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical2()[0],cary);
                horizontal = true;
            }
            else{

                car1 = MoveCar(TL50, cary, Vertical2(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical2()[0],cary);
                horizontal = true;
            }
        }
        else if (RP.getCar1Grid()==5 && horizontal == true){
            if (TL21.getTrafficLightCondition() != 1) {
                car1YDirectionPos();
                car1 = MoveCar(TL50, cary, Vertical3(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical3()[0],cary);
                horizontal = true;
            }
            else{

                car1 = MoveCar(TL50, cary, Vertical3(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical3()[0],cary);
                horizontal = true;
            }
        }
        else if (RP.getCar1Grid()==6 && horizontal == true){
            if (TL25.getTrafficLightCondition() != 1) {
                car1YDirectionPos();
                car1 = MoveCar(TL50, carx, Horizontal3(), lpane);
                RP.setCar1(car1[1],car1[0],Horizontal3()[0],cary);
                horizontal = true;
            }
            else{

                car1 = MoveCar(TL50, carx, Vertical1(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical1()[0],cary);
                horizontal = true;
            }
        }
        else if (RP.getCar1Grid()==7 && horizontal == true){
            if (TL29.getTrafficLightCondition() != 1) {
                car1XDirectionNeg();
                car1 = MoveCar(TL50, carx, Horizontal3(), lpane);
                RP.setCar1(car1[1],car1[0],Horizontal3()[0],cary);
                horizontal = true;
            }
            else{

                car1 = MoveCar(TL50, carx, Vertical2(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical2()[0],cary);
                horizontal = true;
            }
        }
        else if (RP.getCar1Grid()==8 && horizontal == true){
            if (TL33.getTrafficLightCondition() != 1) {
                car1YDirectionPos();

                car1 = MoveCar(TL50, cary, Vertical3(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical3()[0],cary);
                horizontal = true;
            }
            else{

                car1 = MoveCar(TL50, cary, Vertical3(), lpane);
                RP.setCar1(car1[1],car1[0],Vertical3()[0],cary);
                horizontal = true;
            }


            if (RP.getCar1Road()==1){ car1YDirectionPos();
                car1XDirectionNeg();
                car1 = MoveCar(TL50, carx, Horizontal3(), lpane);
                RP.setCar1(car1[1],car1[0],Horizontal3()[0],cary);
                horizontal = false;
            }
        }
        else{System.out.println("Spazzing out2");}






        if (MovementIncrement == timeInSeconds*10) {
            RandomLightChanges();

            for (int i = 0; i < DP.getGridIcons().length; i++) {
                ChangeTrafficLights(i);
            }
        } else if (MovementIncrement > timeInSeconds*20){MovementIncrement =0; counter +=1;}
        else{}
        //System.out.println(counter);
    }



    //Logic to move the car.
    //Updates the car animation based on its grid position and the road type its currently on
    public int[] MoveCar(Vehicle Car, int movement, int[] direction, JLayeredPane drawingPanel) {
        int[] gridConditions;

        if (direction[1]==0) {
            Car.setBounds(movement, direction[0], 60, 30);
            lpane.add(Car, (3), 0);
            System.out.println(GridType(movement,direction[0])[0]+" "+GridType(movement,direction[0])[1]);
            gridConditions = GridType(movement,direction[0]);
        }else{
            Car.setBounds(direction[0], movement, 60, 30);
            lpane.add(Car, (3), 0);
            gridConditions = GridType(direction[0],movement);
            System.out.println(GridType(direction[0],movement)[0]+" "+GridType(direction[0],movement)[1]);
        }

        if(gridConditions[1]==0){
            if(gridConditions[0]==1){System.out.println("Grid 1 is a corner");}
            else if(gridConditions[0]==2){System.out.println("Grid 1 is a t section");}
            else if(gridConditions[0]==3){

                System.out.println("Grid 1 is a cross Section");}
            else{System.out.println("Grid 1 is a straight");}
        }
        else if(gridConditions[1]==1){
            if(gridConditions[0]==1){System.out.println("Grid 2 is a corner");}
            else if(gridConditions[0]==2){System.out.println("Grid 2 is a t section");}
            else if(gridConditions[0]==3){

                System.out.println("Grid 2 is a cross Section");}
            else{System.out.println("Grid 2 is a straight");}
        }
        else if(gridConditions[1]==2){
            if(gridConditions[0]==1){System.out.println("Grid 3 is a corner");}
            else if(gridConditions[0]==2){System.out.println("Grid 3 is a t section");}
            else if(gridConditions[0]==3){System.out.println("Grid 3 is a cross Section");}
            else{System.out.println("Grid 3 is a straight");}
        }
        else if(gridConditions[1]==3){
            if(gridConditions[0]==1){System.out.println("Grid 4 is a corner");}
            else if(gridConditions[0]==2){System.out.println("Grid 4 is a t section");}
            else if(gridConditions[0]==3){System.out.println("Grid 4 is a cross Section");}
            else{System.out.println("Grid 4 is a straight");}
        }
        else if(gridConditions[1]==4){
            if(gridConditions[0]==1){System.out.println("Grid 5 is a corner");}
            else if(gridConditions[0]==2){System.out.println("Grid 5 is a t section");}
            else if(gridConditions[0]==3){System.out.println("Grid 5 is a cross Section");}
            else{System.out.println("Grid 5 is a straight");}
        }
        else if(gridConditions[1]==5){
            if(gridConditions[0]==1){System.out.println("Grid 6 is a corner");}
            else if(gridConditions[0]==2){System.out.println("Grid 6 is a t section");}
            else if(gridConditions[0]==3){System.out.println("Grid 6 is a cross Section");}
            else{System.out.println("Grid 6 is a straight");}
        }
        else if(gridConditions[1]==6){
            if(gridConditions[0]==1){System.out.println("Grid 7 is a corner");}
            else if(gridConditions[0]==2){System.out.println("Grid 7 is a t section");}
            else if(gridConditions[0]==3){System.out.println("Grid 7 is a cross Section");}
            else{System.out.println("Grid 7 is a straight");}
        }
        else if(gridConditions[1]==7){
            if(gridConditions[0]==1){System.out.println("Grid 8 is a corner");}
            else if(gridConditions[0]==2){System.out.println("Grid 8 is a t section");}
            else if(gridConditions[0]==3){System.out.println("Grid 8 is a cross Section");}
            else{System.out.println("Grid 8 is a straight");}
        }
        else{
            if(gridConditions[0]==1){System.out.println("Grid 9 is a corner");}
            else if(gridConditions[0]==2){System.out.println("Grid 9 is a t section");}
            else if(gridConditions[0]==3){System.out.println("Grid 9 is a cross Section");}
            else{System.out.println("Grid 9 is a straight");}
        }

        return gridConditions;
    }




    //Move car & govern direction

    public void car1YDirectionPos() {
        cary+=5;


    }
    public void car1XDirectionPos() {
        carx+=5;
        if (carx>600){carx=0;}
        if (carx<-600){carx=599;}
    }
    public void car1YDirectionNeg() {
        cary-=5;
        if (cary>600){cary=0;}
    }
    public void car1XDirectionNeg() {
        carx-=5;
        if (cary>600){cary=0;}
    }

    //The grid has 3 columns & 3 rows
    //3 left lans in horizontal direction & 3 left lanes in vertical directions
    //Horizontal1 is 1st row, Vertical1 is 1st column

    public int[] Horizontal1(){int[] positionY ={0,0}; positionY[0] = 50; positionY[1] = 0; return positionY;}
    public int[] Horizontal2(){int[] positionY ={0,0}; positionY[0] = 250; positionY[1] = 0;return positionY;}
    public int[] Horizontal3(){int[] positionY ={0,0}; positionY[0] = 450; positionY[1] = 0;return positionY;}

    public int[] Vertical1(){int[] positionX ={0,0}; positionX[0] = 50; positionX[1] = 1; return positionX;}
    public int[] Vertical2(){int[] positionX ={0,0}; positionX[0] = 250; positionX[1] = 1; return positionX;}
    public int[] Vertical3(){int[] positionX ={0,0}; positionX[0] = 450; positionX[1] = 1; return positionX;}



    //Get road type and location specific to the car location at a specific time.
    public int[] GridType(int x, int y){
        int[] type = {0,0} ;
        if( x > 1 && x < 201 && y>0 && y<201){
            type[0] = LG.getGridArray()[0];
            type[1] = 0;
        }
        else if( x > 200 && x < 401 && y>0 && y<201){
            type[0] = LG.getGridArray()[1];
            type[1] = 1;
        }
        else if( x > 400 && x < 601 && y>0 && y<201){
            type[0] = LG.getGridArray()[2];
            type[1] = 2;
        }
        else if( x > 1 && x < 201 && y>200 && y<401){
            type[0] = LG.getGridArray()[3];
            type[1] = 3;
        }
        else if( x > 200 && x < 401 && y>200 && y<401){
            type[0] = LG.getGridArray()[4];
            type[1] = 4;
        }
        else if( x > 400 && x < 601 && y>200 && y<401){
            type[0] = LG.getGridArray()[5];
            type[1] = 5;
        }
        else if( x > 1 && x < 201 && y>400 && y<601){
            type[0] = LG.getGridArray()[6];
            type[1] = 6;
        }
        else if( x > 200 && x < 401 && y>400 && y<601){
            type[0] = LG.getGridArray()[7];
            type[1] = 7;
        }
        else{ type[0] = LG.getGridArray()[8]; type[1] = 8;}
        return type;
    }

    //changes the state of each traffic light by applying a random 1-3 value to each traffic light
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

    //Logic to change the traffic lights
    //All traffic lights are broken down into 9 sub groups of 4 (Cross section in each grid position)
    //if horizontal lights are green or yellow vertical lights are red
    //Paints the traffic light & sets its condition
    //if the road type is a cross section or a t section paint traffic lights appropriately.
    //else dont paint any
    public void ChangeTrafficLights(int i) {
        if (DP.getCond(i) == 3) {

            if (i == 0) {
                TL.setBounds(230 - 210, 0, 20, 50);
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


                lpane.add(TL, (3), 0);
                lpane.add(TL2, (3), 0);
                lpane.add(TL3, (3), 0);
                lpane.add(TL4, (3), 0);

            } else if (i == 1) {

                TL5.setBounds(230, 0, 20, 50);
                TL5.setTrafficLightCondition(TL2Condition);
                TL6.setBounds(350, 120, 20, 50);
                TL6.setTrafficLightCondition(TL2Condition);
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

                lpane.add(TL5, (3), 0);
                lpane.add(TL6, (3), 0);
                lpane.add(TL7, (3), 0);
                lpane.add(TL8, (3), 0);


            } else if (i == 2) {
                TL9.setBounds(230 + 210, 0, 20, 50);
                TL9.setTrafficLightCondition(TL3Condition);
                TL10.setBounds(350 + 210, 140, 20, 50);
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
                lpane.add(TL9, (3), 0);
                lpane.add(TL10, (3), 0);
                lpane.add(TL11, (3), 0);
                lpane.add(TL12, (3), 0);
            } else if (i == 3) {
                TL13.setBounds(230 - 210, 190, 20, 50);
                TL13.setTrafficLightCondition(TL4Condition);
                TL14.setBounds(350 - 210, 340, 20, 50);
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
                lpane.add(TL13, (3), 0);
                lpane.add(TL14, (3), 0);
                lpane.add(TL15, (3), 0);
                lpane.add(TL16, (3), 0);
            } else if (i == 4) {
                TL17.setBounds(230, 190, 20, 50);
                TL17.setTrafficLightCondition(TL5Condition);
                TL18.setBounds(350, 340, 20, 50);
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
                lpane.add(TL17, (3), 0);
                lpane.add(TL18, (3), 0);
                lpane.add(TL19, (3), 0);
                lpane.add(TL20, (3), 0);
            } else if (i == 5) {
                TL21.setBounds(230 + 210, 190, 20, 50);
                TL21.setTrafficLightCondition(TL6Condition);
                TL22.setBounds(350 + 210, 340, 20, 50);
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
                lpane.add(TL21, (3), 0);
                lpane.add(TL22, (3), 0);
                lpane.add(TL23, (3), 0);
                lpane.add(TL24, (3), 0);
            } else if (i == 6) {
                TL25.setBounds(230 - 210, 220 + 180, 20, 50);
                TL25.setTrafficLightCondition(TL7Condition);
                TL26.setBounds(350 - 210, 330 + 230, 20, 50);
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
                lpane.add(TL25, (3), 0);
                lpane.add(TL26, (3), 0);
                lpane.add(TL27, (3), 0);
                lpane.add(TL28, (3), 0);
            } else if (i == 7) {
                TL29.setBounds(230, 220 + 180, 20, 50);
                TL29.setTrafficLightCondition(TL8Condition);
                TL30.setBounds(350, 330 + 230, 20, 50);
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
                lpane.add(TL29, (3), 0);
                lpane.add(TL30, (3), 0);
                lpane.add(TL31, (3), 0);
                lpane.add(TL32, (3), 0);
            } else {
                TL33.setBounds(230 + 210, 220 + 180, 20, 50);
                TL33.setTrafficLightCondition(TL9Condition);
                TL34.setBounds(350 + 210, 330 + 230, 20, 50);
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
                lpane.add(TL33, (3), 0);
                lpane.add(TL34, (3), 0);
                lpane.add(TL35, (3), 0);
                lpane.add(TL36, (3), 0);

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
                lpane.add(TL, (3), 0);
                lpane.add(TL2, (3), 0);
                lpane.add(TL3, (3), 0);
                lpane.add(TL4, (3), 0);
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
                lpane.add(TL5, (3), 0);
                lpane.add(TL6, (3), 0);
                lpane.add(TL7, (3), 0);
                lpane.add(TL8, (3), 0);
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
                lpane.add(TL9, (3), 0);
                lpane.add(TL10, (3), 0);
                lpane.add(TL11, (3), 0);
                lpane.add(TL12, (3), 0);
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
                lpane.add(TL13, (3), 0);
                lpane.add(TL14, (3), 0);
                lpane.add(TL15, (3), 0);
                lpane.add(TL16, (3), 0);
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
                lpane.add(TL17, (3), 0);
                lpane.add(TL18, (3), 0);
                lpane.add(TL19, (3), 0);
                lpane.add(TL20, (3), 0);
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
                lpane.add(TL21, (3), 0);
                lpane.add(TL22, (3), 0);
                lpane.add(TL23, (3), 0);
                lpane.add(TL24, (3), 0);
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
                lpane.add(TL25, (3), 0);
                lpane.add(TL26, (3), 0);
                lpane.add(TL27, (3), 0);
                lpane.add(TL28, (3), 0);
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
                lpane.add(TL29, (3), 0);
                lpane.add(TL30, (3), 0);
                lpane.add(TL31, (3), 0);
                lpane.add(TL32, (3), 0);
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
                lpane.add(TL33, (3), 0);
                lpane.add(TL34, (3), 0);
                lpane.add(TL35, (3), 0);
                lpane.add(TL36, (3), 0);

            }
        }
    }
}
