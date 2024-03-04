import javax.swing.*;
import java.awt.*;

public class twoDgraphicsFrame extends JFrame {
    twoDgraphicsPanel panel;

    public twoDgraphicsFrame(){
        panel = new twoDgraphicsPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.add(panel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }


}
