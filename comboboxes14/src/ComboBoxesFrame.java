import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBoxesFrame extends JFrame implements ActionListener {
    JComboBox comboBox;
    public ComboBoxesFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String[] animals ={"dog","cat","bird"};
        // we can also use wrapper classes if you need to store primitive data type within an array


        comboBox = new JComboBox(animals);
        comboBox.addActionListener(this);

     //   comboBox.setEditable(true); // we can actually type something
       // System.out.println(comboBox.getItemCount()); // gets how many item in the boxes basically count
       // comboBox.addItem("horse"); // we can add extra item in the box
     //comboBox.insertItemAt("pig",0); // insert an item on a particular index
     // comboBox.setSelectedIndex(0); //always going to select index 0 when it first runs
       // comboBox.removeItem("cat"); // remove item
        //comboBox.removeItemAt(0); // remove item at a certain index
        // comboBox.removeAllItems();// clear our all combo box




        this.add(comboBox);
        this.pack();
        this.setVisible(true);
    }





    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==comboBox){
            System.out.println(comboBox.getSelectedItem());
            //System.out.println(comboBox.getSelectedIndex()); // this will always select the index and gives us
        }

    }
}
