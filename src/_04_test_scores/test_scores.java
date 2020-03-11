package _04_test_scores;

import javax.swing.JOptionPane;

public class test_scores {
public static void main(String[] args) {
	
	String score = JOptionPane.showInputDialog("What did you get one your test? Ex: 85.5");
	double test = Double.parseDouble(score);
	if(test > 49.999 && test < 60) {
		JOptionPane.showMessageDialog(null, "You got an F.    Do Better or go home!");
	}
	if(test > 59.999 && test < 70) {
		JOptionPane.showMessageDialog(null, "You got an D.    Make sure that you are trying and doing your best on quizes... They matter");
	}
	
	if(test > 69.999 && test < 80) {
		JOptionPane.showMessageDialog(null, "You got an C.    Not Bad but Not great.... I would work on that.");
	}
	if(test > 79.999 && test < 90) {
		JOptionPane.showMessageDialog(null, "You got a B.    Thats great but I know you can do better!");
	}
	if(test > 89.999 && test < 101) {
		JOptionPane.showMessageDialog(null, "You got an A.    Wow! you must have studied real hard for that test");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
