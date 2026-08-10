// Solid Rectangular star 
//   * * * * *
//   * * * * *
//   * * * * *

import java.util.Scanner;
public class SolidRectangular{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        System.out.print("Enter number of rows = ");
        n = sc.nextInt();

        for(i=1;i<=n;i++)
        {
            for(j=1;j<=5;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}