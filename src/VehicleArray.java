import java.util.ArrayList;

public class VehicleArray extends ArrayList {

    Vehicle[] vehicleList = {};


    public void VehicleArray(){
        for(int i=0; i<51; i++){
            vehicleList[i] = new Vehicle();
        }
    }
    public Vehicle getVehicleFromList(int Index){return vehicleList[Index];}
}
