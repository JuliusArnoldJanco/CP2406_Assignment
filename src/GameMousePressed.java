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
        int iconX = c.getX();
        int iconY = c.getY();


        int x = e.getX();
        int y = e.getY();

        String path = String.valueOf(c.getIcon());
        System.out.println(path);
        System.out.print("Mouse press X is:");
        System.out.println(x);


        System.out.println("Mouse Press");
        System.out.print("Mouse press Y is:");
        System.out.println(y);

        GC.gridDataStore(12,0);


        TransferHandler handler = c.getTransferHandler();
        handler.exportAsDrag(c, e, TransferHandler.COPY);
    }

    public int getX(){return x;}
    public int getY(){return y;}
    public int getIconX(){return iconX;}
    public int getIconY(){return iconY;}


}
