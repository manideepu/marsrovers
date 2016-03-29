package com.deepu.mars.rovers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

import com.deepu.mars.rovers.PositionIF.Direction;
import com.deepu.mars.rovers.Rover.Command;

public class RoverTest {

	private static final Log LOG = LogFactory.getLog(RoverTest.class);

	@Test
	public void testInputLeftMoveLeftMoveLeftMoveLeftMoveMove() {
		Rover rover = new Rover(new PositionIF.Axis(1), new PositionIF.Axis(2), Direction.NORTH);
		rover.processCommands(new Command[] { Command.LEFT, Command.MOVE, Command.LEFT, Command.MOVE, Command.LEFT,
				Command.MOVE, Command.LEFT, Command.MOVE, Command.MOVE });

		assertNotNull(rover.getPosition());
		assertNotNull(rover.getPosition().getX());
		assertNotNull(rover.getPosition().getY());
		assertNotNull(rover.getPosition().getDirection());

		assertEquals(1, rover.getPosition().getX().getAxis());
		assertEquals(3, rover.getPosition().getY().getAxis());
		assertEquals("NORTH", rover.getPosition().getDirection().name());
	}

	@Test
	public void testInputMoveMoveRightMoveMoveRightMoveRightRightMove() {
		Rover rover = new Rover(new PositionIF.Axis(3), new PositionIF.Axis(3), Direction.EAST);
		rover.processCommands(new Command[] { Command.MOVE, Command.MOVE, Command.RIGHT, Command.MOVE, Command.MOVE,
				Command.RIGHT, Command.MOVE, Command.RIGHT, Command.RIGHT, Command.MOVE });

		assertNotNull(rover.getPosition());
		assertNotNull(rover.getPosition().getX());
		assertNotNull(rover.getPosition().getY());
		assertNotNull(rover.getPosition().getDirection());

		assertEquals(5, rover.getPosition().getX().getAxis());
		assertEquals(1, rover.getPosition().getY().getAxis());
		assertEquals("EAST", rover.getPosition().getDirection().name());

	}

	@Test
	public void testInputLMLMLMLMMAndMMRMMRMRRM() {
		Rover rover = new Rover(new PositionIF.Axis(1), new PositionIF.Axis(2), Direction.NORTH);
		rover.processCommands(new Command[] { Command.LEFT, Command.MOVE, Command.LEFT, Command.MOVE, Command.LEFT,
				Command.MOVE, Command.LEFT, Command.MOVE, Command.MOVE });

		assertNotNull(rover.getPosition());
		assertNotNull(rover.getPosition().getX());
		assertNotNull(rover.getPosition().getY());
		assertNotNull(rover.getPosition().getDirection());

		assertEquals(1, rover.getPosition().getX().getAxis());
		assertEquals(3, rover.getPosition().getY().getAxis());
		assertEquals("NORTH", rover.getPosition().getDirection().name());

		LOG.info(rover.getPosition());

		rover = new Rover(new PositionIF.Axis(3), new PositionIF.Axis(3), Direction.EAST);
		rover.processCommands(new Command[] { Command.MOVE, Command.MOVE, Command.RIGHT, Command.MOVE, Command.MOVE,
				Command.RIGHT, Command.MOVE, Command.RIGHT, Command.RIGHT, Command.MOVE });

		assertNotNull(rover.getPosition());
		assertNotNull(rover.getPosition().getX());
		assertNotNull(rover.getPosition().getY());
		assertNotNull(rover.getPosition().getDirection());

		assertEquals(5, rover.getPosition().getX().getAxis());
		assertEquals(1, rover.getPosition().getY().getAxis());
		assertEquals("EAST", rover.getPosition().getDirection().name());
		LOG.info(rover.getPosition());

	}

}