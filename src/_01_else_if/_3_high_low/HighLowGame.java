
package _01_else_if._3_high_low;

import javax.swing.*;
import java.util.Random;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 -
		for(int i=0; i<10; i++) {
			int random = new Random().nextInt(100);
			String quantity = JOptionPane.showInputDialog("Guess the number");
			int num = Integer.parseInt(quantity);
			if (num == random) {
				JOptionPane.showMessageDialog(null, "winner winner chicken dinner");
				System.exit(0);
			} else if (num >= random) {
				JOptionPane.showMessageDialog(null, "to high");
			} else {
				JOptionPane.showMessageDialog(null, "to low");
			}
		}
		JOptionPane.showMessageDialog(null, "you lost");
		// 2. Print out the random variable above

		// 11. Repeat steps 1 to 10 ten times

			// 1. Ask the user for a guess using a pop-up window, and save their response

			// 4. Convert the users’ answer to an int (Integer.parseInt(string))

			// 5. if the guess is correct
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
			// 7. if the guess is high
				// 8. Tell them it's too high
			// 9. if the guess is low
				// 10. Tell them it's too low

		// 13. Tell them they lose

	}

}


