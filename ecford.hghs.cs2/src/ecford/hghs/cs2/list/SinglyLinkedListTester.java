package ecford.hghs.cs2.list;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SinglyLinkedListTester {

	@Test
	public void givenStringFooAndBar_WhenAddEnd_ThenGetHead_ReturnFoo() {
		SinglyLinkedList local = new SinglyLinkedList();
		local.addEnd("Foo");
		local.addEnd("Bar");
		Object input = local.getValueHead();
		assertTrue(input.equals("Foo"));

	}

	@Test
	public void givenStringFooAndBar_WhenAddFirst_ThenGetHead_ReturnBar() {
		SinglyLinkedList local = new SinglyLinkedList();
		local.addFirst("Foo");
		local.addFirst("Bar");
		Object input = local.getValueHead();
		assertTrue(input.equals("Bar"));

	}

	@Test
	public void givenStringFoo_WhenAddFirst_ThenGetHead_ReturnFoo() {
		SinglyLinkedList local = new SinglyLinkedList();
		local.addFirst("Foo");
		Object input = local.getValueHead();
		assertTrue(input.equals("Foo"));

	}

	@Test
	public void givenStringFooAndBar_WhenAddEnd_ThenRemoveFirst_ReturnFoo() {
		SinglyLinkedList local = new SinglyLinkedList();
		local.addEnd("Foo");
		local.addEnd("Bar");
		Object input = local.removeFirst();
		assertTrue(input.equals("Foo"));

	}

	@Test
	public void givenStringFooAndBar_WhenAddFirst_ThenRemoveFirst_ReturnBar() {
		SinglyLinkedList local = new SinglyLinkedList();
		local.addFirst("Foo");
		local.addFirst("Bar");
		Object input = local.removeFirst();
		assertTrue(input.equals("Bar"));

	}

	@Test
	public void givenStringFoo_WhenAddFirst_ThenRemoveFirst_ReturnFoo() {
		SinglyLinkedList local = new SinglyLinkedList();
		local.addFirst("Foo");
		Object input = local.removeFirst();
		assertTrue(input.equals("Foo"));

	}

	@Test
	public void givenStringFooAndBar_WhenAddEnd_ThenRemoveEnd_ReturnBar() {
		SinglyLinkedList local = new SinglyLinkedList();
		local.addEnd("Foo");
		local.addEnd("Bar");
		Object input = local.removeEnd();
		assertTrue(input.equals("Bar"));

	}

	@Test
	public void givenStringFooAndBar_WhenAddFirst_ThenRemoveEnd_ReturnFoo() {
		SinglyLinkedList local = new SinglyLinkedList();
		local.addFirst("Foo");
		local.addFirst("Bar");
		Object input = local.removeEnd();
		assertTrue(input.equals("Foo"));

	}

	@Test
	public void givenStringFoo_WhenAddFirst_ThenRemoveEnd_ReturnFoo() {
		SinglyLinkedList local = new SinglyLinkedList();
		local.addFirst("Foo");
		Object input = local.removeEnd();
		assertTrue(input.equals("Foo"));

	}
}
