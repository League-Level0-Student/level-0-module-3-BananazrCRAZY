package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class cyoa {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "U R at school in the cafeteria choosing school lunch.\n"
				+ "U have the choice between\nCHEESE MASH PUDDING");
		String one = JOptionPane.showInputDialog("Choose an Object");
		
		if (one.equalsIgnoreCase("Cheese")) {
			String two = JOptionPane.showInputDialog("U bite into the 100 year old cheese and get food poisoning\n" +
					"U have 3 choices - 1. Go to the school nurse  2. Go to the bathroom to throw up  3. Deal with it\n" +
					"Input Number");
			if (two.equals("1")) {
				String three = JOptionPane.showInputDialog("U go to the school nurse about your food poisoning.\n" + 
				"On your way there u throw up in the hall. What will u do?\n1. Run away  2. Try to clean it up  3. Tell the janitor");
				if (three.equals("1")) {
					JOptionPane.showMessageDialog(null, "As u run away u bump into the principle\nHe forces u to scrub the floor until it's sqeaky clean\n");
					JOptionPane.showMessageDialog(null, "U LOSE");
				}
			} else if (two.equals("2")) {
				
			} else if (two.equals("3")) {
				
			} else {
				JOptionPane.showMessageDialog(null, "Error");
			}
		} else if (one.equalsIgnoreCase("MASH")) {
			
		} else if (one.equalsIgnoreCase("PUDDING")) {
			
		} else {
			JOptionPane.showMessageDialog(null, "Error");
		}
	}
}
