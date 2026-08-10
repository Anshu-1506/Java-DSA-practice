//7. Write a Java program that reads a floating-point number and prints "zero" if the number is zero. 
//Otherwise, print "positive" or "negative".

import java.util.Scanner;
class NumberType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num;
        System.out.print("Enter number: ");
        num = sc.nextFloat();

        if(num > 0)
            System.out.println("Positive");
        else if(num < 0)
            System.out.println("Negative");
        else
            System.out.println("Zero");
    }
}
