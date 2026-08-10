//1) Write a Program to Make a Simple Calculator to Add, Subtract,Multiply or Divide Using Switch case 
//The program should takes an arithmetic operator (+, -, *, /) and
 //two operands from a user and performs the operation on those
 //two operands depending upon the operator entered by the user.

 import java.util.Scanner;
 
 public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        double num1 = sc.nextDouble();
        System.out.print("Enter the operator : ");
        char operator = sc.next().charAt(0);
        System.out.print("Enter the second number : ");
        double num2 = sc.nextDouble();
        double result = 0;
        boolean validOperation = true;
        switch(operator){
        case '+':
            result = num1+num2;
            break;
        case '-':
            result = num1-num2;
            break;
        case '*':
            result = num1*num2;
            break;
        case '/':
        {
            if(num2!=0)
            result = num1/num2;
            else
            System.out.println("division is not possible");
            validOperation = false;
        }
        break;
        default:
        System.out.println("Invalid operator");
        validOperation = false;
        }
        if(validOperation = true)
        System.out.println("Result = "+result);
    } 
 } 