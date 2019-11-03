package SANDBOX;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DataPointsTest {


    //Test to make sure that the global grid conditions array matchs the window grid dimensions
    @Test
    public void testDatapointLength() {
        Assert.assertEquals(9,new DataPoints().getArray().length );
    }
}