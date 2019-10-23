import java.awt.event.MouseListener;

public class GC {
   int[] gridInformation;

   public void gridDataStore(int intForArray, int arrayLocation){
       gridInformation = new int[9];
       gridInformation[arrayLocation] = intForArray;
           if (gridInformation[0] == 0) {
               System.out.println(gridInformation[0]);
           }
           else{
               System.out.println("Got called and this is what it looks like now" + gridInformation[0]);
           }
       }

   }

