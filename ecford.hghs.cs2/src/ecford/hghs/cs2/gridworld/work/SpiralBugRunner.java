package ecford.hghs.cs2.gridworld.work;


import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class SpiralBugRunner {
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		SpiralBug bob = new SpiralBug(1);
		world.add(new Location(5, 5), bob);
		world.show();
	}
}