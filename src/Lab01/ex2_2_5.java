package Lab01;

import javax.swing.JOptionPane;

public class ex2_2_5 {
    public static void main(String[] args) {

        String str1 = JOptionPane.showInputDialog(null, "Please input the first number", "Input the first number", JOptionPane.INFORMATION_MESSAGE);

        Double num1 = Double.parseDouble(str1);

        String str2 = JOptionPane.showInputDialog(null, "Please input the second number", "Input the second number", JOptionPane.INFORMATION_MESSAGE);
        Double num2 = Double.parseDouble(str2);

        Double res1 = num1 + num2;
        Double res2 = num1 * num2;
        Double res3 = num1 - num2;
        Double res4 = num1 / num2;
        JOptionPane.showMessageDialog(null, "Sum of two numbers is " + res1, "Sum of two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Product of two numbers is " + res2, "Sum of two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Difference of two numbers is " + res3, "Sum of two numbers", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Quotient of two numbers is " + res4, "Sum of two numbers", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);


    }

}