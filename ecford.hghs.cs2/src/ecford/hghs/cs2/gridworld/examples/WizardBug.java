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
		this.setColor(Color.GRAY);
		this.name = name;
	}
	
	public void getname() throws IOException {
		NameFlowers nameMaker = new NameFlowers();
		nameMaker.write(name);
	}

	public void act() {
		moveTo(apparate(getGrid()));
	}

	private Location apparate(Grid<Actor> grid) {
		
		return new Location(randGen.nextInt(grid.getNumRows()),
				randGen.nextInt(grid.getNumCols()));
	}
	
	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		WizardBug harry = new WizardBug("Harry");
		world.add(harry);
		world.show();
		
	}

}
