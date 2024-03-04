import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MenuBarsFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    MenuBarsFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");

        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);


        // let say we want a menu for save load and exit
        loadItem = new JMenuItem("Load");
         saveItem = new JMenuItem("save");
         exitItem = new JMenuItem("Exit");
         // let say we add something in edit
        loadItem = new JMenuItem("editSomething");
        saveItem = new JMenuItem("what is this");
        exitItem = new JMenuItem("just Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        // keyboad shortcut method for this we use
        // we can also set the type in like that file something in any other
//        fileMenu.setMnemonic(KeyEvent.VK_F);  // alt+f for file
//        editMenu.setMnemonic(KeyEvent.VK_E); // alt+e for edit
//        helpMenu.setMnemonic(KeyEvent.VK_H);   // alt+h for help
//        loadItem.setMnemonic(KeyEvent.VK_L); // let say we add L sortcut for load
//        saveItem.setMnemonic(KeyEvent.VK_S); // let say s for the save
//        exitItem.setMnemonic(KeyEvent.VK_S);  // let say we do e for exit

        // you can do samething for individual menu as well





        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        editMenu.add(loadItem);
        editMenu.add(saveItem);
        editMenu.add(exitItem);




        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loadItem){
            System.out.println("*beep boop* you loaded a file");
        }
        if(e.getSource()==saveItem){
            System.out.println("*beep boop you saved a file");

        }
        if(e.getSource()==exitItem){
            System.exit(0);
        }

    }
}
