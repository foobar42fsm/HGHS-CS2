package ecford.hghs.cs2.gridworld.work;

import java.util.ArrayList;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Critter;
import info.gridworld.grid.Location;

public class BlusterCritter extends Critter {
	private int courage;

	public BlusterCritter(int courage) {
		this.courage = courage;
	}

	@Override
	public ArrayList<Actor> getActors() {
		ArrayList<Actor> retX = new ArrayList<Actor>();
		for (int r = getLocation().getRow() - 2; r < getLocation().getRow() + 2; r++) {
			for (int c = getLocation().getCol() - 2; c < getLocation().getCol() + 2; c++) { // lol
																							// c++
				Location curLoc = new Location(r, c);
				if (getGrid().isValid(curLoc)) {
					if (getGrid().get(curLoc) != null
							&& !curLoc.equals(getLocation())
							&& getGrid().get(curLoc) instanceof Critter) {
						retX.add(getGrid().get(curLoc));
					}
				}
			}
		}
		return retX;
	}

	@Override
	public void processActors(ArrayList<Actor> arg0) {
		if (arg0.size() < courage) {
			setColor(getColor().brighter());
		} else {
			setColor(getColor().darker());
		}
	}

	public static void main(String[] args) {
		ActorWorld world = new ActorWorld();
		Critter bob = new Critter();
		BlusterCritter john = new BlusterCritter(1);
		world.add(new Location(5, 5), bob);
		world.add(new Location(5, 6), john);
		world.show();
	}
}
