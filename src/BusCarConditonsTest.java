import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BusCarConditonsTest {

    @Test
    void testDefault() {

        //Change bus length values for different test outcome.
        final int TEST_LENGTH_CAR = 2;
        final int TEST_LENGTH_BUS = 6;

        //Creating car and bus to test length criteria
        Car car = new Car(0,0,4);
        Bus bus = new Bus(0,5,2);

        //Assigning car and lengths
        car.width = TEST_LENGTH_CAR;
        bus.width = TEST_LENGTH_BUS;

        //Testing to make sure that the chosen bus length meets the criteria,
        assertEquals(bus.width, 3*car.width);
    }

}