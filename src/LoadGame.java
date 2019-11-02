import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;

public class LoadGame {

    int[] gridArray ={0,0,0,0,0,0,0,0,0};
    java.util.Scanner scanner = new Scanner(new File("SaveGameUse.csv"));
    String condition;
    char[] charArray;


    public LoadGame() throws FileNotFoundException {
        scanner.useDelimiter(",");
        if (scanner.hasNext()) {
            String str = scanner.nextLine();
            charArray = str.toCharArray();

            scanner.close();



        }


        String arr = new String(charArray);
        gridArray[0]=Integer.parseInt(String.valueOf(arr.charAt(0)));
        gridArray[1]=Integer.parseInt(String.valueOf(arr.charAt(2)));
        gridArray[2]=Integer.parseInt(String.valueOf(arr.charAt(4)));
        gridArray[3]=Integer.parseInt(String.valueOf(arr.charAt(6)));
        gridArray[4]=Integer.parseInt(String.valueOf(arr.charAt(8)));
        gridArray[5]=Integer.parseInt(String.valueOf(arr.charAt(10)));
        gridArray[6]=Integer.parseInt(String.valueOf(arr.charAt(12)));
        gridArray[7]=Integer.parseInt(String.valueOf(arr.charAt(14)));
        gridArray[8]=Integer.parseInt(String.valueOf(arr.charAt(16)));



        System.out.println(gridArray[0]+""+gridArray[1]+""+gridArray[2]+""+gridArray[3]+""+gridArray[4]+""+gridArray[5]+""+gridArray[6]+""+gridArray[7]+""+gridArray[8]);

    }
    public int[] getGridArray(){return gridArray;}
    }


