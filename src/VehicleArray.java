import java.util.ArrayList;
/*The purpose of this class was to store all the vehicles on the grid*/
public class VehicleArray extends ArrayList {

    Vehicle[] vehicleList = {};


    public void VehicleArray(){
        for(int i=0; i<51; i++){
            vehicleList[i] = new Vehicle();
        }
    }
    public Vehicle getVehicleFromList(int Index){return vehicleList[Index];}
}
