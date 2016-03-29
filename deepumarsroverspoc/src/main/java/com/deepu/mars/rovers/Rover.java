package com.deepu.mars.rovers;

import java.util.List;

/**
 * Real world representation of Rover
 */
public class Rover {
	private Position position;

	public Rover(Axis x, Axis y, Direction direction) {
		this.position = new PositionImpl(x, y, direction);
	}

	/**
	 * @param commands
	 *            List of commands to process
	 */
	public void processCommands(List<Command> commands) {
		for (Command command : commands) {
			process(command, position);
		}
	}

	/**
	 * @param command
	 * @param position
	 *            Process the command in the position
	 */
	private void process(Command command, Position position) {
		switch (command) {
		case RIGHT:
			position.setDirection(position.getDirection().right());
			break;
		case LEFT:
			position.setDirection(position.getDirection().left());
			break;
		case MOVE:
			switch (position.getDirection()) {
			case NORTH:
				position.getY().increment();
				break;
			case EAST:
				position.getX().increment();
				break;
			case SOUTH:
				position.getY().decrement();
				break;
			case WEST:
				position.getX().decrement();
				break;
			}
		}
	}

	/**
	 * @return position Current position of rover
	 * 
	 */
	public Position getPosition() {
		return position;
	}
}
