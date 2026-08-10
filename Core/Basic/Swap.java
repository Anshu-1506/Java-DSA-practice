// 6) Write a Program to Swap Two Numbers

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter first number :- ");
    double num1 = sc.nextDouble();
    System.out.print("Enter second number :- ");
    Double num2 = sc.nextDouble();

    Double temp = num1;
    num1 = num2;
    num2 = temp;
    System.out.println("After swapping");
    System.out.println("first number is :- "+num1);
    System.out.println("second number is :- "+num2);
  }
}
