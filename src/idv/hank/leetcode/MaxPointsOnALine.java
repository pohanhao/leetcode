package idv.hank.leetcode;

/**
 * 
 * @author hank_hao
 * @URL https://leetcode.com/problems/max-points-on-a-line/
 * 
 */
public class MaxPointsOnALine {

	// Test case :
	// [[84,250],[0,0],[1,0],[0,-70],[0,-70],[1,-1],[21,10],[42,90],[-42,-230]]
	// [[0,0],[0,1],[0,0]]
	// [[0,0],[0,0],[0,0]]

	public int maxPoints(Point[] points) {
		int length = points.length;
		if (length < 3) {
			return length;
		}

		int max = 0;
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				int count = 2;
				if (i != j) {
					if (isSameNode(points[i], points[j])) {
						for (int k = 0; k < length; k++) {
							if (i != k && j != k) {
								if (isSameNode(points[i], points[k])) {
									count++;
								}
							}
						}
					} else {
						for (int k = 0; k < length; k++) {
							if (i != k && j != k) {
								if (isSameLine(points[i], points[j], points[k])) {
									count++;
								}
							}
						}
					}
					if (count > max) {
						max = count;
					}
				}
			}
		}
		return max;
	}

	private boolean isSameNode(Point a, Point b) {
		return (a.x == b.x) && (a.y == b.y);
	}

	private boolean isSameLine(Point a, Point b, Point c) {
		return ((a.x - c.x) * (a.y - b.y)) == ((a.x - b.x) * (a.y - c.y));
	}

	class Point {
		int x;
		int y;

		Point() {
			x = 0;
			y = 0;
		}

		Point(int a, int b) {
			x = a;
			y = b;
		}
	}

}
