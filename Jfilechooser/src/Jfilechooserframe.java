import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class Jfilechooserframe extends JFrame implements ActionListener {
    JButton button;
    Jfilechooserframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        //this.setSize(400,500);


         button= new JButton("Select File");
        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));
//            System.out.println(fileChooser.showOpenDialog(null)); // this will select file to open
            // int response = fileChooser.showOpenDialog(null);
            int response = fileChooser.showSaveDialog(null); // this will select file to save
             if(response==JFileChooser.APPROVE_OPTION){
                 File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                 System.out.println(file);
             }

        }

    }
}
