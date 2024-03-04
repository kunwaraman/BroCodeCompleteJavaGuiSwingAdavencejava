import javax.swing.*;

public class DragDropImageFrame extends JFrame {

    DragPannel dragPannel = new DragPannel();
    public DragDropImageFrame(){
        this.add(dragPannel);
        this.setTitle("Drag & Drop Demo");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
}
