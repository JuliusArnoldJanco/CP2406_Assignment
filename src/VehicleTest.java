import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VehicleTest {

    //Input speed test speed here

    final int SPEED = 5;

    @Test
    void testDefault() {

        Vehicle vehicle = new Vehicle(1,1,5);
        System.out.println(vehicle.speed);
        assertEquals(SPEED, vehicle.speed);



    }

}