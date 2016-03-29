package com.deepu.mars.rovers;

/**
 * 
 * Co-ordinates
 * 
 */
public class Axis {

	private int axis;

	public Axis(int axis) {
		this.axis = axis;
	}

	public void increment() {
		axis++;
	}

	public void decrement() {
		axis--;
	}

	public int getAxis() {
		return axis;
	}
}