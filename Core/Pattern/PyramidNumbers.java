// Half pyramid using numbers
//  1
//  1 2
//  1 2 3
//  1 2 3 4
//  1 2 3 4 5

import java.util.Scanner;
public class PyramidNumbers {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n,i,j;
    System.out.print("Enter the number of rows = ");
    n = sc.nextInt();
    
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
        {
        System.out.print(i);
        }
    System.out.println();
    }
    }
}
