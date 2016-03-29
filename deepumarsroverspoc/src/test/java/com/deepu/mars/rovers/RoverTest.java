package com.deepu.mars.rovers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;

public class RoverTest {

	private static final Log LOG = LogFactory.getLog(RoverTest.class);

	@Test
	public void testInputLeftMoveLeftMoveLeftMoveLeftMoveMove() {

		Rover rover = new Rover(new Axis(1), new Axis(2), Direction.NORTH);

		Command[] command = { Command.LEFT, Command.MOVE, Command.LEFT, Command.MOVE, Command.LEFT, Command.MOVE,
				Command.LEFT, Command.MOVE, Command.MOVE };
		List<Command> commands = new ArrayList<Command>();
		commands.addAll(Arrays.asList(command));

		rover.processCommands(commands);

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

		Rover rover = new Rover(new Axis(3), new Axis(3), Direction.EAST);
		Command[] command = { Command.MOVE, Command.MOVE, Command.RIGHT, Command.MOVE, Command.MOVE, Command.RIGHT,
				Command.MOVE, Command.RIGHT, Command.RIGHT, Command.MOVE };
		List<Command> commands = new ArrayList<Command>();
		commands.addAll(Arrays.asList(command));

		rover.processCommands(commands);

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
		Rover rover = new Rover(new Axis(1), new Axis(2), Direction.NORTH);

		Command[] command1 = { Command.LEFT, Command.MOVE, Command.LEFT, Command.MOVE, Command.LEFT, Command.MOVE,
				Command.LEFT, Command.MOVE, Command.MOVE };
		List<Command> commands = new ArrayList<Command>();
		commands.addAll(Arrays.asList(command1));

		rover.processCommands(commands);

		assertNotNull(rover.getPosition());
		assertNotNull(rover.getPosition().getX());
		assertNotNull(rover.getPosition().getY());
		assertNotNull(rover.getPosition().getDirection());

		assertEquals(1, rover.getPosition().getX().getAxis());
		assertEquals(3, rover.getPosition().getY().getAxis());
		assertEquals("NORTH", rover.getPosition().getDirection().name());

		LOG.info(rover.getPosition());

		rover = new Rover(new Axis(3), new Axis(3), Direction.EAST);

		Command[] command2 = { Command.MOVE, Command.MOVE, Command.RIGHT, Command.MOVE, Command.MOVE, Command.RIGHT,
				Command.MOVE, Command.RIGHT, Command.RIGHT, Command.MOVE };

		commands.clear();
		commands.addAll(Arrays.asList(command2));

		rover.processCommands(commands);

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