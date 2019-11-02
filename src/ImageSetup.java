import javax.swing.*;
import java.util.ArrayList;

public class ImageSetup extends ArrayList {

    ImageIcon icon0 = new ImageIcon("src/resources/GridBlank.png");
    ImageIcon icon1 = new ImageIcon("src/resources/Corner.png");
    ImageIcon icon4 = new ImageIcon("src/resources/tSection.png");
    ImageIcon icon2 = new ImageIcon("src/resources/xSection.png");
    ImageIcon icon3 = new ImageIcon("src/resources/str8.png");

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

    public void InputImageIntoArray(int myIndex, int imageIcon) {
       if(myIndex == 0 && imageIcon == 0 ){imageArray[0]=icon0;}
       else if(myIndex == 0 && imageIcon == 1 ){imageArray[0]=icon1;}
       else if(myIndex == 0 && imageIcon == 2 ){imageArray[0]=icon4;}
       else if(myIndex == 0 && imageIcon == 3 ){imageArray[0]=icon2;}
       else if(myIndex == 0 && imageIcon == 4 ){imageArray[0]=icon3;}
       else if(myIndex == 1 && imageIcon == 0 ){imageArray[1]=icon0;}
       else if(myIndex == 1 && imageIcon == 1 ){imageArray[1]=icon1;}
       else if(myIndex == 1 && imageIcon == 2 ){imageArray[1]=icon4;}
       else if(myIndex == 1 && imageIcon == 3 ){imageArray[1]=icon2;}
       else if(myIndex == 1 && imageIcon == 4 ){imageArray[1]=icon3;}
       else if(myIndex == 2 && imageIcon == 0 ){imageArray[2]=icon0;}
       else if(myIndex == 2 && imageIcon == 1 ){imageArray[2]=new RotatedIcon(icon1,90);}
       else if(myIndex == 2 && imageIcon == 2 ){imageArray[2]=icon4;}
       else if(myIndex == 2 && imageIcon == 3 ){imageArray[2]=icon2;}
       else if(myIndex == 2 && imageIcon == 4 ){imageArray[2]=icon3;}
       else if(myIndex == 3 && imageIcon == 0 ){imageArray[3]=icon0;}
       else if(myIndex == 3 && imageIcon == 1 ){imageArray[3]=icon1;}
       else if(myIndex == 3 && imageIcon == 2 ){imageArray[3]=icon4;}
       else if(myIndex == 3 && imageIcon == 3 ){imageArray[3]=icon2;}
       else if(myIndex == 3 && imageIcon == 4 ){imageArray[3]=icon3;}
       else if(myIndex == 4 && imageIcon == 0 ){imageArray[4]=icon0;}
       else if(myIndex == 4 && imageIcon == 1 ){imageArray[4]=icon1;}
       else if(myIndex == 4 && imageIcon == 2 ){imageArray[4]=icon4;}
       else if(myIndex == 4 && imageIcon == 3 ){imageArray[4]=icon2;}
       else if(myIndex == 4 && imageIcon == 4 ){imageArray[4]=icon3;}
       else if(myIndex == 5 && imageIcon == 0 ){imageArray[5]=icon0;}
       else if(myIndex == 5 && imageIcon == 1 ){imageArray[5]=icon1;}
       else if(myIndex == 5 && imageIcon == 2 ){imageArray[5]=icon4;}
       else if(myIndex == 5 && imageIcon == 3 ){imageArray[5]=icon2;}
       else if(myIndex == 5 && imageIcon == 4 ){imageArray[5]=icon3;}
       else if(myIndex == 6 && imageIcon == 0 ){imageArray[6]=icon0;}
       else if(myIndex == 6 && imageIcon == 1 ){imageArray[6]=new RotatedIcon(icon1,270);}
       else if(myIndex == 6 && imageIcon == 2 ){imageArray[6]=icon4;}
       else if(myIndex == 6 && imageIcon == 3 ){imageArray[6]=icon2;}
       else if(myIndex == 6 && imageIcon == 4 ){imageArray[6]=icon3;}
       else if(myIndex == 7 && imageIcon == 0 ){imageArray[7]=icon0;}
       else if(myIndex == 7 && imageIcon == 1 ){imageArray[7]=icon1;}
       else if(myIndex == 7 && imageIcon == 2 ){imageArray[7]=icon4;}
       else if(myIndex == 7 && imageIcon == 3 ){imageArray[7]=icon2;}
       else if(myIndex == 7 && imageIcon == 4 ){imageArray[7]=icon3;}
       else if(myIndex == 8 && imageIcon == 0 ){imageArray[8]=icon0;}
       else if(myIndex == 8 && imageIcon == 1 ){imageArray[8]=new RotatedIcon(icon1,180);}
       else if(myIndex == 8 && imageIcon == 2 ){imageArray[8]=icon4;}
       else if(myIndex == 8 && imageIcon == 3 ){imageArray[8]=icon2;}
       else if(myIndex == 8 && imageIcon == 4 ){imageArray[8]=icon3;}
    }
    public ImageIcon getImageFromArray(int myIndex){
        return imageArray[myIndex];
    }
    public ImageIcon[] getArray(){return imageArray;}
    }

