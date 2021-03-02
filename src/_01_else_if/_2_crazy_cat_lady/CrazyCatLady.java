
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		String numCat = JOptionPane.showInputDialog("how many cat u have?");
		// 2. Convert their answer into an int
		int numC = Integer.parseInt(numCat);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
		if (numC > 3) {
			JOptionPane.showMessageDialog(null, "U r crazy cat lady");
		} else if (numC < 3 && numC > 0) {
			// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
			//    Hint: You can use the && operator 
			playVideo("https://www.youtube.com/watch?v=XyNlqQId-nk");
		} else if (numC == 0){
			// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
			playVideo("https://www.youtube.com/watch?v=80Qpriezo5M");
		} else if (numC < 0) {
			JOptionPane.showMessageDialog(null, "you're probably a dog person");
		}
		
		
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

