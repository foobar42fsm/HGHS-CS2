package ecford.hghs.cs2.gridworld.work;

import info.gridworld.actor.Bug;

import java.awt.Color;

public class NameBug extends Bug {

	public NameBug(Color color) {
		super(color);
	}

	public void act() {
		if (canMove())
			move();
		else
			;

	}
	

}
