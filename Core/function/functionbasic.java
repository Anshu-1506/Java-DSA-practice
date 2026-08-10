import java.util.*;
public class functionbasic{

    public static void printHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
    }

    public static int calculateSum(int num1, int num2){//parameters or formal parameter
       int sum = num1+num2;
       return sum;
    }
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
      int sum = calculateSum(a, b); //arguments or actual parameters  //function call
      System.out.println("sum is: "+ sum);
    }
}




