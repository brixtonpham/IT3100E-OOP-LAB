/*2.2.5  Write a program to calculate sum, difference, product, and quotient of 2 double numbers which
are entered by users.*/
import javax.swing.JOptionPane;
public class Calculator {
    public static void main(String[] args) {
        String strNum1, strNum2;
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number:","Input the first number", JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number:","Input the second number", JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        JOptionPane.showMessageDialog(null,
        "Sum of two numbers is: "+ (num1+num2) 
        +"\nDifference of two numbers is: " + (num1-num2) 
        +"\nProduct of two numbers is: "+(num1*num2)
        +"\nQuotient of two numbers is: "+(num1/num2) ,
        "Calculator",
        JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}
