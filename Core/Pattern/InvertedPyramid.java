//  Inverted Half pyramid
//   * * * * * *
//   * * * * *
//   * * * *
//   * * *
//   * *
//   *

import java.util.Scanner;
public class InvertedPyramid {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n,j;
      System.out.print("Enter number of rows = ");
      n = sc.nextInt();
      
      for(;n>=1;n--)
      {
        for(j=1;j<=n;j++)
        {
            System.out.print(" * ");
        }
        System.out.println();
      }
    }
}
