import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class T_lightTest {
    @Test
    void testDefault() {

        // Conditions to check that the traffic light is return the correct state.
        // traffic light is designed to be told to be red else return green,
        //not very robust, I understand.

        String condition1 = "red";
        String condition2 = "green";

        // create Traffic light for testing
        T_light t_light = new T_light();

        //set T light state
        t_light.setState(condition1);

        //create state variable
        String state = t_light.getState();

        //comparing state to condition1 for test comparison
        assertEquals(state,condition1);

        //print state from Traffic light class
        System.out.println(t_light.getState());




    }
}