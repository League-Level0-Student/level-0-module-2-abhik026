package _03_string_conversion._3_rollercoaster;

import javax.swing.JOptionPane;

public class RollerCoaster {

	
	public static void main(String[] args) {
		String fheight = JOptionPane.showInputDialog(null, "What is your height?\nFIRST ENTER HOW MA"
				+ "NY FEET YOU ARE AND THEN\nENTER INCHES IN THE NEXT WINDOW","Roller Coaster Heigh"
						+ "t Check",JOptionPane.INFORMATION_MESSAGE);
		String iheight = JOptionPane.showInputDialog(null, "Now Enter Inches","Roller Coaster Height"
				+ " Check",JOptionPane.INFORMATION_MESSAGE);
		int fheightInt = Integer.parseInt(fheight);
		int iheightInt = Integer.parseInt(iheight);
	
		int totheight = fheightInt*12 + iheightInt;
		JOptionPane.showMessageDialog(null, "Height: "+totheight+" inches","Roller Coaster Height "
				+ "Check",JOptionPane.INFORMATION_MESSAGE);
		if(totheight>=59) {
			JOptionPane.showMessageDialog(null, "You're tall enough, Enjoy the Ride!","Roller Coaster"
					+ " Height Check",JOptionPane.INFORMATION_MESSAGE);
		}
		else if(totheight>=50) {
			JOptionPane.showMessageDialog(null, "You can ride but you'll need someone to ride it wi"
					+ "th!","Roller Coaster Height Check",JOptionPane.INFORMATION_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null, "Sorry bud, too short :( maybe next year!","Roller Coaste"
					+ "r Height Check",JOptionPane.INFORMATION_MESSAGE);
		}
	
	}
	// 1) Make a main method that includes all the steps below…. 
		
		// 2) Ask the user to enter their height in inches using JOptionPane and set it to the variable heightToRide
		
		// Uncomment the line below...
			//if( heightToRide > 42 ) { }
		
		// Do you see the heightToRide > 42 underlined red? That is because you are comparing a STRING to an INTEGER.
		
		// 3) Convert heightToRide to heightAsInt using Integer.parseInt();  Hint: int heightAsInt = Integer.parse... 
	
		// 4) If the heightAsInt is greater than or equal to 48 inches tall print:
	    // "Hurray! You are tall enough to ride the coaster alone!" Hint: use JoptionPane
		
		// 5) Else if the heightAsInt is greater than or equal to 42 inches tall print:
		// "You can ride the coaster with someone else!" 
	
		// 6) else print: "You must be at least 42 inches tall to ride the roller coaster pal!"
} 
