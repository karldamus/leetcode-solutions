package NumberOfPointsInsideCircle;

public class Solution {

	public static int[] countPoints(int[][] points, int[][] queries) {
        int[] returnArray = new int[queries.length];
		int index = -1;

		for (int[] query : queries) {
			int numberOfPointsInsideCircle = 0;
			for (int point[] : points) {
				if (inRadius(point, query)) {
					numberOfPointsInsideCircle += 1;
				}
			}
			returnArray[index += 1] = numberOfPointsInsideCircle;
		}

		return returnArray; 
    }

	public static boolean inRadius(int[] point, int[] circle) {
		// if distance from point to center of circle is less or equal to the radius. OK
		if (getDistance(point[0], point[1], circle[0], circle[1]) <= circle[2]) 
			return true;

		return false; // point is outside circle
	}

	public static double getDistance(int x1, int y1, int x2, int y2) {
		// pythagorean theorem
		return Math.sqrt( Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) );
	}

	public static void main(String[] args) {
		int[][] queries = new int[][] { {2,3,1}, {4,3,1}, {1,1,2} };
		int[][] points = new int[][] { {1,3}, {3,3}, {5,3}, {2,2} };

		int[] returnArray = countPoints(points, queries);
		for (int val : returnArray) {
			System.out.println(val);
		}
	}

}
