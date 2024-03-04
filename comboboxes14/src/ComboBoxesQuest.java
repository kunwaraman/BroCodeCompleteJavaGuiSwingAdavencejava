import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ComboBoxesQuest {
    JFrame frame;
    JComboBox combobox;

    public ComboBoxesQuest(){
        frame = new JFrame("JComboBox");
        String color[] ={"Red","Blue","Green","Yellow","Magenta","Cyan"};
        combobox = new JComboBox<String>(color);
        combobox.setBounds(30,50,100,30);

        combobox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange()==ItemEvent.SELECTED){
                    String selectedColor = (String) combobox.getSelectedItem();
                    switch (selectedColor) {
                        case "Red":
                            frame.getContentPane().setBackground(Color.RED);
                            break;
                        case "Blue":
                            frame.getContentPane().setBackground(Color.BLUE);
                            break;
                        case "Green":
                            frame.getContentPane().setBackground(Color.GREEN);
                            break;
                        case "Yellow":
                            frame.getContentPane().setBackground(Color.yellow);
                            break;
                        case "Magenta":
                            frame.getContentPane().setBackground(Color.MAGENTA);
                            break;
                        case "Cyan":
                            frame.getContentPane().setBackground(Color.CYAN);
                            break;

                    }
                }
            }
        });

        frame.add(combobox);
        frame.setSize(400,500);
        frame.setResizable(false);


        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    public static void main(String...AmanKunwar) {
        new ComboBoxesQuest();

    }
}
