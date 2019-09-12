
// Motorbike class
public class Moto extends Vehicle {
    //When Motorbike class is created it has a starting position and speed assigned to it
    public Moto(int newx, int newy, int newspeed){
        super(newx, newy, newspeed);

        //updates previous x position with new x position
        x = newx;

        //updates previous y position with new y position
        y = newy;

        //Assigns a speed to the motorbike. Used for accelerating and decelerating
        speed = newspeed;
    }
}
