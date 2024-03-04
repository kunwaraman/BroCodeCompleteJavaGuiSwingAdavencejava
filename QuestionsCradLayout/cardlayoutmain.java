package QuestionsCradLayout;

import javax.swing.*;
import java.awt.*;

public class cardlayoutmain {
    static JButton prev;
    static  JButton next;
    static CardLayout cardLayout;
    static JPanel pannel;
    static JComboBox<String> jcb;
    public static void main(String...Amankunwar) {
        JFrame frame = new JFrame("My Cards");
        frame.setSize(800,700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        pannel = new JPanel();
        cardLayout = new CardLayout();
        pannel.setLayout(cardLayout);
        frame.add(pannel);
        JPanel panel1 =new JPanel();
        panel1.setBackground(Color.RED);
        pannel.add(panel1,"Red");
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.GREEN);
        pannel.add(panel2,"Green");
        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.CYAN);
        pannel.add(panel3,"cyan");
        JPanel panel4 = new JPanel();
        panel4.setBackground(Color.YELLOW);
        pannel.add(panel4,"yellow");
        JPanel panel5 = new JPanel();
        panel5.setBackground(Color.MAGENTA);
        pannel.add(panel5,"magenta");

        JPanel buttons = new JPanel();
        prev = new JButton("previous");
        next = new JButton("Next");
        buttons.add(prev);
        buttons.add(next);
        frame.add(buttons,BorderLayout.SOUTH);

        String [] str = {"Yellow","Green","red","magenta","cyan"};
        jcb = new JComboBox<>(str);
        buttons.add(jcb);

        MyListener ml = new MyListener();
        prev.addActionListener(ml);
        next.addActionListener(ml);
        jcb.addActionListener(ml);
        frame.setVisible(true);


    }
}
