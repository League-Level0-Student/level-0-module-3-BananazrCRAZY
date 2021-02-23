
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		int count;
		//1. Create a new Robot
		Robot bot = new Robot();
		bot.setSpeed(100);
		bot.penDown();
		
		for (;;) {
	    //2. Make the robot draw a shape (this will take more than one line of code)	
		for (count = 0; count < 4; count++) {
			bot.move(200);
			bot.turn(90);
		}
		//3. Set the pen width to 10
		bot.setPenWidth(10);
		//4. Ask the user what color pen they would like the robot to draw with
		String color = JOptionPane.showInputDialog("Wat color u like");
		//int coolor = Integer.parseInt(color);
		//5. Use an if/else statement to set the pen color that the user requested
		if (color.equalsIgnoreCase("Red")) {
			bot.setPenColor(Color.RED);
		} else if (color.equalsIgnoreCase("blue")) {
			bot.setPenColor(Color.BLUE);
		} else if (color.equalsIgnoreCase("green")) {
			bot.setPenColor(Color.GREEN);
		} else if (color.equalsIgnoreCase("orange")) {
			bot.setPenColor(Color.ORANGE);
		} else if (color.equalsIgnoreCase("yellow")) {
			bot.setPenColor(Color.YELLOW);
		} else if (color.equalsIgnoreCase("pink")) {
			bot.setPenColor(Color.PINK);
		} else if (color.equalsIgnoreCase("black")) {
			bot.setPenColor(Color.BLACK);
		} else if (color.equalsIgnoreCase("purple")) {
			bot.setPenColor(Color.MAGENTA);
		} else if (color.equalsIgnoreCase("white")) {
			bot.setPenColor(Color.WHITE);
		} else if (color.equalsIgnoreCase("gray")) {
			bot.setPenColor(Color.GRAY);
		} else if (color.equalsIgnoreCase("grey")) {
			bot.setPenColor(Color.GRAY);
		} else {
			bot.setRandomPenColor();
		}
		}
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		



	}
}
