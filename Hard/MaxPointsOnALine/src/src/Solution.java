/**
 * You are given an array of points, points[i] = [xi, yi]
 *      return the maximum number of points that lie on the same straight line
 */
public class Solution {
    public static int maxPoints(int[][] points) {
        int maxPoints = 0;

        for (int i = 0; i < points.length - 1; i += 1) {
            int tmp = 0;

            for (int j = 0; j < points.length - 1; j += 1) {
                if ((i != j) && ( slope(points[i], points[i+1]) == slope(points[j], points[j+1]) )) {
                    System.out.println("yes");
                    tmp += 1;
                }
            }

            if (tmp > maxPoints) {
                maxPoints += tmp;
            }
        }

        return maxPoints;
    }
    /**
     * Slope of two points
     * @param point1
     * @param point2
     * @return the slope
     */
    public static int slope(int[] point1, int[] point2) {
        int x1 = point1[0];
        int y1 = point1[1];
        int x2 = point2[0];
        int y2 = point2[1];

        // slope formula
        return ( (y2 - y1) / (x2 - x1) );
    }

    public static void main(String[] args) {
        int[][] points = new int[][] {{1,1},{2,2},{3,3}};
        System.out.println(maxPoints(points));
    }
}
