import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GameMouseReleased extends MouseAdapter {

    int iconX;
    int iconY;

    int x;
    int y;



    public void mouseReleased(MouseEvent e) {
        JLabel c = (JLabel) e.getSource();

        // Mouse release coordinates
        int x = e.getX();
        int y = e.getY();

        String path = String.valueOf(c.getIcon());
      //  System.out.println(path);
      //  System.out.print("Mouse release X is:");
      //  System.out.println(x);


      //  System.out.println("Mouse Release");
       // System.out.print("Mouse release Y is:");
        //System.out.println(y);



        TransferHandler handler = c.getTransferHandler();
        handler.exportAsDrag(c, e, TransferHandler.COPY);
        }

    public int getX(){return x;}
    public int getY(){return y;}
    public int getIconX(){return iconX;}
    public int getIconY(){return iconY;}

}


