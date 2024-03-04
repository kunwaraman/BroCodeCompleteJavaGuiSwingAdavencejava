import javax.swing.*;
import java.awt.*;

public class FlowLayoutMain {
    public static void main(String[] args) {
        /*
         Flow Layout=places components in a row,sized at their preferred
         size.if the horizontal space in the container is too small
         the flowlayout class uses the nest available row
         */
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,10)); // FlowLayout.trailing krenge to left ke side main jayega nahi to Leading krege to right ke side main center kare to at the center pe

//        JButton button = new JButton("1");
//        frame.add(button);
        // another way to write same thing
        // lets create a pannel add all these button in to pannel
        JPanel pannel = new JPanel();
        pannel.setPreferredSize(new Dimension(100,250));
        pannel.setBackground(Color.lightGray);
        pannel.setLayout(new FlowLayout());



        pannel.add(new JButton("1"));
        pannel.add(new JButton("2"));
        pannel.add(new JButton("3"));
        pannel.add(new JButton("4"));
        pannel.add(new JButton("5"));
        pannel.add(new JButton("6"));
        pannel.add(new JButton("7"));
        pannel.add(new JButton("8"));
        pannel.add(new JButton("9"));

        frame.add(pannel);
        frame.setVisible(true);

    }
}
