// Full Pyramid Star Pattern
//       *
//      * *
//     * * *
//    * * * *
//   * * * * *
//  * * * * * *

import java.util.Scanner;
public class FullPyramid {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int n,i,j,b;
     System.out.print("Enter number of rows = " );
     n = sc.nextInt();
     
     for(i=1;i<=n;i++)
     {
        for(b=1;b<=n-i;b++)
        System.out.print(" ");
        for(j=1;j<i+1;j++)
        System.out.print(" * ");
        System.out.println();
     }
    }
}
