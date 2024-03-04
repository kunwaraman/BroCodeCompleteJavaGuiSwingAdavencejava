import javax.swing.*;
import javax.swing.JFrame;
import java.awt.Color;

public class Frame {
    public static void main(String[] args) {
        // jframe = a gui window to add components to
        /*
        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("Jframe title goes here"); // sets title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        frame.setResizable(false); // prevent frame from being resized
        frame.setSize(420,420); // sets the x  dimenesion and y dimension
        frame.setVisible(true);  // make frame visible

        ImageIcon image = new ImageIcon("rndm.png"); // crete an image icon
        frame.setIconImage(image.getImage()); // change icon frame

        // now change the background color of the frame
       // frame.getContentPane().setBackground(Color.green); // chnge color of background
        frame.getContentPane().setBackground(new Color(123,50,250));
        */

        MyFrame myFrame =   new MyFrame();


    }
}
