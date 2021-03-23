
package _99_extra;

import javax.swing.JOptionPane;

public class BananaQuiz {
	public static void main(String[] args){
		//1. ask the user if they like bananas
		String banana = JOptionPane.showInputDialog("Do u like banana?");
		//2. if they say no, 
		if (banana.equalsIgnoreCase("no")) {
			//tell them they are crazy 
			JOptionPane.showMessageDialog(null, "U crazy");
			//and end quiz
		} else if (banana.equalsIgnoreCase("yes")) {
		//3. if they say yes
		//	ask them what is their favorite hobby
			String hobby = JOptionPane.showInputDialog("What tis you hobby?");
		//	show a pop up that says "<your hobby> is much better with bananas!"
			JOptionPane.showMessageDialog(null, hobby + " is much better with bananas!");
		} else {
		//4. OPTIONAL: if they say something other than "yes?" or "no?"
		//	show a pop up that says "You are bananas!?"
			JOptionPane.showMessageDialog(null, "U R bananaz!?");
		}
	}
}
