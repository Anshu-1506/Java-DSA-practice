//print reverse of number

/* 
import java.util.*;
public class reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
           int lastdigit=n%10;
            System.out.print(lastdigit+"");
            n=n/10;
        }
        System.out.println();
    }
}
*/

//reverse the given number

public class reverse{
    public static void main(String[] args){
        int n = 4675;
        int rev = 0;
        while (n>0) { 
            int lastdigit=n%10;
            rev=(rev*10)+lastdigit;
            n=n/10;
        }
       System.out.println(rev);
    }
}