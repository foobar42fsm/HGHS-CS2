package ecford.hghs.cs2.gridworld.work;

import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.io.IOException;

public class NameBugs extends NameFlowers {

	public NameBugs() throws IOException {
		super();
	}

	public NameBugs(int r, int c) throws IOException {
		super(r, c);
	}
	
	protected void placeObject(Location loc) {
		world.add(loc, new NameBug(new Color(0).BLACK));
	}
}
