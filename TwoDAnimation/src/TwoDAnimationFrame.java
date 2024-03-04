import javax.swing.*;

public class TwoDAnimationFrame extends JFrame {
    TwoDAminationPanel panel;

    public TwoDAnimationFrame(){
        panel = new TwoDAminationPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);


    }


}
