
package _01_else_if._1_robot_color_chooser;

import org.jointheleague.graphical.robot.Robot;

import javax.swing.JOptionPane;
import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		Robot r2d2 = new Robot();
		while (true) {
			String input = JOptionPane.showInputDialog("What is your favorite color?");
			r2d2.clear();
			if (input.equals("green")) {
				r2d2.setPenColor(Color.green);
			} else if (input.equals("yellow")) {
				r2d2.setPenColor(Color.yellow);
			} else if (input.equals("blue")) {
				r2d2.setPenColor(Color.blue);
			} else if (input.equals("red")) {
				r2d2.setPenColor(Color.red);
			} else if (input.equals("")) {
				Random randRed = new Random();
				int red = randRed.nextInt(256);
				Random randGreen = new Random();
				int green = randGreen.nextInt(256);
				Random randBlue = new Random();
				int blue = randBlue.nextInt(256);
				r2d2.setPenColor(red, green, blue);
			} else if (input.equals("exit")) {
				break;
			}
			r2d2.setPenWidth(100);
			r2d2.penDown();
			r2d2.setSpeed(100);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
			r2d2.move(100);
			r2d2.turn(90);
		}
		//1. Create a new Robot
	    //2. Make the robot draw a shape (this will take more than one line of code)		
		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn’t enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them


		



	}
}
