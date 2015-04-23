package ecford.hghs.cs2.projects;

import java.io.IOException;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import ecford.hghs.cs2.gridworld.work.NameFlowers;

public class Scroller extends Actor {
	String text;
	NameFlowers face;
	int r = 0;
	private boolean firstRun;

	public Scroller() throws IOException {
		face = new NameFlowers();
		firstRun = true;
	}

	public void act() {
		if (!firstRun) {
			face.clean(face.getCursorPos().getRow(), face.getCursorPos()
					.getRow() + 7, face.getCursorPos().getCol(), face
					.getCursorPos().getCol() + 4);
		}
		firstRun = false;
		face.write("t");
	}

	public static void main(String[] args) throws IOException {
		ActorWorld world = new ActorWorld();
		Scroller joe = new Scroller();
		world.add(joe);
		world.show();
	}
}
