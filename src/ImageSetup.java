import javax.swing.*;
import java.util.ArrayList;

public class ImageSetup extends ArrayList {

    ImageIcon icon0 = new ImageIcon("src/resources/GridBlank.png");
    ImageIcon icon1 = new ImageIcon("src/resources/Corner.png");
    ImageIcon icon2 = new ImageIcon("src/resources/tSection.png");
    ImageIcon icon3 = new ImageIcon("src/resources/xSection.png");
    ImageIcon icon4 = new ImageIcon("src/resources/str8.png");

    ImageIcon micon1 = new ImageIcon("src/resources/mCnr.png");
    ImageIcon micon2 = new ImageIcon("src/resources/mStr8.png");
    ImageIcon micon3 = new ImageIcon("src/resources/mXSection.png");
    ImageIcon micon4 = new ImageIcon("src/resources/mTSection.png");

    ImageIcon[] imageArray = {icon0,icon0,icon0,icon0,icon0,icon0,icon0,icon0,icon0};
    

    public ImageIcon getIcon0() {return icon0;}
    public ImageIcon getIcon1() {return icon1;}
    public ImageIcon getIcon2() {return icon2;}
    public ImageIcon getIcon3() {return icon3;}
    public ImageIcon getIcon4() {return icon4;}
    public ImageIcon getIcon5() {return micon1;}
    public ImageIcon getIcon6() {return micon2;}
    public ImageIcon getIcon7() {return micon3;}
    public ImageIcon getIcon8() {return micon4;}

    public void InputImageIntoArray(ImageIcon myImage, int myIndex){
        imageArray[myIndex] = myImage;
    }
    public ImageIcon getImageFromArray(int myIndex){
        return imageArray[myIndex];
    }
    }

