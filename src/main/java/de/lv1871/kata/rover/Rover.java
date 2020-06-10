package de.lv1871.kata.rover;

/**
 * @author ibld
 */

public class Rover {

	private int x;
	private int y;

	private String direction;

	public Rover(int x, int y, String direction) {

		this.setX(x);
		this.setY(y);
		this.setDirection(direction);
	}

	public int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}

	private void setDirection(final String direction) {
		this.direction = direction;
	}

	public String getDirection() {
		return this.direction;
	}

	public void processCommands(final String commandsString) {

		// Implement the rover movement.
		// Possible commands within the String are f,b,r,l
		// f = move 1 Step in the current direction
		// b = move 1 Step against the current direction
		// r = turn the rover to the right, change the direction to do so (e.g. North -> East)
		// l = turn the rover to the left, change the direction to do so. (e.g. North -> West)
	}
}
