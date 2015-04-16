package ecford.hghs.cs2.math;

import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;

public class BinaryArithmeticTester {
	private static BinaryArithmetic base;

	@BeforeClass
	public static void before() {
		base = new BinaryArithmetic();
	}
	
	@Test
	public void given0and0_whenMultiplyByAdding_ThenReturn0() {
		int output = base.multiplyByAdding(0, 0);
		assertTrue(output == 0);
	}
	
	@Test
	public void given1and0_whenMultiplyByAdding_ThenReturn0() {
		int output = base.multiplyByAdding(1, 0);
		assertTrue(output == 0);
	}
	
	@Test
	public void given1and1_whenMultiplyByAdding_ThenReturn1() {
		int output = base.multiplyByAdding(1, 1);
		assertTrue(output == 1);
	}
	
	@Test
	public void given11and10_whenMultiplyByAdding_ThenReturn110() {
		int output = base.multiplyByAdding(11, 10);
		assertTrue(output == 110);
	}

	@Test
	public void given1001and1010_whenMultiplyByAdding_ThenReturn1011010() {
		int output = base.multiplyByAdding(1001, 1010);
		assertTrue(output == 1011010);
	}

	@Test
	public void given0and0_whenAddBinaryNumbers_ThenReturn0() {
		int output = base.addBinaryNumbers(0, 0);
		assertTrue(output == 0);
	}

	@Test
	public void given1and0_whenAddBinaryNumbers_ThenReturn1() {
		int output = base.addBinaryNumbers(1, 0);
		assertTrue(output == 1);
	}

	@Test
	public void given1and1_whenAddBinaryNumbers_ThenReturn10() {
		int output = base.addBinaryNumbers(1, 1);
		assertTrue(output == 10);
	}

	@Test
	public void given11and10_whenAddBinaryNumbers_ThenReturn101() {
		int output = base.addBinaryNumbers(11, 10);
		assertTrue(output == 101);
	}

	@Test
	public void given1001and1010_whenAddBinaryNumbers_ThenReturn10011() {
		int output = base.addBinaryNumbers(1001, 1010);
		assertTrue(output == 10011);
	}

	@Test
	public void given0_whenDecrement_ThenReturn0() { // just because i feel nice
														// not to throw an error
		int output = base.decrement(0);
		assertTrue(output == 0);
	}

	@Test
	public void given1_whenDecrement_ThenReturn0() {
		int output = base.decrement(1);
		assertTrue(output == 0);
	}

	@Test
	public void given11_whenDecrement_ThenReturn10() {
		int output = base.decrement(11);
		assertTrue(output == 10);
	}

	@Test
	public void given100_whenDecrement_ThenReturn11() {
		int output = base.decrement(100);
		assertTrue(output == 11);
	}

	@Test
	public void given1001_whenDecrement_ThenReturn1000() {
		int output = base.decrement(1001);
		assertTrue(output == 1000);
	}

	@Test
	public void given0_whenIncrement_ThenReturn1() {
		int output = base.increment(0);
		assertTrue(output == 1);
	}

	@Test
	public void given1_whenIncrement_ThenReturn10() {
		int output = base.increment(1);
		assertTrue(output == 10);
	}

	@Test
	public void given11_whenIncrement_ThenReturn100() {
		int output = base.increment(11);
		assertTrue(output == 100);
	}

	@Test
	public void given100_whenIncrement_ThenReturn101() {
		int output = base.increment(100);
		assertTrue(output == 101);
	}

	@Test
	public void given1001_whenIncrement_ThenReturn1010() {
		int output = base.increment(1001);
		assertTrue(output == 1010);
	}

}
