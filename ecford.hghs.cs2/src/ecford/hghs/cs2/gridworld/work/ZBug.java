package ecford.hghs.cs2.gridworld.work;

import info.gridworld.actor.Bug;

public class ZBug extends Bug {
	int steps;
	int sideLength;
	boolean end;
	int counter;

	public ZBug(int length) {
		steps = 0;
		sideLength = length;
		end = false;
		while (getDirection() != 90) {
			turn();
		}
	}

	public void act() {
		if (counter <= 2) {
			if (steps < sideLength && canMove()) {
				moveBug();
			} else {
				counter++;
				if (getDirection() != 225) {
					turnBug(225);
					if (getDirection() == 225) {
						steps = 0;
					}
				} else {
					turnBug(90);
					if (getDirection() == 90) {
						steps = 0;
					}				}
			}

		}

	}

	private void turnBug(int angle) {
		while (getDirection() != angle) {
			turn();
		}

	}

	public void moveBug() {
		move();
		steps++;
	}
}
