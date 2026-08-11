
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
       
        // Scanner sc = new Scanner(System.in);
        // int[] arr = new int[5];
        // for(int i=0;i<arr.length;i++){
        //     arr[i]=sc.nextInt();
        // }

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }
       

        //Find sum of an array 

        // int[] arr = {10,20,30,40};
        // int sum=0;

        // for(int i=0;i<arr.length;i++){
        //     sum = sum+arr[i];
        // }
        // System.out.println(sum);

        //Find maximum element

//         int[] arr = {10,50,20,80,30};
//         int max = arr[0];

//         for(int i=1;i<arr.length;i++){
//             if(arr[i]>max){
//                 max = arr[i];
//             }
//         }
//         System.out.println("maximum element is : "+max);
        
//     }
// }

     
      //Find minimum element

//       int[] arr = {10,50,20,80,30};
//         int min = arr[0];

//         for(int i=1;i<arr.length;i++){
//             if(arr[i]<min){
//                 min = arr[i];
//             }
//         }
//         System.out.println("minimum element is : "+min);
        


      //Search an element

//       int[] arr = {10,20,30,40,50};
//       int  target = 80;

//       boolean found = false;

//       for(int i=0;i<arr.length;i++){
//         if(arr[i]==target){
//             found = true;
//             break;
//         }
//       }
//   if(found){
//     System.out.println("Element is found");
//   }
//   else{
//     System.out.println("Element not found");
//   }


     //Find index of an element
    //  int[] arr = {10,20,30,40,50};
    //  int target = 40;

    //  for(int i=0;i<arr.length;i++){
    //     if(arr[i]==target){
    //         System.out.println("The index of the element is : "+i);
    //     }
        
    //  }
    

    //Reverse an array

    // int[] arr={10,20,30,40,50};
    // System.out.println("Reverse of the array is : ");
    // for(int i = arr.length-1; i>=0;i--){
    //     System.out.print(arr[i] + " ");
    // }
     

    //count how many times a given element occurs

//     int[] arr = {10,20,10,30,10,40};
//     int target=10;
//     int count = 0;
//     for(int i=0;i<arr.length;i++){
//         if(arr[i]==target){
//             count++;
//         }
//     }
//    System.out.println(count);

     //Find the second largest element

      int[] arr = {10,50,20,80,30};
      int largest = Integer.MIN_VALUE;
      int secondLargest = Integer.MIN_VALUE;

      for(int i=0;i<arr.length;i++){
        if(arr[i]>largest){
            secondLargest=largest;
            largest=arr[i];
            
        }
        else if(arr[i]>secondLargest && arr[i]!=largest){
            secondLargest=arr[i];
        }
      }
    System.out.println("Second Largest Element is : "+secondLargest);
   }
}

    
   