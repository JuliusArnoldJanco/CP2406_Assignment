

//Child of Vehicle and inherits all attributes of Vehicle. x,y height,width
//getters/Setters and all other methods.

public class Car extends Vehicle {

    //When car class is created it has a starting position and speed assigned to it
    public Car(int newx, int newy, int newspeed){
        super(newx, newy, newspeed);

        //updates previous x position with new x position
        x = newx;

        //updates previous y position with new y position
        y = newy;

        //Assigns a speed to the car. Used for accelerating and decelerating
        speed = newspeed;
    }

}

