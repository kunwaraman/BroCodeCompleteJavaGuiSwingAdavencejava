package Projects;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator {
    public static void main(String...AmanKunwar) {
        JFrame frame = new JFrame("Calculator");
        JLabel label = new JLabel("First Number");
        label.setBounds(20,30,100,30);
        JTextField tf1 = new JTextField();
        tf1.setBounds(140,30,100,30);
        JLabel label2 = new JLabel("Second Number");
        label2.setBounds(20,90,100,30);
        JTextField tf2 = new JTextField();
        tf2.setBounds(140,90,100,30);
        JTextField tf3 = new JTextField();
        tf3.setEditable(false);
        tf3.setBounds(20,200,100,30);

        JButton button1 = new JButton("+");
        button1.setBounds(20,150,50,30);
        JButton button2 = new JButton("*");
        button2.setBounds(80,150,50,30);
        JButton button3 = new JButton("-");
        button3.setBounds(140,150,50,30);
        JButton button4 = new JButton("/");
        button4.setBounds(200,150,50,30);
        JButton button5 = new JButton("%");
        button5.setBounds(260,150,50,30);
        JButton button6 = new JButton("=");
        button6.setBounds(320,150,50,30);


        // common for all action listener
        ActionListener operation = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s1 = tf1.getText();
                String s2 = tf2.getText();
                int a = Integer.parseInt(s1);
                int b = Integer.parseInt(s2);
                int result =0;
                if(e.getSource()==button1){
                    result = a+b;
                }else if (e.getSource()==button2){
                    result = a*b;
                }else if (e.getSource()==button3){
                    result = a-b;
                } else if (e.getSource()==button4) {
                    result = a/b;
                } else if (e.getSource()==button5) {
                    result = a%b;
                } else if (e.getSource()==button6) {
                    result = a=b;

                }
                tf3.setText(String.valueOf(result));
            }
        };
        button1.addActionListener(operation);
        button2.addActionListener(operation);
        button3.addActionListener(operation);
        button4.addActionListener(operation);
        button5.addActionListener(operation);
        button6.addActionListener(operation);
        frame.add(label);
        frame.add(tf1);
        frame.add(label2);
        frame.add(tf2);
        frame.add(tf3);
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);


        frame.setSize(400,500);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);


    }
}
