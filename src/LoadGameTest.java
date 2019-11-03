import SANDBOX.DataPoints;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

class LoadGameTest {

    //Testing the load game grid to make sure it matches the global grid conditions
    //turns out it doesn't, but it shouldn't, window isnt open
    @Test
    public void testLoadGameGrid() throws FileNotFoundException {
        Assert.assertEquals(new LoadGame().getGridArray()[2],new DataPoints().getArray()[2]);
    }

}