//Identify the triangle

/*Problem statement
Given three positive integers as X, Y and Z representing three sides of a triangle, write a program that determines whether the triangle formed by the sides exist or not. If the triangle exists, classify it as isosceles, scalene or equilateral.

Condition for valid Triangle:
Sum of any two of its sides should be greater than the third side */

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        if (isValidTriangle(x, y, z)) {
            if (x == y && y == z) {
                System.out.println("Equilateral Triangle");
            } else if (x == y || y == z || z == x) {
                System.out.println("Isosceles Triangle");
            } else {
                System.out.println("Scalene Triangle");
            }
        } else {
            System.out.println("Not a Triangle");
        }
    }

    public static boolean isValidTriangle(int x, int y, int z) {
        return (x + y > z) && (y + z > x) && (z + x > y);
    }
    
}
