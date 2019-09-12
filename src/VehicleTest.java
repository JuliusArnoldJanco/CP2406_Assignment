import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    @Test
    void testDefault() {
        //Input speed test speed here & test positions here
        final int SPEED = 5;
        final int X = 1;
        final int Y = 1;

        //positions to test against (correct conditions: X=x,Y=y)
        final int x = 1;
        final int y = 1;

        //Assigns Vehicle position x, y
        Vehicle vehicle = new Vehicle(X,Y,5);

        System.out.print("Vehicle speed is: ");
        System.out.println(vehicle.speed);

        //Testing vehicle positions and speed
        assertEquals(SPEED, vehicle.speed);
        assertEquals(x, vehicle.x);
        assertEquals(y, vehicle.y);



    }

}