import javax.swing.*;

public class SumTwoGuiApp {
    public static void main(String[] args){
        //JOptionPane.showMessageDialog(null,"Hello world");
        String number1=JOptionPane.showInputDialog("Enter in number 1");
        String number2=JOptionPane.showInputDialog("Enter in number 2");
        int num1=Integer.parseInt(number1);
        int num2=Integer.parseInt(number2);
        int sum=num1+num2;
        JOptionPane.showMessageDialog(null,"Sum= "+sum);
    }
}

