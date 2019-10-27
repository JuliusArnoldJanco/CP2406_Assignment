import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameMousePressed extends MouseAdapter {


    int iconX;
    int iconY;

    int x;
    int y;

    GC GC = new GC();

    public void mousePressed(MouseEvent e) {
        JLabel c = (JLabel) e.getSource();


        //Icon origin coords
      iconX = c.getX();
      iconY = c.getY();


        int x = e.getX();
        int y = e.getY();

        String path = String.valueOf(c.getIcon());
        //System.out.println(path);
       // System.out.print("Mouse press X is:");
       // System.out.println(iconX);



        int IconLocationX = iconX;
        int IconLocationY = iconY;


        if (IconLocationX == 0 && IconLocationY == 0){
            GC.setMenuIcon(1);
            System.out.println("X Val "+IconLocationX+" Y Val "+IconLocationY);
            GC.getMenuIcon();
        }
        else if(IconLocationX == 36 && IconLocationY == 0) {
            GC.setMenuIcon(2);
            System.out.println("X Val "+IconLocationX+" Y Val "+IconLocationY);
            GC.getMenuIcon();
        }
        else if(IconLocationX == 0 && IconLocationY == 56) {
            GC.setMenuIcon(3);
            System.out.println("X Val "+IconLocationX+" Y Val "+IconLocationY);
            GC.getMenuIcon();

        }
        else if(IconLocationX == 36 && IconLocationY == 56) {
            GC.setMenuIcon(4);
            System.out.println("X Val "+IconLocationX+" Y Val "+IconLocationY);
            GC.getMenuIcon();
        }
        else{System.out.println("Total system 'Store High In Transit Safely' ");}
      //  System.out.println("Mouse Press");
     //   System.out.print("Mouse press Y is:");
     //   System.out.println(iconY);




        TransferHandler handler = c.getTransferHandler();
        handler.exportAsDrag(c, e, TransferHandler.COPY);
    }

    public int getX(){return x;}
    public int getY(){return y;}
    public int getIconX(){return iconX;}
    public int getIconY(){return iconY;}


}
