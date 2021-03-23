
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "January 24th";
		String dadsBirthday = "June 9th";
		String myBirthday = "April 16th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		int b = JOptionPane.showOptionDialog(null, "What birthday do u want?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Mom", "Dad", "Yours" }, null);

		// 4. if user asked for "mom"
		if (b == 0) {
			//print mom's birthday
			JOptionPane.showMessageDialog(null, "Mom's Birthday is " + momsBirthday);
		} else if (b == 1) {
		// 5. if user asked for "dad"
			// print dad's birthday
			JOptionPane.showMessageDialog(null, "Dad's Birthday is " + dadsBirthday);
		} else if (b == 2) {
		// 6. if user asked for your name
			// print myBirthday
			JOptionPane.showMessageDialog(null, "Your Birthday is " + myBirthday);
		}

	} 
}
