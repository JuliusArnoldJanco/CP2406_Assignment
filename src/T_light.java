import java.awt.*;

public class T_light {

    int x;
    int y;
    int width = 0;
    int height = 0;
    int period = 10;


    String state ="";


    public void setState(String end) {


        if (end == "red") {
            state = "red";
        }
        else {
            state="green";
        }


    }

    public String getState(){return state;}
}

