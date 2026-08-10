//break
/*
public class bc {
    public static void main(String[] args){
        for(int i=1;i<5;i++){
            if(i==3){
                break;
            }
            System.out.println(i);
            
        }
        System.out.print("i am out of the loop");
    }
    
}
*/

//keep entering number till users enters multiple of 10

/*
import java.util.*;
public class bc{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
        System.out.print("Enter your number:");
        int n=sc.nextInt();
        
            if(n%10==0){
                break;
            }
            System.out.println(n);
        }while(true);
    }
}
*/

//continue

/*
public class bc{
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            if(i==4){
                continue;
            }
            System.out.println(i);
        }
    }
}
*/

//display all numbers entered by user except multiples of 10

import java.util.*;
public class bc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do { 
        System.out.print("Enter your number:");
            int n=sc.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        } while (true);
    }
}