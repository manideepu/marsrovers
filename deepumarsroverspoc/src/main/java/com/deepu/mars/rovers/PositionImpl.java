package com.deepu.mars.rovers;

public class PositionImpl implements Position {

	private Axis x;
	private Axis y;
	private Direction direction;

	public PositionImpl(Axis x, Axis y, Direction direction) {
		if (x == null || y == null || direction == null) {
			throw new IllegalArgumentException("Null values encountered");
		}
		this.direction = direction;
		this.x = x;
		this.y = y;
	}

	@Override
	public void setDirection(Direction direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return getX().getAxis() + " : " + getY().getAxis() + " : " + getDirection().name();
	}

	/*
	 * return the X co-ordinate
	 */
	public Axis getX() {
		return x;
	}


	/*
	 * return the Y co-ordinate
	 */
	public Axis getY() {
		return y;
	}

	/*
	 * return the Direction
	 */
	public Direction getDirection() {
		return direction;
	}

}
