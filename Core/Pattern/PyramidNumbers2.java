// Half pyramid using numbers
//  1
//  2 2
//  3 3 3
//  4 4 4 4
//  5 5 5 5 5

import java.util.Scanner;
public class PyramidNumbers2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int n,i,j;
       System.out.print("Enter number of rows = ");
       n = sc.nextInt();

       for(i=1;i<=n;i++)
       {
        for(j=1;j<=i;j++)
        {
            System.out.print(" "+i);
        }
        System.out.println();
       }
    }
}
