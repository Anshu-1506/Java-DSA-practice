//1. WAP to find whether a number is even or odd

import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num % 2 == 0)
            System.out.println("Even");
        else
            System.out.println("Odd");
      }
}
