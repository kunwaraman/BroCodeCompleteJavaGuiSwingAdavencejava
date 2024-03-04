import javax.swing.*;
import java.awt.*;

public class PannelMain {
    // Jpannel = A gui component that functions as a container to hold other components
    public static void main(String[] args) {
         // now lets add a components to amek a label
        ImageIcon icon = new ImageIcon("thums.png");
        JLabel label = new JLabel();
        label.setText("Hi!!");
        label.setIcon(icon);
        label.setVerticalAlignment(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100,100,100,100);




        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        //switch aal green pannel icon int tot red
       // redPanel.setLayout(new BorderLayout());
        redPanel.setLayout(null);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250,0,250,250);
       // bluePanel.setLayout(new BorderLayout());
        bluePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0,250,500,250);
       // greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);


        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
        // what if you dont want to use a layout manager
        // use setlayout (null)

    }
}
