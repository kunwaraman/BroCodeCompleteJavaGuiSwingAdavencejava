import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class jcolorchooserframe extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    jcolorchooserframe(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
      //  this.setSize(400,500);

        button = new JButton("pick a color");
        button.addActionListener(this);
        label = new JLabel();
        label.setBackground(Color.white);
        label.setText("this is some text :D");
        label.setFont(new Font("MV Boli",Font.PLAIN,100));
        label.setOpaque(true);
        this.add(button);
        this.add(label);

        this.pack();
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JColorChooser colorChooser = new JColorChooser();
            Color color = JColorChooser.showDialog(null,"pick a color... I guess",Color.black);
            label.setForeground(color);
            //label.setBackground(color);

        }

    }
}
