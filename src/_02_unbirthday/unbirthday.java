package _02_unbirthday;

import javax.swing.JOptionPane;

public class unbirthday {
public static void main(String[] args) {
	
String birthday=JOptionPane.showInputDialog("What is your birthday?");
if (birthday.equals("11/07")) {
	JOptionPane.showMessageDialog(null, "Happy birthday");


}
else { JOptionPane.showMessageDialog(null, "Happy UNbirthday");

}
}
}