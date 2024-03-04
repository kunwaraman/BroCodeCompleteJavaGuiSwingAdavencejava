import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    MyFrame(){
        this.setTitle("JFrame title goes here"); // sets title of this
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out epplication
        this.setResizable(false); // prevent this from being resized
        this.setSize(420,420); // sets the x-dimensions,and y-dimensions of this
        this.setVisible(true);

        ImageIcon image = new ImageIcon("rndm.png"); // create an ImageIcon
        this.setIconImage(image.getImage()); // chnage icon of this
        this.getContentPane().setBackground(new Color(123,50,250)); // change color of background


    }


}
