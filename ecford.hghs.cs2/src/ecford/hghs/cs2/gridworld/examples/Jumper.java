package ecford.hghs.cs2.gridworld.examples;

import java.awt.Color;

import info.gridworld.actor.*;
import info.gridworld.grid.Location;
import info.gridworld.grid.Grid;
import info.gridworld.actor.Rock;

public class Jumper extends Actor {

	public Jumper() {
		setColor(Color.ORANGE);
	}

	/**
	 * Moves to the next location of the square.
	 */
	public void act() {
		// int nextJump = getLocation()
		if (canJump()) {
			jump();
		} else {
			turn();
		}
	}

	private void jump() {
		Location currentPlace = getLocation();
		Location jumpOver = currentPlace.getAdjacentLocation(getDirection());
		Location nextPlace = jumpOver.getAdjacentLocation(getDirection());
		moveTo(nextPlace);

	}

	private boolean canJump() { // correct this remove loop!!!!
		Location currentPlace = getLocation();
		Location jumpOver = currentPlace.getAdjacentLocation(getDirection());
		Location nextPlace = jumpOver.getAdjacentLocation(getDirection());
		Grid<Actor> testGrid = getGrid(); // store local grid to work with		
		if (testGrid == null) {
			return false;
		}
		if (!testGrid.isValid(jumpOver)) {
			return false;
		}
		if (!testGrid.isValid(nextPlace)) {
			return false;
		}
		Actor test = testGrid.get(nextPlace);
		if(test != null) {
			return false;
		}
		return true;

	}

	private void turn() {
		setDirection(getDirection() + 45);
	}

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		Jumper dan = new Jumper();
		Rock rocky = new Rock();
		world.add(new Location(0, 0), dan);
		world.add(rocky);
		world.show();
	}
}
