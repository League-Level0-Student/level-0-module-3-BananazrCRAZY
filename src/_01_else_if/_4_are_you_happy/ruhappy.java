package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class ruhappy {
	public static void main(String[] args) {
		String ans = JOptionPane.showInputDialog("R U Happy?\nYes Or No");
		
		if (ans.equalsIgnoreCase("NO")) {
			String ans2 = JOptionPane.showInputDialog("Do U want 2 B Happy?");
			if (ans2.equalsIgnoreCase("Yes")) {
				JOptionPane.showMessageDialog(null, "Then Change Something");
			} else if (ans2.equalsIgnoreCase("NO")) {
				JOptionPane.showMessageDialog(null, "Keep doin whatever ur doin");
			} else {
				JOptionPane.showMessageDialog(null, "Invalid");
			}
		} else if (ans.equalsIgnoreCase("Yes")) {
			JOptionPane.showMessageDialog(null, "Keep doin whatever ur doin");
		} else {
			JOptionPane.showMessageDialog(null, "Invalid");
		}
	}
}
