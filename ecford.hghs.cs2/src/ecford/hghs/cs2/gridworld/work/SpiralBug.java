package ecford.hghs.cs2.gridworld.work;

import info.gridworld.actor.Bug;

public class SpiralBug extends Bug {
	private int steps;
	private int sideLength;

	public SpiralBug(int length) {// starting length
		steps = 0;
		sideLength = length;
	}

	public void act() {
		if (steps < sideLength && canMove()) {
			move();
			steps++;
		} else {
			turn();
			turn();
			sideLength++;
			steps = 0;
		}
	}
}
