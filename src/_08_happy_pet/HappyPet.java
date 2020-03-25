package _08_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
static int happinessLevel = 0;
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
			String fart = JOptionPane.showInputDialog("What pet do you have?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
for (int i = 0 ; i < 1000; i++) {
	
	
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "Help your " + fart + " by...", "Happy Pet", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Cuddle", "Food", "Water", "Take a walk", "Groom", "Clean up poop" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
if(task == 0) {
	cuddle();
}
if(task == 1) {
	food();
}
if(task == 2) {
	water();
}
if(task == 3) {
	walk();
}
if(task == 4) {
	groom();
}
if(task == 5) {
	poop();
}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if(happinessLevel == 10) {
	JOptionPane.showMessageDialog(null, "Wow you must love your " + fart + ".");
	break;
}
}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
public static void cuddle() {
	JOptionPane.showMessageDialog(null, "*Happiness Noises*");
	happinessLevel = happinessLevel + 4;
}	
public static void food() {
	JOptionPane.showMessageDialog(null, "*Crunch Crunch*");
	happinessLevel = happinessLevel + 3;
}
public static void water() {
	JOptionPane.showMessageDialog(null, "*Slurp Slurp*");
	happinessLevel = happinessLevel + 3;
}	
public static void walk() {
	JOptionPane.showMessageDialog(null, "*Excited noises*");
	happinessLevel = happinessLevel + 4;
}
public static void groom() {
	JOptionPane.showMessageDialog(null, "*Sad Noises*");
	happinessLevel = happinessLevel + 1;
}	
public static void poop() {
	JOptionPane.showMessageDialog(null, "*phbbbt*");
	happinessLevel = happinessLevel + 5;
}		
	
}