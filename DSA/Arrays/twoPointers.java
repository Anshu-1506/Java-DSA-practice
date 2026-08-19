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

//    int[] arr = {0,1,0,3,12};
//    int left = 0;
//    int right = 1;
//    while(right<arr.length){
//     if (arr[left]==0&&arr[right]!=0) {
//         int temp = arr[left];
//         arr[left]=arr[right];
//         arr[right]=temp;  
//         left++;
        
//     }
//      {
//         right++;
    
//     }
//    }
//    for(int i=0;i<arr.length;i++)
//    System.out.print(" "+arr[i]);
    

     //Remove duplicate elements iarray from the sorted array

    // int[] arr = {1,1,2,3,3,4,5,5};
    // int i = 0;
    
    // for(int j=1;j<arr.length;j++){
    //     if(arr[i]!=arr[j]){
    //         i++;
    //         arr[i]=arr[j];
    //     }
        
    // }
    // int uniquecount = i+1;

    // for(int k=0;k<uniquecount;k++){
    //     System.out.print(arr[k]+" ");
    // }

    //Merge two sorted arrays

    // int[] arr1={1,4,7,10};
    // int[] arr2={2,3,6,8,9};

    // int i=0;
    // int j=0;
    // int[] result = new int[arr1.length+arr2.length];
    // int k=0;

    // while(i<arr1.length && j<arr2.length){
    //     if(arr1[i]<arr2[j]){
    //         result[k]=arr1[i];
    //         i++;
    //     }
    //     else{
    //         result[k]=arr2[j];
    //         j++;
    //     }
    // k++;
    // }
    // while(i<arr1.length){
    //     result[k]=arr1[i];
    //     i++;
    //     k++;
    // }
    // while(j<arr2.length){
    //     result[k]=arr2[j];
    //     j++;
    //     k++;
    // }
    // for(int m=0;m<result.length;m++){
    //     System.out.print(result[m]+" ");
    // }


    //Find triplets with given sum

    int[] arr ={1,2,3,4,5,6,8};
    int target = 13;
    for(int fixed=0;fixed<arr.length;fixed++){
        int i = fixed + 1;
        int j = arr.length - 1;
    while(i<j){
        if(arr[fixed]+arr[i]+arr[j]==target){
            System.out.print(arr[fixed]+" "+arr[i]+" "+arr[j]);
            System.out.println();
            break;
            
        }
        else if(arr[fixed]+arr[i]+arr[j]<target){
            i++;
        }
        else{
            j--;
        }
    }
    
}

}
    
   
}