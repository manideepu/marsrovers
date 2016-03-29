package com.deepu.mars.rovers;

public class Position implements PositionIF {

	private Axis x;
	private Axis y;
	private Direction direction;

	public Position(Axis x, Axis y, Direction direction) {
		if (x == null || y == null || direction == null) {
			throw new IllegalArgumentException("Position's attributes can't be null");
		}
		this.direction = direction;
		this.x = x;
		this.y = y;
	}

	protected void setDirectionRight() {
		direction = direction.right();
	}

	protected void setDirectionLeft() {
		direction = direction.left();
	}

	@Override
	public String toString() {
		return getX().getAxis() + " : " + getY().getAxis() + " : " + getDirection().name();
	}

	public Axis getX() {
		return x;
	}

	public Axis getY() {
		return y;
	}

	public Direction getDirection() {
		return direction;
	}

}
