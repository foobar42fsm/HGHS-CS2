package ecford.hghs.cs2.gridworld.examples;

import java.awt.Color;

import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

public class ZBugRunner {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		ZBug bob = new ZBug(20);
		world.add(new Location(5, 5), bob);
		world.show();
	}
}
