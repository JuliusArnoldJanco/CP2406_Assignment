package SANDBOX;

import java.util.ArrayList;

public class DataPoints extends ArrayList {
    int Px;
    int Py;

    int Rx;
    int Ry;

    int[] gridIcons = {0,0,0,0,0,0,0,0,0};

    int originalImage;



    double str8Rotation=0, quarterRotation = 90 ;







    public void InputCondition(int Condition, int Index){
        gridIcons[Index] = Condition;
    }

    public void OriginalImage(int img){
        originalImage = img;
    }

    public int getOriginalImage() {
        return originalImage;
    }

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
    public int getCond(int Index) {
        return gridIcons[Index];
    }
    public int[] getArray() {
        return gridIcons;
    }

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

    public void setStr8Rotation(){
        str8Rotation += quarterRotation
        ;
    }
    public double getStr8Rotation(){

        return str8Rotation;
    }
    public int[] getGridIcons(){return gridIcons;}
}
