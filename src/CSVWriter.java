import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*
This creates a save game in the format of a csv file
* This is performed by saving each road type in a position in an array
* the position of the array corresponds to its position on the grid
*  */


class CsvWriter {

    int[] saveGridIconLocation = {0,0,0,0,0,0,0,0,0};

    public CsvWriter(){}
    public void Save() {

        try (PrintWriter writer = new PrintWriter(new File("SaveGame.csv"))) {

            StringBuilder sb = new StringBuilder();
            sb.append("Column1");
            sb.append(',');
            sb.append("Column2");
            sb.append(',');
            sb.append("Column3");
            sb.append('\n');

            sb.append("   "+saveGridIconLocation[0]+"   ");
            sb.append("   "+saveGridIconLocation[1]+"   ");
            sb.append("   "+saveGridIconLocation[2]+"   ");
            sb.append('\n');
            sb.append("   "+saveGridIconLocation[3]+"   ");
            sb.append("   "+saveGridIconLocation[4]+"   ");
            sb.append("   "+saveGridIconLocation[5]+"   ");
            sb.append('\n');
            sb.append("   "+saveGridIconLocation[6]+"   ");
            sb.append("   "+saveGridIconLocation[7]+"   ");
            sb.append("   "+saveGridIconLocation[8]+"   ");
            sb.append('\n');

            writer.write(sb.toString());

            System.out.println("done!");

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try (PrintWriter writer = new PrintWriter(new File("SaveGameUse.csv"))) {

            StringBuilder sb2 = new StringBuilder();


            sb2.append(saveGridIconLocation[0]);
            sb2.append(",");
            sb2.append(saveGridIconLocation[1]);
            sb2.append(",");
            sb2.append(saveGridIconLocation[2]);
            sb2.append(",");
            sb2.append(saveGridIconLocation[3]);
            sb2.append(",");
            sb2.append(saveGridIconLocation[4]);
            sb2.append(",");
            sb2.append(saveGridIconLocation[5]);
            sb2.append(",");
            sb2.append(saveGridIconLocation[6]);
            sb2.append(",");
            sb2.append(saveGridIconLocation[7]);
            sb2.append(",");
            sb2.append(saveGridIconLocation[8]);

            sb2.append('\n');

            writer.write(sb2.toString());

            System.out.println(sb2.toString());

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
    public void setImageIcon(int index, int image){saveGridIconLocation[index] = image;}
}