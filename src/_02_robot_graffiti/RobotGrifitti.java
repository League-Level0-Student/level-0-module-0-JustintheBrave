package _02_robot_graffiti;
import org.jointheleague.graphical.robot.Robot;

public class RobotGrifitti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	Robot joe = new Robot();
	joe.penDown();
	joe.setSpeed(200);
	joe.turn(90);
	joe.move(200);
	joe.turn(180);
	joe.move(100);
	joe.turn(-90);
	joe.move(200);
	for(int i=0; i<180; i++) {
		joe.move(1);
		joe.turn(1);
	}
	joe.hide();
	}

}



 