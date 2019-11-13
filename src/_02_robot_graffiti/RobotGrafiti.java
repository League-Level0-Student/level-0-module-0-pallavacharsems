package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGrafiti {
	public static void main(String[] args) {
		Robot ice = new Robot ("mini");
		ice.moveTo(30, 350);
		ice.penDown();
		ice.setSpeed(100);
		ice.move(220);
		for (int i = 0; i < 17; i++) {
		ice.turn(20);
		ice.move(30);
		}
		ice.moveTo(150, 290);
		for (int i = 0; i < 19; i++) {
		ice.turn(20);
		ice.move(20);
		}
		ice.moveTo(260, 250);
		ice.move(-75);
		ice.moveTo(300, 320);
		ice.move(250);
		ice.moveTo(400, 320);
		ice.move(250);
		ice.moveTo(450, 280);
		for (int i = 0; i < 19; i++) {
		ice.turn(20);
		ice.move(20);
		}
		ice.moveTo(560, 250);
		ice.setAngle(0);
		ice.move(-75);
		
		
		ice.moveTo(670, 270);
		ice.setAngle(0);
		ice.move(-75);
		ice.setAngle(0);
		ice.move(-75);

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
