package com.deepu.mars.rovers;

public interface Position {

	public Axis getX();

	public Axis getY();

	public Direction getDirection();

	public void setDirection(Direction direction);
}