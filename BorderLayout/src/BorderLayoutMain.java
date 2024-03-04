import javax.swing.*;
import java.awt.*;

public class BorderLayoutMain {
    public static void main(String[] args) {
         // border layout  places components in five areas noth south east west center
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout(10,10)); // we pass margin inside border layout 10px for width  for height
        frame.setSize(500,500);
        frame.setVisible(true);

        JPanel pannel1 = new JPanel();
        JPanel pannel2 = new JPanel();
        JPanel pannel3 = new JPanel();
        JPanel pannel4= new JPanel();
        JPanel pannel5 = new JPanel();

        pannel1.setBackground(Color.red);
        pannel2.setBackground(Color.green);
        pannel3.setBackground(Color.yellow);
        pannel4.setBackground(Color.magenta);
        pannel5.setBackground(Color.blue);

        pannel1.setPreferredSize(new Dimension(100,100));
        pannel2.setPreferredSize(new Dimension(100,100));
        pannel3.setPreferredSize(new Dimension(100,100));
        pannel4.setPreferredSize(new Dimension(100,100));
        pannel5.setPreferredSize(new Dimension(100,100));

        //----------------------Sub Panels-------------//

        JPanel pannel6 = new JPanel();
        JPanel pannel7 = new JPanel();
        JPanel pannel8 = new JPanel();
        JPanel pannel9= new JPanel();
        JPanel pannel10 = new JPanel();

        pannel6.setBackground(Color.black);
        pannel7.setBackground(Color.darkGray);
        pannel8.setBackground(Color.gray);
        pannel9.setBackground(Color.lightGray);
        pannel10.setBackground(Color.white);
        pannel5.setLayout(new BorderLayout());

        pannel6.setPreferredSize(new Dimension(50,50));
        pannel7.setPreferredSize(new Dimension(50,50));
        pannel8.setPreferredSize(new Dimension(50,50));
        pannel9.setPreferredSize(new Dimension(50,50));
        pannel10.setPreferredSize(new Dimension(50,50));

        pannel5.add(pannel6,BorderLayout.NORTH);
        pannel5.add(pannel7,BorderLayout.SOUTH);
        pannel5.add(pannel8,BorderLayout.WEST);
        pannel5.add(pannel9,BorderLayout.EAST);
        pannel5.add(pannel10,BorderLayout.CENTER);
        










        frame.add(pannel1,BorderLayout.NORTH);
        frame.add(pannel2,BorderLayout.WEST);
        frame.add(pannel3,BorderLayout.EAST);
        frame.add(pannel4,BorderLayout.SOUTH);
        frame.add(pannel5,BorderLayout.CENTER);




    }
}
