public class RoadPositions {
    int[] carPositions = {0,0,0,0,0,0,0,0};


    public RoadPositions(){}


    public void setCar1(int grid, int road, int x, int y) {
        this.carPositions[0] = grid;
        this.carPositions[1] = road;
        this.carPositions[2] = x;
        this.carPositions[3] = y;
    }

    public void setCar2(int grid, int road, int x, int y) {
        this.carPositions[4] = grid;
        this.carPositions[5] = road;
        this.carPositions[6] = x;
        this.carPositions[7] = y;

    }

    public int getCar1Road() {
        return carPositions[1];
    }
    public int getCar1Grid() {
        return carPositions[0];
    }
    public int getCar2Road() {
        return carPositions[1];
    }
    public int getCar2Grid() {
        return carPositions[0];
    }
}
