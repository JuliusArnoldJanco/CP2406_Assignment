public class GC {






    int[] gridInformation;
   int menuIcon = 69;







   public void gridDataStore(int intForArray, int arrayLocation){
       gridInformation = new int[9];
       gridInformation[arrayLocation] = intForArray;
           if (gridInformation[0] == 0) {
                System.out.println(gridInformation[0]);
           }
           else if(gridInformation[0] == 1) {
                System.out.println(gridInformation[0]);
           }
           else if(gridInformation[0] == 2) {
                System.out.println(gridInformation[0]);
           }
           else if(gridInformation[0] == 3) {
               System.out.println(gridInformation[0]);
           }
           else if(gridInformation[1] == 0) {
               System.out.println(gridInformation[1]);
           }
           else if(gridInformation[1] == 1) {
               System.out.println(gridInformation[1]);
           }
           else if(gridInformation[1] == 2) {
               System.out.println(gridInformation[1]);
           }
           else if(gridInformation[1] == 3) {
               System.out.println(gridInformation[1]);
           }
           else if(gridInformation[2] == 0) {
               System.out.println(gridInformation[2]);
           }
           else if(gridInformation[2] == 1) {
               System.out.println(gridInformation[2]);
           }
           else if(gridInformation[2] == 2) {
               System.out.println(gridInformation[2]);
           }
           else if(gridInformation[2] == 3) {
               System.out.println(gridInformation[2]);
           }
           else if(gridInformation[3] == 0) {
               System.out.println(gridInformation[3]);
           }
           else if(gridInformation[3] == 1) {
               System.out.println(gridInformation[3]);
           }
           else if(gridInformation[3] == 2) {
               System.out.println(gridInformation[3]);
           }
           else if(gridInformation[3] == 3) {
               System.out.println(gridInformation[3]);
           }
           else if(gridInformation[4] == 0) {
               System.out.println(gridInformation[4]);
           }
           else if(gridInformation[4] == 1) {
               System.out.println(gridInformation[4]);
           }
           else if(gridInformation[4] == 2) {
               System.out.println(gridInformation[4]);
           }
           else if(gridInformation[4] == 3) {
               System.out.println(gridInformation[4]);
           }
           else if(gridInformation[5] == 0) {
               System.out.println(gridInformation[5]);
           }
           else if(gridInformation[5] == 1) {
               System.out.println(gridInformation[5]);
           }
           else if(gridInformation[5] == 2) {
               System.out.println(gridInformation[5]);
           }
           else if(gridInformation[5] == 3) {
               System.out.println(gridInformation[5]);
           }
           else if(gridInformation[6] == 0) {
               System.out.println(gridInformation[6]);
           }
           else if(gridInformation[6] == 1) {
               System.out.println(gridInformation[6]);
           }
           else if(gridInformation[6] == 2) {
               System.out.println(gridInformation[6]);
           }
           else if(gridInformation[6] == 3) {
               System.out.println(gridInformation[6]);
           }
           else if(gridInformation[7] == 0) {
               System.out.println(gridInformation[7]);
           }
           else if(gridInformation[7] == 1) {
               System.out.println(gridInformation[7]);
           }
           else if(gridInformation[7] == 2) {
               System.out.println(gridInformation[7]);
           }
           else if(gridInformation[7] == 3) {
               System.out.println(gridInformation[7]);
           }
           else if(gridInformation[8] == 0) {
               System.out.println(gridInformation[8]);
           }
           else if(gridInformation[8] == 1) {
               System.out.println(gridInformation[8]);
           }
           else if(gridInformation[8] == 2) {
               System.out.println(gridInformation[8]);
           }
           else if(gridInformation[8] == 3) {
               System.out.println(gridInformation[8]);
           }
           else if(gridInformation[9] == 0) {
               System.out.println(gridInformation[9]);
           }
           else if(gridInformation[9] == 1) {
               System.out.println(gridInformation[9]);
           }
           else if(gridInformation[9] == 2) {
               System.out.println(gridInformation[9]);
           }
           else if(gridInformation[9] == 3) {
               System.out.println(gridInformation[9]);
           }
           else{
               System.out.println("Value inserted outside array condition index (0-9). Number entered: "+intForArray +" this has been stored at array cell: "+arrayLocation);
       }
       }

       public int getGridInfo(int cellNumber){ return gridInformation[cellNumber]; }



       public int getMenuIcon(){
    System.out.println("menuIcon is: " + menuIcon);return menuIcon;}

    public void setMenuIcon(int MenuIconNumber) {
        menuIcon = MenuIconNumber;
    }
}

