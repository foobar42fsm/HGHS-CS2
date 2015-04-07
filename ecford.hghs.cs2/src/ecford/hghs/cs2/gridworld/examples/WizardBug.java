package ecford.hghs.cs2.gridworld.examples;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.awt.Color;
import java.io.IOException;
import java.util.Random;

public class WizardBug extends Bug {
	private Random randGen = new Random();
	private String name;

	public WizardBug(String name) {
		if (randGen.nextInt(2) == 1) {
			this.setColor(Color.GRAY);
		} else {
			this.setColor(Color.BLACK);
		}
		this.name = name;
	}

	public void getname() throws IOException {
		NameFlowers nameMaker = new NameFlowers();
		nameMaker.write(name);
	}

	public void act() {
		if (randGen.nextInt(10) > 1) {
			moveTo(apparate(getGrid()));
		} else {
			fireBolt();
		}
	}

	private void fireBolt() {
		int randDirection = 360 / (randGen.nextInt(7)+1);
		while (!getGrid().isValid(
				getLocation().getAdjacentLocation(randDirection))) {
			randDirection = 360 / (randGen.nextInt(7)+1);
		}
		if (getGrid().isValid(
				getLocation().getAdjacentLocation(randDirection))) {
			Bolt bolt = new Bolt();
			bolt.putSelfInGrid(getGrid(), getLocation()
					.getAdjacentLocation(getDirection() + 45));
		}		
	}

	private Location apparate(Grid<Actor> grid) {
		Location retX = new Location(randGen.nextInt(grid.getNumRows()),
				randGen.nextInt(grid.getNumCols()));
		Grid<Actor> temp = getGrid();
		while (temp.getOccupiedLocations().contains(retX)) {
			retX = new Location(randGen.nextInt(grid.getNumRows()),
					randGen.nextInt(grid.getNumCols()));
		}
		return retX;
	}

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		WizardBug harry = new WizardBug("Harry Potter \r~~~~");
		world.add(harry);
		world.show();

	}

}
