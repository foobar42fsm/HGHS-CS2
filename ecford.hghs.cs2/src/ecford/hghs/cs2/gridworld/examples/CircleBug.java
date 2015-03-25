package ecford.hghs.cs2.gridworld.examples;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;

import java.awt.Color;

public class CircleBug extends Bug {
	int size;
	int length;
	int counter;

	public CircleBug(int size) {
		this.size = size;
		length = 0;
		counter = 0;
		setColor(Color.ORANGE);
	}

	public void act() {

		if (size == 1) {
			if (counter < 1) {
				turn();
				counter++;
			}
			turn();
			turn();
			move();
		} else {
			if (length < size - 1) {
				move();
				length++;
			} else {
				turn();
				length = 0;
			}
		}
	}

	private void findNextlocation() {

	}
}
