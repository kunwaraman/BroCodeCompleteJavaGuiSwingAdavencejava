import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListenerFrame extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon smile;
    ImageIcon nervous;
    ImageIcon pain;

    public MouseListenerFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        label = new JLabel();
        label.addMouseListener(this);

        smile = new ImageIcon("smile.png");
        pain = new ImageIcon("Pain.png");
        nervous = new ImageIcon("Nervous.png");
        label.setIcon(smile);

        this.add(label);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

//        label = new JLabel();
//        label.setBounds(0,0,100,100);
//        label.setBackground(Color.red);
//        label.setOpaque(true);
//
//        this.addMouseListener(this);
//        this.add(label);
//        this.setVisible(true);



    }


    @Override
    public void mouseClicked(MouseEvent e) {
        //

    }

    @Override
    public void mousePressed(MouseEvent e) {
//        System.out.println("you pressed the mouse");
//        label.setBackground(Color.yellow);
        label.setIcon(pain);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        System.out.println("you released the mouse");
//        label.setBackground(Color.green);
        label.setIcon(smile);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
//        System.out.println("You entered the component");
//        label.setBackground(Color.blue);
        label.setIcon(nervous);

    }

    @Override
    public void mouseExited(MouseEvent e) {
//        System.out.println("You exited the component");
//        label.setBackground(Color.red);
      // jaise jaise hm hover krenge wo change hote jayega color ushka jo hm change krne chahte hai
        label.setIcon(smile);


    }
}
