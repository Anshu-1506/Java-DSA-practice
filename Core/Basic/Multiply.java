// 8) Write a Program to Multiply two decimal Number entered by User

import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("first number :- ");
    float num1 = sc.nextFloat();
    System.out.print("second number :- ");
    float num2 = sc.nextFloat();
    
    float mul = num1*num2;
    System.out.println("multiplication of numbers is :- "+mul);
    }
}
