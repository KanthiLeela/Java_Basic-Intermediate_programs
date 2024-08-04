/*Problem statement
You are given a rectangle in a plane whose sides are parallel to the axes. The coordinates of one of its diagonals are provided to you. You have to print the total area of the rectangle.

The coordinates of the rectangle are provided as four integral values: x1, y1, x2, y2. It is given that x1 < x2 and y1 < y2.


Detailed explanation ( Input/output format, Notes, Images )
Constraints:
1 <= x1 <= 10
1 <= y1 <= 10
1 <= x2 <= 10
1 <= y2 <= 10 
Time Limit: 1 second
Output format:
The first and only line of output contains the result.   */

import java.util.Scanner;

public class Rectangular_Area {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
		int len = x2 - x1;
        int wid = y2 - y1;
        int Area = len * wid;
		System.out.println(Area);

	}

    
}
