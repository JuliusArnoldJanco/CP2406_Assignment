import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener;

public class Main extends JFrame {

    public static void main(String args[]) {

            MouseListener listener = new GameMousePressed();
            MouseListener listenerDrop = new GameMouseReleased();

            //Main Window
            JFrame f = new JFrame("Atmen Sim");

            JPanel content = new JPanel();
            content.setLayout(new BorderLayout());

            JPanel menu = new JPanel();
            menu.setLayout(new GridLayout(5, 1));
            menu.setSize(200, 200);

            JPanel gridPanel = new JPanel();
            gridPanel.setLayout(new GridLayout(3, 3));


            //Corner Grid menu
            JPanel buttonsPanel2 = new JPanel();
            buttonsPanel2.setLayout(new GridLayout(2, 2));
            ImageSetup IS = new ImageSetup();
            ImageIcon micon1 = IS.getIcon5();
            ImageIcon micon2 = IS.getIcon6();
            ImageIcon micon3 = IS.getIcon7();
            ImageIcon micon4 = IS.getIcon8();
            ImageIcon icon0 = IS.getIcon0();
            ImageIcon icon1 = IS.getIcon1();
            ImageIcon icon2 = IS.getIcon2();
            ImageIcon icon3 = IS.getIcon3();
            ImageIcon icon4 = IS.getIcon4();
            JLabel grid1 = new JLabel(icon0);
            JLabel grid2 = new JLabel(icon0);
            JLabel grid3 = new JLabel(icon0);
            JLabel grid4 = new JLabel(icon0);
            JLabel grid5 = new JLabel(icon0);
            JLabel grid6 = new JLabel(icon0);
            JLabel grid7 = new JLabel(icon0);
            JLabel grid8 = new JLabel(icon0);
            JLabel grid9 = new JLabel(icon0);

            //Listeners have been added to these objects
            JLabel rdCnr = new JLabel(micon1, JLabel.CENTER);
            JLabel rdStr8 = new JLabel(micon4, JLabel.CENTER);
            JLabel rdXsec = new JLabel(micon3, JLabel.CENTER);
            JLabel rdTsec = new JLabel(micon2, JLabel.CENTER);

            //Listeners are created here

            rdCnr.addMouseListener(listener);
            rdStr8.addMouseListener(listener);
            rdXsec.addMouseListener(listener);
            rdTsec.addMouseListener(listener);
            grid1.addMouseListener(listenerDrop);
            grid2.addMouseListener(listenerDrop);
            grid3.addMouseListener(listenerDrop);
            grid4.addMouseListener(listenerDrop);
            grid5.addMouseListener(listenerDrop);
            grid6.addMouseListener(listenerDrop);
            grid7.addMouseListener(listenerDrop);


            rdCnr.setTransferHandler(new TransferHandler("icon"));
            rdTsec.setTransferHandler(new TransferHandler("icon"));
            rdXsec.setTransferHandler(new TransferHandler("icon"));
            rdStr8.setTransferHandler(new TransferHandler("icon"));
            grid1.setTransferHandler(new TransferHandler("icon"));
            grid2.setTransferHandler(new TransferHandler("icon"));
            grid3.setTransferHandler(new TransferHandler("icon"));
            grid4.setTransferHandler(new TransferHandler("icon"));
            grid5.setTransferHandler(new TransferHandler("icon"));
            grid6.setTransferHandler(new TransferHandler("icon"));
            grid7.setTransferHandler(new TransferHandler("icon"));
            grid8.setTransferHandler(new TransferHandler("icon"));
            grid9.setTransferHandler(new TransferHandler("icon"));

            buttonsPanel2.add(rdCnr);
            buttonsPanel2.add(rdXsec);
            buttonsPanel2.add(rdTsec);
            buttonsPanel2.add(rdStr8);

            menu.add(buttonsPanel2);
            menu.add(new JButton("START"));
            menu.add(new JButton("STOP"));

            gridPanel.add(grid1);
            gridPanel.add(grid2);
            gridPanel.add(grid3);
            gridPanel.add(grid4);
            gridPanel.add(grid5);
            gridPanel.add(grid6);
            gridPanel.add(grid7);
            gridPanel.add(grid8);
            gridPanel.add(grid9);

            content.add(gridPanel, BorderLayout.CENTER);
            content.add(menu, BorderLayout.WEST);
            f.setContentPane(content);

            f.pack();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(1000,600);

            f.setVisible(true);
    }
}
