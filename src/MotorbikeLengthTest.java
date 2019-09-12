import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MotorbikeLengthTest {
    @Test
    void testDefault() {

        //Change bus length values for different test outcome.
        final int TEST_LENGTH_CAR = 2;
        final int TEST_LENGTH_MOTO = 1;

        //Creating car and motorbike to test length criteria
        Car car = new Car(0,0,4);
        Moto moto = new Moto(0,5,2);

        //Assigning car and lengths
        car.width = TEST_LENGTH_CAR;
        moto.width = TEST_LENGTH_MOTO;

        //Testing to make sure that the chosen motorbike length meets the criteria,
        assertEquals(moto.width, 0.5*car.width);
    }

}