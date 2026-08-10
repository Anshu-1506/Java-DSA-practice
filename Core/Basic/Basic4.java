//4) Write a program where the user is asked to enter two integers (divisor and dividend) and the quotient and the 
//remainder of their division is computed.(Both divisor and dividend should be integers).

import java.util.Scanner;
public class Basic4 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter divisor :- ");
    int num1 = sc.nextInt();
    System.out.print("Enter dividend :- ");
    int num2 = sc.nextInt();
    int quo = num2/num1;
    int rem = num2%num1;
    System.out.println("quotient is :- "+quo);
    System.out.println("remainder is :- "+rem);
    }
}
