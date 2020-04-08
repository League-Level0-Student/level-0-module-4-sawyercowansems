package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
		String one = JOptionPane.showInputDialog("Pick a number.");
		int uno = Integer.parseInt(one);
		String two = JOptionPane.showInputDialog("Pick another number.");
		int dos = Integer.parseInt(two);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "Pick an operation.", "Operations", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "add", "subtract", "multiply", "divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
		if(operation == 0) {	
			add(uno, dos);
		}
		if(operation == 1) {	
			subtract(uno, dos);
		}
		if(operation == 2) {	
			multiply(uno, dos);
		}
		if(operation == 3) {	
			divide(uno, dos);
		}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	}

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
		public static void add(int uno, int dos) {
			JOptionPane.showMessageDialog(null, uno + " + " + dos + " = " + (uno + dos));
		}
		public static void subtract(int uno, int dos) {
			JOptionPane.showMessageDialog(null, uno + " - " + dos + " = " + (uno - dos));
		}
		public static void multiply(int uno, int dos) {
			JOptionPane.showMessageDialog(null, uno + " x " + dos + " = " + (uno * dos));
		}
		public static void divide(int uno, int dos) {
			JOptionPane.showMessageDialog(null, uno + " / " + dos + " = " + (uno / dos));
		}
	// 4. Create similar methods for subtraction, multiplication and division.
}