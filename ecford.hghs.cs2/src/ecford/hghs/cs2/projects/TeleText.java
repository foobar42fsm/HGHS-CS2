package ecford.hghs.cs2.projects;

import ecford.hghs.cs2.list.CircularLinkedList;
import ecford.hghs.cs2.list.DoubleListNode;

import java.util.Scanner;

public class TeleText {
	CircularLinkedList reader;
	boolean exit;
	Scanner readIn = new Scanner(System.in);

	public TeleText() {
		exit = false;
		reader = new CircularLinkedList("Today's headlines:");
		while (!exit) {
			System.out.println();
			System.out
					.println("To exit, enter \"e\" \rTo add a new headline, enter \"n\" \rTo remove a headline, enter \"d\" \rTo print headlines, enter \"p\"");
			divider();
			String input = readIn.next();
			readIn.nextLine();
			switch (input.toLowerCase()) {
			case "e":
				exit = true;
				break;
			case "n":
				add();
				divider();
				break;
			case "d":
				remove();
				divider();
				break;
			case "p":
				printAll();
				break;
			default:
				System.out.println("input not understood");
				divider();
				break;
			}
		}

	}

	private void printAll() {
		DoubleListNode temp = reader.getHeader();
		for (int i = 0; i < reader.getNodeCount(); i++) {
			System.out.println(temp.getValue());
			temp = (DoubleListNode) temp.getNext();
		}
		divider();

	}

	private void remove() {
		System.out.println("enter headline you wish to remove");
		String input = readIn.nextLine();
		DoubleListNode temp = reader.getHeader();
		for (int i = 0; i < reader.getNodeCount(); i++) {
			if (temp.getValue().equals(input)) {
				reader.remove(new DoubleListNode(input, temp.getNext()
						.getNext(), temp));
				return;
			}
			temp = (DoubleListNode) temp.getNext();
		}
		System.out.println("Headline not found");
	}

	private void add() {
		System.out.println("enter new headline:");
		String nH = readIn.nextLine();
		reader.addLast(nH);
	}

	private void divider() {
		System.out.println("----------");
	}

	public static void main(String[] args) {
		TeleText test = new TeleText();
	}
}
