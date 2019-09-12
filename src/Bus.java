public class Bus extends Vehicle{
    //When car class is created it has a starting position and speed assigned to it
    public Bus(int newx, int newy, int newspeed){
        super(newx, newy, newspeed);

        //updates previous x position with new x position
        x = newx;

        //updates previous y position with new y position
        y = newy;

        //Assigns a speed to the bus. Used for accelerating and decelerating
        speed = newspeed;
    }
}
