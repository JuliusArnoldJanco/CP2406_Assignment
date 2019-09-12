public class Road {

    //Value for position adjustment along Y axis (lane change)
    final int LANE_POSITION = 10;
    //Value for quantity of segments
    final int ROAD_SEGMENTS = 20;

    //Width of the intersection (Traffic light area)
    final int CROSS_SECTION_WIDTH = 4;

    //x,y values for the start of the road
    final int ROAD_ORIGIN_X = 0;
    final int ROAD_ORIGIN_Y = 0;

    //Assigns a car speed
    int CAR_SPEED = 2;

    //counter for a loop and counter of how many times
    //the loop has gone back to zero
    int counter = 0;
    int loopCounter = 0;

    //condition for functions
    String endOfRoad = "yes";
    String anotherRoad = "no";
    String tSection = "yes";




    //Road keeps track of car positions
    public Road() {
        super();

        Car car = new Car(ROAD_ORIGIN_X, ROAD_ORIGIN_Y + LANE_POSITION,CAR_SPEED);

        

    }
}
