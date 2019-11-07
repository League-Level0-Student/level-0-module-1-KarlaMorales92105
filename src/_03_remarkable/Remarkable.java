package _03_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
String aboutMelina = "You are really good at math" ;
String aboutKarla = "I like your hair";
String aboutMama = "You are very intelligent";
		// 2. Ask the user to enter a name. Store their answer in a variable.
String name = JOptionPane.showInputDialog("What is your name?");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
if (name.equals("Melina")) {
	JOptionPane.showMessageDialog(null, "You are really good at math");}

if (name.equals("Karla")) {
	JOptionPane.showMessageDialog(null, "I like your hair");}
	
if (name.equals("Mama")) {
	JOptionPane.showMessageDialog(null, "You are very intelligent");}

}
}
