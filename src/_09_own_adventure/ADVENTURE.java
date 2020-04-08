package _09_own_adventure;

import javax.swing.JOptionPane;

public class ADVENTURE {
public static void main(String[] args) {
	JOptionPane.showMessageDialog(null, "Once upon a time there lived a person who wanted to save the life of all turtles.");
	JOptionPane.showMessageDialog(null, "In fact he wanted to help turtles so bad he flew to haweii just to give all turtles medicine for a disease called hibosceious.");
	int one = JOptionPane.showOptionDialog(null, "However on the plane ride over both pilots were shot but the shooter was killed! What should you do?", "Question 1", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Take over the plane!", "Jump out of the plane with a parachute!", }, null);
if(one == 0) {
	JOptionPane.showMessageDialog(null, "He takes control of the plane with the help of the plane manual.");
	int twoone = JOptionPane.showOptionDialog(null, "He is flying fine but cant stop noticing that the fuel levels are going down. If he does not find anywhere to land you will die! Where should he land?", "Question 2-1", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "In a lake coming up", "In an open area coming up.", }, null);
	if(twoone == 0){
		JOptionPane.showMessageDialog(null, "He slowly steers the plane towards the water and are able to land safly.");
		JOptionPane.showMessageDialog(null, "One day later the safty plane comes and everyone is safe.");
	}
	if(twoone == 1) {
		JOptionPane.showMessageDialog(null, "He slowly lowers the plane as if to land but hits the ground too hard and crashes.");
		JOptionPane.showMessageDialog(null, "One day later the safty plane comes to fnd everyone injured and dead.");
	}
}
if(one == 1) {
	int para = JOptionPane.showOptionDialog(null, "He grabbed the parachute and is about to jump when he saw a little kid and his mom frighted. What should you do?", "Question 2-2", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Give the little boy and his momthe parachute", "Jump", } , null);
	
	if(para == 0) {
		JOptionPane.showMessageDialog(null, "He gives the parachute to the boy and his mom.");
		JOptionPane.showMessageDialog(null, "The boy and his mom jump out with the parachute and he goes down with the plane");
	}
	if(para == 1) {
		JOptionPane.showMessageDialog(null, "He jumps out of the plane and lives but forever lives in sorro as he let the boy and his mom die");
	}
}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
