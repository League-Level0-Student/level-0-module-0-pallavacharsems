package _99_extra;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
public class Checkpoint {
public static void main(String[] args) {
		
		
		String response = JOptionPane.showInputDialog("What is your favorite color?");
		JOptionPane.showMessageDialog(null, response + " is also my favorite color!");
		
		
		
		Robot ice = new Robot();
		for (int i = 0; i < 3; i++) {
		ice.penDown();
		ice.setSpeed(10);
		ice.move(100);
		ice.turn(120);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
