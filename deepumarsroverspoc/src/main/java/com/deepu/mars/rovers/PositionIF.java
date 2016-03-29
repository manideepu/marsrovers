package com.deepu.mars.rovers;

public interface PositionIF {

	public static final class Axis {
		int axis = 0;
		public Axis(int axis) {
			this.axis = axis;
		}

		protected void increment() {
			axis++;
		}

		protected void decrement() {
			axis--;
		}

		public int getAxis() {
			return axis;
		}
	}

	public enum Direction {

		NORTH {
			@Override
			public Direction right() {
				return EAST;
			}

			@Override
			public Direction left() {
				return WEST;
			}
		},

		EAST {
			@Override
			public Direction right() {
				return SOUTH;
			}

			@Override
			public Direction left() {
				return NORTH;
			}
		},

		SOUTH {
			@Override
			public Direction right() {
				return WEST;
			}

			@Override
			public Direction left() {
				return EAST;
			}
		},

		WEST {
			@Override
			public Direction right() {
				return NORTH;
			}

			@Override
			public Direction left() {
				return SOUTH;
			}
		};

		public abstract Direction right();

		public abstract Direction left();
	}

	public Axis getX();

	public Axis getY();

	public Direction getDirection();

}