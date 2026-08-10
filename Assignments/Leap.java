//6. Write a program to check whether a year is leap year or not


import java.util.Scanner;
class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year;
        System.out.print("Enter year: ");
        year = sc.nextInt();

        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
            System.out.println("Leap year");
        else
            System.out.println("Not leap year");
    }
}
