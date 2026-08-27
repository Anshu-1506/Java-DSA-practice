public class searching {
    public static void main(String[] args) {
        

      // Linear Search

    //     // int[] arr = {12,45,7,23,89,34};
    //     // int target = 23;
    //     // int index = -1; // if element not present in array

    //     // for(int i =0;i<arr.length;i++){
    //     //     if(arr[i]==target){
    //     //         index = i;
    //     //         break;
    //     //     }
    //     // }
    //     // System.out.println("Element found at index : "+index);
       

    // //     int[] arr = {5,12,8,20,3};
    // //     int target = 15;
    // //     int index = -1; // if element not present in array

    // //     for(int i =0;i<arr.length;i++){
    // //         if(arr[i]==target){
    // //             index = i;
    // //             break;
    // //         }
    // //     }
    // //     if(index == -1){
    // //     System.out.println("Element not found");
    // // }
    // // else{
    // //     System.out.println("Element found at index : "+index);
    // // }
   
    // int[] arr = {4,8,2,8,10};
    // int target = 8;
    // int index = -1;

    // for(int i=0;i<arr.length;i++){
    //     if(arr[i]==target){
    //         index=i;
    //         break;
    //     }
    // }
    // System.out.println(index);

    //count occurrences

    // int[] arr = {2,5,2,8,2,9};
    // int target = 2;
    // int index = -1;
    // int count = 0;

    // for(int i=0;i<arr.length;i++){
    //     if(arr[i]==target){
    //         count++;
    //     }
    // }
    // System.out.println(count);


    //Binary Search

//     int[]arr = {3,7,11,15,19,23,27};
//     int target = 19;

//     int left = 0;
//     int right = arr.length-1;
//     int index = -1;

//     while(left<=right){
//         int mid = (left+right)/2;
//         if(arr[mid]==target){
//             index = mid;
//             break;
//         }
//         else if(target>arr[mid]){
//             left = mid+1;
//         }
//         else{
//             right = mid-1;
//         }
//     }
//     if(index == -1){
//     System.out.println("Element not found");
//     }
// else{
//     System.out.println("Element found at index : " + index);
// }

    //  int[]arr = {2,5,8,12,16,20,25};
    // int target = 13;

    // int left = 0;
    // int right = arr.length-1;
    // int index = -1;

    // while(left<=right){
    //     int mid = (left+right)/2;
    //     if(arr[mid]==target){
    //         index = mid;
    //         break;
    //     }
    //     else if(target>arr[mid]){
    //         left = mid+1;
    //     }
    //     else{
    //         right = mid-1;
    //     }
    // }
    // if(index == -1){
    // System.out.println("Element not found");
    // }
    // else{
    // System.out.println("Element found at index : " + index);
    //     }

    int[]arr = {1,4,7,10,13,16,19};
    int target = 1;

    int left = 0;
    int right = arr.length-1;
    int index = -1;

    while(left<=right){
        int mid = (left+right)/2;
        if(arr[mid]==target){
            index = mid;
            break;
        }
        else if(target>arr[mid]){
            left = mid+1;
        }
        else{
            right = mid-1;
        }
    }
    if(index == -1){
    System.out.println("Element not found");
    }
    else{
    System.out.println("Element found at index : " + index);
        }
    }
}
