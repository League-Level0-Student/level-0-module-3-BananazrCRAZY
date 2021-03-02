
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(100 - 1 + 1) + 1;
		// 2. Print out the random variable above
		JOptionPane.showMessageDialog(null, random);
		// 11. Repeat steps 1 to 10 ten times
		for (int count = 0; count < 10; count++) {
			// 1. Ask the user for a guess using a pop-up window, and save their response 
			String x = JOptionPane.showInputDialog("Guess");
			// 4. Convert the users’ answer to an int (Integer.parseInt(string))
			int y = Integer.parseInt(x);
			// 5. if the guess is correct
			if (y == random) {
				// 6. Win
				JOptionPane.showMessageDialog(null, "U WIN");
				System.exit(0);
			}
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
			else if (y > random) {
				// 8. Tell them it's too high
				JOptionPane.showMessageDialog(null, "2 High");
			}
			// 9. if the guess is low
			else if (y < random) {
				// 10. Tell them it's too low
				JOptionPane.showMessageDialog(null, "2 Low");
			}
		}
		// 13. Tell them they lose
		JOptionPane.showMessageDialog(null, "U LOSE");
		
	}

}


