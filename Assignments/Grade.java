//9. Write a program to input marks of five subjects Physics, Chemistry, Biology, Mathematics and Computer. 
//Calculate percentage and grade according to following:

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks for Physics: ");
        double physics = sc.nextDouble();
        System.out.print("Enter marks for Chemistry: ");
        double chemistry = sc.nextDouble();
        System.out.print("Enter marks for Biology: ");
        double biology = sc.nextDouble();
        System.out.print("Enter marks for Mathematics: ");
        double mathematics = sc.nextDouble();
        System.out.print("Enter marks for Computer: ");
        double computer = sc.nextDouble();
        double total = physics + chemistry + biology + mathematics + computer;
        double percentage = (total / 500) * 100;
        System.out.println("Percentage: " + percentage + "%");
        if (percentage >= 90) {
            System.out.println("Grade A");
        } else if (percentage >= 80) {
            System.out.println("Grade B");
        } else if (percentage >= 70) {
            System.out.println("Grade C");
        } else if (percentage >= 60) {
            System.out.println("Grade D");
        } else if (percentage >= 40) {
            System.out.println("Grade E");
        } else {
            System.out.println("Grade F");
        }
    }
}
