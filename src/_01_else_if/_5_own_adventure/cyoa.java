package _01_else_if._5_own_adventure;

import javax.swing.JOptionPane;
// There are 40 endings 
// 5 secret endings
public class cyoa {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "U R at school in the cafeteria choosing school lunch.\n"
				+ "U have the choice between\n1. CHEESE  2. MASH  3. PUDDING  4. In-N-Out (Input Number)");
		String one = JOptionPane.showInputDialog("Choose an Object");
		
		if (one.equals("1")) {
			String two = JOptionPane.showInputDialog("U bite into the 100 year old cheese and get food poisoning\n" +
					"1. Go to the school nurse  2. Go to the bathroom to throw up  3. Deal with it");
			if (two.equals("1")) {
				String three = JOptionPane.showInputDialog("U go to the school nurse about your food poisoning.\n" + 
				"On your way there u throw up in the hall. What will u do?\n1. Run away  2. Try to clean it up  3. Tell the janitor");
				if (three.equals("1")) {
					JOptionPane.showMessageDialog(null, "As u run away u bump into the principle\nHe forces u to scrub the floor until it's sqeaky clean\n");
					JOptionPane.showMessageDialog(null, "U LOSE\n(1/40)");
				} else if (three.equals("2")) {
					String four = JOptionPane.showInputDialog("As u return from getting a bundle of paper towels from the bathroom\n" + 
							"The janitor is already cleaning the mess up\n1. Do u help  2. Do u walk away");
					if (four.equals("1")) {
						JOptionPane.showMessageDialog(null, "When u go to help the janitor you are apraised");
						JOptionPane.showMessageDialog(null, "U R an OK Person\n(2/40)");
					} else if (four.equals("2")){
						JOptionPane.showMessageDialog(null, "As u walk away slowly u bump into the principle and he tells u to go help the janitor");
						JOptionPane.showMessageDialog(null, "U R SHAMED\n(3/40)");
					} else {
						JOptionPane.showMessageDialog(null, "U just stand there\nU have achieved invisiblity");
						JOptionPane.showMessageDialog(null, "*Crunch*\n(43/40)");
					}
				} else if (three.equals("3")) {
					String four = JOptionPane.showInputDialog("When u tell the janitor do u say it was u\nYes or No");
					if (four.equalsIgnoreCase("Yes")) {
						JOptionPane.showMessageDialog(null, "U tell the janitor what happened");
						JOptionPane.showMessageDialog(null, "U Will DIE with HONOR\n(4/40)");
					} else if (four.equalsIgnoreCase("No")) {
						JOptionPane.showMessageDialog(null, "U tell the janitor what happened by blaming the other kid");
						JOptionPane.showMessageDialog(null, "What Crook-ed ways\n(5/40)");
					}
				}
			} else if (two.equals("2")) {
				String three = JOptionPane.showInputDialog("U go to the bathroom to throw up\nDo u choose Left or Right");
				if (three.equalsIgnoreCase("left")) {
					JOptionPane.showMessageDialog(null, "U run into the left bathroom not looking at the sign. OOF");
					JOptionPane.showMessageDialog(null, "U have EYES. Use them\n(6/40)");
				} else if (three.equalsIgnoreCase("Right")) {
					String four = JOptionPane.showInputDialog("U luckly run into the boys bathroom\nDo u throw up in\n1. Toilet  2. Sink  3. Floor");
					if (four.equals("1")) {
						JOptionPane.showMessageDialog(null, "U throw up in the toilet. U flush. U slip. U dunk.");
						JOptionPane.showMessageDialog(null, "Watch out for the pee floor\n(7/40)");
					} else if (four.equals("2")) {
						JOptionPane.showMessageDialog(null, "U throw up in the sink and it overflows");
						JOptionPane.showMessageDialog(null, "Barf Shoes\n(8/40)");
					} else if (four.equals("3")) {
						JOptionPane.showMessageDialog(null, "Really\n(9/40)");
					}
				}
			} else if (two.equals("3")) {
				JOptionPane.showMessageDialog(null, "U get very sick in 6 period and u end up throwing up all over yourself");
				JOptionPane.showMessageDialog(null, "WELL... U dealt with it\n(10/40)");
			}
		} else if (one.equals("2")) {
			String two = JOptionPane.showInputDialog("U choose Mash for your lunch. As u dig in to your food u realize it has become stuck to your spoon\n" + 
					"What will u do?\n1. Try to eat it  2. Don't eat  3. Let Physics do the work");
			if (two.equals("1")) {
				JOptionPane.showMessageDialog(null, "I'm 2 lazy to make this long\nU embarress yourself");
				JOptionPane.showMessageDialog(null, "U become the class LOSER\n(11/40)");
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
								JOptionPane.showMessageDialog(null, "Creature of NIGHTMARES\n(12/40)");
							} else if (six.equals("2")) {
								JOptionPane.showMessageDialog(null, "U ask for food and u get it.");
								JOptionPane.showMessageDialog(null, "Hmmm food good\n(13/40)");
							} else {
								JOptionPane.showMessageDialog(null, "U hungry so u use hunger switch\nU electrocute everyone");
								JOptionPane.showMessageDialog(null, "Morpeko's Hunger Switch\n(44/40)");
							}
						} else if (five.equals("2")) {
							JOptionPane.showMessageDialog(null, "U ask for food and u get it.");
							JOptionPane.showMessageDialog(null, "Hmmm food good\n(14/40)");
						}
					} else if (four.equals("2")) {
						JOptionPane.showMessageDialog(null, "U ask for food and u get it.");
						JOptionPane.showMessageDialog(null, "Hmmm food good\n(15/40)");
					}
				} else if (three.equals("2")) {
					String four = JOptionPane.showInputDialog("U eat your book and start to choke\n1. Tap the guy to your right  2. Tap the guy to the left");
					if (four.equals("1")) {
						JOptionPane.showMessageDialog(null, "U tap the guy to your right to try and get him to help u.\nThe man stares at u with death in his eyes.");
						JOptionPane.showMessageDialog(null, "He does the heimlich on u");
						JOptionPane.showMessageDialog(null, "I survived THE BOOK OF DEATH\n(16/40)");
					} else if (four.equals("2")) {
						JOptionPane.showMessageDialog(null, "U tap the guy to your left to try and get him to help u.\nThe man stares at you with joy in his eyes.");
						JOptionPane.showMessageDialog(null, "He watches u choke to death.");
						JOptionPane.showMessageDialog(null, "You soffocated to death\n(17/40)");
					}
				} else if (three.equals("3")) {
					JOptionPane.showMessageDialog(null, "U decide to chew on the desk... and WHY?");
					JOptionPane.showMessageDialog(null, "Class WIERDO\n(18/40)");
				}
			} else if (two.equals("3")) {
				JOptionPane.showMessageDialog(null, "U swing the spoon with mash on it in the air.\nU mash flies and hits a kid.\nU start war.");
				JOptionPane.showMessageDialog(null, "U R Drafted into the FOOD WAR\n(19/40)");
			}
		} else if (one.equals("3")) {
			String two = JOptionPane.showInputDialog("U choose to eat the pudding for lunch. However, when u take a spoon full u realize it's sour!\n" + 
		            "1. Spit it out  2. Swallow  3. Eat more");
			if (two.equals("1")) {
				String three = JOptionPane.showInputDialog(null, "U spit it out and it hits another kid. FOOD DUEL!\nQuick! Which way will you shoot your pudding?\n1. Left  2. Right  3. Up");
				if (three.equals("1")) {
					JOptionPane.showMessageDialog(null, "U shoot left hoping u hit your mark. However u get hit first by a spoon full of mash.\n" + 
							"Both u and your opponent are hit.");
					JOptionPane.showMessageDialog(null, "U was shot by other kid using mash\n(20/40)");
				} else if (three.equals("2")) {
					JOptionPane.showMessageDialog(null, "U shoot right hoping to hit your mark.\nBAM!!!\nYour opponent dead before u.");
					JOptionPane.showMessageDialog(null, "The GUN SLINGER\n(21/40)");
				} else if (three.equals("3")) {
					JOptionPane.showMessageDialog(null, "U shoot up even though u know ur a better shot than your opponent.\nU know u will live in shame knowing u killed someone.\n" + 
							"In that moment u image death more like it's a memory");
					JOptionPane.showMessageDialog(null, "Sucks to be BURR\n(22/40)");
				}
			} else if (two.equals("2")) {
				String three = JOptionPane.showInputDialog("U decide to swallow it. The acids burn your tongue and throat.\nWhat will u do?\n1. Drink water  2. Nothing  3. Think about it");
				if (three.equals("1")) {
					JOptionPane.showMessageDialog(null, "U drink water.\nWater is Good.");
					JOptionPane.showMessageDialog(null, "H2O is yo friend YO!\n(23/40)");
				} else if (three.equals("2")) {
					String four = JOptionPane.showInputDialog("U do nothing.\nNow what?\n1. Nothing  2. Something");
					if (four.equals("1")) {
						String five = JOptionPane.showInputDialog("Really?\nAgain?!?\nOk...\nAnother chance.\n1. Nothing  2. Something");
						if (five.equals("1")) {
							String six = JOptionPane.showInputDialog("Ok...*sigh*\nFINAL CHANCE\nU better choose SOMETHING\n1. SOMETHING  2. Something");
							if (six.equals("1")) {
								JOptionPane.showMessageDialog(null, "Good\nU did something and died");
								JOptionPane.showMessageDialog(null, "It was too late. (*O*)\n(24/40)");
							} else if (six.equals("2")) {
								JOptionPane.showMessageDialog(null, "GOOD\nU get to live another day");
								JOptionPane.showMessageDialog(null, "U feel nothingness\n(25/40)");
							} else {
								JOptionPane.showMessageDialog(null, "Ok that is it!\nU really had to choose something other than \"SOMETHING\"\n" +
										"Like I said FINAL CHANCE");
								JOptionPane.showMessageDialog(null, "U fell out of the world\n(26/40)");
							}
						} else if (five.equals("2")) {
							String six = JOptionPane.showInputDialog("Good\nBut to make sure\n1. Nothing  2. Something");
							if (six.equals("1")) {
								JOptionPane.showMessageDialog(null, "As you wish.");
								JOptionPane.showMessageDialog(null, "You were stabbed to death by Dread Pirate Roberts\n(27/40)");
							} else if (six.equals("2")) {
								JOptionPane.showMessageDialog(null, "Your loyalty is rewarded");
								JOptionPane.showMessageDialog(null, "You have become the next generation of Dread Pirate Roberts\n(28/40)");
							}
						}
					} else if (four.equals("2")) {
						String five = JOptionPane.showInputDialog("U did something\n1. PK Fire  2. PK Freeze  3. PK Star Storm");
						if (five.equals("1")) {
							JOptionPane.showMessageDialog(null, "IDK how this is supposed to help with the sour taste.");
							JOptionPane.showMessageDialog(null, "U burned the whole school down\n(29/40)");
						} else if (five.equals("2")) {
							JOptionPane.showMessageDialog(null, "Cool!\nLiterally and metaphorically.\nSo now what?");
							JOptionPane.showMessageDialog(null, "U froze yourself. Cold as stone.\n(30/40)");
						} else if (five.equals("3")) {
							JOptionPane.showMessageDialog(null, "Hmmm...\nHow does this help?");
							JOptionPane.showMessageDialog(null, "U destroyed the whole neighborhood\n(31/40)");
						} else {
							JOptionPane.showMessageDialog(null, "U used PK Flash");
							JOptionPane.showMessageDialog(null, "Every is suffering of crying around U\n(45/40)");
						}
					}
				} else if (three.equals("3")) {
					String four = JOptionPane.showInputDialog("U think about it.\n1. Think about it  2. Think about it for awhile");
					if (four.equals("1")) {
						String five = JOptionPane.showInputDialog("U have gain Infinite IQ while thinking\n1. Learn Pokemon moves  2. Think about it");
						if (five.equals("1")) {
							String six = JOptionPane.showInputDialog("What move will u learn?\n1. Solar Beam  2. Flamethrower  3. Frost Breath");
							if (six.equals("1")) {
								JOptionPane.showMessageDialog(null, "U uses Solar Beam");
								JOptionPane.showMessageDialog(null, "Charging");
								JOptionPane.showMessageDialog(null, "Charging");
								JOptionPane.showMessageDialog(null, "Charging");
								JOptionPane.showMessageDialog(null, "Charging");
								JOptionPane.showMessageDialog(null, "Charging");
								JOptionPane.showMessageDialog(null, "Charging");
								JOptionPane.showMessageDialog(null, "Charging");
								JOptionPane.showMessageDialog(null, "Charging");
								JOptionPane.showMessageDialog(null, "Charging");
								JOptionPane.showMessageDialog(null, "Charging");
								JOptionPane.showMessageDialog(null, "U know it takes a turn to charge right?");
								JOptionPane.showMessageDialog(null, "Charging");
								JOptionPane.showMessageDialog(null, "Charging");
								JOptionPane.showMessageDialog(null, "Charging");
								JOptionPane.showMessageDialog(null, "Charging");
								JOptionPane.showMessageDialog(null, "Charging");
								JOptionPane.showMessageDialog(null, "U uses Solar Beam but fails because your inside");
								JOptionPane.showMessageDialog(null, "Charging 4 Life\n(32/40)");
							} else if (six.equals("2")) {
								JOptionPane.showMessageDialog(null, "U uses flamethrower");
								JOptionPane.showMessageDialog(null, "U burns down the school again\n(33/40)");
							} else if (six.equals("3")) {
								JOptionPane.showMessageDialog(null, "U uses frost breath.");
								JOptionPane.showMessageDialog(null, "The sour is numbed\n(34/40)");
							}  else {
								JOptionPane.showMessageDialog(null, "U uses Explosion");
								JOptionPane.showMessageDialog(null, "U can probably Guess what happens next\n(42/40)");
							}
						} else if (five.equals("2")) {
							JOptionPane.showMessageDialog(null, "U think for so long\nU gain sooo much IQ\nUr brain explodes");
							JOptionPane.showMessageDialog(null, "BIG BRAIN\n(35/40)");
						}
					} else if (four.equals("2")) {
						JOptionPane.showMessageDialog(null, "U think about for so long years pass\nU turn to stone");
						JOptionPane.showMessageDialog(null, "U become the thinker statue\n(36/40)");
					}
				}
			} else if (two.equals("3")) {
				String three = JOptionPane.showInputDialog("IDk what the logic is her but...U eat more\nAnd it is sour\nWhat will U do?\n1. Use Endure  2. Eat more ");
				if (three.equals("1")) {
					JOptionPane.showMessageDialog(null, "U uses Endure");
					JOptionPane.showMessageDialog(null, "Ur at 1 HP\n(37/40)");
				} else if (three.equals("2")) {
					String four = JOptionPane.showInputDialog("Just choose\n1. Eat more  2. Get 13 hearts");
					if (four.equals("1")) {
						JOptionPane.showMessageDialog(null, "Ok U win");
						JOptionPane.showMessageDialog(null, "U became Kirby\n(38/40)");
					} else if (four.equals("2")) {
						JOptionPane.showMessageDialog(null, "U quested to 52 shrines to get 13 hearts\nU pull the Master Sword");
						JOptionPane.showMessageDialog(null, "WAIT... ur not Link?!?!\n(39/40)");
					}
				}
			}
		} else if (one.equals(4)) {
			JOptionPane.showMessageDialog(null, "We don't server that\n(40/40)");
		} else {
			JOptionPane.showMessageDialog(null, "This is a secret ending");
			JOptionPane.showMessageDialog(null, "U should try finding the others\n(41/40)");
		}
	}
}