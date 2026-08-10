
   import java.util.Scanner;
    public class ArrayBasics{
    public static void main(String[] args){

        // int[] arr = new int[5];
        // arr = new int[]{10,20,30,40,50};
        // System.out.println(arr[3]);

        // int[] arr = {12,25,7,40,15};
        // for(int i = 0; i<arr.length ; i++){
        //     System.out.println(arr[i]);
        // }
       
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
        
    }
}