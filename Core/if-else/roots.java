// 4) Write a Program which accepts coefficients of a quadratic equation from the user and displays the roots (both real and complex roots depending upon the discriminant).


import java.util.Scanner;
public class roots {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the value of a :- ");
    int a = sc.nextInt();
    System.out.print("Enter the value of b :- ");
    int b = sc.nextInt();
    System.out.print("Enter the value of c :- ");
    int c = sc.nextInt();
    
    int d = (b*b)-(4*a*c);
    System.out.println("The value of discriminant is = "+d);
    if(d>0)
    System.out.println("Equation have two distinct real roots.");
    else if(d==0)
    System.out.println("Equation have one real root.");
    else
    System.out.println("Equation have two conjugate complex roots.");

    }
}
