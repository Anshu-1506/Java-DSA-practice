// Half pyramid using numbers
//  2
//  3 4
//  4 5 6
//  5 6 7 8
//  6 7 8 9 10

import java.util.Scanner;
public class PyramidNumbers3 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n,i,j;
      System.out.print("Enter number of rows = ");
      n = sc.nextInt();
      for(i=1;i<=n;i++)
      {
        for(j=1;j<=i;j++)
        {
            System.out.print(" "+(i+j));
        }
        System.out.println();
      }
    }
}
