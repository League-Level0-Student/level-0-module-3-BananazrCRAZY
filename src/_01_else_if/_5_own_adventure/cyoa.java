package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;

public class cyoa {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "U R at school in the cafeteria choosing school lunch.\n"
				+ "U have the choice between\n1. CHEESE  2. MASH  3. PUDDING (Input Number)");
		String one = JOptionPane.showInputDialog("Choose an Object");
		
		if (one.equals("1")) {
			String two = JOptionPane.showInputDialog("U bite into the 100 year old cheese and get food poisoning\n" +
					"U have 3 choices - 1. Go to the school nurse  2. Go to the bathroom to throw up  3. Deal with it");
			if (two.equals("1")) {
				String three = JOptionPane.showInputDialog("U go to the school nurse about your food poisoning.\n" + 
				"On your way there u throw up in the hall. What will u do?\n1. Run away  2. Try to clean it up  3. Tell the janitor");
				if (three.equals("1")) {
					JOptionPane.showMessageDialog(null, "As u run away u bump into the principle\nHe forces u to scrub the floor until it's sqeaky clean\n");
					JOptionPane.showMessageDialog(null, "U LOSE");
				} else if (three.equals("2")) {
					String four = JOptionPane.showInputDialog("As u return from getting a bundle of paper towels from the bathroom\n" + 
							"The janitor is already cleaning the mess up\n1. Do u help  2. Do u walk away");
					if (four.equals("1")) {
						JOptionPane.showMessageDialog(null, "When u go to help the janitor you are apraised");
						JOptionPane.showMessageDialog(null, "U R an OK Person");
					} else if (four.equals("2")){
						JOptionPane.showMessageDialog(null, "As u walk away slowly u bump into the principle and he tells u to go help the janitor");
						JOptionPane.showMessageDialog(null, "U R SHAMED");
					}
				} else if (three.equals("3")) {
					String four = JOptionPane.showInputDialog("When u tell the janitor do u say it was u\nYes or No");
					if (four.equalsIgnoreCase("Yes")) {
						JOptionPane.showMessageDialog(null, "U tell the janitor what happened");
						JOptionPane.showMessageDialog(null, "U Will DIE with HONOR");
					} else if (four.equalsIgnoreCase("No")) {
						JOptionPane.showMessageDialog(null, "U tell the janitor what happened by blaming the other kid");
						JOptionPane.showMessageDialog(null, "What Crook-ed ways");
					}
				}
			} else if (two.equals("2")) {
				String three = JOptionPane.showInputDialog("U go to the bathroom to throw up\nDo u choose Left or Right");
				if (three.equalsIgnoreCase("left")) {
					JOptionPane.showMessageDialog(null, "U run into the left bathroom not looking at the sign. OOF");
					JOptionPane.showMessageDialog(null, "U have EYES. Use them");
				} else if (three.equalsIgnoreCase("Right")) {
					String four = JOptionPane.showInputDialog("U luckly run into the boys bathroom\nDo u throw up in\n1. Toilet  2. Sink  3. Floor");
					if (four.equals("1")) {
						JOptionPane.showMessageDialog(null, "U throw up in the toilet. U flush. U slip. U dunk.");
						JOptionPane.showMessageDialog(null, "Watch out for the pee floor");
					} else if (four.equals("2")) {
						JOptionPane.showMessageDialog(null, "U throw up in the sink and it overflows");
						JOptionPane.showMessageDialog(null, "Barf Shoes");
					} else if (four.equals("3")) {
						JOptionPane.showMessageDialog(null, "Really");
					}
				}
			} else if (two.equals("3")) {
				JOptionPane.showMessageDialog(null, "U get very sick in 6 period and u end up throwing up all over yourself");
				JOptionPane.showMessageDialog(null, "WELL... U dealt with it");
			}
		} else if (one.equals("2")) {
			String two = JOptionPane.showInputDialog("U choose Mash for your lunch. As u dig in to your food u realize it has become stuck to your spoon\n" + 
					"What will u do?\n1. Try to eat it  2. Don't eat  3. Let Physics do the work");
			if (two.equals("1")) {
				JOptionPane.showMessageDialog(null, "I'm 2 lazy to make this long\nU embarress yourself");
				JOptionPane.showMessageDialog(null, "U become the class LOSER");
			} else if (two.equals("2")) {
				String three = JOptionPane.showInputDialog("U become a hungry beast in 6 period\n1. U will not eat  2. U eat your book  3. U chew the desk");
				if (three.equals("1")) {
					String four = JOptionPane.showInputDialog(null, "U keep the inner beast hidden but u stare at others with wild eyes\n1. Ignore  2. Ask for food");
					if (four.equals("1")) {
						String five = JOptionPane.showInputDialog(null, "U keep the inner beast hidden but u stare at others with wild eyes\n1. Ignore  2. Ask for food");
						if (five.equals("1")) {
							String six = JOptionPane.showInputDialog(null, "U keep the inner beast hidden but u stare at others with wild eyes\n1. Ignore  2. Ask for food");
							if (six.equals("1")) {
								JOptionPane.showMessageDialog(null, "U cannot contain the beast any longer. U eat your classmates and teacher");
								JOptionPane.showMessageDialog(null, "Creature of NIGHTMARES");
							} else if (six.equals("2")) {
								JOptionPane.showMessageDialog(null, "U ask for food and u get it.");
								JOptionPane.showMessageDialog(null, "Hmmm food good");
							}
						} else if (five.equals("2")) {
							JOptionPane.showMessageDialog(null, "U ask for food and u get it.");
							JOptionPane.showMessageDialog(null, "Hmmm food good");
						}
					} else if (four.equals("2")) {
						JOptionPane.showMessageDialog(null, "U ask for food and u get it.");
						JOptionPane.showMessageDialog(null, "Hmmm food good");
					}
				} else if (three.equals("2")) {
					//Stopped here
				} else if (three.equals("3")) {
					
				}
			} else if (two.equals("3")) {
				JOptionPane.showMessageDialog(null, "U swing the spoon with mash on it in the air.\nU mash flies and hits a kid.\nU start war.");
				JOptionPane.showMessageDialog(null, "U R Drafted into the FOOD WAR");
			}
		} else if (one.equals("3")) {
			
		}
	}
}