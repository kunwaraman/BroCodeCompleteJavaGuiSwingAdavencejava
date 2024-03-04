import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;


public class LabelMain {
    public static void main(String[] args) {
        // jlabel = a gui display area for a string of text,an image,or both

        ImageIcon image = new ImageIcon("forSwing.png");

        Border border = BorderFactory.createLineBorder(Color.green,3);
        JLabel label = new JLabel(); // create a label
       label.setText("Bro do you even code!");  // set text  of label
       label.setIcon(image);
       label.setHorizontalTextPosition(JLabel.CENTER); // set text left,center,right of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // set text top,center bottom of imageicon
        label.setForeground(new Color(0x00FF00)); // change the text color use foreground font color of text
        label.setFont(new Font("MV Boli",Font.PLAIN,50)); // set font of text
        label.setIconTextGap(-10); // set gap of text to image
        label.setBackground(Color.black); // set background color
        label.setOpaque(true); // display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);  // set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text within label
       // label.setBounds(100,100,250,250);  // set x,y position within frame as well as dimensions






        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       // frame.setSize(500,500);
       // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();




    }
}