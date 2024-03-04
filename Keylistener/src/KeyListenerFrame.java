import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListenerFrame extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon;


    public KeyListenerFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        icon = new ImageIcon("Rocket.png");
        label = new JLabel();
        label.setBounds(0,0,100,100);
        label.setIcon(icon);
        this.getContentPane().setBackground(Color.BLACK);
        //label.setBackground(Color.red);
       // label.setOpaque(true);
        this.add(label);


        this.setVisible(true);

    }


    @Override
    public void keyTyped(KeyEvent e) {
        // keytyped = Invoked when a key is typed uses keychar,char output
        switch (e.getKeyChar()){
            case 'a':label.setLocation(label.getX()-10,label.getY());
               break;
            case 'w':label.setLocation(label.getX(),label.getY()-10);
               break;
            case 's':label.setLocation(label.getX(),label.getY()+10);
               break;
            case 'd':label.setLocation(label.getX()+1,label.getY());
               break;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // keypressed = invoked when a physical key is pressed down uses keycode,int output
        switch (e.getKeyCode()){
            case 37:label.setLocation(label.getX()-10,label.getY());
                break;
            case 38:label.setLocation(label.getX(),label.getY()-10);
                break;
            case 39:label.setLocation(label.getX()+10,label.getY()+10);
                break;
            case 40:label.setLocation(label.getX(),label.getY()+10);
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // keyrealesed = called whenever a button is released
        System.out.println("You released key char: " + e.getKeyChar());
        System.out.println("you released key code: " + e.getKeyCode());

    }
}
