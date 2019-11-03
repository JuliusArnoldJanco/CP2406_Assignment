package SANDBOX;

import java.util.ArrayList;
/*This class stores road types and is called by both gui class and runsim class
* This was to make sure that the grids in the 2 windows matched correctly*/
public class DataPoints extends ArrayList {
    int Px;
    int Py;

    int Rx;
    int Ry;

    //road types are stored here.
    //position is the grid position
    int[] gridIcons = {0,0,0,0,0,0,0,0,0};

    int originalImage;


    //attempting tile rotation ability
    double str8Rotation=0, quarterRotation = 90 ;






    //update road types in the array
    public void InputCondition(int Condition, int Index){
        gridIcons[Index] = Condition;
    }

    //Functions below get the mouse positions for press and release
    public int getPressX() {
        return Px;
    }
    public int getPressY(){
        return Py;
    }
    public int getReleaseX() {
        return Rx;
    }
    public int getReleaseY(){
        return Ry;
    }

    //gets a road type from the array
    public int getCond(int Index) {
        return gridIcons[Index];
    }
    public int[] getArray() {
        return gridIcons;
    }

    // Sets the the press and release mouse buttons positions
    public void setPressX(int x) {
        Px = x;
    }

    public void setPressY(int y) {
        Py = y;
    }
    public void setReleaseX(int x) {
        Rx = x;
    }

    public void setReleaseY(int y) {
        Ry = y;
    }

    //attempting tile rotation functionality
    public void setStr8Rotation(){
        str8Rotation += quarterRotation
        ;
    }
    public double getStr8Rotation(){

        return str8Rotation;
    }
    //returns the array of road types
    public int[] getGridIcons(){return gridIcons;}
}
