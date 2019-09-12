public class Vehicle {
    int x;
    int y;
    int width = 0;
    int height = 0;
    int speed = 0;

    public Vehicle(int newx, int newy, int newspeed){
        x = newx;
        y = newy;
        speed = newspeed;

    }

    // getters/setters

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public int getWidth(){
        return width;
    }

    public int getHeight(){
        return height;
    }

    public void setSpeed(int newspeed){speed = newspeed;}

    public void setX(int newx){
        x = newx;
    }

    public void setY(int newy){
        y = newy;
    }

    public int getSpeed(){
        return speed;
    }



}
