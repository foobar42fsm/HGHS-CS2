package ecford.hghs.cs2.math;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

import org.junit.BeforeClass;
import org.junit.Test;

public class PolygonAreaTester {
	private static final List<Coordinates> zeroPointPolygon = null;
	private static final List<Coordinates> onePointPolygon = Arrays
			.asList(new Coordinates[] { new Coordinates(0, 4) });
	private static final List<Coordinates> twoPointPolygon = Arrays
			.asList(ArrayUtils.addAll(
					(Coordinates[]) onePointPolygon.toArray(),
					new Coordinates[] { new Coordinates(0, 0) }));
	private static final List<Coordinates> threePointPolygon = Arrays
			.asList(ArrayUtils.addAll(
					(Coordinates[]) twoPointPolygon.toArray(),
					new Coordinates[] { new Coordinates(3, 0) }));

	private static final List<Coordinates> fourPointPolygon = Arrays
			.asList(ArrayUtils.addAll(
					(Coordinates[]) threePointPolygon.toArray(),
					new Coordinates[] { new Coordinates(3, 4) }));

	private static final List<Coordinates> fivePointPolygon = Arrays
			.asList(ArrayUtils.addAll(
					(Coordinates[]) fourPointPolygon.toArray(),
					new Coordinates[] { new Coordinates(3, 6) }));

	@BeforeClass
	public static void before() {

		assertNull(zeroPointPolygon);
		assertTrue(onePointPolygon.size() == 1);
		assertTrue(twoPointPolygon.size() == 2);
		assertTrue(threePointPolygon.size() == 3);
		assertTrue(fourPointPolygon.size() == 4);
		assertTrue(fivePointPolygon.size() == 5);

	}

	@Test
	public void given5PointPolygon_whenPolygonArea_thenReturn15() {
		assertTrue(fivePointPolygon.size() == 5);
		double result = PolygonArea.polygonArea(fivePointPolygon);
		assertTrue(result == 15);
	}

	@Test
	public void given4PointPolygon_whenPolygonArea_thenReturn12() {
		assertTrue(fourPointPolygon.size() == 4);
		double result = PolygonArea.polygonArea(fourPointPolygon);
		assertTrue(result == 12);
	}

	@Test
	public void given3PointPolygon_whenPolygonArea_thenReturn6() {
		assertTrue(threePointPolygon.size() == 3);
		double result = PolygonArea.polygonArea(threePointPolygon);
		assertTrue(result == 6);
	}

	@Test
	public void given2PointPolygon_whenPolygonArea_thenReturn0() {
		assertTrue(twoPointPolygon.size() == 2);
		double result = PolygonArea.polygonArea(twoPointPolygon);
		assertTrue(result == 0);
	}

	@Test
	public void given1PointPolygon_whenPolygonArea_thenReturn0() {
		assertTrue(onePointPolygon.size() == 1);
		double result = PolygonArea.polygonArea(onePointPolygon);
		assertTrue(result == 0);
	}

	@Test
	public void given0PointPolygon_whenPolygonArea_thenReturn0() {
		assertNull(zeroPointPolygon);
		double result = PolygonArea.polygonArea(zeroPointPolygon);
		assertTrue(result == 0);
	}
}
