      //3) Write a Program to Add Two Integer Numbers Entered by User

import java.util.Scanner;
public class Basic3 {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter first number :- ");
     int num1 = sc.nextInt();
     System.out.print("Enter second number :- ");
     int num2 = sc.nextInt();
     int add = num1 + num2;
     System.out.println("Addition of numbers is :- "+add);

    }
}
