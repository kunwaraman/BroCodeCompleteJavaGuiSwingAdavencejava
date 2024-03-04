package QuestionsCradLayout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cardlayoutmain.prev){
            cardlayoutmain.cardLayout.previous(cardlayoutmain.prev);
        }
        if(e.getSource()==cardlayoutmain.next){
            cardlayoutmain.cardLayout.next(cardlayoutmain.prev);
        } else if (e.getSource()==cardlayoutmain.jcb) {
            String selected = (String) cardlayoutmain.jcb.getSelectedItem();
            cardlayoutmain.cardLayout.show(cardlayoutmain.prev,selected);

        }
    }
}
