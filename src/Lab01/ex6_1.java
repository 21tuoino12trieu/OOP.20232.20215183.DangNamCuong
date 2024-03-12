package Lab01;

import javax.swing.JOptionPane;

public class ex6_1 {

    public static void main(String[] args) {

        int option = JOptionPane.showConfirmDialog(null, "Do you want to change to the first class ticket?");
        JOptionPane.showMessageDialog(null, "You've chosen: " + (option == JOptionPane.YES_OPTION ? "Yes" : "No"));

       /*  String[] buttons = { "I do","I don't" };

        int rc = JOptionPane.showOptionDialog(null, "Do you want to change to first class ticket?", "Confirmation",
            JOptionPane.WARNING_MESSAGE, 0, null, buttons, buttons[1]);
            JOptionPane.showMessageDialog(null,"You've chosen: "+(rc==JOptionPane.YES_OPTION?"I do":"I don't"));
        System.exit(0); */
    }
}