package ecford.hghs.cs2.gridworld.examples;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.util.Random;

public class Bolt extends Flower {
	private int direction;
	private Location currentlocation;
	private Random randGen = new Random();

	public Bolt() {
		this(0);
	}

	public Bolt(int direction) {
		this.direction = direction;
		this.currentlocation = getLocation();
		genColor();

	}

	private void genColor() {
		int Randint = randGen.nextInt(3);
		if (Randint == 1) {
			this.setColor(Color.RED);
		} else if (Randint == 2) {
			this.setColor(Color.ORANGE);
		} else {
			this.setColor(Color.YELLOW);
		}
	}

	public void act() {
		currentlocation = getLocation();
		genColor();
		if (canmoveForward()) {
			move();
		} else {
			explode();
			removeSelfFromGrid();
		}
	}

	private void explode() {
		Grid<Actor> testGrid = getGrid();
		for (int i = 0; i < 5; i++) { // rows
			for (int q = 0; q < 5; q++) { // columns

			}
		}
		// TODO Auto-generated method stub

	}

	private void move() {
		this.moveTo(currentlocation.getAdjacentLocation(direction));
	}

	private boolean canmoveForward() { // TODO not working
		Grid<Actor> testGrid = getGrid();
		Location nextplace = currentlocation.getAdjacentLocation(direction);
		if (testGrid == null) {
			return false;
		}
		if (!testGrid.isValid(nextplace)) {
			return false;
		}
		return true;
	}

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		Bolt boom = new Bolt();
		world.add(new Location(5, 5), boom);
		world.show();
	}
}
