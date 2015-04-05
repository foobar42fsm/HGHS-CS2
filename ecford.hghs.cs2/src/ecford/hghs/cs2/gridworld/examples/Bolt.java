package ecford.hghs.cs2.gridworld.examples;

import info.gridworld.actor.Flower;

public class Bolt extends Flower {
	private boolean existed = false;
	private 
	public void act(){
		if(getLocation() == null && !existed) {
			
		}
		moveTo(newLocation);
	}
}
