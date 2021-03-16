
package _02_loop_variables._3_robot_walk_of_fame;

import org.jointheleague.graphical.robot.Robot;

public class WalkOfFame {
	public static void main(String[] args) {

		Robot bot = new Robot();
		bot.setSpeed(100);
		// 1. Set the X position of the robot so that it starts on the left. 
		bot.setX(0);
		// You also need to show the robot to see the result of this line.
		// 2. Make the robot draw a star shape. Hint: angle=144.
		for (int count = 0; count < 5; count++) {
			bot.move(30);
			bot.turn(144);
		}
		// 3. Set the length of each line in the star to 30.

		/** THE CHALLENGE: **/
		/*
		 * Make the robot draw a line of 10 stars (see recipe to see how it should look)
		 * 
		 * Hint: The distance between stars is 50.
		 */
		
	}

/*	public static void makeStar() {
		int x = bot.getX();
		bot.setX(x);
		for (int count = 0; count < 5; count++) {
			bot.move(30);
			bot.turn(144);
		}
	}
*/
}