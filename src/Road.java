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
        T_light t_light = new T_light();

        int loop = 5;

        while(loop>1){
            //Begins iterations
            counter(1, 10);

            //Refresh rate:    1 = 1ms : 1000 = 1s
            sleep(1000);

            //-----------------------------------------------------
            //Moves cars position
            if(Collision(car.getX(), car.getX()+1) == false){
                car.setX(car.getX() + car.getSpeed());
                System.out.print("The cars position is: ");
                System.out.println(car.getX());
            }else{System.out.println("COLLISION"); break;}


            ChangeRoads(car, t_light,anotherRoad,t_light.getState());



        }
    }

    private boolean Collision(int carX,int nextPos){
        boolean collision;
        if (carX != nextPos){

            collision = false;

        }else{collision = true;}
        return collision;
    }


    private void ChangeRoads(Car car, T_light t_light,String anotherRoad,String t_lightState) {
        if (car.getX() > (ROAD_SEGMENTS-ROAD_SEGMENTS/2) && car.getX() < ROAD_SEGMENTS || car.getX() >
                ROAD_SEGMENTS + CROSS_SECTION_WIDTH+ROAD_SEGMENTS/2 && car.getX() <
                (2*ROAD_SEGMENTS) + CROSS_SECTION_WIDTH && anotherRoad == "no" && t_lightState == "red") {

            //Approaches traffic light.
            car.setSpeed(CAR_SPEED / 2);


            if (car.getX() > ROAD_SEGMENTS-2 && car.getX() < ROAD_SEGMENTS || car.getX() >
                    ROAD_SEGMENTS + CROSS_SECTION_WIDTH + ROAD_SEGMENTS/2 && car.getX() <
                    (2*ROAD_SEGMENTS) + CROSS_SECTION_WIDTH) {

                t_light.setState("red");
                System.out.println(t_light.getState());
                sleep(3000);
                t_light.setState("green");
                System.out.println(t_light.getState());
            }

            if(car.getX() > ROAD_SEGMENTS-2 && car.getX() < ROAD_SEGMENTS){

                car.setX(ROAD_SEGMENTS + CROSS_SECTION_WIDTH);

            }

            if (car.getX() >
                    ROAD_SEGMENTS + CROSS_SECTION_WIDTH+ROAD_SEGMENTS/2 && car.getX() <
                    (2*ROAD_SEGMENTS) + CROSS_SECTION_WIDTH){
                car.setSpeed(CAR_SPEED/2);
            }

        }else{car.setSpeed(CAR_SPEED);}


        if (car.getX() >
                (2*ROAD_SEGMENTS-1 + CROSS_SECTION_WIDTH)  && car.getX() <
                (2*ROAD_SEGMENTS + CROSS_SECTION_WIDTH+3) && endOfRoad == "yes"){

            car.setX(ROAD_ORIGIN_X);
            System.out.println("END OF SCREEN RETURNING TO START");
        }



    }


    public void counter(int step,int finish) {

        counter = counter + step;
        if (counter > finish) {
            counter = 0;
            loopCounter = loopCounter + 1;

        }
    }

    public static void sleep(int period) {
        try {
            Thread.sleep(period);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
