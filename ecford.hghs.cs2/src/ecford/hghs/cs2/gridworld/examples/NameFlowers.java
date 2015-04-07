package ecford.hghs.cs2.gridworld.examples;

import info.gridworld.actor.Actor;
import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.grid.UnboundedGrid;

import java.awt.Color;
import java.io.IOException;

import ecford.hghs.cs2.reader.CreateArrayFromFile;

public class NameFlowers {
	private int[][][] letterStoring;
	private Location cursorPos;
	private ActorWorld world;
	private String fileName;
	private CreateArrayFromFile fileReader;

	public NameFlowers() throws IOException {
		this(0, 0);
	}

	public NameFlowers(int r, int c) throws IOException {
		cursorPos = new Location(r, c);
		world = new ActorWorld(new UnboundedGrid<Actor>());
		world.show();
		fileName = "letterToGrid";
		fileReader = new CreateArrayFromFile(fileName);
		String[] temp = fileReader.getArray();
		letterStoring = new int[148][8][5];
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != null) {
				if (temp[i].indexOf(":") != -1) {
					for (int q = 0; q < 8; q++) { // rows
						for (int w = 0; w < 5; w++) { // columns
							letterStoring[findArrayPos(temp[i])][q][w] = Integer
									.parseInt(temp[i + 1 + q].substring(w,
											w + 1));
						}
					}
				}
			}
		}

	}

	private int findArrayPos(String input) { // TODO make this work
		String temp = input.substring(input.indexOf("«") + 1,
				input.indexOf("»"));
		if (temp != null) {
			return Integer.parseInt(temp);
		}
		return 0;
	}

	private void placeFlower(Location loc) {
		world.add(loc, new Flower(new Color(0).BLACK));
	}

	public void write(String input) {
		String name = input.toLowerCase();
		if (name.length() > 0) {

			String firstLetter = name.substring(0, 1);
			printChar(firstLetter);
			cursorPos = new Location(cursorPos.getRow(), cursorPos.getCol() + 6);
			write(name.substring(1));
		} else {
			return;
		}
	}

	private void printChar(String firstLetter) {
		int charNum = charToIndexValue(firstLetter);
		if(charNum == 13) {
			cursorPos = new Location(cursorPos.getRow()+9, -6);
			return;
		}
		for (int i = 0; i < 8; i++) {
			for (int q = 0; q < 5; q++) {
				if (letterStoring[charNum][i][q] == 1) {
					placeFlower(new Location(cursorPos.getRow() + i,
							cursorPos.getCol() + q));
				}
			}
		}

	}

	private int charToIndexValue(String firstLetter) {
		return firstLetter.codePointAt(0);
	}

	public static void main(String[] args) throws IOException {
		NameFlowers boom = new NameFlowers();
		boom.write("abcdefghijklmnopqrstuvwxyz\r!@#$%^&*()_+`\\\"\'");
	}
}