import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonFrame extends JFrame implements ActionListener {
    JRadioButton pizzaButton;
    JRadioButton hamburgerButton;
    JRadioButton hotdogButton;

    ImageIcon pizzaIcon;
    ImageIcon hamburgerIcon;
    ImageIcon hotdogIcon;

    public RadioButtonFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        pizzaIcon = new ImageIcon("pizza.png");
        hamburgerIcon = new ImageIcon("\uD83C\uDF54");
        hotdogIcon = new ImageIcon("\uD83C\uDF2D");

         pizzaButton = new JRadioButton("pizza");
         hamburgerButton= new JRadioButton("hamburger");
         hotdogButton= new JRadioButton("hotdog");

        ButtonGroup group = new ButtonGroup(); // this method we can select only one item
        group.add(pizzaButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzaButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);

        pizzaButton.setIcon(pizzaIcon);


        this.add(pizzaButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        // write now we are selected all of the button but we want to select only one
        // we use Button group


        this.pack();
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pizzaButton){
            System.out.println("You ordered pizza!");
        }
        else if(e.getSource()==hamburgerButton){
            System.out.println("You ordered a hamburger");
        }
        else if(e.getSource()==hotdogButton){
            System.out.println("Ypu ordered a hotdog");
        }

    }
}
