public class twoPointers {
    public static void main(String[] args){

        //Reverse an array:-

        // int[] arr = {1,2,3,4,5};
        // int left = 0;
        // int right = arr.length-1;
        // while(left<right){
        //     int temp = arr[left];
        //     arr[left] = arr[right];
        //     arr[right] = temp;

        //     left++;
        //     right--;

        // }

        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i] + " ");
        // }

        // check whether an array is palindrome

    //     int[] arr = {4,5,6,8};
    //     int left =0;
    //     int right = arr.length-1;
    //     boolean Palindrome = true;
    //     while(left<=right){
    //         if(arr[left]==arr[right]){
    //             left++;
    //             right--;
    //             }
    //             else{
    //                 Palindrome=false;
    //                 break;
    //             }
    //     }
    //   if(Palindrome){
    //       System.out.println("Array is palindrome");
    //   } 
    //   else{
    //      System.out.println("Array is not palindrome");
    //   }
       
    // pair with given sum 
     
//     int[] arr = {1,2,4,6,8,9};
//     int target = 12;
//     int left = 0;
//     int right= arr.length-1;
    
// while(left<right){
//     int sum=arr[left]+arr[right];
//     if(sum==target){
//         System.out.println(arr[left]+" "+arr[right]);
//         break;
//     }
//     else if(sum<target){
//         left++;
//     }
//     else{
//         right--;
//     }

//     }

   // Move all zeroes to end

   int[] arr = {0,1,0,3,12};
   int left = 0;
   int right = 1;
   while(right<arr.length){
    if (arr[left]==0&&arr[right]!=0) {
        int temp = arr[left];
        arr[left]=arr[right];
        arr[right]=temp;  
        left++;
        
    }
     {
        right++;
    
    }
   }
   for(int i=0;i<arr.length;i++)
   System.out.print(" "+arr[i]);
    }
    

}