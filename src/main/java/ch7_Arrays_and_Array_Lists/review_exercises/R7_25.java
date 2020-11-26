package ch7_Arrays_and_Array_Lists.review_exercises;

/**
 * Difficulty: Medium
 * 
 * Prompt:
 * You are given two arrays denoting x- and y-coordinates of a set of points in a plane. For plotting the point set, we need to
 * know the x- and y-coordinates of the smallest rectangle containing the points. How can you obtain these values from the
 * fundamental algorithm in Section 7.3?
 *
 * TIME:
 * Time Complexity: O(N)
 * Space Complexity: O(N) if considering the arrays, otherwise O(1)
 */
public class R7_25 {
	/**
	 * We can obtain these values by using the following algorithm:
	 *	- Finding min and max of each array
	 *	- Maybe element separator
	 */
	public static void main(String[] args) {

		int[] xCoor = {1, 3, -1, 4, 3};
		int[] yCoor = {1, -3, -1, 4, 3};

		int xSmallest = Integer.MAX_VALUE, xLargest = Integer.MIN_VALUE;
		int ySmallest = Integer.MAX_VALUE, yLargest = Integer.MIN_VALUE;

		for(int idx = 0; idx < xCoor.length; idx++) {
			if(xSmallest > xCoor[idx]) {
				xSmallest = xCoor[idx];
			}
			else if(xLargest < xCoor[idx]) {
				xLargest = xCoor[idx];
			}
		}

		for(int idx = 0; idx < yCoor.length; idx++) {
			
			if(ySmallest > yCoor[idx]) {
				ySmallest = yCoor[idx];
			}
			else if(yLargest < yCoor[idx]) {
				yLargest = yCoor[idx];
			}
		}

		System.out.print("(" + xSmallest + ", " + yLargest + ")");
		System.out.println("(" + xLargest + ", " + yLargest + ")");
		System.out.print("(" + xSmallest + ", " + ySmallest + ")");
		System.out.println("(" + xLargest + ", " + ySmallest + ")");
	}
}