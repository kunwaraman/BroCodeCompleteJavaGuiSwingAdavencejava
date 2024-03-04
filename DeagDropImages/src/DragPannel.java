import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

public class DragPannel extends JPanel {
    ImageIcon image = new ImageIcon("smily.png");
    final int WIDTH = image.getIconWidth();
    final  int HEIGHT = image.getIconHeight();
    Point imageCorner;
    Point prevPt;


    public DragPannel(){
        imageCorner = new Point(0,0);
        ClickListener clickListener = new ClickListener();
        DragListener dragListener = new DragListener();
        this.addMouseListener(clickListener);
        this.addMouseMotionListener(dragListener);

    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        image.paintIcon(this,g, (int) imageCorner.getX(), (int) imageCorner.getY());


    }
    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
             prevPt = e.getPoint();

        }

    }
    private class DragListener extends MouseMotionAdapter {
        public void mouseDragged(MouseEvent e){
            Point currPt = e.getPoint();
            imageCorner.translate(
                    (int)(currPt.getX()-prevPt.getX()),
                    (int)(currPt.getY()-prevPt.getY())
            );
            prevPt = currPt;
            repaint();
        }

    }
}
