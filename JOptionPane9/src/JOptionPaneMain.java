import javax.swing.*;

public class JOptionPaneMain {
    public static void main(String[] args) {
        /*
        JOptionPane== pop up a standard dialog box that prompts users for a vaalue
           or informs them of something
         */
      //  JOptionPane.showMessageDialog(null,"This is some useless info","title",JOptionPane.PLAIN_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Here is more uselesss info;D","title",JOptionPane.INFORMATION_MESSAGE);
      //  JOptionPane.showMessageDialog(null,"really","title",JOptionPane.QUESTION_MESSAGE);
//       while(true) {
//           JOptionPane.showMessageDialog(null, "Your computer has a virus", "title", JOptionPane.WARNING_MESSAGE);
//       }
        // if you will remove while loop condition they will not tell you more than one time
//        while (true) {
//            JOptionPane.showMessageDialog(null, "Call tech support NOW OR ELSE!!!!", "title", JOptionPane.ERROR_MESSAGE);
//        }

        //JOptionPane.showConfirmDialog(null,"bro,do you even code?","This is my title",JOptionPane.YES_NO_CANCEL_OPTION);  // get mutiple optionsyes no cancel like option
        // we can print this
        //System.out.println(JOptionPane.showConfirmDialog(null,"bro,do you even code?","This is my title",JOptionPane.YES_NO_CANCEL_OPTION));
       // int ans = JOptionPane.showConfirmDialog(null,"bro,do you even code?","This is my title",JOptionPane.YES_NO_CANCEL_OPTION);
//        String name = JOptionPane.showInputDialog("Whta is your name?:");
//        System.out.println("Hello "+name);
        String[] responses = {"No,you are awesome!","thank you","+blush"};
        ImageIcon icon = new ImageIcon("rndm.png");
        JOptionPane.showOptionDialog(null,
                "You are awesome",
                "secret message",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                icon,responses,0);




    }
}
