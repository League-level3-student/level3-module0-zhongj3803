package _00_Intro_To_Arrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _02_RobotRace {
	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] robs = new Robot[7];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < robs.length; i++) {
			robs[i] = new Robot();
			robs[i].setSpeed(20);
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		
		for (int i = 0; i < robs.length; i++) {
			robs[i].setY(500);
			robs[i].setX(850/(robs.length)*i+50);
		}
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		Random ran = new Random();
		int winner = 0;
		boolean gameActive = true;
		while (gameActive) {
		for (int i = 0; i<robs.length;i++) {
			robs[i].move(ran.nextInt(50));
			if (robs[i].getY()<0) {
				gameActive = false;
				winner = i;
				break;
			}
		}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.
		
		// 7. declare that robot the winner and throw it a party!
		JOptionPane.showMessageDialog(null,"Robot " + (winner+1)+ " is the winner!");
		
		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
		for (int i = 0;i<robs.length;i++) {
			robs[i].miniaturize();
			robs[i].turn(90);
			robs[i].setX(300);
			robs[i].setY(200/(robs.length)*i+300);
		}
	}
}
