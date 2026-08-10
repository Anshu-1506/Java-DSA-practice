//  Inverted Full pyramid
//     * * * * * *
//      * * * * *
//       * * * *
//        * * *
//         * * 
//          * 

import java.util.Scanner;
public class InvertedFullPyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i,n,b,j;
        System.out.print("Enter number of rows = ");
        n = sc.nextInt();

        for(i=1;i<=n;i++)
        {
            for(b=1;b<i;b++)
            System.out.print(" ");
            for(j=1;j<n;j++)
            System.out.print(" * ");
            System.out.println();
        }
    }
}
