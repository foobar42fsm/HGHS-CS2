package ecford.hghs.cs2.math;

import java.util.ArrayList;
import java.util.List;

public class PolygonArea {
	public PolygonArea() {

	}

	@SuppressWarnings("rawtypes")
	private static boolean hasNoPolygon(List a) {
		if (a.size() < 3) {
			return true;
		}
		return false;

	}

	private static double triangleArea(double x1, double y1, double x2,
			double y2, double x3, double y3) {
		return Math.abs(x1 * y2 + x2 * y3 + x3 * y1 - y1 * x2 - y2 * x3 - y3
				* x1) / 2;

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	private static double triangleArea(List p) {
		if (hasNoPolygon(p)) {
			return 0;
		}
		List temp = new ArrayList(p);
		temp.remove(1);
		return triangleArea(((Coordinates) p.get(0)).getX(),
				((Coordinates) p.get(0)).getY(),
				((Coordinates) p.get(1)).getX(),
				((Coordinates) p.get(1)).getY(),
				((Coordinates) p.get(2)).getX(),
				((Coordinates) p.get(2)).getY())
				+ triangleArea(temp);
	}

	@SuppressWarnings("rawtypes")
	public static double polygonArea(List p) {
		if(p == null) {
			return 0;
		}
		if (hasNoPolygon(p)) {
			return 0;
		}
		return triangleArea(p);

	}

	public static void main(String[] args) {
		ArrayList<Coordinates> input = new ArrayList<Coordinates>();
		input.add(new Coordinates(4, 3));
		input.add(new Coordinates(4, 0));
		input.add(new Coordinates(0, 0));
		input.add(new Coordinates(0, 3));
		System.out.print(polygonArea(input));
	}
}
// to divide up a polygon into non-crossing triangles just take the amount of
// points and subtract 2