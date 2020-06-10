package de.lv1871.kata.rover;

/**
 * @author ibld
 */

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class RoverTest {

	private Rover rover;

	@Before
	public void setUp() {
		rover = new Rover(1, 1, "N");
	}

	@Test
	public void testCreation() {
		assertEquals(1, rover.getX());
		assertEquals(1, rover.getY());
	}

	@Test
	public void testMoveForward() {
		rover.processCommands("f");
		assertEquals(2, rover.getY());
		assertEquals(1, rover.getX());
	}

	@Test
	public void testMoveBackward() {
		rover.processCommands("b");
		assertEquals(0, rover.getY());
		assertEquals(1, rover.getX());
	}

	@Test
	public void testMoveRight() {
		rover.processCommands("r");
		assertEquals(1, rover.getY());
		assertEquals(1, rover.getX());
		assertEquals(1, rover.getDirection());
	}

	@Test
	public void testMoveForwardTwice() {
		rover.processCommands("ff");
		assertEquals(3, rover.getY());
		assertEquals(1, rover.getX());
	}

	@Test
	public void testMoveForwardAndThenBackwards() {
		rover.processCommands("fb");
		assertEquals(1, rover.getY());
		assertEquals(1, rover.getX());
	}

	@Test
	public void testMoveForwardAndThenBackwardMultipleTimes() {
		rover.processCommands("ffffbb");
		assertEquals(3, rover.getY());
		assertEquals(1, rover.getX());
	}

	@Test
	public void testTurnRightAndMoveForward() {
		rover.processCommands("rf");
		assertEquals(1, rover.getY());
		assertEquals(2, rover.getX());
	}

	@Test
	public void testMoving() {
		rover.processCommands("ffrff");
		assertEquals(3, rover.getY());
		assertEquals(3, rover.getX());
	}

	@Test
	public void testTurningLeftLeft() {
		rover.processCommands("ffllb");
		assertEquals(4, rover.getY());
		assertEquals(1, rover.getX());
	}

	@Test
	public void testTurningAround() {
		rover.processCommands("ffllff");
		assertEquals(1, rover.getY());
		assertEquals(1, rover.getX());
	}

}
