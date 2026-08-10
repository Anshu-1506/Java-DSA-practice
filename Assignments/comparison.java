//15. Given the length and breadth of a rectangle, write a program to find whether the area of the rectangle is greater than its perimeter. 
//For example, the area of the rectangle with length = 5 and breadth = 4 is greater than its perimeter.

import java.util.Scanner;

public class comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth of rectangle: ");
        double breadth = sc.nextDouble();
        double area = length * breadth;
        double perimeter = 2 * (length + breadth);
        if (area > perimeter) {
            System.out.println("Area is greater than Perimeter");
        } else if (area < perimeter) {
            System.out.println("Perimeter is greater than Area");
        } else {
            System.out.println("Area and Perimeter are equal");
        }
    }
}
