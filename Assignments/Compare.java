//5. Write a program that accepts three numbers and prints "All numbers are equal" if all three numbers are equal,
// "All numbers are different" if all three numbers are different and "Neither all are equal or different" otherwise.

import java.util.Scanner;
class Compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter 3 numbers:");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a == b && b == c)
            System.out.println("All numbers are equal");
        else if(a != b && b != c && a != c)
            System.out.println("All numbers are different");
        else
            System.out.println("Neither all equal nor all different");
    }
}
